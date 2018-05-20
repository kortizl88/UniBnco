CREATE OR REPLACE PACKAGE RHEKT.PAWEBUNIFORMES AS 

  /*************************************************************
   Proyecto:                       WebUniformes 
   Descripcion:                    Paquete para WS de Uniformes
   Parametros de entrada:          No aplica
   Parametros de salida:           No aplica
   Parametros de entrada-salida    No aplica
   Precondiciones:                 Tener creado el esquema
   Creador:                        Othoniel García González
   Fecha de creacion:              Septiembre 2014
   *************************************************************/
   
  TYPE rcgCursor IS REF CURSOR; -- Cursor por referencia

  PROCEDURE SPCONPEDIDOSPENDIENTES(
    paIdEmpDistrital    IN RHEKT.UNI_DESCARGA_DISTRITAL.NUM_EMP_DISTRITAL%TYPE,
    paEmpleadoSituacion IN RHEKT.RH_EMP_SAP_FBP.FCEMPLEADO_SITUACION%TYPE,
    curDatos            OUT rcgCursor);
   
  PROCEDURE SPCONPLANTILLAACTIVA(
    paIdEmpleado IN RHEKT.RHVW_POS_LINREP.NUM_EMPLEADO%TYPE,
    curDatos     OUT rcgCursor);

  PROCEDURE SPCONSULTACANAL(
    paIdEmpleado IN RHEKT.RH_EMP_SAP_FBP.FIEMPLEADO_NUM%TYPE,
    curDatos     OUT rcgCursor);

  PROCEDURE SPCONSULTAESTATUSEMPLEADO(
    paIdEmpleado IN RHEKT.UNI_INVENTARIO_C_SKU.ID_EMPLEADO%TYPE,
    curDatos     OUT rcgCursor);

  PROCEDURE SPCONSULTAKITSPORCANALES(
    paArrayCanales  IN VARCHAR,
    curDatos        OUT rcgCursor);

  PROCEDURE SPINSSOLICITUDSTOCK(
    paIdEmpleado      IN RHEKT.TASOLICITUDSTOCK.FIEMPLEADONUM%TYPE,
    paTiendaReceptora IN RHEKT.TASOLICITUDSTOCK.FITIENDARECEPTORA%TYPE,
    curDatos          OUT rcgCursor);

  PROCEDURE SPINSDETALLESOLICITUDSTOCK(
    paIdSolicitud IN RHEKT.TASOLICSTOCKDETALLE.FIIDSOLICITUD%TYPE,
    paSku         IN RHEKT.TASOLICSTOCKDETALLE.FISKU%TYPE,
    paCantidad    IN RHEKT.TASOLICSTOCKDETALLE.FICANTIDAD%TYPE,
    curDatos      OUT rcgCursor);

  PROCEDURE SPCONSOLICITUDESSTOCK(
    paIdEmpleado  IN RHEKT.TASOLICITUDSTOCK.FIEMPLEADONUM%TYPE,
    curDatos      OUT rcgCursor);

  PROCEDURE SPCONSULTAINVENTARIO(
    paIdEmpleado  IN RHEKT.TAINVENTARIOEMP.FIEMPLEADONUM%TYPE,
    curDatos      OUT rcgCursor);

  PROCEDURE SPCONSULTAKITASIGNACION(
    paIdEmpEntrega  IN RHEKT.TAINVENTARIOEMP.FIEMPLEADONUM%TYPE,
    paIdFuncion     IN RHEKT.UNI_CAT_FUNCION.ID%TYPE,
    paIdCanal       IN RHEKT.UNI_CAT_CIA.ID%TYPE,
    paIdGenero      IN RHEKT.UNI_CAT_GENERO.ID%TYPE,
    curDatos        OUT rcgCursor);

  PROCEDURE SPINSGRABAASIGNACION(
    paIdEmpEntrega    IN RHEKT.TAASIGNAUNIFORME.FIEMPENTREGA%TYPE,
    paIdEmpRecibe     IN RHEKT.TAASIGNAUNIFORME.FIEMPRECIBE%TYPE,
    paSku             IN RHEKT.TAASIGNAUNIFORME.FISKU%TYPE,
    paCantidad        IN RHEKT.TAASIGNAUNIFORME.FICANTIDAD%TYPE,
    paPrecioEmpleado  IN RHEKT.TAASIGNAUNIFORME.FIPRECIOEMP%TYPE,
    paNegocioId       IN RHEKT.TAASIGNAUNIFORME.FINEGOCIOID%TYPE,
    curDatos          OUT rcgCursor);

  PROCEDURE SPCONPEDIDOSPORENTREGAR(
    paIdEmpEntrega    IN RHEKT.TAASIGNAUNIFORME.FIEMPENTREGA%TYPE,
    curDatos          OUT rcgCursor);
END PAWEBUNIFORMES;

/

CREATE OR REPLACE PACKAGE BODY RHEKT.PAWEBUNIFORMES AS

  /*************************************************************
   Proyecto:                           WebUniformes
   Descripcion:                        No aplica
   Parametros de entrada:              No aplica
   Parametros de salida:               No aplica
   Parametros de entrada-salida        No aplica
   Precondiciones:                     Tener creado el esquema
   Creador:                            Othoniel García González
   Fecha de creacion:                  Septiembre 2014
   *************************************************************/


  PROCEDURE SPCONPEDIDOSPENDIENTES(
     paIdEmpDistrital IN RHEKT.UNI_DESCARGA_DISTRITAL.NUM_EMP_DISTRITAL%TYPE,
     paEmpleadoSituacion IN RHEKT.RH_EMP_SAP_FBP.FCEMPLEADO_SITUACION%TYPE,
     curDatos   OUT   rcgCursor)
  /*************************************************************
   Proyecto:                         WebUniformes
   Descripcion:                      SPCONPEDIDOSPENDIENTES
   Parametros de entrada:            paIdEmpDistrital    Id del distrital
                                     paEmpleadoSituacion Situacion del empleado
   Parametros de salida:             curDatos            Cursor                                
   Parametros de entrada-salida      No aplica
   Precondiciones:                   Tener creado el esquema
   Creador:                          Othoniel García González
   Fecha de creacion:                Agosto 2014
   *************************************************************/
  IS
  BEGIN
    OPEN curDatos FOR
      SELECT UICS.NO_TIENDA,
             UICS.ID_EMPLEADO,
             UICS.NO_PEDIDO,
             UICS.DESC_GENERAL,
             UICS.FECHA_REMISION,
             COUNT(UICS.NO_PEDIDO) CANTIDAD,
             RH.FCEMPLEADO_NOMBRE,
             SUM(UICS.PRECIO) SUBTOTAL,
             CC.NOMBRE NOMBRE_TIENDA
        FROM RHEKT.UNI_INVENTARIO_C_SKU UICS
  INNER JOIN RHEKT.UNI_DESCARGA_DISTRITAL DIST
          ON UICS.FOLIO_PEDIDO = DIST.FOLIO_PEDIDO
         AND UICS.NO_PEDIDO = DIST.NO_PEDIDO
         AND UICS.ID_EMPLEADO = DIST.FIIDEMPLEADO
         AND FIBANDERAENTREGADO = 0
  INNER JOIN RHEKT.RH_EMP_SAP_FBP RH
          ON UICS.ID_EMPLEADO = RH.FIEMPLEADO_NUM
         AND UICS.ESTATUS = '4'
         AND UICS.REMISION = 1
   LEFT JOIN RHEKT.UNI_CECO CC
          ON UICS.NO_TIENDA = CC.NUMECO
         AND SUBSTR(CC.IDCC, 1, 2) IN ('80', '50')
       WHERE DIST.NUM_EMP_DISTRITAL = paIdEmpDistrital
         AND RH.FCEMPLEADO_SITUACION = paEmpleadoSituacion
    GROUP BY UICS.NO_TIENDA,
             UICS.ID_EMPLEADO,
             UICS.NO_PEDIDO,
             UICS.DESC_GENERAL,
             UICS.FECHA_REMISION,
             RH.FCEMPLEADO_NOMBRE,
             CC.NOMBRE;
     
  END SPCONPEDIDOSPENDIENTES;

  PROCEDURE SPCONPLANTILLAACTIVA(
       paIdEmpleado IN RHEKT.RHVW_POS_LINREP.NUM_EMPLEADO%TYPE,
       curDatos     OUT rcgCursor)
  /*************************************************************
   Proyecto:                         WebUniformes
   Descripcion:                      SPCONPLANTILLAACTIVA
   Parametros de entrada:            paIdEmpleado    Id del empleado
   Parametros de salida:             curDatos        Cursor                                
   Parametros de entrada-salida      No aplica
   Precondiciones:                   Tener creado el esquema
   Creador:                          Othoniel García González
   Fecha de creacion:                Septiembre 2014
   *************************************************************/
  IS
    vlEmpSituacionAlta VARCHAR(1) := 'A';
  BEGIN
    OPEN curDatos FOR
      SELECT RH.FIEMPLEADO_NUM,
             RH.FCEMPLEADO_NOMBRE,
             RH.FNFUNCION_NUM,
             RH.FCPOSICION_DESC,
             RH.FCCENCOS_NUM,
             DECODE(DIR.SEXO, 'M', 1,
                              'H', 2) GENERO
        FROM RHEKT.RHVW_POS_LINREP LR
  INNER JOIN RHEKT.RH_EMP_SAP_FBP RH 
          ON RH.FIEMPLEADO_NUM = LR.NUM_EMPLEADO
  INNER JOIN RHEKT.RHVW_EMP_DIR DIR
          ON DIR.EMPLEADO = RH.FIEMPLEADO_NUM
       WHERE RH.FCEMPLEADO_SITUACION = vlEmpSituacionAlta
         AND RH.FNFUNCION_NUM IN (SELECT ID FROM RHEKT.UNI_CAT_FUNCION)
  START WITH LR.NUM_EMPLEADO = paIdEmpleado
  CONNECT BY NOCYCLE PRIOR LR.POSICION = LR.POSICION_REP
    GROUP BY RH.FIEMPLEADO_NUM,
             RH.FCEMPLEADO_NOMBRE,
             RH.FNFUNCION_NUM,
             RH.FCPOSICION_DESC,
             RH.FCCENCOS_NUM,
             DIR.SEXO;
  
  END SPCONPLANTILLAACTIVA;

  PROCEDURE SPCONSULTACANAL(
    paIdEmpleado IN RHEKT.RH_EMP_SAP_FBP.FIEMPLEADO_NUM%TYPE,
    curDatos     OUT rcgCursor)
  /*************************************************************
   Proyecto:                         WebUniformes
   Descripcion:                      SPCONSULTACANAL
   Parametros de entrada:            paIdEmpleado    Id del empleado
   Parametros de salida:             curDatos        Cursor                                
   Parametros de entrada-salida      No aplica
   Precondiciones:                   Tener creado el esquema
   Creador:                          Othoniel García González
   Fecha de creacion:                Septiembre 2014
   *************************************************************/
  IS
    vlIdCia   NUMBER(6)  := 0;
    vlFuncion NUMBER(6)  := 0;
    vlCenCos  NUMBER(10) := 0;
    vlCount   NUMBER(3)  := 0;

    vlIdCiaEKT   NUMBER(3)   := 1;
    vlIdCia3ros  NUMBER(3)   := 3;
    vlIdCiaDEK   NUMBER(3)   := 4;
    vlIdCiaPP    NUMBER(3)   := 8;
    vlNombrePP   VARCHAR(25) := 'PRESTA%PRENDA%';
    vlNombreDEK  VARCHAR(25) := '%DEK%';
    vlEntidadPP  VARCHAR(25) := 'NEGOCIO PRENDARIO';
    vlEntidadBAZ VARCHAR(25) := 'BANCO AZTECA';

  BEGIN
    SELECT FNFUNCION_NUM,
           FCCENCOS_NUM
      INTO vlFuncion,
           vlCenCos
      FROM RH_EMP_SAP_FBP
     WHERE FIEMPLEADO_NUM = paIdEmpleado;

    SELECT COUNT(FIFUNCIONID) 
      INTO vlCount
      FROM TAFUNCIONESCIA
     WHERE FIFUNCIONUM = vlFuncion;

    IF (vlCount = 1) THEN
      SELECT FICIAID
        INTO vlIdCia
        FROM TAFUNCIONESCIA
       WHERE FIFUNCIONUM = vlFuncion;
    ELSE
      BEGIN
            SELECT CIA.ID_CIA
              INTO vlIdCia
              FROM UNI_CANAL_CIA CIA
        INNER JOIN UNI_CECO CC 
                ON TRIM(CC.IDCANAL) = TRIM(CIA.ID_CANAL)
               AND TRIM(CC.CANAL) = TRIM(CIA.CANAL)
             WHERE CC.IDCC = vlCenCos;
      EXCEPTION
        WHEN NO_DATA_FOUND THEN
          vlIdCia := vlIdCia3ros;
      END;

      SELECT COUNT(1)
        INTO vlCount
        FROM UNI_CECO
       WHERE IDCC = vlCenCos
         AND (NOMBRE LIKE vlNombrePP
          OR NOMBREENTIDAD = vlEntidadPP);
      IF(vlCount > 0) THEN
        vlIdCia := vlIdCiaPP;
      END IF;

      -- Validación para los casos en donde hay un Banco Azteca dentro de Presta Prenda
      IF (vlIdCia = vlIdCiaPP) THEN
        SELECT COUNT(1)
          INTO vlCount
          FROM UNI_CECO
         WHERE IDCC = vlCenCos
           AND NOMBREENTIDAD = vlEntidadBAZ;
        IF(vlCount > 0) THEN
          vlIdCia := vlIdCia3ros;
        END IF;
      END IF;

      -- Validación para los casos donde hay un DEK dentro de un Elektra
      IF (vlIdCia = vlIdCiaEKT) THEN
        SELECT COUNT(1)
          INTO vlCount
          FROM UNI_CECO
         WHERE IDCC = vlCenCos
           AND NOMBRE LIKE vlNombreDEK;
        IF(vlCount > 0) THEN
          vlIdCia := vlIdCiaDEK;
        END IF;
      END IF;

    END IF;

    OPEN curDatos FOR
      SELECT ID,         
             CLAVE,
             DESCRIPCION               
        FROM RHEKT.UNI_CAT_CIA 
       WHERE ID = vlIdCia;  

  END SPCONSULTACANAL;

  PROCEDURE SPCONSULTAESTATUSEMPLEADO(
    paIdEmpleado IN RHEKT.UNI_INVENTARIO_C_SKU.ID_EMPLEADO%TYPE,
    curDatos     OUT rcgCursor)
  /*************************************************************
   Proyecto:                         WebUniformes
   Descripcion:                      SPCONSULTAESTATUSEMPLEADO
   Parametros de entrada:            paIdEmpleado        Número de empleado
   Parametros de salida:             curDatos            Cursor                                
   Parametros de entrada-salida      No aplica
   Precondiciones:                   Tener creado el esquema
   Creador:                          Othoniel García González
   Fecha de creacion:                Agosto 2014
   *************************************************************/
  IS
    vlCount        NUMBER(3)   := 0;
    vlIdEstatus    NUMBER(3)   := 0;
    vlDescrEstatus VARCHAR(50) := 0;

    vlIdRequiereUniforme     NUMBER(3) := 10;
    vlIdSolicitudEnProceso   NUMBER(3) := 20;
    vlIdUniformeOK           NUMBER(3) := 30;

    vlDescRequiereUniforme   VARCHAR(50) := 'Requiere nuevo uniforme.';
    vlDescSolicitudEnProceso VARCHAR(50) := 'Solicitud de uniforme en proceso.';
    vlDescUniformeOK         VARCHAR(50) := 'Ya cuenta con uniforme.';

  BEGIN
    SELECT COUNT(1)
        INTO vlCount
        FROM RHEKT.UNI_INVENTARIO_C_SKU
       WHERE ID_EMPLEADO = paIdEmpleado
         AND ESTATUS = '0';
    IF (vlCount > 0) THEN
      vlIdEstatus := vlIdSolicitudEnProceso;
      vlDescrEstatus := vlDescSolicitudEnProceso;
    ELSE 
      SELECT COUNT(1) 
        INTO vlCount
        FROM RHEKT.UNI_INVENTARIO_C_SKU
       WHERE ID_EMPLEADO = paIdEmpleado
         AND FECHA > (ADD_MONTHS(TRUNC(SYSDATE), -6));
      IF (vlCount = 0) THEN
        vlIdEstatus := vlIdRequiereUniforme;
        vlDescrEstatus := vlDescRequiereUniforme;
      ELSE
        vlIdEstatus := vlIdUniformeOK;
        vlDescrEstatus := vlDescUniformeOK;
      END IF;
    END IF;

    OPEN curDatos FOR
      SELECT vlIdEstatus ID,
             vlDescrEstatus DESCRIPCION               
        FROM DUAL;

  END SPCONSULTAESTATUSEMPLEADO;

  PROCEDURE SPCONSULTAKITSPORCANALES(
    paArrayCanales IN VARCHAR,
    curDatos     OUT rcgCursor)
  /*************************************************************
   Proyecto:                         WebUniformes
   Descripcion:                      SPCONSULTAKITSPORCANALES
   Parametros de entrada:            paArrayCanales      Canales
   Parametros de salida:             curDatos            Cursor                                
   Parametros de entrada-salida      No aplica
   Precondiciones:                   Tener creado el esquema
   Creador:                          Othoniel García González
   Fecha de creacion:                Agosto 2014
   *************************************************************/
  IS
    vlCadExec VARCHAR(1500) := ''; 
  BEGIN
    vlCadExec :=
       'SELECT PZ.ID_CATEGORIA,
               CAT.CATDESCR,
               PZ.IMAGEN,
               PZ.PRECIO,
               CANT.TOTAL,
               PZ.ID_GENERO,
               GEN.DESCRIPCION DESCRGENERO,
               PZ.SKU,
               PZ.DESCRIPCION DESCRPIEZA,
               PZ.ID_TALLA,
               T.DESCRIPCION DESCRTALLA
          FROM UNI_PIEZA_UNIFORME PZ
    INNER JOIN UNI_CIA_FUNC_SKU CFS
            ON PZ.SKU = CFS.SKU
    INNER JOIN UNI_CAT_GENERO GEN
            ON PZ.ID_GENERO = GEN.ID
    INNER JOIN UNI_PRODUCTO_CATEGORIA CAT
            ON PZ.ID_CATEGORIA = CAT.CATID
    INNER JOIN UNI_CANT_PIEZAS CANT
            ON PZ.ID_CATEGORIA = CANT.ID_CATEGORIA
           AND CANT.ID_CIA = CFS.ID_CIA
    INNER JOIN UNI_CAT_TALLA T
            ON PZ.ID_TALLA = T.ID
         WHERE CFS.ID_CIA IN (' || paArrayCanales || ')
      GROUP BY PZ.ID_CATEGORIA,
               CAT.CATDESCR,
               PZ.IMAGEN,
               PZ.PRECIO,
               CANT.TOTAL,
               PZ.ID_GENERO,
               GEN.DESCRIPCION,
               PZ.SKU,
               PZ.DESCRIPCION,
               PZ.ID_TALLA,
               T.DESCRIPCION';

    OPEN curDatos FOR vlCadExec;
  END SPCONSULTAKITSPORCANALES;

  PROCEDURE SPINSSOLICITUDSTOCK(
    paIdEmpleado IN RHEKT.TASOLICITUDSTOCK.FIEMPLEADONUM%TYPE,
    paTiendaReceptora IN RHEKT.TASOLICITUDSTOCK.FITIENDARECEPTORA%TYPE,
    curDatos     OUT rcgCursor)
  /*************************************************************
   Proyecto:                         WebUniformes
   Descripcion:                      SPINSSOLICITUDSTOCK
   Parametros de entrada:            paIdEmpleado      Empleado solicitante
                                     paTiendaReceptora Tienda receptora
   Parametros de salida:             curDatos          Cursor                                
   Parametros de entrada-salida      No aplica
   Precondiciones:                   Tener creado el esquema
   Creador:                          Othoniel García González
   Fecha de creacion:                Septiembre 2014
   *************************************************************/
  IS
    vlIdSolicitudStock    NUMBER(10) := 0;
    vlIdEstatusSolicitado NUMBER(3) := 10;
  BEGIN
    vlIdSolicitudStock := RHEKT.SEQIDSOLICITUD.NEXTVAL;
    INSERT INTO RHEKT.TASOLICITUDSTOCK(
                FIIDSOLICITUD,
                FIEMPLEADONUM,
                FDFECHASOLICITUD,
                FIIDESTATUS,
                FITIENDARECEPTORA)
         VALUES (vlIdSolicitudStock,
                paIdEmpleado,
                SYSDATE,
                vlIdEstatusSolicitado,
                paTiendaReceptora);

    OPEN curDatos FOR
      SELECT FIIDSOLICITUD,
             FIEMPLEADONUM,
             FDFECHASOLICITUD,
             FIIDESTATUS,
             FITIENDARECEPTORA
        FROM RHEKT.TASOLICITUDSTOCK
       WHERE FIIDSOLICITUD = vlIdSolicitudStock;

  END SPINSSOLICITUDSTOCK;

  PROCEDURE SPINSDETALLESOLICITUDSTOCK(
    paIdSolicitud IN RHEKT.TASOLICSTOCKDETALLE.FIIDSOLICITUD%TYPE,
    paSku         IN RHEKT.TASOLICSTOCKDETALLE.FISKU%TYPE,
    paCantidad    IN RHEKT.TASOLICSTOCKDETALLE.FICANTIDAD%TYPE,
    curDatos      OUT rcgCursor)
  /*************************************************************
   Proyecto:                         WebUniformes
   Descripcion:                      SPINSDETALLESOLICITUDSTOCK
   Parametros de entrada:            paIdSolicitud    Id solicitud
                                     paSku            Sku
                                     paCantidad       Cantidad
   Parametros de salida:             curDatos         Cursor                                
   Parametros de entrada-salida      No aplica
   Precondiciones:                   Tener creado el esquema
   Creador:                          Othoniel García González
   Fecha de creacion:                Septiembre 2014
   *************************************************************/
  IS
    vlIdSolicDetalle      NUMBER(10)  := 0;
    vlIdEstatusSolicitado NUMBER(3)   := 10;
    vlPedidoTienda        NUMBER(10)  := 0;
    vlEmpleadoNum         NUMBER(10)  := 0;
  BEGIN
    vlIdSolicDetalle := RHEKT.SEQIDSOLICDETALLE.NEXTVAL;
    INSERT INTO RHEKT.TASOLICSTOCKDETALLE(
                FIIDSOLICDETALLE,
                FIIDSOLICITUD,
                FIPEDIDOTIENDA,
                FISKU,
                FICANTIDAD,
                FIIDSTATUSDETALLE)
         VALUES (vlIdSolicDetalle,
                paIdSolicitud,
                vlPedidoTienda,
                paSku,
                paCantidad,
                vlIdEstatusSolicitado);

    MERGE INTO RHEKT.TAINVENTARIOEMP INV
         USING (SELECT FIEMPLEADONUM, 
                       paSku SKU
                  FROM RHEKT.TASOLICITUDSTOCK
                 WHERE FIIDSOLICITUD = paIdSolicitud) S
            ON (S.FIEMPLEADONUM = INV.FIEMPLEADONUM 
           AND  S.SKU = INV.FISKU)
    WHEN MATCHED THEN UPDATE SET INV.FIINVENPROCESO = INV.FIINVENPROCESO + paCantidad
    WHEN NOT MATCHED THEN INSERT (INV.FIEMPLEADONUM,
                                  INV.FISKU,
                                  INV.FIINVNETO,
                                  INV.FIINVASIGNADO,
                                  INV.FIINVENPROCESO)
                          VALUES (S.FIEMPLEADONUM,
                                  S.SKU,
                                  0,
                                  0,
                                  paCantidad);

    OPEN curDatos FOR
      SELECT FIIDSOLICDETALLE,
             FIIDSOLICITUD,
             FIPEDIDOTIENDA,
             FISKU,
             FICANTIDAD,
             FIIDSTATUSDETALLE
        FROM RHEKT.TASOLICSTOCKDETALLE
       WHERE FIIDSOLICDETALLE = vlIdSolicDetalle;

  END SPINSDETALLESOLICITUDSTOCK;

  PROCEDURE SPCONSOLICITUDESSTOCK(
    paIdEmpleado  IN RHEKT.TASOLICITUDSTOCK.FIEMPLEADONUM%TYPE,
    curDatos      OUT rcgCursor)
  /*************************************************************
   Proyecto:                         WebUniformes
   Descripcion:                      SPCONSOLICITUDESSTOCK
   Parametros de entrada:            paIdEmpleado     Número de empleado
   Parametros de salida:             curDatos         Cursor                                
   Parametros de entrada-salida      No aplica
   Precondiciones:                   Tener creado el esquema
   Creador:                          Othoniel García González
   Fecha de creacion:                Septiembre 2014
   *************************************************************/
  IS
  BEGIN
    OPEN curDatos FOR
      SELECT S.FIIDSOLICITUD,
             S.FIEMPLEADONUM,
             S.FDFECHASOLICITUD,
             S.FIIDESTATUS,
             S.FITIENDARECEPTORA,
             D.FIIDSOLICDETALLE,
             D.FIPEDIDOTIENDA,
             D.FISKU,
             D.FICANTIDAD,
             D.FIIDSTATUSDETALLE,
             SG.FCDESCRIPCION DESCRESTATUSGRAL,
             CC.NOMBRE NOMBRETIENDA,
             PZ.DESCRIPCION DESCRSKU,
             R.FINUMREMISION,
             SD.FCDESCRIPCION DESCRESTATUSDETALLE,
             NVL(H.FDFECHA, S.FDFECHASOLICITUD) FECHAESTATUSDETALLE
        FROM RHEKT.TASOLICITUDSTOCK S
  INNER JOIN RHEKT.TASOLICSTOCKDETALLE D
          ON S.FIIDSOLICITUD = D.FIIDSOLICITUD
  INNER JOIN RHEKT.TACATSTATUSGRAL SG
          ON S.FIIDESTATUS = SG.FIIDSTATUSGRAL
   LEFT JOIN RHEKT.UNI_CECO CC
          ON S.FITIENDARECEPTORA = CC.NUMECO
         AND SUBSTR(CC.IDCC, 1, 2) IN ('80', '50')
  INNER JOIN RHEKT.UNI_PIEZA_UNIFORME PZ
          ON D.FISKU = PZ.SKU
   LEFT JOIN RHEKT.TAREMISION R
          ON D.FIIDSOLICDETALLE = R.FIIDSOLICDETALLE
  INNER JOIN RHEKT.TACATSTATUSDETALLE SD
          ON D.FIIDSTATUSDETALLE = SD.FIIDSTATUSDETALLE
   LEFT JOIN RHEKT.TAHISTSOLICITUDSTOCK H
          ON D.FIIDSOLICDETALLE = H.FIIDSOLICDETALLE
         AND D.FIIDSTATUSDETALLE = H.FINVOESTATUS
       WHERE S.FIEMPLEADONUM = paIdEmpleado;
  END SPCONSOLICITUDESSTOCK;


  PROCEDURE SPCONSULTAINVENTARIO(
    paIdEmpleado  IN RHEKT.TAINVENTARIOEMP.FIEMPLEADONUM%TYPE,
    curDatos      OUT rcgCursor)
  /*************************************************************
   Proyecto:                         WebUniformes
   Descripcion:                      SPCONSULTAINVENTARIO
   Parametros de entrada:            paIdEmpleado     Número de empleado
   Parametros de salida:             curDatos         Cursor                                
   Parametros de entrada-salida      No aplica
   Precondiciones:                   Tener creado el esquema
   Creador:                          Othoniel García González
   Fecha de creacion:                Septiembre 2014
   *************************************************************/
  IS
  BEGIN
      OPEN curDatos FOR
        SELECT INV.FISKU,
               (INV.FIINVNETO - INV.FIINVASIGNADO) DISPONIBLE,
               INV.FIINVASIGNADO,
               INV.FIINVENPROCESO,
               PZ.DESCRIPCION DESCRSKU,
               PZ.ID_CATEGORIA,
               PZ.ID_TALLA,
               PZ.ID_GENERO,
               PZ.PRECIO,
               CT.CATDESCR,
               TLL.DESCRIPCION DESCRTALLA,
               GN.DESCRIPCION DESCRGENERO
          FROM RHEKT.TAINVENTARIOEMP INV
    INNER JOIN RHEKT.UNI_PIEZA_UNIFORME PZ
            ON PZ.SKU = INV.FISKU
    INNER JOIN RHEKT.UNI_PRODUCTO_CATEGORIA CT
            ON CT.CATID = PZ.ID_CATEGORIA
    INNER JOIN RHEKT.UNI_CAT_TALLA TLL 
            ON TLL.ID = PZ.ID_TALLA
    INNER JOIN RHEKT.UNI_CAT_GENERO GN
            ON GN.ID = PZ.ID_GENERO
         WHERE INV.FIEMPLEADONUM = paIdEmpleado;

  END SPCONSULTAINVENTARIO;

  PROCEDURE SPCONSULTAKITASIGNACION(
    paIdEmpEntrega  IN RHEKT.TAINVENTARIOEMP.FIEMPLEADONUM%TYPE,
    paIdFuncion     IN RHEKT.UNI_CAT_FUNCION.ID%TYPE,
    paIdCanal       IN RHEKT.UNI_CAT_CIA.ID%TYPE,
    paIdGenero      IN RHEKT.UNI_CAT_GENERO.ID%TYPE,
    curDatos        OUT rcgCursor)
  /*************************************************************
   Proyecto:                         WebUniformes
   Descripcion:                      SPCONSULTAKITASIGNACION
   Parametros de entrada:            paIdEmpEntrega   Número de empleado
                                     paIdFuncion      Función SAP
                                     paIdCanal        Negocio
                                     paIdGenero       1 - Mujer, 2 - Hombre
   Parametros de salida:             curDatos         Cursor                                
   Parametros de entrada-salida      No aplica
   Precondiciones:                   Tener creado el esquema
   Creador:                          Othoniel García González
   Fecha de creacion:                Septiembre 2014
   *************************************************************/
  IS
  BEGIN
    OPEN curDatos FOR
          SELECT CFS.SKU,
                 PZ.DESCRIPCION DESCRSKU,
                 PZ.ID_CATEGORIA,
                 PZ.ID_TALLA,
                 PZ.ID_GENERO,
                 PZ.IMAGEN,
                 CNT.FNPRECIOSUBKIT,
                 CAT.CATDESCR,
                 CNT.TOTAL,
                 TLL.DESCRIPCION DESCRTALLA,
                 NVL((INV.FIINVNETO - INV.FIINVASIGNADO), 0) DISPONIBLE
            FROM RHEKT.UNI_CIA_FUNC_SKU CFS
      INNER JOIN RHEKT.UNI_PIEZA_UNIFORME PZ
              ON PZ.SKU = CFS.SKU
      INNER JOIN RHEKT.UNI_PRODUCTO_CATEGORIA CAT
              ON CAT.CATID = PZ.ID_CATEGORIA
      INNER JOIN RHEKT.UNI_CANT_PIEZAS CNT
              ON CNT.ID_CIA = CFS.ID_CIA
             AND CNT.ID_CATEGORIA = PZ.ID_CATEGORIA
      INNER JOIN RHEKT.UNI_CAT_TALLA TLL
              ON TLL.ID = PZ.ID_TALLA
       LEFT JOIN RHEKT.TAINVENTARIOEMP INV
              ON INV.FIEMPLEADONUM = paIdEmpEntrega
             AND INV.FISKU = CFS.SKU
           WHERE CFS.ID_CIA = paIdCanal
             AND CFS.ID_FUNCION = paIdFuncion
             AND PZ.ID_GENERO = paIdGenero
        ORDER BY PZ.ID_CATEGORIA,
                 PZ.ID_TALLA;

  END SPCONSULTAKITASIGNACION;

  PROCEDURE SPINSGRABAASIGNACION(
    paIdEmpEntrega    IN RHEKT.TAASIGNAUNIFORME.FIEMPENTREGA%TYPE,
    paIdEmpRecibe     IN RHEKT.TAASIGNAUNIFORME.FIEMPRECIBE%TYPE,
    paSku             IN RHEKT.TAASIGNAUNIFORME.FISKU%TYPE,
    paCantidad        IN RHEKT.TAASIGNAUNIFORME.FICANTIDAD%TYPE,
    paPrecioEmpleado  IN RHEKT.TAASIGNAUNIFORME.FIPRECIOEMP%TYPE,
    paNegocioId       IN RHEKT.TAASIGNAUNIFORME.FINEGOCIOID%TYPE,
    curDatos          OUT rcgCursor)
  /*************************************************************
   Proyecto:                         WebUniformes
   Descripcion:                      SPINSGRABAASIGNACION
   Parametros de entrada:            paIdEmpEntrega   Número de empleado que entrega
                                     paIdEmpRecibe    Número de empleado que recibe
                                     paSku            SKU
                                     paCantidad       Cantidad
                                     paPrecioEmpleado Precio del uniforme para empleado
                                     paNegocioId      ID de la unidad de negocio
   Parametros de salida:             curDatos         Cursor                                
   Parametros de entrada-salida      No aplica
   Precondiciones:                   Tener creado el esquema
   Creador:                          Othoniel García González
   Fecha de creacion:                Septiembre 2014
   *************************************************************/
  IS
    vlIdEstatusAsignado NUMBER(3)   := 10;
    vlFechaEntrega      DATE        := TO_DATE('01011900', 'DDMMYYYY');
    vlIdAsignacion      NUMBER(20)  := 0;
    vlSemanasDescto     NUMBER(3)   := 8;
  BEGIN
    vlIdAsignacion := RHEKT.SEQIDASIGNACION.NEXTVAL;

    INSERT INTO RHEKT.TAASIGNAUNIFORME (FIIDASIGNACION,
                                        FIEMPENTREGA,
                                        FIEMPRECIBE,
                                        FISKU,
                                        FICANTIDAD,
                                        FIPRECIOEMP,
                                        FISEMANASDESCTO,
                                        FIIDESTATUS,
                                        FINEGOCIOID,
                                        FDFECHA,
                                        FDFECHAENTREGA
                                        )
                                VALUES (vlIdAsignacion,
                                        paIdEmpEntrega,
                                        paIdEmpRecibe,
                                        paSku,
                                        paCantidad,
                                        paPrecioEmpleado,
                                        vlSemanasDescto,
                                        vlIdEstatusAsignado,
                                        paNegocioId,
                                        SYSDATE,
                                        vlFechaEntrega);
    UPDATE RHEKT.TAINVENTARIOEMP
       SET FIINVASIGNADO = FIINVASIGNADO + paCantidad
     WHERE FIEMPLEADONUM = paIdEmpEntrega
       AND FISKU = paSku;

    OPEN curDatos FOR
      SELECT FIIDASIGNACION,
             FIEMPENTREGA,
             FIEMPRECIBE,
             FISKU,
             FICANTIDAD,
             FIPRECIOEMP,
             FIIDESTATUS,
             FDFECHA,
             FDFECHAENTREGA
        FROM RHEKT.TAASIGNAUNIFORME
       WHERE FIIDASIGNACION = vlIdAsignacion;

  END SPINSGRABAASIGNACION;

  PROCEDURE SPCONPEDIDOSPORENTREGAR(
    paIdEmpEntrega    IN RHEKT.TAASIGNAUNIFORME.FIEMPENTREGA%TYPE,
    curDatos          OUT rcgCursor)
  /*************************************************************
   Proyecto:                         WebUniformes
   Descripcion:                      SPCONPEDIDOSPORENTREGAR
   Parametros de entrada:            paIdEmpEntrega   Número de empleado que entrega
   Parametros de salida:             curDatos         Cursor                                
   Parametros de entrada-salida      No aplica
   Precondiciones:                   Tener creado el esquema
   Creador:                          Othoniel García González
   Fecha de creacion:                Septiembre 2014
   *************************************************************/
  IS
    vlIdEstatusAsignado NUMBER(3)   := 10;
  BEGIN
    OPEN curDatos FOR
          SELECT A.FIEMPRECIBE,
                 A.FISKU,
                 A.FICANTIDAD,
                 A.FIPRECIOEMP,
                 A.FISEMANASDESCTO,
                 RH.FCEMPLEADO_NOMBRE,
                 RH.FNFUNCION_NUM,
                 RH.FCPOSICION_DESC,
                 RH.FCCENCOS_NUM,
                 CIA.CLAVE,
                 PZ.DESCRIPCION
            FROM RHEKT.TAASIGNAUNIFORME A
      INNER JOIN RHEKT.RH_EMP_SAP_FBP RH
              ON RH.FIEMPLEADO_NUM = A.FIEMPRECIBE
      INNER JOIN RHEKT.UNI_CAT_CIA CIA
              ON CIA.ID = A.FINEGOCIOID
      INNER JOIN RHEKT.UNI_PIEZA_UNIFORME PZ
              ON PZ.SKU = A.FISKU
           WHERE A.FIEMPENTREGA = paIdEmpEntrega;

  END SPCONPEDIDOSPORENTREGAR;

END PAWEBUNIFORMES;
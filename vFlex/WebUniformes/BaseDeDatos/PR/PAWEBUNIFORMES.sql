CREATE OR REPLACE PACKAGE RHEKT.PAWEBUNIFORMES
AS
/*************************************************************
Proyecto:                       Uniformes
Descripcion:                    Paquete para sistema de uniformes
Parametros de entrada:          No aplica
Parametros de salida:           No aplica
Parametros de entrada-salida    No aplica
Precondiciones:                 Tener creado el esquema
Creador:                        Othoniel Garcia Gonzalez
Fecha de creacion:              Abril 2015
*************************************************************/

  TYPE rcgCursor IS REF CURSOR;
-- Cursor por referencia
  TYPE RESTATUS IS RECORD
  (
    ID_ESTATUS NUMBER,
    NO_PEDIDOS NUMBER
  );
  TYPE ESTATUSPEDIDOS IS TABLE OF RESTATUS INDEX BY BINARY_INTEGER;

  FUNCTION FNOBTIENEPEDIDO(
    paIdEmpleado IN RHEKT.UNI_INVENTARIO_C_SKU.ID_EMPLEADO%TYPE)
    RETURN rcgCursor;

  PROCEDURE SPOBTIENEFOLIO(
    paFolioPedido  IN  RHEKT.UNI_INVENTARIO_C_SKU.FOLIO_PEDIDO%TYPE,
    paIdEmpleado   IN  RHEKT.UNI_INVENTARIO_C_SKU.ID_EMPLEADO%TYPE,
    paNoTienda     OUT RHEKT.UNI_INVENTARIO_C_SKU.NO_TIENDA%TYPE,
    paNombreTienda OUT RHEKT.UNI_CECO.NOMBRE%TYPE,
    paFecha        OUT RHEKT.UNI_INVENTARIO_C_SKU.FECHA%TYPE,
    paEstatus      OUT RHEKT.UNI_ESTATUS_PEDIDO.ID_ESTATUS%TYPE,
    paDescEst      OUT RHEKT.UNI_ESTATUS_PEDIDO.FCDESCRIPCION%TYPE,
    paDetallePed   OUT rcgCursor);

  FUNCTION FNOBTIENEFOLIOS(
    paIdEmpleado IN RHEKT.UNI_INVENTARIO_C_SKU.ID_EMPLEADO%TYPE)
    RETURN rcgCursor;

  FUNCTION FNOBTIENEDESC(
    paIdEmpleado IN RHEKT.UNI_EMP_DESCTO_SAP.EMPLID%TYPE,
    paIdFolio    IN RHEKT.UNI_EMP_DESCTO_SAP.REFE%TYPE)
    RETURN rcgCursor;
    
  FUNCTION FNESTATUSPEDIDO(
    paIdEmpleado IN RHEKT.UNI_INVENTARIO_C_SKU.ID_EMPLEADO%TYPE,
    paNoPedido   IN RHEKT.UNI_INVENTARIO_C_SKU.NO_PEDIDO%TYPE,
    paNoFolio    IN RHEKT.UNI_INVENTARIO_C_SKU.FOLIO_PEDIDO%TYPE)
    RETURN NUMBER;

  FUNCTION FNESTATUSFOLIO(
    paIdEmpleado IN RHEKT.UNI_INVENTARIO_C_SKU.ID_EMPLEADO%TYPE,
    paNoFolio    IN RHEKT.UNI_INVENTARIO_C_SKU.FOLIO_PEDIDO%TYPE)
    RETURN NUMBER;

  PROCEDURE SPOBTIENETIENDAS(
    paIdEmpleado    IN  RHEKT.TAEMPLEADOINFO.FIEMPLEADONUM%TYPE,
    paNegocio       IN  RHEKT.TAFUNCIONESXNEGOCIO.FINEGOCIO%TYPE,
    paTodasLasSucur OUT rcgCursor,
    paSucurPorEmp   OUT rcgCursor);

  PROCEDURE SPOBTIENEDESCRIPCIONPEDIDOS(
    paArraySKU IN  VARCHAR,
    paEmp      IN  RHEKT.UNI_INVENTARIO_C_SKU.ID_EMPLEADO%TYPE,
    paIdTienda IN  RHEKT.TASUCURSALES.FISUCURSAL%TYPE,
    paCantidad OUT NUMBER);

  PROCEDURE SPINSERTAPEDIDO(
      paIdEmpleado    IN  RHEKT.UNI_INVENTARIO_C_SKU.ID_EMPLEADO%TYPE
    , paSKU           IN  RHEKT.UNI_INVENTARIO_C_SKU.SKU%TYPE
    , paNoPedido      IN  RHEKT.UNI_INVENTARIO_C_SKU.NO_PEDIDO%TYPE
    , paNoTienda      IN  RHEKT.UNI_INVENTARIO_C_SKU.NO_TIENDA%TYPE
    , paNegocio       IN  RHEKT.UNI_CAT_CIA.ID%TYPE
    , paPais          IN  RHEKT.UNI_INVENTARIO_C_SKU.PAIS%TYPE
    , paFnFuncionNum  IN  RHEKT.UNI_INVENTARIO_C_SKU.FNFUNCION_NUM%TYPE
    , paFolioPedido   IN  RHEKT.UNI_INVENTARIO_C_SKU.FOLIO_PEDIDO%TYPE
    , paTipoSolicitud IN  RHEKT.UNI_INVENTARIO_C_SKU.FIIDTIPOSOLICITUD%TYPE
    , paCount         OUT NUMBER);

  PROCEDURE SPOBTIENEPOSICIONAYUDA(
    paIdEmp IN  RHEKT.UNI_INVENTARIO_C_SKU.ID_EMPLEADO%TYPE,
    paRet   OUT VARCHAR);

  FUNCTION FNOBTIENEPEDIDOSPENDIENTES(
    paIdEmp   IN RHEKT.TAEMPLEADOINFO.FIEMPLEADONUM%TYPE,
    paEstatus IN RHEKT.UNI_INVENTARIO_C_SKU.ESTATUS%TYPE)
    RETURN rcgCursor;

  PROCEDURE SPOBTIENESKU(paNumEmpleado IN  RHEKT.UNI_INVENTARIO_C_SKU.ID_EMPLEADO%TYPE,
                         paFolioPedido IN  RHEKT.UNI_INVENTARIO_C_SKU.FOLIO_PEDIDO%TYPE,
                         paNoPedido    IN  RHEKT.UNI_INVENTARIO_C_SKU.NO_PEDIDO%TYPE,
                         paNoTienda    IN  RHEKT.UNI_INVENTARIO_C_SKU.NO_TIENDA%TYPE,
                         paCurDatos    OUT rcgCursor,
                         paIPTienda    OUT RHEKT.TASUCURSALES.FCDIRIP%TYPE);

  PROCEDURE SPRECOGEPEDIDO(paNumEmpleado  IN RHEKT.UNI_INVENTARIO_C_SKU.ID_EMPLEADO%TYPE,
                           paIdEmpCaptura IN RHEKT.UNI_INVENTARIO_C_SKU.ID_EMPLEADO_CAPTURA%TYPE,
                           paFolioPedido  IN RHEKT.UNI_INVENTARIO_C_SKU.FOLIO_PEDIDO%TYPE,
                           paNoPedido     IN RHEKT.UNI_INVENTARIO_C_SKU.NO_PEDIDO%TYPE,
                           paNoTienda     IN RHEKT.UNI_INVENTARIO_C_SKU.NO_TIENDA%TYPE,
                           paDistrital    IN RHEKT.UNI_DESCARGA_DISTRITAL.NUM_EMP_DISTRITAL%TYPE);

  FUNCTION FNDESCRIPCIONSKU(paFolioPedido IN RHEKT.UNI_INVENTARIO_C_SKU.FOLIO_PEDIDO%TYPE)
    RETURN VARCHAR2;

  PROCEDURE SPVALIDASOLICITUD(paIdEmpleado IN  RHEKT.UNI_INVENTARIO_C_SKU.ID_EMPLEADO%TYPE,
                              paIdFunc     IN  RHEKT.TAFUNCIONESXNEGOCIO.FIIDFUNCION%TYPE,
                              paIdGenero   IN  RHEKT.UNI_PIEZA_UNIFORME.ID_GENERO%TYPE,
                              paIdSubkit   IN  RHEKT.TASUBKITS.FIIDSUBKIT%TYPE,
                              paMesesRenov IN  RHEKT.TASUBKITSXKIT.FIMESESRENOV%TYPE,
                              curDatos     OUT rcgCursor);

  PROCEDURE SPOBTIENEKITPORTIENDA(paIdEmpleado IN  RHEKT.UNI_INVENTARIO_C_SKU.ID_EMPLEADO%TYPE,
                                  paNegocio    IN  RHEKT.TAFUNCIONESXNEGOCIO.FINEGOCIO%TYPE,
                                  paIdFunc     IN  RHEKT.TAFUNCIONESXNEGOCIO.FIIDFUNCION%TYPE,
                                  paIdGenero   IN  RHEKT.UNI_PIEZA_UNIFORME.ID_GENERO%TYPE,
                                  paIdTienda   IN  RHEKT.TASUCURSALES.FISUCURSAL%TYPE,
                                  curDatos     OUT rcgCursor);

  FUNCTION FNSOLFOLIOENTREGA
    RETURN VARCHAR2;

  PROCEDURE SPACTUALIZAMSGABASTO(paIdEmpleado    IN  RHEKT.UNI_INVENTARIO_C_SKU.ID_EMPLEADO%TYPE
    ,                            paNoTienda      IN  RHEKT.UNI_INVENTARIO_C_SKU.NO_TIENDA%TYPE
    ,                            paNoPedido      IN  RHEKT.UNI_INVENTARIO_C_SKU.NO_PEDIDO%TYPE
    ,                            paSKU           IN  RHEKT.UNI_INVENTARIO_C_SKU.SKU%TYPE
    ,                            paMensajeAbasto IN  RHEKT.UNI_INVENTARIO_C_SKU.MENSAJE_AVASTO%TYPE
    ,                            paCount         OUT NUMBER);

  PROCEDURE SPCONSULTAIPTIENDA(paSucursal IN  RHEKT.TASUCURSALES.FISUCURSAL%TYPE,
                               paIpTienda OUT RHEKT.TASUCURSALES.FCDIRIP%TYPE);

  FUNCTION FNESPRIMERKIT(paIdKit      IN RHEKT.TAFUNCIONESXNEGOCIO.FIIDKIT%TYPE,
                         paIdEmpleado IN RHEKT.UNI_INVENTARIO_C_SKU.ID_EMPLEADO%TYPE)
    RETURN NUMBER;

  PROCEDURE SPCONSULTADATOSEMPLEADO(
    paEmpleadoNum    IN  RHEKT.TAEMPLEADOINFO.FIEMPLEADONUM%TYPE,
    paFuncionNum     OUT RHEKT.TAEMPLEADOINFO.FIFUNCIONNUM%TYPE,
    paSexo           OUT NUMBER,
    paEmpleadoNombre OUT RHEKT.TAEMPLEADOINFO.FCEMPLEADONOMBRE%TYPE,
    paFcPosicionDesc OUT RHEKT.TAEMPLEADOINFO.FCPOSICIONDESC%TYPE,
    paCount          OUT NUMBER,
    paCanal          OUT rcgCursor,
    paIdPais         OUT RHEKT.UNI_CECO.IDPAIS%TYPE,
    paManualDeImagen OUT RHEKT.TAFUNCIONESXNEGOCIO.FCMANUALDEIMAGEN%TYPE,
    paMensajes       OUT RHEKT.TAFUNCIONESXNEGOCIO.FCMENSAJESINICIO%TYPE);

  PROCEDURE SPCONSULTAPEDIDOSPORFILTRO(
    paIdEmpleado    IN  RHEKT.UNI_INVENTARIO_C_SKU.ID_EMPLEADO%TYPE,
    paSucursal      IN  RHEKT.UNI_INVENTARIO_C_SKU.NO_TIENDA%TYPE,
    paPedido        IN  RHEKT.UNI_INVENTARIO_C_SKU.NO_PEDIDO%TYPE,
    paSKU           IN  RHEKT.UNI_INVENTARIO_C_SKU.SKU%TYPE,
    paCDeCostos     IN  RHEKT.TAEMPLEADOINFO.FICENCOSNUM%TYPE,
    paRemision      IN  RHEKT.UNI_INVENTARIO_C_SKU.NO_REMISION%TYPE,
    paFechaSolIni   IN  RHEKT.UNI_INVENTARIO_C_SKU.FECHA%TYPE,
    paFechaSolFin   IN  RHEKT.UNI_INVENTARIO_C_SKU.FECHA%TYPE,
    paFechaRemIni   IN  RHEKT.UNI_INVENTARIO_C_SKU.FECHA_REMISION%TYPE,
    paFechaRemFin   IN  RHEKT.UNI_INVENTARIO_C_SKU.FECHA_REMISION%TYPE,
    curDatos        OUT rcgCursor);

  PROCEDURE SPINSERTAREPOSICION(
    paIdEmpleado    IN RHEKT.TAREPOSICIONES.FIEMPLEADO%TYPE,
    paCorreo        IN RHEKT.TAREPOSICIONES.FCCORREO%TYPE,
    paTelefono      IN RHEKT.TAREPOSICIONES.FCTELEFONO%TYPE,
    paMotivo        IN RHEKT.TAREPOSICIONES.FCMOTIVO%TYPE,
    paMensaje       IN RHEKT.TAREPOSICIONES.FCMENSAJE%TYPE,
    paIdSubkit      IN RHEKT.TAREPOSICIONES.FIIDSUBKIT%TYPE,
    paFolio         OUT RHEKT.TAREPOSICIONES.FIFOLIOREPOSICION%TYPE);
  
  PROCEDURE SPCONSULTAREPOSICION(
    paIdEmpleado    IN RHEKT.TAREPOSICIONES.FIEMPLEADO%TYPE,
    paIdSubkit      IN RHEKT.TAREPOSICIONES.FIIDSUBKIT%TYPE,
    curDatos        OUT rcgCursor);
    
  PROCEDURE SPCONREPOSICIONESXEMPLEADO(
    paIdEmpleado    IN RHEKT.TAREPOSICIONES.FIEMPLEADO%TYPE,
    curDatos        OUT rcgCursor);
    
  PROCEDURE SPCONAUTORIZANTESREP(
    paIdEmpleado    IN RHEKT.TACORREOAUTORIZANTES.FIIDEMPLEADO%TYPE,
    curDatos        OUT rcgCursor);
  
  PROCEDURE SPINSERTASOLICEXT(
    paIdEmpleado    IN RHEKT.TASOLICITUDESEXTERNAS.FIEMPLEADONUM%TYPE,
    paIdCategoria   IN RHEKT.TASOLICITUDESEXTERNAS.FIIDCATEGORIA%TYPE,
    paUltimaRem     IN RHEKT.TASOLICITUDESEXTERNAS.FDULTIMAREMISION%TYPE,
    paOrigen        IN RHEKT.TASOLICITUDESEXTERNAS.FIORIGEN%TYPE
  );
  
  PROCEDURE SPGUARDASOLICSININVENTARIO(
    paIdEmpleado    IN RHEKT.TASOLICSININVENTARIO.FIEMPLEADONUM%TYPE,   
    paPeriodo       IN RHEKT.TASOLICSININVENTARIO.FIPERIODO%TYPE,  
    paIdSubkit      IN RHEKT.TASOLICSININVENTARIO.FIIDSUBKIT%TYPE,  
    paSku           IN RHEKT.TASOLICSININVENTARIO.FISKU%TYPE,  
    paSucursal      IN RHEKT.TASUCURSALES.FISUCURSAL%TYPE
  );
  
  PROCEDURE SPOBTENERCONFIGURACION(
    paIdSucursal    IN RHEKT.TACONFIGPARCIAL.FIIDSUCURSAL%TYPE,
    paIdCanal       IN RHEKT.TACONFIGPARCIAL.FIIDCANAL%TYPE,
    paIdPais        IN RHEKT.TACONFIGPARCIAL.FIIDPAIS%TYPE,
    curDatos        OUT rcgCursor
  );
  
  PROCEDURE SPOBTENERENSAMBLE(
    paSku           IN RHEKT.TASOLICSININVENTARIO.FISKU%TYPE,  
    paSucursal      IN RHEKT.TASUCURSALES.FISUCURSAL%TYPE,
    curDatos        OUT rcgCursor
  );
  
  PROCEDURE SPCONFIRMANOTIFICACION(paFolioReposicion IN RHEKT.TAREPOSICIONES.FIFOLIOREPOSICION%TYPE);
  
  PROCEDURE SPCONSULTAENCUESTA(
    paIdEmpleado    IN RHEKT.TAEMPLEADOSXENCUESTA.FIIDEMPLEADO%TYPE,
    curDatos        OUT rcgCursor
  );
  
  PROCEDURE SPGUARDARESPUESTA(
    paIdEmpleado    IN RHEKT.TARESPUESTASXEMPLEADO.FIIDEMPLEADO%TYPE,
    paIdEncuesta    IN RHEKT.TARESPUESTASXEMPLEADO.FIIDENCUESTA%TYPE,
    paIdPregunta    IN RHEKT.TARESPUESTASXEMPLEADO.FIIDPREGUNTA%TYPE,
    paIdRespuesta   IN RHEKT.TARESPUESTASXEMPLEADO.FIIDRESPUESTA%TYPE
  );

  PROCEDURE SPFINALIZAENCUESTA(
    paIdEmpleado    IN RHEKT.TAEMPLEADOSXENCUESTA.FIIDEMPLEADO%TYPE,
    paIdEncuesta    IN RHEKT.TAEMPLEADOSXENCUESTA.FIIDENCUESTA%TYPE,
    paComentarios   IN RHEKT.TAEMPLEADOSXENCUESTA.FCCOMENTARIOS%TYPE
  );
  
  PROCEDURE SPOBTENERNEGOCIO(paIdEmpleado IN RHEKT.TAEMPLEADOINFO.FIEMPLEADONUM%TYPE,
                             paCount          OUT NUMBER,
                             paCanal          OUT rcgCursor);
  
  PROCEDURE SPCONCAPTURASTALLAS(
    paIdEmpleado IN  RHEKT.TAEMPLEADOINFO.FIEMPLEADONUM%TYPE,
    paIdCarga    IN  RHEKT.TACARGATALLAS.FIIDCARGA%TYPE,
    curDatos     OUT rcgCursor);

  PROCEDURE SPCONSULTACARGAACTIVA(
    paIdEmpleado  IN  RHEKT.TACAPTURAMEDIDAS.FIIDEMPLEADO%TYPE,
    paNegocio     IN  RHEKT.TACARGASXFUNCIONES.FIIDNEGOCIO%TYPE,
    paIdFunc      IN  RHEKT.TACARGASXFUNCIONES.FIIDFUNCION%TYPE,
    paIdCarga     OUT INTEGER,
    paBandCaptura OUT INTEGER,
    paBandModif   OUT INTEGER);

  PROCEDURE SPGUARDACAPTURAMEDIDA(
    paIdCarga         IN RHEKT.TACARGATALLAS.FIIDCARGA%TYPE,
    paIdEmpleado      IN RHEKT.TACAPTURAMEDIDAS.FIIDEMPLEADO%TYPE,
    paIdNegocio       IN RHEKT.TACAPTURAMEDIDAS.FINEGOCIO%TYPE,
    paFuncionSap      IN RHEKT.TACAPTURAMEDIDAS.FIFUNCIONSAP%TYPE,
    paIdGenero        IN RHEKT.TACAPTURAMEDIDAS.FIIDGENERO%TYPE,
    paIdCaptura       OUT RHEKT.TACAPTURAMEDIDAS.FIIDCAPTURA%TYPE
  );
  
  PROCEDURE SPGUARDACAPTURADETALLE (
    paIdCaptura       IN RHEKT.TACAPTURAMEDIDAS.FIIDCAPTURA%TYPE,
    paIdMedida        IN RHEKT.TACAPTURADETALLE.FIIDMEDIDA%TYPE,
    paValor           IN RHEKT.TACAPTURADETALLE.FNVALOR%TYPE,
    paResult          OUT NUMBER
  );
END PAWEBUNIFORMES;
/

CREATE OR REPLACE PACKAGE BODY  RHEKT.PAWEBUNIFORMES
AS

/*************************************************************
   Proyecto:                           Uniformes
   Descripcion:                        No aplica
   Parametros de entrada:              No aplica
   Parametros de salida:               No aplica
   Parametros de entrada-salida        No aplica
   Precondiciones:                     Tener creado el esquema
   Creador:                            Othoniel Garcia Gonzalez
   Fecha de creacion:                  Abril 2015
   *************************************************************/

  

  FUNCTION FNOBTIENEPEDIDO(
    paIdEmpleado IN RHEKT.UNI_INVENTARIO_C_SKU.ID_EMPLEADO%TYPE)
    RETURN rcgCursor
/*************************************************************
   Proyecto:                         Uniformes
   Descripcion:                      FNOBTIENEPEDIDO
   Parametros de entrada:            paIdEmpleado     Id del empleado
   Parametros de salida:             rcgCursor        Cursor
   Parametros de entrada-salida      
   Precondiciones:                   Tener creado el esquema
   Creador:                          Othoniel Garcia Gonzalez
   Fecha de creacion:                Abril 2015
*************************************************************/
  IS
    curDatos rcgCursor;
-- Cursor que va a contener los datos enviados al usuario
    BEGIN
      OPEN curDatos FOR
      SELECT
        FOLIO_PEDIDO FOLIOPED,
        MIN(FECHA)   FECHA
      FROM RHEKT.UNI_INVENTARIO_C_SKU T
      WHERE T.ID_EMPLEADO = paIdEmpleado
      GROUP BY FOLIO_PEDIDO
      ORDER BY FECHA DESC;

      RETURN curDatos;
    END FNOBTIENEPEDIDO;

  PROCEDURE SPOBTIENEFOLIO(
    paFolioPedido  IN  RHEKT.UNI_INVENTARIO_C_SKU.FOLIO_PEDIDO%TYPE,
    paIdEmpleado   IN  RHEKT.UNI_INVENTARIO_C_SKU.ID_EMPLEADO%TYPE,
    paNoTienda     OUT RHEKT.UNI_INVENTARIO_C_SKU.NO_TIENDA%TYPE,
    paNombreTienda OUT RHEKT.UNI_CECO.NOMBRE%TYPE,
    paFecha        OUT RHEKT.UNI_INVENTARIO_C_SKU.FECHA%TYPE,
    paEstatus      OUT RHEKT.UNI_ESTATUS_PEDIDO.ID_ESTATUS%TYPE,
    paDescEst      OUT RHEKT.UNI_ESTATUS_PEDIDO.FCDESCRIPCION%TYPE,
    paDetallePed   OUT rcgCursor)
  IS
/*************************************************************
   Proyecto:                         Uniformes
   Descripcion:                      SPOBTIENEFOLIO
   Parametros de entrada:            paFolioPedido    Folio del pedido
                                     paIdEmpleado     Id del empleado
                                     paNoTienda       Número de la tienda
                                     paNombreTienda   Nombre de la tienda
                                     paFecha          Fecha de la solicitud
                                     paEstatus        Id del estatus de la solicitud
                                     paDescEst        Descripción del estatus
                                     paDetallePed     Detalle del pedido
   Parametros de salida:             rcgCursor        Cursor
   Parametros de entrada-salida      
   Precondiciones:                   Tener creado el esquema
   Creador:                          Othoniel Garcia Gonzalez
   Fecha de creacion:                Abril 2015
*************************************************************/

    vlFechaMin RHEKT.UNI_INVENTARIO_C_SKU.FECHA%TYPE;

    BEGIN

      SELECT
        MIN(TRUNC(FECHA)) FECHA
      INTO vlFechaMin
      FROM RHEKT.UNI_INVENTARIO_C_SKU
      WHERE ID_EMPLEADO = paIdEmpleado
            AND FOLIO_PEDIDO = paFolioPedido;

      SELECT DISTINCT
        TRUNC(FECHA)
      INTO paFecha
      FROM RHEKT.UNI_INVENTARIO_C_SKU
      WHERE ID_EMPLEADO = paIdEmpleado
            AND FOLIO_PEDIDO = paFolioPedido
            AND TRUNC(FECHA) = vlFechaMin;

      SELECT
        ID_ESTATUS    IDESTATUS,
        FCDESCRIPCION DESCRIPCION
      INTO paEstatus
        , paDescEst
      FROM RHEKT.UNI_ESTATUS_PEDIDO
      WHERE ID_ESTATUS = RHEKT.PAWEBUNIFORMES.FNESTATUSFOLIO(paIdEmpleado, paFolioPedido);

      SELECT DISTINCT
        NO_TIENDA NOTIENDA
      INTO paNoTienda
      FROM RHEKT.UNI_INVENTARIO_C_SKU
      WHERE ID_EMPLEADO = paIdEmpleado
            AND FOLIO_PEDIDO = paFolioPedido;

      SELECT
        FCDESCRIPCION
      INTO paNombreTienda
      FROM RHEKT.TASUCURSALES
      WHERE FISUCURSAL = paNoTienda;

      OPEN paDetallePed FOR
      SELECT
        UICS.NO_PEDIDO,
        UICS.SKU,
        UICS.DESC_GENERAL,
        UICS.FECHA_CANCELACION,
        UICS.FECHA_REMISION,
        UICS.NO_REMISION,
        COUNT(UICS.SKU)        TOTALSKU,
        STAT.ID_ESTATUS,
        STAT.FCDESCRIPCION,
        UICS.FDFECMOV,
        UICS.FECHA_PHUELLA,
        TRUNC(UICS.FECHA)      FECHA,
        T.CLAVE                TALLA
      FROM RHEKT.UNI_INVENTARIO_C_SKU UICS
        INNER JOIN RHEKT.UNI_ESTATUS_PEDIDO STAT
          ON STAT.ID_ESTATUS = RHEKT.PAWEBUNIFORMES.FNESTATUSPEDIDO(UICS.ID_EMPLEADO, UICS.NO_PEDIDO, UICS.FOLIO_PEDIDO)
        INNER JOIN RHEKT.UNI_PIEZA_UNIFORME PZ
          ON PZ.SKU = UICS.SKU
        INNER JOIN RHEKT.UNI_CAT_TALLA T
          ON T.ID = PZ.ID_TALLA
      WHERE ID_EMPLEADO = paIdEmpleado
            AND FOLIO_PEDIDO = paFolioPedido
      GROUP BY UICS.NO_PEDIDO
        , UICS.SKU
        , UICS.DESC_GENERAL
        , UICS.FECHA_CANCELACION
        , UICS.FECHA_REMISION
        , UICS.NO_REMISION
        , UICS.FDFECMOV
        , UICS.FECHA_PHUELLA
        , STAT.ID_ESTATUS
        , STAT.FCDESCRIPCION
        , TRUNC(UICS.FECHA)
        , T.CLAVE
      ORDER BY NO_PEDIDO
        , SKU;
    END SPOBTIENEFOLIO;

  FUNCTION FNOBTIENEFOLIOS(
    paIdEmpleado IN RHEKT.UNI_INVENTARIO_C_SKU.ID_EMPLEADO%TYPE)
    RETURN rcgCursor
/*************************************************************
   Proyecto:                         Uniformes
   Descripcion:                      Funcion que obtiene los folios de los descuentos 
   Parametros de entrada:            paIdEmpleado = numero del empleado
   Parametros de salida:             folios, fechasImpSap
   Parametros de entrada-salida      No aplica
   Precondiciones:                   Tener creado el esquema
   Creador:                          Othoniel Garcia Gonzalez
   Fecha de creacion:                Abril 2015
*************************************************************/
  IS
    curDatos rcgCursor;
    cslFalso    NUMBER(1) := 0;
-- Cursor que va a contener los datos enviados al usuario
    BEGIN
      OPEN curDatos FOR
      SELECT DISTINCT
        FOLIOPED,
        FECHA
      FROM (SELECT T.FOLIO_PEDIDO           FOLIOPED,
                   MIN(T.FECHA)             FECHA
              FROM RHEKT.UNI_INVENTARIO_C_SKU T
             WHERE T.FECHA_IMPACTO_SAP IS NOT NULL
               AND T.FLAG_PEND_PROC_SAP = cslFalso
               AND ID_EMPLEADO = paIdEmpleado
             GROUP BY T.FOLIO_PEDIDO
             UNION
            SELECT DS.FCFOLIOPEDIDO         FOLIOPED,
                   MIN(UICS.FECHA)          FECHA
              FROM RHEKT.TADISTRIBUCIONESSAP DS
             INNER JOIN RHEKT.UNI_INVENTARIO_C_SKU UICS
                ON UICS.ID_EMPLEADO = DS.FIIDEMPLEADO
               AND UICS.FOLIO_PEDIDO = DS.FCFOLIOPEDIDO
             WHERE DS.FIIDEMPLEADO = paIdEmpleado
             GROUP BY DS.FCFOLIOPEDIDO
            )
      ORDER BY FECHA DESC;
      RETURN curDatos;

    END FNOBTIENEFOLIOS;

  FUNCTION FNOBTIENEDESC(
    paIdEmpleado IN RHEKT.UNI_EMP_DESCTO_SAP.EMPLID%TYPE,
    paIdFolio    IN RHEKT.UNI_EMP_DESCTO_SAP.REFE%TYPE)
    RETURN rcgCursor
/*************************************************************
   Proyecto:                         Uniformes
   Descripcion:                      Funcion que obtiene los folios de los descuentos 
   Parametros de entrada:            paIdEmpleado = numero del empleado
   Parametros de salida:             emplid, soc, ccnom, refe, totdesc, fecpago, semdescto, aniodescto, saldo
   Parametros de entrada-salida      No aplica
   Precondiciones:                   Tener creado el esquema
   Creador:                          Othoniel Garcia Gonzalez
   Fecha de creacion:                Abril 2015
*************************************************************/
  IS
    curDatos rcgCursor;
    cslMexico   NUMBER(1) := 1;
-- Cursor que va a contener los datos enviados al usuario
    BEGIN
      OPEN curDatos FOR
      SELECT
        A.EMPLID                                   EMPID,
        A.SOC                                      SOCIEDAD,
        A.CCNOM,
        A.REFE,
        CASE C.IDPAIS
        WHEN cslMexico THEN
          CEIL(A.TOTDESC)
        ELSE
          A.TOTDESC
        END                                        TOTDESC,
        A.FECPAGO                                  FECHPAGO,
        A.SEMDESCTO                                SEMANADESC,
        A.ANIODESCTO,
        CASE C.IDPAIS
        WHEN cslMexico THEN
          CEIL(SALDO)
        ELSE
          SALDO
        END                                        SALDO,
        RHEKT.PAWEBUNIFORMES.FNDESCRIPCIONSKU(REFE) DESCGRAL,
        A.FNPAGO,
        NVL(P.FISEMANASDESCTO, 8)                  PERIODOS
      FROM
        RHEKT.UNI_EMP_DESCTO_SAP A
        INNER JOIN
        RHEKT.TAEMPLEADOINFO B
          ON A.EMPLID = B.FIEMPLEADONUM
        INNER JOIN
        RHEKT.UNI_CECO C
          ON B.FICENCOSNUM = C.IDCC
        LEFT JOIN
        RHEKT.UNI_PRECIO_PEDIDO P
          ON SUBSTR(A.REFE, 1, 8) = P.FOLIO_UNIFICADO
          AND SUBSTR(A.REFE, 10, INSTR(A.REFE, '-', 10) - 10) = TO_CHAR(P.NUM_PEDIDO)
      WHERE
        EMPLID = paIdEmpleado
        AND A.REFE LIKE CONCAT(paIdFolio, '%')
      ORDER BY A.FECPAGO, A.SALDO DESC;
      RETURN curDatos;
    END FNOBTIENEDESC;

  FUNCTION FNESTATUSPEDIDO(
    paIdEmpleado IN RHEKT.UNI_INVENTARIO_C_SKU.ID_EMPLEADO%TYPE,
    paNoPedido   IN RHEKT.UNI_INVENTARIO_C_SKU.NO_PEDIDO%TYPE,
    paNoFolio    IN RHEKT.UNI_INVENTARIO_C_SKU.FOLIO_PEDIDO%TYPE)
    RETURN NUMBER
  /*************************************************************
   Proyecto:                         Uniformes
   Descripcion:                      Funcion que obtiene el estatus del pedido 
   Parametros de entrada:            paIdEmpleado  Id del empleado
                                     paNoPedido    No. del pedido
                                     paNoFolio     No. del folio
   Parametros de salida:             No aplica
   Parametros de entrada-salida      No aplica
   Precondiciones:                   Tener creado el esquema
   Creador:                          Othoniel Garcia Gonzalez
   Fecha de creacion:                Abril 2015
  *************************************************************/
  IS
    vlTotalPrendas             NUMBER(2) := 0;
    vlEstatus                  NUMBER(2) := 0;
    cslPendienteAbasto         VARCHAR2(30) := 'Pendiente de enviar Abasto';
    cslEstatusSolicitado       NUMBER(2) := 1;
    cslEstatusAtendidoEnCd     NUMBER(2) := 3;
    cslEstatusEnviadoATienda   NUMBER(2) := 5;
    cslEstatusRecibidoEnTienda NUMBER(2) := 7;
    cslEstatusEntregado        NUMBER(2) := 9;
    cslEstatusCancelado        NUMBER(2) := 11;
    cslEstatusAsignado         NUMBER(2) := 13;
    cslEstatusAsigYEntregado   NUMBER(2) := 15;
    cslEstatusReinyectado      NUMBER(2) := 16;
    cslFalso                   NUMBER(1) := 0;
    cslVerdadero               NUMBER(1) := 1;
    cslPasoSolicitado          NUMBER(1) := 1;
    cslPasoAtendidoEnCD        NUMBER(1) := 2;
    cslPasoEnviadoATienda      NUMBER(1) := 3;
    cslPendiente               VARCHAR(1) := '0';
    cslEntregado               VARCHAR(1) := '1';
    cslCancelado               VARCHAR(1) := '3';
    cslReasignado              VARCHAR(1) := '4';
    cslReasignadoYEntregado    VARCHAR(1) := '5';
    cslReinyectado             VARCHAR(1) := '6';
    cslHuellaOK                NUMBER(1) := 2;
    BEGIN

      SELECT
        COUNT(ROWID)
      INTO vlTotalPrendas
      FROM RHEKT.UNI_INVENTARIO_C_SKU
      WHERE ID_EMPLEADO = paIdEmpleado
            AND (MENSAJE_AVASTO IN (SELECT
                                      TRIM(MSG_ABASTO)
                                    FROM RHEKT.UNI_PASOS_MINITRCK_CTRL
                                    WHERE PASO = cslPasoSolicitado)
                 OR MENSAJE_AVASTO IS NULL
                 OR MENSAJE_AVASTO = cslPendienteAbasto)
            AND ESTATUS = cslPendiente
            AND REMISION = cslFalso
            AND FECHA_REMISION IS NULL
            AND FOLIO_PEDIDO = paNoFolio
            AND NO_PEDIDO = paNoPedido;

      IF vlTotalPrendas > 0
      THEN
        RETURN cslEstatusSolicitado;
      END IF;

      SELECT
        COUNT(ROWID)
      INTO vlTotalPrendas
      FROM RHEKT.UNI_INVENTARIO_C_SKU
      WHERE ID_EMPLEADO = paIdEmpleado
            AND ESTATUS = cslPendiente
            AND REMISION = cslFalso
            AND FECHA_REMISION IS NULL
            AND MENSAJE_AVASTO IN (SELECT
                                     TRIM(MSG_ABASTO)
                                   FROM RHEKT.UNI_PASOS_MINITRCK_CTRL
                                   WHERE PASO = cslPasoAtendidoEnCD)
            AND FOLIO_PEDIDO = paNoFolio
            AND NO_PEDIDO = paNoPedido;

      IF vlTotalPrendas > 0
      THEN
        RETURN cslEstatusAtendidoEnCd;
      END IF;

      SELECT
        COUNT(ROWID)
      INTO vlTotalPrendas
      FROM RHEKT.UNI_INVENTARIO_C_SKU
      WHERE ID_EMPLEADO = paIdEmpleado
            AND ESTATUS = cslPendiente
            AND REMISION = cslFalso
            AND FECHA_REMISION IS NULL
            AND (TRIM(MENSAJE_AVASTO) LIKE '%TRANSITO%' OR MENSAJE_AVASTO IN (SELECT TRIM(MSG_ABASTO)
                                                                                FROM RHEKT.UNI_PASOS_MINITRCK_CTRL
                                                                                WHERE PASO = cslPasoEnviadoATienda))
            AND FOLIO_PEDIDO = paNoFolio
            AND NO_PEDIDO = paNoPedido;

      IF vlTotalPrendas > 0
      THEN
        RETURN cslEstatusEnviadoATienda;

      END IF;

      SELECT
        COUNT(ROWID)
      INTO vlTotalPrendas
      FROM RHEKT.UNI_INVENTARIO_C_SKU
      WHERE ID_EMPLEADO = paIdEmpleado
            AND ESTATUS = cslPendiente
            AND REMISION = cslVerdadero
            AND FECHA_REMISION IS NOT NULL
            AND FOLIO_PEDIDO = paNoFolio
            AND NO_PEDIDO = paNoPedido;

      IF vlTotalPrendas > 0
      THEN
        RETURN cslEstatusRecibidoEnTienda;
      END IF;

      SELECT
        COUNT(ROWID)
      INTO VLTOTALPRENDAS
      FROM RHEKT.UNI_INVENTARIO_C_SKU I
      WHERE ID_EMPLEADO = paIdEmpleado
            AND FOLIO_PEDIDO = paNoFolio
            AND NO_PEDIDO = paNoPedido
            AND I.ESTATUS = cslEntregado;

      IF vlTotalPrendas > 0
      THEN
        RETURN cslEstatusEntregado;
      END IF;

      SELECT
        COUNT(ROWID)
      INTO vlTotalPrendas
      FROM RHEKT.UNI_INVENTARIO_C_SKU
      WHERE ID_EMPLEADO = paIdEmpleado
            AND ESTATUS = cslReinyectado
            AND FOLIO_PEDIDO = paNoFolio
            AND NO_PEDIDO = paNoPedido;

      IF vlTotalPrendas > 0
      THEN
        RETURN cslEstatusReinyectado;
      END IF;
      
      SELECT
        COUNT(ROWID)
      INTO vlTotalPrendas
      FROM RHEKT.UNI_INVENTARIO_C_SKU
      WHERE ID_EMPLEADO = paIdEmpleado
            AND (CANCELADO = cslVerdadero OR ESTATUS = cslCancelado)
            AND FOLIO_PEDIDO = paNoFolio
            AND NO_PEDIDO = paNoPedido;

      IF vlTotalPrendas > 0
      THEN
        RETURN cslEstatusCancelado;
      END IF;

      
      
      SELECT
        COUNT(ROWID)
      INTO vlTotalPrendas
      FROM RHEKT.UNI_INVENTARIO_C_SKU
      WHERE ID_EMPLEADO = paIdEmpleado
            AND FOLIO_PEDIDO = paNoFolio
            AND ESTATUS = cslReasignado
            AND NO_PEDIDO = paNoPedido;
      IF vlTotalPrendas > 0
      THEN
        RETURN cslEstatusAsignado;
      END IF;
      

      SELECT
        COUNT(ROWID)
      INTO vlTotalPrendas
      FROM RHEKT.UNI_INVENTARIO_C_SKU
      WHERE ID_EMPLEADO = paIdEmpleado
            AND FOLIO_PEDIDO = paNoFolio
            AND ESTATUS = cslReasignadoYEntregado
            AND NO_PEDIDO = paNoPedido;
      IF vlTotalPrendas > 0
      THEN
        RETURN cslEstatusAsigYEntregado;
      END IF;
            
      RETURN -1;
    END FNESTATUSPEDIDO;

  FUNCTION FNESTATUSFOLIO(
    paIdEmpleado IN RHEKT.UNI_INVENTARIO_C_SKU.ID_EMPLEADO%TYPE,
    paNoFolio    IN RHEKT.UNI_INVENTARIO_C_SKU.FOLIO_PEDIDO%TYPE)
    RETURN NUMBER
/*************************************************************
   Proyecto:                         Uniformes
   Descripcion:                      Funcion que obtiene el estatus del detalle del pedido 
   Parametros de entrada:            paIdEmpleado  Id del empleado
                                     paNoFolio     No. del folio
   Parametros de salida:             No aplica
   Parametros de entrada-salida      No aplica
   Precondiciones:                   Tener creado el esquema
   Creador:                          Othoniel Garcia Gonzalez
   Fecha de creacion:                Abril 2015
*************************************************************/
  IS

    EP1                           ESTATUSPEDIDOS;
    EP2                           ESTATUSPEDIDOS;
    vlTotalPedidos                NUMBER(2) := 0;
    vlTotalPedidosSolicitados     NUMBER(2) := 0;
    vlTotalPedidosAtendidosCD     NUMBER(2) := 0;
    vlTotalPedidosEnviadosTienda  NUMBER(2) := 0;
    vlTotalPedidosRecibidosTienda NUMBER(2) := 0;
    vlTotalPedidosEntregados      NUMBER(2) := 0;
    vlTotalPedidosCancelados      NUMBER(2) := 0;
    vlTotalAsignadosDistrital     NUMBER(2) := 0;
    vlTotalEntregadosDistrital    NUMBER(2) := 0;
    vlIndex                       NUMBER(2) := 1;
    vlContador                    NUMBER(2) := 0;
    vlEstatus                     NUMBER(2) := 0;
    cslPendienteAbasto            VARCHAR2(30) := 'Pendiente de enviar Abasto';
    cslEstatusSolicitado       NUMBER(2) := 1;
    cslEstatusAtendidoEnCd     NUMBER(2) := 3;
    cslEstatusEnviadoATienda   NUMBER(2) := 5;
    cslEstatusRecibidoEnTienda NUMBER(2) := 7;
    cslEstatusEntregado        NUMBER(2) := 9;
    cslEstatusCancelado        NUMBER(2) := 11;
    cslEstatusAsignado         NUMBER(2) := 13;
    cslEstatusAsigYEntregado   NUMBER(2) := 15;
    cslFalso                   NUMBER(1) := 0;
    cslVerdadero               NUMBER(1) := 1;
    cslPasoSolicitado          NUMBER(1) := 1;
    cslPasoAtendidoEnCD        NUMBER(1) := 2;
    cslPasoEnviadoATienda      NUMBER(1) := 3;
    cslPendiente               VARCHAR(1) := '0';
    cslEntregado               VARCHAR(1) := '1';
    cslReasignado              VARCHAR(1) := '4';
    cslReasignadoYEntregado    VARCHAR(1) := '5';
    cslReinyectado             VARCHAR(1) := '6';
    cslHuellaOK                NUMBER(1) := 2;
    BEGIN

-- Total pedidos
      SELECT
        COUNT(ROWID)
      INTO vlTotalPedidos
      FROM RHEKT.UNI_INVENTARIO_C_SKU
      WHERE ID_EMPLEADO = paIdEmpleado
            AND FOLIO_PEDIDO = paNoFolio;

--  Solicitados
      SELECT
        COUNT(ROWID)
      INTO vlTotalPedidosSolicitados
      FROM RHEKT.UNI_INVENTARIO_C_SKU
      WHERE ID_EMPLEADO = paIdEmpleado
            AND (MENSAJE_AVASTO IN (SELECT
                                      TRIM(MSG_ABASTO)
                                    FROM RHEKT.UNI_PASOS_MINITRCK_CTRL
                                    WHERE PASO = cslPasoSolicitado)
                 OR MENSAJE_AVASTO IS NULL
                 OR MENSAJE_AVASTO LIKE cslPendienteAbasto)
            AND ESTATUS = cslPendiente
            AND REMISION = cslFalso
            AND FECHA_REMISION IS NULL
            AND FOLIO_PEDIDO = paNoFolio;

-- Atendidos en CD
      SELECT
        COUNT(ROWID)
      INTO vlTotalPedidosAtendidosCD
      FROM RHEKT.UNI_INVENTARIO_C_SKU
      WHERE ID_EMPLEADO = paIdEmpleado
            AND ESTATUS = cslPendiente
            AND REMISION = cslFalso
            AND FECHA_REMISION IS NULL
            AND MENSAJE_AVASTO IN (SELECT
                                     TRIM(MSG_ABASTO)
                                   FROM RHEKT.UNI_PASOS_MINITRCK_CTRL
                                   WHERE PASO = cslPasoAtendidoEnCD)
            AND FOLIO_PEDIDO = paNoFolio;

-- Enviado a tienda
      SELECT
        COUNT(ROWID)
      INTO vlTotalPedidosEnviadosTienda
      FROM RHEKT.UNI_INVENTARIO_C_SKU
      WHERE ID_EMPLEADO = paIdEmpleado
            AND ESTATUS = cslPendiente
            AND REMISION = cslFalso
            AND FECHA_REMISION IS NULL
            AND (TRIM(MENSAJE_AVASTO) LIKE '%TRANSITO%' OR MENSAJE_AVASTO IN (SELECT
                                                                                TRIM(MSG_ABASTO)
                                                                              FROM RHEKT.UNI_PASOS_MINITRCK_CTRL
                                                                              WHERE PASO = cslPasoEnviadoATienda))
            AND FOLIO_PEDIDO = paNoFolio;

-- Recibido en tienda
      SELECT
        COUNT(ROWID)
      INTO vlTotalPedidosRecibidosTienda
      FROM RHEKT.UNI_INVENTARIO_C_SKU
      WHERE ID_EMPLEADO = paIdEmpleado
            AND ESTATUS = cslPendiente
            AND REMISION = cslVerdadero
            AND FECHA_REMISION IS NOT NULL
            AND FOLIO_PEDIDO = paNoFolio;

-- Entregados
      SELECT
        COUNT(ROWID)
      INTO vlTotalPedidosEntregados
      FROM RHEKT.UNI_INVENTARIO_C_SKU I
      WHERE ID_EMPLEADO = paIdEmpleado
            AND FOLIO_PEDIDO = paNoFolio
            AND I.ESTATUS_PHUELLA = cslHuellaOK
            AND I.FECHA_SHUELLA IS NOT NULL
            AND I.CANCELADO = cslFalso
            AND I.ESTATUS = cslEntregado;

-- Cancelados
      SELECT
        COUNT(ROWID)
      INTO vlTotalPedidosCancelados
      FROM RHEKT.UNI_INVENTARIO_C_SKU
      WHERE ID_EMPLEADO = paIdEmpleado
            AND CANCELADO = cslVerdadero
            AND ESTATUS != cslReinyectado
            AND FOLIO_PEDIDO = paNoFolio;

-- Asignados a distrital
      SELECT
        COUNT(ROWID)
      INTO vlTotalAsignadosDistrital
      FROM RHEKT.UNI_INVENTARIO_C_SKU
      WHERE ID_EMPLEADO = paIdEmpleado
            AND FOLIO_PEDIDO = paNoFolio
            AND ESTATUS = cslReasignado;

-- Entregados a distrital
      SELECT
        COUNT(ROWID)
      INTO vlTotalEntregadosDistrital
      FROM RHEKT.UNI_INVENTARIO_C_SKU
      WHERE ID_EMPLEADO = paIdEmpleado
            AND FOLIO_PEDIDO = paNoFolio
            AND ESTATUS = cslReasignadoYEntregado;

      EP1(1).ID_ESTATUS := cslEstatusSolicitado;
      EP1(1).NO_PEDIDOS := vlTotalPedidosSolicitados;

      EP1(2).ID_ESTATUS := cslEstatusAtendidoEnCd;
      EP1(2).NO_PEDIDOS := vlTotalPedidosAtendidosCD;

      EP1(3).ID_ESTATUS := cslEstatusEnviadoATienda;
      EP1(3).NO_PEDIDOS := vlTotalPedidosEnviadosTienda;

      EP1(4).ID_ESTATUS := cslEstatusRecibidoEnTienda;
      EP1(4).NO_PEDIDOS := vlTotalPedidosRecibidosTienda;

      EP1(5).ID_ESTATUS := cslEstatusEntregado;
      EP1(5).NO_PEDIDOS := vlTotalPedidosEntregados;

      EP1(6).ID_ESTATUS := cslEstatusCancelado;
      EP1(6).NO_PEDIDOS := vlTotalPedidosCancelados;

      EP1(7).ID_ESTATUS := cslEstatusAsignado;
      EP1(7).NO_PEDIDOS := vlTotalAsignadosDistrital;

      EP1(8).ID_ESTATUS := cslEstatusAsigYEntregado;
      EP1(8).NO_PEDIDOS := vlTotalEntregadosDistrital;

      FOR i IN EP1.FIRST..EP1.LAST
      LOOP
        IF EP1.EXISTS(i)
        THEN
          IF EP1(i).NO_PEDIDOS > 0
          THEN
            vlContador := vlContador + 1;
            EP2(vlContador).ID_ESTATUS := EP1(i).ID_ESTATUS;
            EP2(vlContador).NO_PEDIDOS := EP1(i).NO_PEDIDOS;
          END IF;
        END IF;
      END LOOP;

-- Si vlContador = 1 todos los pedidos estan en un estatus y se regresa el estatus
      IF vlContador = 1
      THEN
        vlEstatus := ep2(1).ID_ESTATUS;
        RETURN vlEstatus;
      ELSIF vlContador > 1
        THEN
          vlEstatus := ep2(2).ID_ESTATUS - 1;
          RETURN vlEstatus;
      ELSIF vlContador <= 0
        THEN
          RETURN -1;
      END IF;

      RETURN vlContador;

      EXCEPTION WHEN OTHERS THEN
      RETURN ' ERROR ' || to_number(SQLCODE) || ' : ' || SQLERRM || ' ::::: ' || DBMS_UTILITY.FORMAT_ERROR_BACKTRACE;
    END FNESTATUSFOLIO;

  PROCEDURE SPOBTIENETIENDAS(
    paIdEmpleado    IN  RHEKT.TAEMPLEADOINFO.FIEMPLEADONUM%TYPE,
    paNegocio       IN  RHEKT.TAFUNCIONESXNEGOCIO.FINEGOCIO%TYPE,
    paTodasLasSucur OUT rcgCursor,
    paSucurPorEmp   OUT rcgCursor)
/*************************************************************
   Proyecto:                         Uniformes
   Descripcion:                      Funcion que obtiene los folios de los descuentos 
   Parametros de entrada:            paIdEmpleado Id del empleado
                                     paNegocio Id de la compañía
   Parametros de salida:             paTodasLasSucur  cursor para sucursales
                                     paSucurPorEmp  cursor para sucursales por empleado
                                     paError Error generado
   Parametros de entrada-salida      No aplica
   Precondiciones:                   Tener creado el esquema
   Creador:                          Othoniel Garcia Gonzalez
   Fecha de creacion:                23/12/2013
*************************************************************/
  IS
    cslNegocioEkt   NUMBER(2) := 1;
    cslNegocioSyr   NUMBER(2) := 2;
    cslNegocioCdt   NUMBER(2) := 3;
    cslNegocioDek   NUMBER(2) := 4;
    cslTNeto        NUMBER(2) := 5;
    cslNegocioRem   NUMBER(2) := 7;
    cslNegocioPp    NUMBER(2) := 8;
    cslPrefijoSuc   VARCHAR(2) := '52';
    cslCanalEKT     VARCHAR(1) := '1';
    cslCanalSYR     VARCHAR(1) := '3';
    cslActivo       NUMBER(1) := 1;
    cslMexico       NUMBER(1) := 1;
    curEstados      rcgCursor;
    vlTabXMunicipio TYPTABSUCUREMP;
    vlTabSucurEmp   TYPTABSUCUREMP;
    vlBand          BOOLEAN := FALSE;
    vlContadorVolante  NUMBER(3) := 0;
    vlCentroCostos  RHEKT.TAEMPLEADOINFO.FICENCOSNUM%TYPE := 0;
    vlEstado        RHEKT.TACENTROSCOMERCIALES.FCESTADO%TYPE := '';
    vlMunicipio     RHEKT.TACENTROSCOMERCIALES.FCMUNICIPIO%TYPE := '';
    BEGIN
      SELECT
        COUNT(FNC.ROWID)
      INTO vlContadorVolante
      FROM RHEKT.TAFUNCIONESCIA FNC
        INNER JOIN RHEKT.TAEMPLEADOINFO RH
          ON RH.FIFUNCIONNUM = FNC.FIFUNCIONUM
      WHERE RH.FIEMPLEADONUM = paIdEmpleado;

      IF (paNegocio = cslNegocioEkt
          OR paNegocio = cslNegocioSyr)
         AND (vlContadorVolante <= 1)
      THEN
        SELECT
          TYPREGSUCUREMP(
              SUC.FISUCURSAL,
              SUC.FCDESCRIPCION)
        BULK COLLECT INTO vlTabSucurEmp
        FROM RHEKT.UNI_CECO T
          INNER JOIN RHEKT.TAEMPLEADOINFO SAP
            ON T.IDCC = SAP.FICENCOSNUM
          INNER JOIN RHEKT.TASUCURSALES SUC
            ON SUC.FISUCURSAL = T.NUMECO
           AND SUC.FIBANDRECIBEUNIFORME = cslActivo
        WHERE SAP.FIEMPLEADONUM = paIdEmpleado;

        IF vlTabSucurEmp.COUNT > 0
        THEN
          vlBand := TRUE;
          OPEN paSucurPorEmp FOR
          SELECT
            NUMECO,
            NOMBRE
          FROM TABLE (CAST(vlTabSucurEmp AS TYPTABSUCUREMP));
          OPEN paTodasLasSucur FOR
          SELECT
            1
          FROM DUAL
          WHERE 1 = 2;
        END IF;
      END IF;

      IF vlBand = FALSE
      THEN


        SELECT
            FICENCOSNUM
        INTO vlCentroCostos
        FROM RHEKT.TAEMPLEADOINFO
        WHERE FIEMPLEADONUM = paIdEmpleado;

        SELECT FCESTADO,
               FCMUNICIPIO
          INTO vlEstado,
               vlMunicipio
          FROM RHEKT.TACENTROSCOMERCIALES
         WHERE FCIDCC = vlCentroCostos;
         
        SELECT
          TYPREGSUCUREMP(
              FINUMECO
              , FCNOMBRE)
        BULK COLLECT INTO vlTabXMunicipio
        FROM RHEKT.TACENTROSCOMERCIALES
        WHERE FCMUNICIPIO = vlMunicipio
              AND SUBSTR(TO_CHAR(FCIDCC), 0, 2) = cslPrefijoSuc
              AND TRIM(FCIDCANAL) IN (cslCanalEKT, cslCanalSYR)
              AND FIIDPAIS = cslMexico
              AND FISTATUS = cslActivo
        ORDER BY FINUMECO;

        IF vlTabXMunicipio.COUNT > 0
        THEN
          OPEN paSucurPorEmp FOR
          SELECT
            NUMECO,
            NOMBRE
          FROM TABLE (CAST(vlTabXMunicipio AS TYPTABSUCUREMP));

          OPEN paTodasLasSucur FOR
          SELECT
            FINUMECO AS NUMECO,
            FCNOMBRE AS NOMBRE
          FROM RHEKT.TACENTROSCOMERCIALES
          WHERE SUBSTR(TO_CHAR(FCIDCC), 0, 2) = cslPrefijoSuc
                AND TRIM(FCIDCANAL) IN (cslCanalEKT, cslCanalSYR)
                AND FISTATUS = cslActivo
                AND FIIDPAIS = cslMexico
                AND FINUMECO NOT IN (SELECT
                                       NUMECO
                                     FROM TABLE (CAST(vlTabXMunicipio AS TYPTABSUCUREMP)));

        ELSE
          OPEN paSucurPorEmp FOR
          SELECT
            FINUMECO AS NUMECO,
            FCNOMBRE AS NOMBRE
          FROM RHEKT.TACENTROSCOMERCIALES
          WHERE FCESTADO = vlEstado
                AND SUBSTR(TO_CHAR(FCIDCC), 0, 2) = cslPrefijoSuc
                AND TRIM(FCIDCANAL) IN (cslCanalEKT, cslCanalSYR)
                AND FIIDPAIS = cslMexico
                AND FISTATUS = cslActivo
          ORDER BY FINUMECO;

          OPEN paTodasLasSucur FOR
          SELECT
            FINUMECO AS NUMECO,
            FCNOMBRE AS NOMBRE
          FROM RHEKT.TACENTROSCOMERCIALES
          WHERE SUBSTR(TO_CHAR(FCIDCC), 0, 2) = cslPrefijoSuc
                AND TRIM(FCIDCANAL) IN (cslCanalEKT, cslCanalSYR)
                AND FISTATUS = cslActivo
                AND FIIDPAIS = cslMexico
                AND FINUMECO NOT IN (SELECT
                                       FINUMECO
                                     FROM RHEKT.TACENTROSCOMERCIALES
                                     WHERE FCESTADO = vlEstado
                                           AND SUBSTR(TO_CHAR(FCIDCC), 0, 2) = cslPrefijoSuc
                                           AND TRIM(FCIDCANAL) IN (cslCanalEKT, cslCanalSYR)
                                           AND FIIDPAIS = cslMexico
                                           AND FISTATUS = cslActivo)
          ORDER BY FINUMECO;

        END IF;

      END IF;

    END SPOBTIENETIENDAS;

  FUNCTION FNSOLFOLIOENTREGA
    RETURN VARCHAR2
/*************************************************************
   Proyecto:                           Uniformes
   Descripcion:                        FNSOLFOLIOENTREGA
   Parametros de entrada:              No aplica
   Parametros de salida:               No aplica
   Parametros de entrada-salida        No aplica
   Precondiciones:                     Tener creado el esquema
   Creador:                            Othoniel Garcia Gonzalez
   Fecha dcreacion:                    Abril 2015
*************************************************************/
  AS

  PRAGMA AUTONOMOUS_TRANSACTION;
    vlMaxc         NUMBER(5) := 99999;
    vlPos1         INT := 0;
    vlPos2         INT := 0;
    vlPos3         INT := 0;
    vlFolio        VARCHAR2(9) := '';
    vlNextVal      NUMBER(5) := 0;
    cslValorAsciiA NUMBER(2) := ASCII('A');
    cslValorAsciiZ NUMBER(2) := ASCII('Z');
    BEGIN
      vlNextVal := RHEKT.FOLIO_UNIFORMES_NVAENTREGA.NEXTVAL;

      SELECT
        POS1 || POS2 || POS3 || TRIM(TO_CHAR(vlNextVal, '00000')),
        ASCII(POS1),
        ASCII(POS2),
        ASCII(POS3)
      INTO vlFolio,
        vlPos1,
        vlPos2,
        vlPos3
      FROM RHEKT.UNI_SEQ_LETRAS_NVAENTREGA;


      IF vlNextVal = vlMaxc
      THEN

        IF vlPos3 < cslValorAsciiZ
        THEN
          vlPos3 := vlPos3 + 1;
        ELSE
          vlPos3 := cslValorAsciiA;
          IF vlPos2 < cslValorAsciiZ
          THEN
            vlPos2 := vlPos2 + 1;
          ELSE
            vlPos2 := cslValorAsciiA;
            IF vlPos1 < cslValorAsciiZ
            THEN
              vlPos1 := vlPos1 + 1;
            ELSE
              vlPos1 := cslValorAsciiA;
            END IF;
          END IF;
        END IF;

        UPDATE RHEKT.UNI_SEQ_LETRAS_NVAENTREGA
        SET POS1 = CHR(vlPos1),
          POS2   = CHR(vlPos2),
          POS3   = CHR(vlPos3);
        COMMIT;
      END IF;

      RETURN vlFolio;


    END FNSOLFOLIOENTREGA;

  PROCEDURE SPOBTIENEDESCRIPCIONPEDIDOS(
    paArraySKU IN  VARCHAR,
    paEmp      IN  RHEKT.UNI_INVENTARIO_C_SKU.ID_EMPLEADO%TYPE,
    paIdTienda IN  RHEKT.TASUCURSALES.FISUCURSAL%TYPE,
    paCantidad OUT NUMBER)
  IS
/*************************************************************
   Proyecto:                           Uniformes
   Descripcion:                        SPOBTIENEDESCRIPCIONPEDIDOS
   Parametros de entrada:              paArraySKU Array de SKU's
                                       paEmp Id del empleado
                                       paIdTienda Id de la tienda
   Parametros de salida:               paCantidad   Cantidad de registros
   Parametros de entrada-salida        No aplica
   Precondiciones:                     Tener creado el esquema
   Creador:                            Othoniel Garcia Gonzalez
   Fecha dcreacion:                    07-01-2014
*************************************************************/
    vlCadExec VARCHAR(500) := '';
    vlContador   NUMBER(2);
    cslFalso     NUMBER(1) := 0;
    BEGIN

      SELECT
        COUNT(ROWID)
      INTO vlContador
      FROM RHEKT.EXCEPTION_SOLICITA_UNIFORMES
      WHERE ID_EMPLEADO = paEmp
            AND SOLICITADO = cslFalso;

      IF vlContador = 0
      THEN

        vlCadExec :=
        'SELECT COUNT(ROWID) ' ||
        '  FROM RHEKT.UNI_INVENTARIO_C_SKU ' ||
        ' WHERE SKU IN (' || paArraySKU || ') ' ||
        '   AND ID_EMPLEADO = ' || paEmp || ' ' ||
        '   AND ESTATUS = ''0'' ' ||
        '   AND TRUNC(FECHA) = TRUNC(SYSDATE) ';

        EXECUTE IMMEDIATE vlCadExec
        INTO paCantidad;
      ELSE
        paCantidad := 0;
      END IF;

    END SPOBTIENEDESCRIPCIONPEDIDOS;

  PROCEDURE SPINSERTAPEDIDO(
      paIdEmpleado   IN  RHEKT.UNI_INVENTARIO_C_SKU.ID_EMPLEADO%TYPE
    , paSKU          IN  RHEKT.UNI_INVENTARIO_C_SKU.SKU%TYPE
    , paNoPedido     IN  RHEKT.UNI_INVENTARIO_C_SKU.NO_PEDIDO%TYPE
    , paNoTienda     IN  RHEKT.UNI_INVENTARIO_C_SKU.NO_TIENDA%TYPE
    , paNegocio      IN  RHEKT.UNI_CAT_CIA.ID%TYPE
    , paPais         IN  RHEKT.UNI_INVENTARIO_C_SKU.PAIS%TYPE
    , paFnFuncionNum IN  RHEKT.UNI_INVENTARIO_C_SKU.FNFUNCION_NUM%TYPE
    , paFolioPedido  IN  RHEKT.UNI_INVENTARIO_C_SKU.FOLIO_PEDIDO%TYPE
    , paTipoSolicitud IN  RHEKT.UNI_INVENTARIO_C_SKU.FIIDTIPOSOLICITUD%TYPE
    , paCount        OUT NUMBER)
/*************************************************************
   Proyecto:                           Uniformes
   Descripcion:                        SPINSERTAPEDIDO
   Parametros de entrada:              paIdEmpleado Id del empleado
                                       paSKU Id de la prenda
                                       paNoPedido No. del pedido
                                       paNoTienda No. de la tienda
                                       paNegocio  No. del negocio
                                       paPais Id del pais
                                       paFnFuncionNum Función de empleado
                                       paFolioPedido Folio del pedido
                                       paTipoSolicitud 1-Ord, 2-Ext c/costo, 3-Ext s/costo
   Parametros de salida:               No aplica
   Parametros de entrada-salida        No aplica
   Precondiciones:                     Tener creado el esquema
   Creador:                            Othoniel Garcia Gonzalez
   Fecha dcreacion:                    Abril 2015
*************************************************************/
  IS
    cslPendiente        VARCHAR(30) := 'Pendiente de enviar Abasto';
    cslFalso            NUMBER(1) := 0;
    cslVerdadero        NUMBER(1) := 1;
    cslCero             NUMBER(1) := 0;
    
    vlPrecSubKit        RHEKT.TASUBKITS.FNPRECIO%TYPE := 0;
    vlDescSKU           RHEKT.UNI_PIEZA_UNIFORME.DESCRIPCION%TYPE := '';
    vlDescGral          RHEKT.UNI_PRODUCTO_CATEGORIA.CATDESCR%TYPE := '';
    vlSemanasDescto     RHEKT.TAKITUNIFORMES.FISEMANASDESCTO%TYPE := 0;
    vlPrecioSKU         RHEKT.UNI_PIEZA_UNIFORME.PRECIO%TYPE := 0;
    vlCont              NUMBER := 0;
    cslSolicitado       NUMBER(1) := 1;
    cslHuellaOK         NUMBER(1) := 2;
    cslCantidad         NUMBER(1) := 1;
    vlIdSubkit          RHEKT.TASUBKITS.FIIDSUBKIT%TYPE := 0;
    
    vlFolioRepos        RHEKT.TAREPOSICIONES.FIFOLIOREPOSICION%TYPE := 0;
    vlEmpAutoriza       RHEKT.TAREPOSICIONES.FIEMPLEADOAUTORIZA%TYPE := 0;
    cslAutConCosto      RHEKT.TAREPOSICIONES.FIFOLIOREPOSICION%TYPE := 20;
    cslAutSinCosto      RHEKT.TAREPOSICIONES.FIFOLIOREPOSICION%TYPE := 30;
    cslRepGenerada      RHEKT.TAREPOSICIONES.FIFOLIOREPOSICION%TYPE := 40;
    
    vlTipoSolExtCC      RHEKT.UNI_INVENTARIO_C_SKU.FIIDTIPOSOLICITUD%TYPE := 2;
    vlNombreAutoriza    RHEKT.UNI_INVENTARIO_C_SKU.FCNOMBREAUTORIZANTE%TYPE := ' ';
    excerror EXCEPTION;
    BEGIN

      BEGIN
        INSERT INTO RHEKT.TAPEDIDOBITACORA (FCFOLIOPEDIDO
          , FIIDEMPLEADO
          , FIIDESTATUS)
        VALUES (paFolioPedido
          , paIdEmpleado
          , cslSolicitado);
        EXCEPTION
        WHEN DUP_VAL_ON_INDEX THEN
        NULL;
      END;

      BEGIN
        SELECT
          PZ.DESCRIPCION,
          SK.FIIDSUBKIT,
          SK.FCDESCRIPCION,
          CASE WHEN (paTipoSolicitud = vlTipoSolExtCC)
               THEN SK.FNPRECIOEXT
               ELSE SK.FNPRECIO
          END,
          SK.FICANTIDAD,
          KIT.FISEMANASDESCTO,
          PZ.PRECIO
        INTO vlDescSKU,
          vlIdSubkit,
          vlDescGral,
          vlPrecSubKit,
          vlCont,
          vlSemanasDescto,
          vlPrecioSKU
        FROM RHEKT.TAFUNCIONESXNEGOCIO RCFK
          INNER JOIN RHEKT.TAKITXCEDIS CDK
            ON CDK.FIIDKIT = RCFK.FIIDKIT
          INNER JOIN RHEKT.TASUCURSALES CT
            ON CT.FIIDCDISTRIBUCION = CDK.FIIDCEDIS
          INNER JOIN RHEKT.TAKITUNIFORMES KIT
            ON RCFK.FIIDKIT = KIT.FIIDKIT
          INNER JOIN RHEKT.TASUBKITSXKIT RKS
            ON RKS.FIIDKIT = KIT.FIIDKIT
          INNER JOIN RHEKT.TASUBKITS SK
            ON SK.FIIDSUBKIT = RKS.FIIDSUBKIT
          INNER JOIN RHEKT.TASKUSXSUBKIT RSS
            ON RSS.FIIDSUBKIT = SK.FIIDSUBKIT
          LEFT JOIN RHEKT.TAENSAMBLESXSKU EN1
            ON RSS.FISKU = EN1.FISKU
          LEFT JOIN RHEKT.TAENSAMBLESXSKU EN2
            ON EN1.FIIDENSAMBLE = EN2.FIIDENSAMBLE            
         INNER JOIN RHEKT.UNI_PIEZA_UNIFORME PZ
            ON PZ.SKU = NVL(EN2.FISKU, RSS.FISKU)
        WHERE RCFK.FINEGOCIO = paNegocio
              AND RCFK.FIIDFUNCION = paFnFuncionNum
              AND RCFK.FIPARCIAL = cslVerdadero
              AND PZ.SKU = paSKU
              AND CT.FISUCURSAL = paNoTienda;
        EXCEPTION
        WHEN NO_DATA_FOUND THEN
        SELECT
          PZ.DESCRIPCION,
          SK.FIIDSUBKIT,
          SK.FCDESCRIPCION,
          CASE WHEN (paTipoSolicitud = vlTipoSolExtCC)
               THEN SK.FNPRECIOEXT
               ELSE SK.FNPRECIO
          END,
          SK.FICANTIDAD,
          KIT.FISEMANASDESCTO,
          PZ.PRECIO
        INTO vlDescSKU,
          vlIdSubkit,
          vlDescGral,
          vlPrecSubKit,
          vlCont,
          vlSemanasDescto,
          vlPrecioSKU
        FROM RHEKT.TAFUNCIONESXNEGOCIO RCFK
          INNER JOIN RHEKT.TAKITUNIFORMES KIT
            ON RCFK.FIIDKIT = KIT.FIIDKIT
          INNER JOIN RHEKT.TASUBKITSXKIT RKS
            ON RKS.FIIDKIT = KIT.FIIDKIT
          INNER JOIN RHEKT.TASUBKITS SK
            ON SK.FIIDSUBKIT = RKS.FIIDSUBKIT
          INNER JOIN RHEKT.TASKUSXSUBKIT RSS
            ON RSS.FIIDSUBKIT = SK.FIIDSUBKIT
          LEFT JOIN RHEKT.TAENSAMBLESXSKU EN1
            ON RSS.FISKU = EN1.FISKU
          LEFT JOIN RHEKT.TAENSAMBLESXSKU EN2
            ON EN1.FIIDENSAMBLE = EN2.FIIDENSAMBLE               
          INNER JOIN RHEKT.UNI_PIEZA_UNIFORME PZ
            ON PZ.SKU = NVL(EN2.FISKU, RSS.FISKU)
        WHERE RCFK.FINEGOCIO = paNegocio
              AND RCFK.FIIDFUNCION = paFnFuncionNum
              AND RCFK.FIPARCIAL = cslFalso
              AND PZ.SKU = paSKU;
      END;

      BEGIN
        SELECT R.FIFOLIOREPOSICION,
               R.FIEMPLEADOAUTORIZA,
               RH.FCEMPLEADONOMBRE
          INTO vlFolioRepos,
               vlEmpAutoriza,
               vlNombreAutoriza       
          FROM RHEKT.TAREPOSICIONES R
         INNER JOIN RHEKT.TAEMPLEADOINFO RH
            ON RH.FIEMPLEADONUM = R.FIEMPLEADOAUTORIZA
         WHERE R.FIEMPLEADO = paIdEmpleado
           AND R.FIIDSUBKIT = vlIdSubkit
           AND R.FIESTATUSREPOSICION IN (cslAutConCosto, cslAutSinCosto);
      EXCEPTION
        WHEN NO_DATA_FOUND THEN 
          vlFolioRepos := cslCero;
          vlEmpAutoriza := cslCero;     
      END;

      INSERT INTO RHEKT.UNI_PRECIO_PEDIDO (FOLIO_UNIFICADO
        , NUM_PEDIDO
        , PRECIO_C_DESC_TOTAL
        , FISEMANASDESCTO)
      VALUES (paFolioPedido
        , paNoPedido
        , vlPrecSubKit
        , vlSemanasDescto);

      paCount := cslCero;
      FOR i IN 1..vlCont LOOP
        INSERT INTO RHEKT.UNI_INVENTARIO_C_SKU (ID_EMPLEADO
          , SKU
          , DESC_SKU
          , CANTIDAD
          , DESC_GENERAL
          , NO_PEDIDO
          , NO_TIENDA
          , CANAL
          , PAIS
          , FECHA
          , ESTATUS
          , CONSECUTIVO
          , TIPO
          , REMISION
          , CONFIRMACION
          , DEVUELTO
          , CANCELADO
          , FNFUNCION_NUM
          , MENSAJE_AVASTO
          , FLAG_PROCESS
          , FOLIO_ENT
          , PRECIO
          , CONFIRMACION_SAP
          , CONFIRMACION_SPPI
          , FLAG_PEND_PROC_SAP
          , FLAG_PEND_PROC_SPPI
          , PRECIO_C_DESC
          , SEMANA_DESC_INICIO
          , ANIO_DESC
          , NO_REMISION
          , ENVIOEMAIL
          , AUTOMATICO
          , FOLIO_PEDIDO
          , FIIDTIPOSOLICITUD
          , FIEMPLEADOAUTORIZA
          , FCNOMBREAUTORIZANTE)
        VALUES (paIdEmpleado
          , paSKU
          , vlDescSKU
          , cslCantidad
          , vlDescGral
          , paNoPedido
          , paNoTienda
          , paNegocio
          , paPais
          , SYSDATE
          , cslFalso
          , i
          , cslHuellaOK
          , cslFalso
          , cslFalso
          , cslFalso
          , cslFalso
          , paFnFuncionNum
          , cslPendiente
          , cslFalso
          , cslFalso
          , vlPrecioSKU
          , cslFalso
          , cslFalso
          , cslFalso
          , cslFalso
          , vlPrecSubKit / vlCont
          , cslFalso
          , cslFalso
          , cslFalso
          , cslFalso
          , cslFalso
          , paFolioPedido
          , paTipoSolicitud
          , vlEmpAutoriza
          , vlNombreAutoriza);
        paCount := paCount + SQL%ROWCOUNT;
      END LOOP;

      -- Si el empleado estaba en la tabla de excepciones se actualiza
      UPDATE RHEKT.EXCEPTION_SOLICITA_UNIFORMES
      SET SOLICITADO = cslVerdadero
      WHERE ID_EMPLEADO = paIdEmpleado;
    
      -- Si la solicitud proviene de una reposicion esta se actualiza
      UPDATE RHEKT.TAREPOSICIONES 
         SET FIPEDIDO = paNoPedido,
             FISUCURSAL = paNoTienda,
             FNPRECIO = vlPrecSubKit,
             FIESTATUSREPOSICION = cslRepGenerada
       WHERE FIFOLIOREPOSICION = vlFolioRepos;
      
      -- Actualiza Inventario del CD
      UPDATE RHEKT.TAINVENTARIOXCEDIS
         SET FICANTIDAD = GREATEST(FICANTIDAD - vlCont, 0)
       WHERE FISKU = paSKU
         AND FIIDCEDIS = (SELECT FIIDCDISTRIBUCION
                            FROM RHEKT.TASUCURSALES
                           WHERE FISUCURSAL = paNoTienda);
  END SPINSERTAPEDIDO;

  PROCEDURE SPOBTIENEPOSICIONAYUDA(paIdEmp IN  RHEKT.UNI_INVENTARIO_C_SKU.ID_EMPLEADO%TYPE,
                                   paRet   OUT VARCHAR)
/*************************************************************
   Proyecto:                           Uniformes
   Descripcion:                        SPOBTIENEPOSICIONAYUDA
   Parametros de entrada:              paIdEmp  Id del empleado
   Parametros de salida:               paRet Estatus
   Parametros de entrada-salida        No aplica
   Precondiciones:                     Tener creado el esquema
   Creador:                            Othoniel Garcia Gonzalez
   Fecha dcreacion:                    Abril 2015
*************************************************************/
  IS
    vlSaldo       NUMBER := 0;
    vlFolioPedido RHEKT.UNI_INVENTARIO_C_SKU.FOLIO_PEDIDO%TYPE := NULL;
    cslPendiente    VARCHAR(1) := '0';
    cslEntregado    VARCHAR(1) := '1';
    cslCancelado    VARCHAR(1) := '3';
    cslSinposicon   VARCHAR(30) := 'SINPOSICION';
    cslSolicitud    VARCHAR(30) := 'SOLICITUD';
    cslEstatus      VARCHAR(30) := 'ESTATUSPEDIDO';
    cslDescuento    VARCHAR(30) := 'ESTATUSDESCUENTO';
    cslEstatusEntregado        NUMBER(2) := 9;
    BEGIN

      paRet := cslSinposicon;

      BEGIN
        SELECT
          T.FOLIO_PEDIDO
        INTO vlFolioPedido
        FROM (SELECT
                FOLIO_PEDIDO
              FROM RHEKT.UNI_INVENTARIO_C_SKU
              WHERE ID_EMPLEADO = paIdEmp
                    AND ESTATUS IN (cslPendiente, cslEntregado, cslCancelado)
              ORDER BY FECHA DESC) T
        WHERE ROWNUM = 1;

        EXCEPTION
        WHEN NO_DATA_FOUND THEN
        NULL;
      END;

      IF vlFolioPedido IS NULL
      THEN

        paRet := cslSolicitud;
      ELSE

        IF FNESTATUSFOLIO(paIdEmp, vlFolioPedido) <> cslEstatusEntregado
        THEN

          paRet := cslEstatus;
        ELSE

          SELECT
            COUNT(ROWID)
          INTO vlSaldo
          FROM RHEKT.UNI_EMP_DESCTO_SAP
          WHERE EMPLID = paIdEmp
                AND REFE LIKE CONCAT(vlFolioPedido, '%');

          IF vlSaldo <> 0
          THEN
            paRet := cslDescuento;
          END IF;
        END IF;
      END IF;
    END SPOBTIENEPOSICIONAYUDA;

  FUNCTION FNOBTIENEPEDIDOSPENDIENTES(paIdEmp   IN RHEKT.TAEMPLEADOINFO.FIEMPLEADONUM%TYPE,
                                      paEstatus IN RHEKT.UNI_INVENTARIO_C_SKU.ESTATUS%TYPE)
    RETURN rcgCursor
/*************************************************************
   Proyecto:                           Uniformes
   Descripcion:                        FNOBTIENEPEDIDOSPENDIENTES
   Parametros de entrada:              paIdEmp Id del empleado
                                       paEstatus Estatus del pedido
   Parametros de salida:               No aplica
   Parametros de entrada-salida        No aplica
   Precondiciones:                     Tener creado el esquema
   Creador:                            Othoniel Garcia Gonzalez
   Fecha dcreacion:                    Abril 2015
*************************************************************/
  IS

    curDatos rcgCursor;
-- Cursor que va a contener los datos enviados al usuario
    vlContador  NUMBER := 0;
    vlNumeco RHEKT.UNI_CECO.NUMECO%TYPE := NULL;
    cslFalso        NUMBER(1) := 0;
    cslVerdadero    NUMBER(1) := 1;
    BEGIN
      SELECT
        T.NUMECO
      INTO vlNumeco
      FROM RHEKT.UNI_CECO T
        INNER JOIN RHEKT.TAEMPLEADOINFO SAP
          ON (T.IDCC = SAP.FICENCOSNUM)
      WHERE SAP.FIEMPLEADONUM = paIdEmp;

      OPEN curDatos FOR
      SELECT
        UICS.FOLIO_PEDIDO,
        UICS.ID_EMPLEADO,
        SAP.FICENCOSNUM            FCCENCOS_NUM,
        SAP.FCEMPLEADONOMBRE       NOMBRE_EMP,
        FUNC.DESCRIPCION,
        CIA.CLAVE,
        UICS.NO_PEDIDO,
        UICS.SKU,
        UICS.DESC_SKU,
        TRUNC(UICS.FECHA_REMISION) FECHA_REMISION,
        UICS.NO_REMISION,
        COUNT(UICS.ROWID)          TOTSKU,
        DTR.NUM_EMP_DISTRITAL,
        SAPDTR.FCEMPLEADONOMBRE    NOMBRE_DIST,
        UICS.NO_TIENDA
      FROM RHEKT.UNI_INVENTARIO_C_SKU UICS
        INNER JOIN RHEKT.TAEMPLEADOINFO SAP
          ON UICS.ID_EMPLEADO = SAP.FIEMPLEADONUM
        INNER JOIN RHEKT.UNI_CAT_FUNCION FUNC
          ON UICS.FNFUNCION_NUM = FUNC.ID
        INNER JOIN RHEKT.UNI_CAT_CIA CIA
          ON UICS.CANAL = CIA.ID
        LEFT JOIN RHEKT.UNI_DESCARGA_DISTRITAL DTR
          ON (DTR.FOLIO_PEDIDO = UICS.FOLIO_PEDIDO AND DTR.NO_PEDIDO = UICS.NO_PEDIDO)
        LEFT JOIN RHEKT.TAEMPLEADOINFO SAPDTR
          ON DTR.NUM_EMP_DISTRITAL = SAPDTR.FIEMPLEADONUM
        INNER JOIN (SELECT
                      UICS.ID_EMPLEADO,
                      UICS.FOLIO_PEDIDO,
                      UICS.NO_PEDIDO
                    FROM RHEKT.UNI_INVENTARIO_C_SKU UICS
                    WHERE NO_TIENDA = vlNumeco
                          AND ESTATUS = paEstatus
                          AND CANCELADO = cslFalso
                          AND REMISION = cslVerdadero
                          AND FECHA_SHUELLA IS NULL
                    GROUP BY UICS.ID_EMPLEADO
                      , UICS.FOLIO_PEDIDO
                      , UICS.NO_PEDIDO
                    MINUS
                    SELECT
                      UICS.ID_EMPLEADO,
                      UICS.FOLIO_PEDIDO,
                      UICS.NO_PEDIDO
                    FROM RHEKT.UNI_INVENTARIO_C_SKU UICS
                    WHERE NO_TIENDA = vlNumeco
                          AND REMISION = cslFalso
                    GROUP BY UICS.ID_EMPLEADO
                      , UICS.FOLIO_PEDIDO
                      , UICS.NO_PEDIDO) TABLA
          ON (UICS.ID_EMPLEADO = TABLA.ID_EMPLEADO AND UICS.FOLIO_PEDIDO = TABLA.FOLIO_PEDIDO AND
              UICS.NO_PEDIDO = TABLA.NO_PEDIDO)
      GROUP BY UICS.FOLIO_PEDIDO
        , UICS.ID_EMPLEADO
        , SAP.FICENCOSNUM
        , SAP.FCEMPLEADONOMBRE
        , FUNC.DESCRIPCION
        , CIA.CLAVE
        , UICS.NO_PEDIDO
        , UICS.SKU
        , UICS.DESC_SKU
        , TRUNC(UICS.FECHA_REMISION)
        , UICS.NO_REMISION
        , DTR.NUM_EMP_DISTRITAL
        , SAPDTR.FCEMPLEADONOMBRE
        , UICS.NO_TIENDA
      ORDER BY UICS.ID_EMPLEADO;
      RETURN curDatos;
    END FNOBTIENEPEDIDOSPENDIENTES;

  PROCEDURE SPOBTIENESKU(paNumEmpleado IN  RHEKT.UNI_INVENTARIO_C_SKU.ID_EMPLEADO%TYPE,
                         paFolioPedido IN  RHEKT.UNI_INVENTARIO_C_SKU.FOLIO_PEDIDO%TYPE,
                         paNoPedido    IN  RHEKT.UNI_INVENTARIO_C_SKU.NO_PEDIDO%TYPE,
                         paNoTienda    IN  RHEKT.UNI_INVENTARIO_C_SKU.NO_TIENDA%TYPE,
                         paCurDatos    OUT rcgCursor,
                         paIPTienda    OUT RHEKT.TASUCURSALES.FCDIRIP%TYPE)
/*************************************************************
   Proyecto:                           Uniformes
   Descripcion:                        SPOBTIENESKU
   Parametros de entrada:              paNumEmpleado       Id del empleado
                                       paFolioPedido       Folio del pedido
                                       paNoPedido          Número del pedido
                                       paNoTienda          Número de la tienda
   Parametros de salida:               paCurDatos   Cursor de Datos
                                       paIPTienda  Ip de la tienda
   Parametros de entrada-salida        No aplica
   Precondiciones:                     Tener creado el esquema
   Creador:                            Othoniel Garcia Gonzalez
   Fecha de creacion:                  Abril 2015
*************************************************************/
  IS
--curDatos     rcgCursor;-- Cursor que va a contener los datos enviados al usuario
    BEGIN

      SELECT
        FCDIRIP
      INTO paIPTienda
      FROM RHEKT.TASUCURSALES
      WHERE FISUCURSAL = paNoTienda;

      OPEN paCurDatos FOR
      SELECT
        SKU
      FROM RHEKT.UNI_INVENTARIO_C_SKU UICS
      WHERE ID_EMPLEADO = paNumEmpleado
            AND FOLIO_PEDIDO = paFolioPedido
            AND NO_PEDIDO = paNoPedido
            AND NO_TIENDA = paNoTienda;

    END SPOBTIENESKU;

  PROCEDURE SPRECOGEPEDIDO(paNumEmpleado  IN RHEKT.UNI_INVENTARIO_C_SKU.ID_EMPLEADO%TYPE,
                           paIdEmpCaptura IN RHEKT.UNI_INVENTARIO_C_SKU.ID_EMPLEADO_CAPTURA%TYPE,
                           paFolioPedido  IN RHEKT.UNI_INVENTARIO_C_SKU.FOLIO_PEDIDO%TYPE,
                           paNoPedido     IN RHEKT.UNI_INVENTARIO_C_SKU.NO_PEDIDO%TYPE,
                           paNoTienda     IN RHEKT.UNI_INVENTARIO_C_SKU.NO_TIENDA%TYPE,
                           paDistrital    IN RHEKT.UNI_DESCARGA_DISTRITAL.NUM_EMP_DISTRITAL%TYPE)

/*************************************************************
   Proyecto:                           Uniformes
   Descripcion:                        SPRECOGEPEDIDO
   Parametros de entrada:              paNumEmpleado       Id del empleado
                                       paIdEmpCacptura     Id del gerente
                                       paFolioPedido       Folio del pedido
                                       paNoPedido          Número del pedido
                                       paNoTienda          Número de la tienda
   Parametros de salida:               No aplica
   Parametros de entrada-salida        No aplica
   Precondiciones:                     Tener creado el esquema
   Creador:                            Othoniel Garcia Gonzalez
   Fecha de creacion:                  Abril 2015
*************************************************************/
  IS

    cslEstatusPendiente            VARCHAR(1) := '0';
    cslEstatusEntregado            VARCHAR(1) := '1';
    cslEstatusReasignado           VARCHAR(1) := '4';
    cslEstatusReasignadoYEntregado VARCHAR(1) := '5';
    cslEstatusPendienteSPPI        NUMBER(2) := 10;
    cslEstatusPendienteSAP         NUMBER(2) := 10;
    cslObservaciones               VARCHAR(50) := 'Pendiente de enviar';
    cslFalso                       NUMBER(1) := 0;
    cslVerdadero                   NUMBER(1) := 1;
    cslHuellaOK                    NUMBER(1) := 2;
    cslFechaVacia                  DATE := TO_DATE('01011900','DDMMYYYY');
    cslSeparador                   VARCHAR(1) := '-';
    cslConsecutivo                 VARCHAR(2) := '-1';
    cslRoundPlaces                 NUMBER(1) := 2;
    BEGIN

      UPDATE RHEKT.UNI_INVENTARIO_C_SKU
      SET ESTATUS_PHUELLA   = cslVerdadero,
        FECHA_PHUELLA       = SYSDATE,
        ID_EMPLEADO_CAPTURA = paIdEmpCaptura
      WHERE ID_EMPLEADO = paNumEmpleado
            AND FOLIO_PEDIDO = paFolioPedido
            AND NO_PEDIDO = paNoPedido
            AND NO_TIENDA = paNoTienda;

      IF paDistrital IS NOT NULL
      THEN
        UPDATE RHEKT.UNI_INVENTARIO_C_SKU
        SET ESTATUS           = cslEstatusReasignadoYEntregado,
          ESTATUS_PHUELLA     = cslHuellaOK,
          FECHA_SHUELLA       = SYSDATE,
          CONFIRMACION_SAP    = cslFalso,
          CONFIRMACION_SPPI   = cslFalso,
          FLAG_PEND_PROC_SAP  = cslFalso,
          FLAG_PEND_PROC_SPPI = cslFalso
        WHERE ID_EMPLEADO = paNumEmpleado
              AND FOLIO_PEDIDO = paFolioPedido
              AND NO_PEDIDO = paNoPedido
              AND NO_TIENDA = paNoTienda
              AND ESTATUS = cslEstatusReasignado;

        UPDATE RHEKT.UNI_DESCARGA_DISTRITAL
        SET FIBANDERAENTREGADO = cslVerdadero
        WHERE FOLIO_PEDIDO = paFolioPedido
              AND NUM_EMP_DISTRITAL = paDistrital
              AND NO_PEDIDO = paNoPedido;
      ELSE

        UPDATE RHEKT.UNI_INVENTARIO_C_SKU
        SET ESTATUS           = cslEstatusEntregado,
          ESTATUS_PHUELLA     = cslHuellaOK,
          FECHA_SHUELLA       = SYSDATE,
          CONFIRMACION_SAP    = cslFalso,
          CONFIRMACION_SPPI   = cslFalso,
          FLAG_PEND_PROC_SAP  = cslVerdadero,
          FLAG_PEND_PROC_SPPI = cslVerdadero
        WHERE ID_EMPLEADO = paNumEmpleado
              AND FOLIO_PEDIDO = paFolioPedido
              AND NO_PEDIDO = paNoPedido
              AND NO_TIENDA = paNoTienda
              AND ESTATUS = cslEstatusPendiente;

        MERGE INTO RHEKT.TADISTRIBUCIONSPPI T
        USING (SELECT U.ID_EMPLEADO,
                      U.NO_TIENDA,
                      U.NO_PEDIDO,
                      U.CANAL,
                      U.FOLIO_PEDIDO,
                      ROUND(SUM(U.PRECIO) - SUM(U.PRECIO_C_DESC), cslRoundPlaces) IMPORTE,
                      TRUNC(U.FECHA_SHUELLA)                         FECHA_ENTREGA,
                      INF.FICENCOSNUM
                 FROM RHEKT.UNI_INVENTARIO_C_SKU U
                INNER JOIN RHEKT.TAEMPLEADOINFO INF
                   ON INF.FIEMPLEADONUM = U.ID_EMPLEADO
                WHERE ID_EMPLEADO = paNumEmpleado
                  AND FOLIO_PEDIDO = paFolioPedido
                  AND NO_PEDIDO = paNoPedido
                  AND NO_TIENDA = paNoTienda
                GROUP BY U.ID_EMPLEADO,
                      U.NO_TIENDA,
                      U.NO_PEDIDO,
                      U.CANAL,
                      U.FOLIO_PEDIDO,
                      TRUNC(U.FECHA_SHUELLA),
                      INF.FICENCOSNUM
               HAVING SUM(PRECIO) > SUM(PRECIO_C_DESC)
              ) U
        ON (U.ID_EMPLEADO = T.FIEMPLEADO AND
            U.NO_TIENDA = T.FISUCURSAL AND
            U.NO_PEDIDO = T.FIPEDIDO)
        WHEN NOT MATCHED
        THEN INSERT (FIEMPLEADO,
                     FISUCURSAL,
                     FIPEDIDO,
                     FIESTATUS,
                     FINEGOCIO,
                     FCFOLIOPEDIDO,
                     FNIMPORTE,
                     FDFECHAENTREGA,
                     FICENTRODECOSTOS)
        VALUES (U.ID_EMPLEADO,
          U.NO_TIENDA,
          U.NO_PEDIDO,
          cslEstatusPendienteSPPI,
          U.CANAL,
          U.FOLIO_PEDIDO,
          U.IMPORTE,
          U.FECHA_ENTREGA,
          U.FICENCOSNUM);
           
        MERGE INTO RHEKT.TADISTRIBUCIONESSAP T
        USING (SELECT UICS.ID_EMPLEADO FIIDEMPLEADO,
                      UICS.NO_TIENDA FISUCURSAL,
                      UICS.NO_PEDIDO FIPEDIDO,
                      UICS.CANAL FINEGOCIO,
                      UICS.FOLIO_PEDIDO FCFOLIOPEDIDO,
                      PR.PRECIO_C_DESC_TOTAL FNIMPORTE,
                      ROUND((PR.PRECIO_C_DESC_TOTAL / PR.FISEMANASDESCTO), 2) FNAMORTIZACION,
                      UICS.FOLIO_PEDIDO || cslSeparador || TO_CHAR(UICS.NO_PEDIDO) || cslConsecutivo FCREFERENCIASAP,
                      cslFechaVacia FDFECHADESCUENTO,
                      cslFechaVacia FDFECHAENVIO,
                      cslObservaciones FCOBSERVACIONES,
                      cslEstatusPendienteSAP FIESTATUSSAP
                 FROM RHEKT.UNI_INVENTARIO_C_SKU UICS
                INNER JOIN RHEKT.UNI_PRECIO_PEDIDO PR
                          ON PR.FOLIO_UNIFICADO = UICS.FOLIO_PEDIDO
                             AND PR.NUM_PEDIDO = UICS.NO_PEDIDO
                WHERE UICS.ID_EMPLEADO = paNumEmpleado
                  AND UICS.FOLIO_PEDIDO = paFolioPedido
                  AND UICS.NO_PEDIDO = paNoPedido
                  AND UICS.NO_TIENDA = paNoTienda
                  AND PR.PRECIO_C_DESC_TOTAL > 0
                GROUP BY UICS.ID_EMPLEADO,
                         UICS.FOLIO_PEDIDO,
                         UICS.NO_PEDIDO,
                         UICS.NO_TIENDA,
                         UICS.CANAL,
                         PR.PRECIO_C_DESC_TOTAL,
                         PR.FISEMANASDESCTO) S
            ON (S.FIIDEMPLEADO = T.FIIDEMPLEADO AND
                S.FISUCURSAL = T.FISUCURSAL AND
                S.FIPEDIDO = T.FIPEDIDO)
            WHEN NOT MATCHED THEN
            INSERT(T.FIIDEMPLEADO, 
                   T.FISUCURSAL, 
                   T.FIPEDIDO, 
                   T.FINEGOCIO, 
                   T.FCFOLIOPEDIDO, 
                   T.FNIMPORTE, 
                   T.FNAMORTIZACION, 
                   T.FCREFERENCIASAP, 
                   T.FDFECHADESCUENTO, 
                   T.FDFECHAENVIO, 
                   T.FCOBSERVACIONES, 
                   T.FIESTATUSSAP)
            VALUES(S.FIIDEMPLEADO, 
                   S.FISUCURSAL, 
                   S.FIPEDIDO, 
                   S.FINEGOCIO, 
                   S.FCFOLIOPEDIDO, 
                   S.FNIMPORTE, 
                   S.FNAMORTIZACION, 
                   S.FCREFERENCIASAP, 
                   S.FDFECHADESCUENTO, 
                   S.FDFECHAENVIO, 
                   S.FCOBSERVACIONES, 
                   S.FIESTATUSSAP);
      END IF;

    END SPRECOGEPEDIDO;

  FUNCTION FNDESCRIPCIONSKU(paFolioPedido IN RHEKT.UNI_INVENTARIO_C_SKU.FOLIO_PEDIDO%TYPE)
    RETURN VARCHAR2
/*************************************************************
   Proyecto:                           Uniformes
   Descripcion:                        FNDESCRIPCIONSKU
   Parametros de entrada:              paFolioPedido       Folio del pedido
   Parametros de salida:               No aplica
   Parametros de entrada-salida        No aplica
   Precondiciones:                     Tener creado el esquema
   Creador:                            Othoniel Garcia Gonzalez
   Fecha de creacion:                  Abril 2015
*************************************************************/
  IS
    vlPos       NUMBER(20);
    vlSubCadFol RHEKT.UNI_INVENTARIO_C_SKU.FOLIO_PEDIDO%TYPE;
    vlFol       RHEKT.UNI_INVENTARIO_C_SKU.FOLIO_PEDIDO%TYPE;
    vlDesc      RHEKT.UNI_INVENTARIO_C_SKU.DESC_GENERAL%TYPE;
    cslGuion    VARCHAR(1) := '-';
    cslKitCompleto VARCHAR(15) := 'Kit completo';
    BEGIN

      vlPos := INSTR(paFolioPedido, cslGuion);

      IF vlPos > 0
      THEN

        vlFol := SUBSTR(paFolioPedido, 1, vlPos - 1);
        vlSubCadFol := SUBSTR(paFolioPedido, vlPos + 1);
        vlPos := INSTR(vlSubCadFol, cslGuion);
        vlSubCadFol := SUBSTR(vlSubCadFol, 1, vlPos - 1);

        SELECT DISTINCT
          DESC_GENERAL
        INTO vlDesc
        FROM RHEKT.UNI_INVENTARIO_C_SKU
        WHERE FOLIO_PEDIDO LIKE vlFol
              AND NO_PEDIDO = vlSubCadFol;


      ELSE
        vlDesc := cslKitCompleto;
      END IF;

      RETURN vlDesc;

      EXCEPTION
      WHEN TOO_MANY_ROWS THEN
      RETURN cslKitCompleto;


    END;

  PROCEDURE SPVALIDASOLICITUD(paIdEmpleado IN  RHEKT.UNI_INVENTARIO_C_SKU.ID_EMPLEADO%TYPE,
                              paIdFunc     IN  RHEKT.TAFUNCIONESXNEGOCIO.FIIDFUNCION%TYPE,
                              paIdGenero   IN  RHEKT.UNI_PIEZA_UNIFORME.ID_GENERO%TYPE,
                              paIdSubkit   IN  RHEKT.TASUBKITS.FIIDSUBKIT%TYPE,
                              paMesesRenov IN  RHEKT.TASUBKITSXKIT.FIMESESRENOV%TYPE,
                              curDatos     OUT rcgCursor)
/*************************************************************
   Proyecto:                         Uniformes
   Descripcion:                      SPVALIDASOLICITUD
   Parametros de entrada:            paIdEmpleado     Id del empleado
                                     paNegocio        Unidad de negocio
                                     paIdFunc         Funcion SAP
                                     paIdGenero       1 - Mujer, 2 - Hombre
   Parametros de salida:             curDatos         Cursor
   Parametros de entrada-salida
   Precondiciones:                   Tener creado el esquema
   Creador:                          Othoniel García González
   Fecha de creacion:                Abril 2015
*************************************************************/
  IS
    vlEstSolicitado      VARCHAR(1) := '0';
    vlEstEntregado       VARCHAR(1) := '1';
    vlCategoria          NUMBER(3) := 0;
    cslMotivoSolicitado  VARCHAR(100) := 'Solicitud realizada:\n{0}\nConsulta "Estatus de mi Uniforme"';
    cslMotivoPendRecoger VARCHAR(100) := 'Pedido pendiente de recoger. Llegó a la tienda desde:\n {0}';
    cslMotivoMeses       VARCHAR(100) := 'Última solicitud:\n{0}\nRecuerda que solo se permiten solicitudes cada {1} meses';
    cslMotivoSolicExt    VARCHAR(100) := 'Remisión sistema anterior:\n{0}\nRecuerda que solo se permiten solicitudes cada {1} meses';
    cslMotivoMoto        VARCHAR(100) := 'Entregado con moto Italika nueva:\n{0}\nRecuerda que solo se permiten solicitudes cada {1} meses';
    cslMotivoSinMoto     VARCHAR(100) := 'No se puede agregar este elemento. No se encontró motocicleta asignada';
    cslSeparador         VARCHAR(1) := ';';
    cslVerdadero         NUMBER(1) := 1;
    cslFalso             NUMBER(1) := 0;
    cslUnisex            NUMBER(1) := 3;
    cslTipoSolicOrd      NUMBER(1) := 1;
    cslOrigenSistAnt     NUMBER(1) := 0;
    cslOrigenMoto        NUMBER(1) := 1;
    cslCatMoto           NUMBER(2) := 21;
    cslCatImpermeable    NUMBER(2) := 12;
    BEGIN
    
      SELECT DISTINCT
             PZ.ID_CATEGORIA
        INTO vlCategoria
        FROM RHEKT.UNI_PIEZA_UNIFORME PZ
       INNER JOIN RHEKT.TASKUSXSUBKIT SXS
          ON SXS.FISKU = PZ.SKU
       WHERE SXS.FIIDSUBKIT = paIdSubkit;
    
      OPEN curDatos FOR
        SELECT vlEstEntregado   ESTATUS,
               cslVerdadero     REMISION,
               cslMotivoSinMoto STRINGMOTIVO,
               cslSeparador     DATOSMOTIVO,
               SYSDATE          FECHA,
               (CASE
                WHEN EXC.SOLICITADO = cslFalso
                THEN cslVerdadero
                ELSE cslFalso
                END) AS APLICAEXCEPCION
          FROM (SELECT paIdEmpleado IDEMPLEADO
                  FROM DUAL) D
          LEFT JOIN RHEKT.TAVWMOTOS M
            ON M.FIIDEMPLEADO = D.IDEMPLEADO
          LEFT JOIN RHEKT.EXCEPTION_SOLICITA_UNIFORMES EXC
            ON EXC.ID_EMPLEADO =D.IDEMPLEADO
           AND EXC.FICATEGORIA = vlCategoria
         WHERE M.FCSERIEMOTO IS NULL
           AND vlCategoria IN (cslCatMoto)
      UNION
        SELECT vlEstEntregado ESTATUS,
               cslVerdadero   REMISION,
               (CASE WHEN FIORIGEN = cslOrigenSistAnt
                     THEN cslMotivoSolicExt
                     WHEN FIORIGEN = cslOrigenMoto
                     THEN cslMotivoMoto
                     ELSE NULL
                END) STRINGMOTIVO,
               (TO_CHAR(T.FDULTIMAREMISION, 'dd/fmMonth/yyyy', 'nls_date_language=spanish') || cslSeparador || paMesesRenov) DATOSMOTIVO,
               T.FDULTIMAREMISION FECHA,
               (CASE
                WHEN EXC.SOLICITADO = cslFalso
                THEN cslVerdadero
                ELSE cslFalso
                END) AS APLICAEXCEPCION
          FROM RHEKT.TASOLICITUDESEXTERNAS T
          LEFT JOIN RHEKT.EXCEPTION_SOLICITA_UNIFORMES EXC
            ON EXC.ID_EMPLEADO = T.FIEMPLEADONUM
           AND EXC.FICATEGORIA = vlCategoria
         WHERE FIEMPLEADONUM = paIdEmpleado
           AND FIIDCATEGORIA = vlCategoria
           AND FDULTIMAREMISION > ADD_MONTHS(SYSDATE, (0 - paMesesRenov))
      UNION
        SELECT DISTINCT
               UICS.ESTATUS,
               UICS.REMISION,
               (CASE
                WHEN UICS.ESTATUS = vlEstEntregado
                THEN cslMotivoMeses
                WHEN UICS.ESTATUS = vlEstSolicitado
                THEN CASE
                    WHEN UICS.REMISION = cslVerdadero
                    THEN cslMotivoPendRecoger
                    ELSE cslMotivoSolicitado
                    END
               END) AS STRINGMOTIVO,
               (CASE
                WHEN UICS.ESTATUS = vlEstEntregado
                THEN TO_CHAR(UICS.FECHA, 'dd/fmMonth/yyyy', 'nls_date_language=spanish') || cslSeparador || paMesesRenov
                WHEN UICS.ESTATUS = vlEstSolicitado
                THEN CASE
                     WHEN UICS.REMISION = cslVerdadero
                     THEN TO_CHAR(UICS.FECHA_REMISION, 'dd/fmMonth/yyyy', 'nls_date_language=spanish')
                     ELSE TO_CHAR(UICS.FECHA, 'dd/fmMonth/yyyy', 'nls_date_language=spanish')
                     END
               END) AS DATOSMOTIVO,
               UICS.FECHA FECHA,
               (CASE
                WHEN EXC.SOLICITADO = cslFalso
                THEN cslVerdadero
                ELSE cslFalso
                END) AS APLICAEXCEPCION
          FROM RHEKT.UNI_INVENTARIO_C_SKU UICS
         INNER JOIN RHEKT.UNI_PIEZA_UNIFORME PZ
            ON PZ.SKU = UICS.SKU
           AND PZ.ID_GENERO IN (paIdGenero, cslUnisex)
           AND PZ.ID_CATEGORIA = vlCategoria
     LEFT JOIN RHEKT.EXCEPTION_SOLICITA_UNIFORMES EXC
            ON EXC.ID_EMPLEADO = UICS.ID_EMPLEADO
           AND EXC.FICATEGORIA = vlCategoria
         WHERE UICS.ID_EMPLEADO = paIdEmpleado
            AND ( UICS.ESTATUS = vlEstSolicitado
                OR ( UICS.FECHA > ADD_MONTHS(SYSDATE, (0 - paMesesRenov))
                    AND UICS.ESTATUS = vlEstEntregado
                    AND UICS.SKU IN  (SELECT NVL(EN2.FISKU, SXS.FISKU)
                                        FROM RHEKT.TASKUSXSUBKIT SXS
                                        LEFT JOIN RHEKT.TAENSAMBLESXSKU EN1
                                          ON EN1.FISKU = SXS.FISKU
                                        LEFT JOIN RHEKT.TAENSAMBLESXSKU EN2
                                          ON EN1.FIIDENSAMBLE = EN2.FIIDENSAMBLE
                                       WHERE FIIDSUBKIT = paIdSubkit ) ) 
               )
      ORDER BY FECHA DESC;

    END SPVALIDASOLICITUD;

  PROCEDURE SPOBTIENEKITPORTIENDA(paIdEmpleado IN  RHEKT.UNI_INVENTARIO_C_SKU.ID_EMPLEADO%TYPE,
                                  paNegocio    IN  RHEKT.TAFUNCIONESXNEGOCIO.FINEGOCIO%TYPE,
                                  paIdFunc     IN  RHEKT.TAFUNCIONESXNEGOCIO.FIIDFUNCION%TYPE,
                                  paIdGenero   IN  RHEKT.UNI_PIEZA_UNIFORME.ID_GENERO%TYPE,
                                  paIdTienda   IN  RHEKT.TASUCURSALES.FISUCURSAL%TYPE,
                                  curDatos     OUT rcgCursor)
/*************************************************************
   Proyecto:                         Uniformes
   Descripcion:                      SPOBTIENEKITPORTIENDA
   Parametros de entrada:            paIdEmpleado     Id del empleado
                                     paNegocio        Unidad de negocio
                                     paIdFunc         Funcion SAP
                                     paIdGenero       1 - Mujer, 2 - Hombre
                                     paTienda         Tienda receptora
   Parametros de salida:             curDatos         Cursor
   Parametros de entrada-salida
   Precondiciones:                   Tener creado el esquema
   Creador:                          Othoniel García González
   Fecha de creacion:                Abril 2015
*************************************************************/
  IS
    cslFalso            NUMBER(1) := 0;
    cslVerdadero        NUMBER(1) := 1;
    cslUnisex           NUMBER(3) := 3;
    vlIdKit             NUMBER(5) := 0;
    vlIdCedis           NUMBER(5) := 0;
    vlBandTieneMoto     NUMBER(1) := 0;
    
    cslCatCasco         NUMBER(2) := 21;
  BEGIN

    SELECT FIIDCDISTRIBUCION
      INTO vlIdCedis
      FROM RHEKT.TASUCURSALES
     WHERE FISUCURSAL = paIdTienda;
     
    BEGIN
      SELECT FXN.FIIDKIT
        INTO vlIdKit
        FROM RHEKT.TAFUNCIONESXNEGOCIO FXN
       INNER JOIN RHEKT.TAKITXCEDIS KXC
          ON KXC.FIIDKIT = FXN.FIIDKIT
       WHERE FXN.FINEGOCIO = paNegocio
         AND FXN.FIIDFUNCION = paIdFunc
         AND FXN.FIPARCIAL = cslVerdadero
         AND KXC.FIIDCEDIS = vlIdCedis;   
    EXCEPTION
        WHEN NO_DATA_FOUND 
        THEN 
        BEGIN
             SELECT FIIDKIT
               INTO vlIdKit
               FROM RHEKT.TAFUNCIONESXNEGOCIO
              WHERE FINEGOCIO = paNegocio
                AND FIIDFUNCION = paIdFunc
                AND FIPARCIAL = cslFalso;  
         EXCEPTION
              WHEN NO_DATA_FOUND 
              THEN vlIdKit := NULL;
         END;
    END;
    
     SELECT COUNT(ROWID)
       INTO vlBandTieneMoto
       FROM RHEKT.TAVWMOTOS
      WHERE FIIDEMPLEADO = paIdEmpleado;
       
      OPEN curDatos FOR
      SELECT
        PZ.SKU,
        PZ.ID_CATEGORIA,
        PZ.IMAGEN,
        PZ.PRECIO,
        TA.ID,
        TRIM(TA.CLAVE)   AS CLAVE,
        TA.DESCRIPCION   AS DESCRIPCIONTALLA,
        TA.ORDEN,
        SK.FICANTIDAD    AS TOTAL,
        SK.FNPRECIO      AS FNPRECIOSUBKIT,
        SK.FIIDSUBKIT,
        SK.FCDESCRIPCION AS DESCRIPCION,
        (CASE WHEN PZ.ID_CATEGORIA = cslCatCasco AND vlBandTieneMoto = cslFalso 
              THEN cslFalso
              ELSE SK.FIREPOSICION
         END)            AS FIREPOSICION,
        SK.FNPRECIOEXT,
        TRIM(SK.FCGUIASUBKIT) FCGUIASUBKIT,
        RKS.FIMESESRENOV,
        RKS.FIOBLIGATORIO,
        RKS.FIAGRUPAR,
        KIT.FISEMANASDESCTO,
        KIT.FIMOSTRARGUIA,
        KIT.FCARCHIVOSGUIA,
        KIT.FIIDKIT,
        NVL(INV.FICANTIDAD, 0)   AS INVENTARIO
      FROM RHEKT.TAKITUNIFORMES KIT
        INNER JOIN RHEKT.TASUBKITSXKIT RKS
          ON RKS.FIIDKIT = KIT.FIIDKIT
        INNER JOIN RHEKT.TASUBKITS SK
          ON SK.FIIDSUBKIT = RKS.FIIDSUBKIT
        INNER JOIN RHEKT.TASKUSXSUBKIT RSS
          ON RSS.FIIDSUBKIT = RKS.FIIDSUBKIT
        INNER JOIN RHEKT.UNI_PIEZA_UNIFORME PZ
          ON PZ.SKU = RSS.FISKU
        INNER JOIN RHEKT.UNI_CAT_TALLA TA
          ON TA.ID = PZ.ID_TALLA
        LEFT JOIN RHEKT.TAINVENTARIOXCEDIS INV
          ON INV.FISKU = PZ.SKU
         AND INV.FIIDCEDIS = vlIdCedis
      WHERE KIT.FIIDKIT = vlIdKit
            AND PZ.ID_GENERO IN (paIdGenero, cslUnisex)
            AND RSS.FIDISCONTINUO = cslFalso
      ORDER BY PZ.ID_CATEGORIA ASC, TA.ORDEN ASC;

  END SPOBTIENEKITPORTIENDA;

  PROCEDURE SPACTUALIZAMSGABASTO(paIdEmpleado    IN  RHEKT.UNI_INVENTARIO_C_SKU.ID_EMPLEADO%TYPE
    ,                            paNoTienda      IN  RHEKT.UNI_INVENTARIO_C_SKU.NO_TIENDA%TYPE
    ,                            paNoPedido      IN  RHEKT.UNI_INVENTARIO_C_SKU.NO_PEDIDO%TYPE
    ,                            paSKU           IN  RHEKT.UNI_INVENTARIO_C_SKU.SKU%TYPE
    ,                            paMensajeAbasto IN  RHEKT.UNI_INVENTARIO_C_SKU.MENSAJE_AVASTO%TYPE
    ,                            paCount         OUT NUMBER)

/*************************************************************
    Proyecto:                         Uniformes
    Descripcion:                      SPACTUALIZAMSGABASTO
    Parametros de entrada:            paIdEmpleado       Id del empleado
                                      paNoTienda         Número de la sucursal
                                      paNoPedido         Número del pedido
                                      paSKU             SKU
                                      paMensajeAbasto   Mensaje de abasto
    Parametros de salida:             paCount           Número de registros actualizados
    Parametros de entrada-salida
    Precondiciones:                   Tener creado el esquema
    Creador:                          Othoniel García González
    Fecha de creacion:                Abril 2015
 *************************************************************/
  IS
    BEGIN
      UPDATE RHEKT.UNI_INVENTARIO_C_SKU
      SET MENSAJE_AVASTO = paMensajeAbasto
      WHERE ID_EMPLEADO = paIdEmpleado
            AND NO_TIENDA = paNoTienda
            AND NO_PEDIDO = paNoPedido
            AND SKU = paSKU;

      paCount := SQL%ROWCOUNT;
    END SPACTUALIZAMSGABASTO;

  PROCEDURE SPCONSULTAIPTIENDA(paSucursal IN  RHEKT.TASUCURSALES.FISUCURSAL%TYPE,
                               paIpTienda OUT RHEKT.TASUCURSALES.FCDIRIP%TYPE)
  IS
/*************************************************************
     Proyecto:                         Uniformes
     Descripcion:                      SPCONSULTAIPTIENDA
     Parametros de entrada:            paSucursal       Número de sucursal
     Parametros de salida:             paIpTienda       IP de la sucursal
     Parametros de entrada-salida
     Precondiciones:                   Tener creado el esquema
     Creador:                          Othoniel García González
     Fecha de creacion:                Abril 2015
  *************************************************************/
    BEGIN
      SELECT
        FCDIRIP
      INTO paIpTienda
      FROM RHEKT.TASUCURSALES
      WHERE FISUCURSAL = paSucursal;
    END SPCONSULTAIPTIENDA;

  FUNCTION FNESPRIMERKIT(paIdKit      IN RHEKT.TAFUNCIONESXNEGOCIO.FIIDKIT%TYPE,
                         paIdEmpleado IN RHEKT.UNI_INVENTARIO_C_SKU.ID_EMPLEADO%TYPE)
    RETURN NUMBER
/*************************************************************
     Proyecto:                         Uniformes
     Descripcion:                      FNESPRIMERKIT
     Parametros de entrada:            paIdEmpleado     Id del empleado
                                       paIdKit          Id del kit a validar
     Parametros de salida:             rcgCursor        Cursor
     Parametros de entrada-salida
     Precondiciones:                   Tener creado el esquema
     Creador:                          Othoniel García González
     Fecha de creacion:                Abril 2015
 *************************************************************/
  IS
    vlNumSolicitudesAnt NUMBER := 0;
    cslFalso            NUMBER(1) := 0;
    cslVerdadero        NUMBER(2) := 1;
    cslEstatusPendiente VARCHAR(1) := '0';
    cslEstatusEntregado VARCHAR(1) := '1';
    BEGIN
      SELECT
        COUNT(SXK.ROWID)
      INTO vlNumSolicitudesAnt
      FROM RHEKT.TASUBKITSXKIT SXK
        INNER JOIN RHEKT.TASKUSXSUBKIT SXS
          ON SXS.FIIDSUBKIT = SXK.FIIDSUBKIT
        INNER JOIN RHEKT.UNI_INVENTARIO_C_SKU UICS
          ON UICS.SKU = SXS.FISKU
             AND UICS.ID_EMPLEADO = paIdEmpleado
             AND UICS.ESTATUS IN (cslEstatusPendiente, cslEstatusEntregado)
      WHERE SXK.FIIDKIT = paIdKit;
      
      IF (vlNumSolicitudesAnt = 0) THEN
        RETURN cslVerdadero;
      ELSE
        RETURN cslFalso;
      END IF;
      
    END FNESPRIMERKIT;

  PROCEDURE SPCONSULTADATOSEMPLEADO(
    paEmpleadoNum    IN  RHEKT.TAEMPLEADOINFO.FIEMPLEADONUM%TYPE,
    paFuncionNum     OUT RHEKT.TAEMPLEADOINFO.FIFUNCIONNUM%TYPE,
    paSexo           OUT NUMBER,
    paEmpleadoNombre OUT RHEKT.TAEMPLEADOINFO.FCEMPLEADONOMBRE%TYPE,
    paFcPosicionDesc OUT RHEKT.TAEMPLEADOINFO.FCPOSICIONDESC%TYPE,
    paCount          OUT NUMBER,
    paCanal          OUT rcgCursor,
    paIdPais         OUT RHEKT.UNI_CECO.IDPAIS%TYPE,
    paManualDeImagen OUT RHEKT.TAFUNCIONESXNEGOCIO.FCMANUALDEIMAGEN%TYPE,
    paMensajes       OUT RHEKT.TAFUNCIONESXNEGOCIO.FCMENSAJESINICIO%TYPE)

/*************************************************************
Proyecto:                         Uniformes
Descripcion:                      SPCONSULTADATOSEMPLEADO
Parametros de entrada:            paEmpleadoNum       Id del empleado
Parametros de salida:             paFuncionNum        Id de la función
                                  paSexo              Id del sexo
                                  paEmpleadoNombre    Nombre del empleado
                                  paFcPosicionDesc    Posición del empleado
                                  paCount             Contador de canales
                                  paCanal             canal(es)
                                  paIdPais            Id del país
                                  paManualDeImagen    Manual de imágen
                                  paMensajes          Mensaje(s) para mostrar al inicio
Parametros de entrada-salida      No aplica
Precondiciones:                   Tener creado el esquema
Creador:                          Othoniel García González
Fecha de creacion:                Abril 2015
*************************************************************/

  IS
    cslFalso        NUMBER(1) := 0;
    cslMujer        NUMBER(1) := 1;
    cslHombre       NUMBER(1) := 2;
    cslUnisex       NUMBER(1) := 3;
    cslM            VARCHAR(1) := 'M';
    cslH            VARCHAR(1) := 'H';
    
    vlNegocio       RHEKT.TAFUNCIONESXNEGOCIO.FINEGOCIO%TYPE := 0;
    vlCanalCve      RHEKT.UNI_CAT_CIA.CLAVE%TYPE := '';
    vlCanalDesc     RHEKT.UNI_CAT_CIA.DESCRIPCION%TYPE := '';
    
    cslUno          NUMBER(1) := 1;
  BEGIN

    SELECT A.FIFUNCIONNUM,
           CASE A.FCEMPLEADOSEXO
             WHEN cslM THEN cslMujer
             WHEN cslH THEN cslHombre
             ELSE cslFalso
           END,
           A.FCEMPLEADONOMBRE,
           A.FCPOSICIONDESC,
           EC.IDPAIS
      INTO paFuncionNum
         , paSexo
         , paEmpleadoNombre
         , paFcPosicionDesc
         , paIdPais
      FROM RHEKT.TAEMPLEADOINFO A
        INNER JOIN RHEKT.UNI_CECO EC
          ON A.FICENCOSNUM = EC.IDCC
        LEFT JOIN RHEKT.UNI_CANAL_CIA CIA
          ON EC.IDCANAL = CIA.ID_CANAL
             AND EC.CANAL = CIA.CANAL
      WHERE A.FIEMPLEADONUM = paEmpleadoNum;

    RHEKT.PAWEBUNIFORMES.SPOBTENERNEGOCIO(paEmpleadoNum, paCount, paCanal);
    
    FETCH paCanal INTO vlNegocio, vlCanalCve, vlCanalDesc;
    CLOSE paCanal;
    
    BEGIN
      SELECT
        TRIM(FCMANUALDEIMAGEN),
        TRIM(FCMENSAJESINICIO)
      INTO 
        paManualDeImagen,
        paMensajes
      FROM (SELECT
              FCMANUALDEIMAGEN,
              FIPARCIAL,
              FCMENSAJESINICIO
            FROM RHEKT.TAFUNCIONESXNEGOCIO
            WHERE FIIDFUNCION = paFuncionNum
                  AND FINEGOCIO = vlNegocio
                  AND FIPARCIAL = cslFalso)
      WHERE ROWNUM = cslUno;
    EXCEPTION
      WHEN NO_DATA_FOUND
      THEN NULL;
    END;
    RHEKT.PAWEBUNIFORMES.SPOBTENERNEGOCIO(paEmpleadoNum, paCount, paCanal);
    
  END SPCONSULTADATOSEMPLEADO;

  PROCEDURE SPCONSULTAPEDIDOSPORFILTRO(
    paIdEmpleado    IN  RHEKT.UNI_INVENTARIO_C_SKU.ID_EMPLEADO%TYPE,
    paSucursal      IN  RHEKT.UNI_INVENTARIO_C_SKU.NO_TIENDA%TYPE,
    paPedido        IN  RHEKT.UNI_INVENTARIO_C_SKU.NO_PEDIDO%TYPE,
    paSKU           IN  RHEKT.UNI_INVENTARIO_C_SKU.SKU%TYPE,
    paCDeCostos     IN  RHEKT.TAEMPLEADOINFO.FICENCOSNUM%TYPE,
    paRemision      IN  RHEKT.UNI_INVENTARIO_C_SKU.NO_REMISION%TYPE,
    paFechaSolIni   IN  RHEKT.UNI_INVENTARIO_C_SKU.FECHA%TYPE,
    paFechaSolFin   IN  RHEKT.UNI_INVENTARIO_C_SKU.FECHA%TYPE,
    paFechaRemIni   IN  RHEKT.UNI_INVENTARIO_C_SKU.FECHA_REMISION%TYPE,
    paFechaRemFin   IN  RHEKT.UNI_INVENTARIO_C_SKU.FECHA_REMISION%TYPE,
    curDatos        OUT rcgCursor)
/*************************************************************
Proyecto:                         Uniformes
Descripcion:                      SPCONSULTAPEDIDOSPORFILTRO
Parametros de entrada:            paIdEmpleado       Id del empleado
                                  paSucursal         Sucursal
                                  paPedido           Número de pedido
                                  paSKU              SKU
                                  paCDeCostos        Centro de costos
                                  paRemision         Remisión
                                  paFechaSolIni      Fecha inicio de solicitud
                                  paFechaSolFin      Fecha final de la solicitud
                                  paFechaRemIni      Fecha inicio de la remisión
                                  paFechaRemFin      Fecha final de la remisión                                  
Parametros de salida:             curDatos           Cursor de referencia
Parametros de entrada-salida      No aplica
Precondiciones:                   Tener creado el esquema
Creador:                          Othoniel García González
Fecha de creacion:                Abril 2015
*************************************************************/
  IS
    vlCadExec VARCHAR(2000) := '';
    vlAnd     VARCHAR(5) := ' ';
    cslAnd    VARCHAR(5) := ' AND ';
  BEGIN
  
    vlCadExec :=
    'SELECT UICS.ID_EMPLEADO,' ||
    '       RH.FCEMPLEADONOMBRE,' ||
    '       RH.FIFUNCIONNUM,' ||
    '       RH.FCPOSICIONDESC,' ||
    '       RH.FICENCOSNUM,' ||
    '       CC.NOMBRE,' ||
    '       UICS.NO_PEDIDO,' ||
    '       ST.FCDESCRIPCION ESTATUS,' ||
    '       UICS.NO_TIENDA,' ||
    '       SUC.FCDESCRIPCION NOMBRETIENDA,' ||
    '       UICS.SKU,' ||
    '       UICS.DESC_SKU,' ||
    '       TRUNC(UICS.FECHA) FECHASOLICITUD,' ||
    '       UICS.NO_REMISION,' ||
    '       TRUNC(UICS.FECHA_REMISION) FECHAREMISION,' ||
    '       TRUNC(UICS.FECHA_SHUELLA) FECHAENTREGA,' ||
    '       COUNT(UICS.SKU) PIEZAS' ||
    '  FROM RHEKT.UNI_INVENTARIO_C_SKU UICS' ||
    ' INNER JOIN RHEKT.TAEMPLEADOINFO RH' ||
    '    ON RH.FIEMPLEADONUM = UICS.ID_EMPLEADO' ||
    '  LEFT JOIN RHEKT.UNI_CECO CC' ||
    '    ON CC.IDCC = RH.FICENCOSNUM' ||
    ' INNER JOIN RHEKT.UNI_ESTATUS_PEDIDO ST' ||
    '    ON ST.ID_ESTATUS = RHEKT.PAWEBUNIFORMES.FNESTATUSPEDIDO(UICS.ID_EMPLEADO, UICS.NO_PEDIDO, UICS.FOLIO_PEDIDO)' ||
    ' INNER JOIN RHEKT.TASUCURSALES SUC' ||
    '    ON SUC.FISUCURSAL = UICS.NO_TIENDA' ||
    ' WHERE ';
    
    IF (paIdEmpleado IS NOT NULL)
    THEN
        vlCadExec := vlCadExec || 'UICS.ID_EMPLEADO = ' || paIdEmpleado;
        vlAnd := cslAnd;
    END IF;
    
    IF (paSucursal IS NOT NULL)
    THEN
        vlCadExec := vlCadExec || vlAnd || 'UICS.NO_TIENDA = ' || paSucursal;
        vlAnd := cslAnd;
    END IF;
    
    IF (paPedido IS NOT NULL)
    THEN
        vlCadExec := vlCadExec || vlAnd || 'UICS.NO_PEDIDO = ' || paPedido;
        vlAnd := cslAnd;
    END IF;
    
    IF (paSKU IS NOT NULL)
    THEN
        vlCadExec := vlCadExec || vlAnd || 'UICS.SKU = ' || paSKU;
        vlAnd := cslAnd;
    END IF;
    
    IF (paCDeCostos IS NOT NULL)
    THEN
        vlCadExec := vlCadExec || vlAnd || 'RH.FICENCOSNUM = ' || paCDeCostos;
        vlAnd := cslAnd;
    END IF;
    
    IF (paRemision IS NOT NULL)
    THEN
        vlCadExec := vlCadExec || vlAnd || 'UICS.NO_REMISION = ' || paRemision;
        vlAnd := cslAnd;
    END IF;
    
    IF (paFechaSolIni IS NOT NULL)
    THEN
        vlCadExec := vlCadExec || vlAnd || 
        REPLACE('TRUNC(UICS.FECHA) >= TO_DATE(''paramDate'', ''DDMMYYYY'')', 'paramDate', TO_CHAR(paFechaSolIni, 'DDMMYYYY'));
        vlAnd := cslAnd;
    END IF;
    
    IF (paFechaSolFin IS NOT NULL)
    THEN
        vlCadExec := vlCadExec || vlAnd || 
        REPLACE('TRUNC(UICS.FECHA) <= TO_DATE(''paramDate'', ''DDMMYYYY'')', 'paramDate', TO_CHAR(paFechaSolFin, 'DDMMYYYY'));
        vlAnd := cslAnd;
    END IF;
    
    IF (paFechaRemIni IS NOT NULL)
    THEN
        vlCadExec := vlCadExec || vlAnd || 
        REPLACE('TRUNC(UICS.FECHA_REMISION) >= TO_DATE(''paramDate'', ''DDMMYYYY'')', 'paramDate', TO_CHAR(paFechaRemIni, 'DDMMYYYY'));
        vlAnd := cslAnd;
    END IF;
    
    IF (paFechaRemFin IS NOT NULL)
    THEN
        vlCadExec := vlCadExec || vlAnd || 
        REPLACE('TRUNC(UICS.FECHA_REMISION) <= TO_DATE(''paramDate'', ''DDMMYYYY'')', 'paramDate', TO_CHAR(paFechaRemFin, 'DDMMYYYY'));
        vlAnd := cslAnd;
    END IF;
    
    vlCadExec := vlCadExec ||
    ' GROUP BY UICS.ID_EMPLEADO,' ||
    '       RH.FCEMPLEADONOMBRE,' ||
    '       RH.FIFUNCIONNUM,' ||
    '       RH.FCPOSICIONDESC,' ||
    '       RH.FICENCOSNUM,' ||
    '       CC.IDCC,' ||
    '       CC.NOMBRE,' ||
    '       UICS.NO_PEDIDO,' ||
    '       ST.FCDESCRIPCION,' ||
    '       UICS.NO_TIENDA,' ||
    '       UICS.FOLIO_PEDIDO,' ||
    '       SUC.FCDESCRIPCION,' ||
    '       UICS.SKU,' ||
    '       UICS.DESC_SKU,' ||
    '       TRUNC(UICS.FECHA),' ||
    '       UICS.NO_REMISION,' ||
    '       TRUNC(UICS.FECHA_REMISION),' ||
    '       TRUNC(UICS.FECHA_SHUELLA)';
    
    OPEN curDatos FOR vlCadExec;
  END SPCONSULTAPEDIDOSPORFILTRO;
  
  PROCEDURE SPINSERTAREPOSICION(
    paIdEmpleado    IN RHEKT.TAREPOSICIONES.FIEMPLEADO%TYPE,
    paCorreo        IN RHEKT.TAREPOSICIONES.FCCORREO%TYPE,
    paTelefono      IN RHEKT.TAREPOSICIONES.FCTELEFONO%TYPE,
    paMotivo        IN RHEKT.TAREPOSICIONES.FCMOTIVO%TYPE,
    paMensaje       IN RHEKT.TAREPOSICIONES.FCMENSAJE%TYPE,
    paIdSubkit      IN RHEKT.TAREPOSICIONES.FIIDSUBKIT%TYPE,
    paFolio         OUT RHEKT.TAREPOSICIONES.FIFOLIOREPOSICION%TYPE)
/*************************************************************
Proyecto:                         Uniformes
Descripcion:                      SPINSERTAREPOSICION
Parametros de entrada:            paIdEmpleado       Id del empleado
                                  paCorreo           Correo electronico
                                  paTelefono         Telefono
                                  paMotivo           Motivo de la reposicion
                                  paMensaje          Mensaje para reposicion
                                  paIdSubkit         Id del subkit a reponer                               
Parametros de salida:             paRowCount         Numero de registros
Parametros de entrada-salida      No aplica
Precondiciones:                   Tener creado el esquema
Creador:                          Othoniel García González
Fecha de creacion:                Mayo 2015
*************************************************************/
  IS
    vlFolioReposicion       NUMBER(10) := 0;
    cslEstatusSolicitado    NUMBER(3) := 10;
    cslBlank                VARCHAR(1) := ' ';
    cslCero                 NUMBER(1) := 0;
    cslVerdadero            NUMBER(1) := 1;
  BEGIN
    vlFolioReposicion := RHEKT.SEFOLIOREPOSICION.NEXTVAL;
    INSERT INTO RHEKT.TAREPOSICIONES(
                FIFOLIOREPOSICION,
                FIEMPLEADO,
                FCCORREO,
                FCTELEFONO,
                FCMOTIVO,
                FIEMPLEADOAUTORIZA,
                FCMENSAJE,
                FCOBSERVACIONES,
                FIPEDIDO,
                FISUCURSAL,
                FNPRECIO,
                FIIDSUBKIT,
                FIESTATUSREPOSICION,
                FDFECHASOLICITUD,
                FIBANDNOTIFICAR)
         VALUES (vlFolioReposicion,
                paIdEmpleado,
                paCorreo,
                paTelefono,
                paMotivo,
                cslCero,
                paMensaje,
                cslBlank,
                cslCero,
                cslCero,
                cslCero,
                paIdSubkit,
                cslEstatusSolicitado,
                SYSDATE,
                cslVerdadero);
                
    paFolio := vlFolioReposicion;
    
  END SPINSERTAREPOSICION;
  
  PROCEDURE SPCONSULTAREPOSICION(
    paIdEmpleado    IN RHEKT.TAREPOSICIONES.FIEMPLEADO%TYPE,
    paIdSubkit      IN RHEKT.TAREPOSICIONES.FIIDSUBKIT%TYPE,
    curDatos        OUT rcgCursor)
/*************************************************************
Proyecto:                         Uniformes
Descripcion:                      SPCONSULTAREPOSICION
Parametros de entrada:            paIdEmpleado       Id del empleado
                                  paIdSubkit         Id del subkit a reponer                               
Parametros de salida:             curDatos           Cursor de referencia
Parametros de entrada-salida      No aplica
Precondiciones:                   Tener creado el esquema
Creador:                          Othoniel García González
Fecha de creacion:                Mayo 2015
*************************************************************/
  IS
    cslSolicitado           NUMBER(3) := 10;
    cslAutorizadoSinCosto   NUMBER(3) := 20;
    cslAutorizadoConCosto   NUMBER(3) := 30;
  BEGIN
    OPEN curDatos FOR
      SELECT FIFOLIOREPOSICION,
             FIEMPLEADO,
             FCCORREO,
             FCTELEFONO,
             FCMOTIVO,
             FCMENSAJE,
             FCOBSERVACIONES,
             FIPEDIDO,
             FISUCURSAL,
             FNPRECIO,
             FIIDSUBKIT,
             FIESTATUSREPOSICION
        FROM RHEKT.TAREPOSICIONES
       WHERE FIEMPLEADO = paIdEmpleado
         AND FIIDSUBKIT = paIdSubkit
         AND FIESTATUSREPOSICION 
          IN (cslSolicitado, 
             cslAutorizadoSinCosto,
             cslAutorizadoConCosto);
         
  END SPCONSULTAREPOSICION;

  PROCEDURE SPCONREPOSICIONESXEMPLEADO(
    paIdEmpleado    IN RHEKT.TAREPOSICIONES.FIEMPLEADO%TYPE,
    curDatos        OUT rcgCursor)
/*************************************************************
Proyecto:                         Uniformes
Descripcion:                      SPCONREPOSICIONESXEMPLEADO
Parametros de entrada:            paIdEmpleado       Id del empleado                          
Parametros de salida:             curDatos           Cursor de referencia
Parametros de entrada-salida      No aplica
Precondiciones:                   Tener creado el esquema
Creador:                          Othoniel García González
Fecha de creacion:                Mayo 2015
*************************************************************/
  IS
    cslSolicitado           NUMBER(3) := 10;
    cslAutorizadoConCosto   NUMBER(3) := 20;
    cslAutorizadoSinCosto   NUMBER(3) := 30;
    cslRechazada            NUMBER(3) := 50;
    cslVerdadero            NUMBER(1) := 1;
  BEGIN
    OPEN curDatos FOR
      SELECT R.FIFOLIOREPOSICION,
             R.FIEMPLEADO,
             R.FCCORREO,
             R.FCTELEFONO,
             R.FCMOTIVO,
             R.FCMENSAJE,
             R.FCOBSERVACIONES,
             R.FIPEDIDO,
             R.FISUCURSAL,
             R.FNPRECIO,
             R.FIIDSUBKIT,
             R.FIESTATUSREPOSICION,
             SK.FCDESCRIPCION
        FROM RHEKT.TAREPOSICIONES R
       INNER JOIN RHEKT.TASUBKITS SK
          ON R.FIIDSUBKIT = SK.FIIDSUBKIT
       WHERE R.FIEMPLEADO = paIdEmpleado
         AND R.FIBANDNOTIFICAR = cslVerdadero
         AND R.FIESTATUSREPOSICION 
          IN (cslSolicitado, 
             cslAutorizadoSinCosto,
             cslAutorizadoConCosto,
             cslRechazada);
         
  END SPCONREPOSICIONESXEMPLEADO;

  PROCEDURE SPCONAUTORIZANTESREP(
    paIdEmpleado    IN RHEKT.TACORREOAUTORIZANTES.FIIDEMPLEADO%TYPE,
    curDatos        OUT rcgCursor)
/*************************************************************
Proyecto:                         Uniformes
Descripcion:                      SPCONAUTORIZANTESREP
Parametros de entrada:            paIdEmpleado       Id del empleado                          
Parametros de salida:             curDatos           Cursor de referencia
Parametros de entrada-salida      No aplica
Precondiciones:                   Tener creado el esquema
Creador:                          Othoniel García González
Fecha de creacion:                Junio 2015
*************************************************************/
  IS
    vlCont      NUMBER(3) := 0;
    vlFuncion   NUMBER(10) := 0;
    cslCero     NUMBER(1) := 0;
  BEGIN
    SELECT FIFUNCIONNUM
      INTO vlFuncion
      FROM RHEKT.TAEMPLEADOINFO
     WHERE FIEMPLEADONUM = paIdEmpleado;
     
    SELECT COUNT(ROWID)
      INTO vlCont
      FROM RHEKT.TAAUTORIZANTESXFUNCION
     WHERE FIIDFUNCION = vlFuncion;
     
    IF vlCont > cslCero THEN
        OPEN curDatos FOR
             SELECT AXF.FCCORREO,
                    INF.FCEMPLEADONOMBRE,
                    INF.FCPOSICIONDESC
               FROM RHEKT.TAAUTORIZANTESXFUNCION AXF
              INNER JOIN RHEKT.TAEMPLEADOINFO INF
                 ON INF.FIEMPLEADONUM = AXF.FIIDEMPAUT
              WHERE AXF.FIIDFUNCION = vlFuncion;    
    ELSE
        OPEN curDatos FOR
             SELECT C.FCCORREO,
                    INF.FCEMPLEADONOMBRE,
                    INF.FCPOSICIONDESC
               FROM RHEKT.RHVW_POS_LINREP LR
         INNER JOIN RHEKT.TAEMPLEADOINFO INF
                 ON LR.NUM_EMPLEADO_REP = INF.FIEMPLEADONUM
          LEFT JOIN RHEKT.TACORREOAUTORIZANTES C
                 ON C.FIIDEMPLEADO = LR.NUM_EMPLEADO_REP
              WHERE C.FCCORREO IS NOT NULL
         START WITH LR.NUM_EMPLEADO = paIdEmpleado
         CONNECT BY NOCYCLE 
              PRIOR LR.NUM_EMPLEADO_REP = LR.NUM_EMPLEADO;
    END IF;
  END SPCONAUTORIZANTESREP;  
  
  PROCEDURE SPINSERTASOLICEXT(
    paIdEmpleado    IN RHEKT.TASOLICITUDESEXTERNAS.FIEMPLEADONUM%TYPE,
    paIdCategoria   IN RHEKT.TASOLICITUDESEXTERNAS.FIIDCATEGORIA%TYPE,
    paUltimaRem     IN RHEKT.TASOLICITUDESEXTERNAS.FDULTIMAREMISION%TYPE,
    paOrigen        IN RHEKT.TASOLICITUDESEXTERNAS.FIORIGEN%TYPE
  )
/*************************************************************
Proyecto:                         Uniformes
Descripcion:                      Inserta una solicitud hecha de forma externa
Parametros de entrada:            paIdEmpleado       Id del empleado   
                                  paIdCategoria      Categoría
                                  paUltimaRem        Fecha de la última remisión    
                                  paOrigen           0 - Sistema anterior, 1 - Moto Italika Nueva                   
Parametros de salida:             No aplica
Parametros de entrada-salida      No aplica
Precondiciones:                   Tener creado el esquema
Creador:                          Othoniel García González
Fecha de creacion:                Junio 2015
*************************************************************/
  IS
  BEGIN
    MERGE INTO RHEKT.TASOLICITUDESEXTERNAS T
    USING (SELECT paIdEmpleado  IDEMPLEADO,
                  paIdCategoria IDCATEGORIA
             FROM DUAL) D
       ON (T.FIEMPLEADONUM = D.IDEMPLEADO
      AND T.FIIDCATEGORIA = IDCATEGORIA)
     WHEN MATCHED
     THEN UPDATE SET T.FDULTIMAREMISION = paUltimaRem,
                     T.FIORIGEN = paOrigen
     WHEN NOT MATCHED
     THEN INSERT(
          T.FIEMPLEADONUM,
          T.FIIDCATEGORIA,
          T.FDULTIMAREMISION,
          T.FIORIGEN)
          VALUES(
          paIdEmpleado,
          paIdCategoria,
          paUltimaRem,
          paOrigen);
  END  SPINSERTASOLICEXT;   

  PROCEDURE SPGUARDASOLICSININVENTARIO(
    paIdEmpleado    IN RHEKT.TASOLICSININVENTARIO.FIEMPLEADONUM%TYPE,   
    paPeriodo       IN RHEKT.TASOLICSININVENTARIO.FIPERIODO%TYPE,  
    paIdSubkit      IN RHEKT.TASOLICSININVENTARIO.FIIDSUBKIT%TYPE,  
    paSku           IN RHEKT.TASOLICSININVENTARIO.FISKU%TYPE,  
    paSucursal      IN RHEKT.TASUCURSALES.FISUCURSAL%TYPE
  )
/*************************************************************
Proyecto:                         Uniformes
Descripcion:                      Inserta una solicitud que no tiene inventario en CD
Parametros de entrada:            paIdEmpleado       Id del empleado   
                                  paPeriodo          Año y semana en que se guarda, ej. 201534
                                  paIdSubkit         Subkit de donde seleccionó el sku 
                                  paSku              SKU de la pieza
                                  paCeDis            Centro de distribución
Parametros de salida:             No aplica
Parametros de entrada-salida      No aplica
Precondiciones:                   Tener creado el esquema
Creador:                          Othoniel García González
Fecha de creacion:                Agosto 2015
*************************************************************/
  IS
    vlOrden     NUMBER(3) := 0;
    vlCeDis     NUMBER(6) := 0;
    vlCantidad  NUMBER(3) := 0;
  BEGIN
    SELECT NVL(MAX(FIORDEN), vlOrden) + 1
      INTO vlOrden
      FROM RHEKT.TASOLICSININVENTARIO
     WHERE FIEMPLEADONUM = paIdEmpleado
       AND FIPERIODO = paPeriodo
       AND FIIDSUBKIT = paIdSubkit;
       
    SELECT FIIDCDISTRIBUCION
      INTO vlCeDis
      FROM RHEKT.TASUCURSALES
     WHERE FISUCURSAL = paSucursal;
    
    SELECT FICANTIDAD
      INTO vlCantidad
      FROM RHEKT.TASUBKITS
     WHERE FIIDSUBKIT = paIdSubkit;
           
    MERGE INTO RHEKT.TASOLICSININVENTARIO T
    USING (SELECT paIdEmpleado  IDEMPLEADO,
                  paPeriodo     PERIODO,
                  paSku         SKU,
                  vlCeDis       CEDIS
             FROM DUAL) D
       ON (T.FIEMPLEADONUM = D.IDEMPLEADO 
          AND T.FIPERIODO = D.PERIODO
          AND T.FISKU = D.SKU
          AND T.FIIDCEDIS = D.CEDIS)
     WHEN NOT MATCHED
     THEN INSERT(
          T.FIIDSOLICITUD,
          T.FIEMPLEADONUM,
          T.FIPERIODO,
          T.FDFECHASOLICITUD,
          T.FIIDSUBKIT,
          T.FISKU,
          T.FIIDCEDIS,  
          T.FICANTIDAD,
          T.FIORDEN,
          T.FISUCURSAL)
   VALUES (RHEKT.SESOLICSININVENTARIO.NEXTVAL,
          paIdEmpleado,
          paPeriodo,
          SYSDATE,
          paIdSubkit,
          paSku,
          vlCeDis,
          vlCantidad,
          vlOrden,
          paSucursal);
          
   END SPGUARDASOLICSININVENTARIO;
   
   PROCEDURE SPOBTENERCONFIGURACION(
     paIdSucursal   IN RHEKT.TACONFIGPARCIAL.FIIDSUCURSAL%TYPE,
     paIdCanal      IN RHEKT.TACONFIGPARCIAL.FIIDCANAL%TYPE,
     paIdPais       IN RHEKT.TACONFIGPARCIAL.FIIDPAIS%TYPE,
     curDatos       OUT rcgCursor
   )
/*************************************************************
Proyecto:                         Uniformes
Descripcion:                      Consulta parametros de configuracion
Parametros de entrada:            paIdSucursal  Sucursal
                                  paIdCanal     Canal
                                  paIdPais      Pais
Parametros de salida:             curDatos      Cursor de referencia
Parametros de entrada-salida      No aplica
Precondiciones:                   Tener creado el esquema
Creador:                          Othoniel García González
Fecha de creacion:                Noviembre 2015
*************************************************************/
   IS
   BEGIN
     OPEN curDatos FOR
       SELECT CONF.FCNOMBREPARAM, 
              NVL(CP.FCVALORPARCIAL, CONF.FCVALORGENERICO) VALOR
         FROM RHEKT.TACONFIGURACIONES CONF
         LEFT JOIN RHEKT.TACONFIGPARCIAL CP
           ON CP.FCNOMBREPARAM = CONF.FCNOMBREPARAM
          AND CP.FIIDSUCURSAL = paIdSucursal
          AND CP.FIIDCANAL = paIdCanal
          AND CP.FIIDPAIS = paIdPais;
   END;
   
   PROCEDURE SPOBTENERENSAMBLE(
     paSku           IN RHEKT.TASOLICSININVENTARIO.FISKU%TYPE,  
     paSucursal      IN RHEKT.TASUCURSALES.FISUCURSAL%TYPE,
     curDatos       OUT rcgCursor)
/*************************************************************
Proyecto:                         Uniformes
Descripcion:                      Consulta SKUs equivalentes para ensamble dinamico
Parametros de entrada:            paSku         SKU
                                  paSucursal    Sucursal
Parametros de salida:             curDatos      Cursor de referencia
Parametros de entrada-salida      No aplica
Precondiciones:                   Tener creado el esquema
Creador:                          Othoniel García González
Fecha de creacion:                Julio 2016
*************************************************************/
   IS
    vlCeDis     NUMBER(6) := 0;
   BEGIN
    SELECT FIIDCDISTRIBUCION
      INTO vlCeDis
      FROM RHEKT.TASUCURSALES
     WHERE FISUCURSAL = paSucursal;
     
     OPEN curDatos FOR
       SELECT FISKU,
              FICANTIDAD,
              PRECIO 
         FROM (SELECT B.FISKU, 
                      INV.FICANTIDAD,
                      PZ.PRECIO
                 FROM RHEKT.TAENSAMBLESXSKU A
                INNER JOIN RHEKT.TAENSAMBLESXSKU B
                   ON A.FIIDENSAMBLE = B.FIIDENSAMBLE
                 LEFT JOIN RHEKT.TAINVENTARIOXCEDIS INV
                   ON INV.FISKU = B.FISKU
                  AND INV.FIIDCEDIS = vlCeDis
                INNER JOIN RHEKT.UNI_PIEZA_UNIFORME PZ
                   ON B.FISKU = PZ.SKU                
                WHERE A.FISKU = paSku
                  AND INV.FICANTIDAD > 0
                ORDER BY INV.FICANTIDAD DESC)
        WHERE ROWNUM = 1;
        
   END SPOBTENERENSAMBLE;
  
   PROCEDURE SPCONFIRMANOTIFICACION(paFolioReposicion IN RHEKT.TAREPOSICIONES.FIFOLIOREPOSICION%TYPE)
/*************************************************************
Proyecto:                         Uniformes
Descripcion:                      Confirma que una notificacion ya fue visualizada para no volver a mostrarla
Parametros de entrada:            paFolioReposicion         Folio de reposicion
Parametros de salida:             No aplica
Parametros de entrada-salida      No aplica
Precondiciones:                   Tener creado el esquema
Creador:                          Othoniel García González
Fecha de creacion:                Noviembre 2016
*************************************************************/   
   IS
      cslFalso  NUMBER(1) := 0;
   BEGIN
      UPDATE RHEKT.TAREPOSICIONES
         SET FIBANDNOTIFICAR = cslFalso
       WHERE FIFOLIOREPOSICION = paFolioReposicion;
       
   END SPCONFIRMANOTIFICACION;
   
   
   PROCEDURE SPCONSULTAENCUESTA(
    paIdEmpleado    IN RHEKT.TAEMPLEADOSXENCUESTA.FIIDEMPLEADO%TYPE,
    curDatos        OUT rcgCursor)
/*************************************************************
Proyecto:                         Uniformes
Descripcion:                      Consulta de encuesta
Parametros de entrada:            paIdEmpleado  Número de empleadop
Parametros de salida:             curDatos      Cursor de referencia
Parametros de entrada-salida      No aplica
Precondiciones:                   Tener creado el esquema
Creador:                          Othoniel García González
Fecha de creacion:                Febrero 2017
*************************************************************/   
   IS
      cslFalso  NUMBER(1) := 0;
   BEGIN
     OPEN curDatos FOR
       SELECT EMP.FIIDEMPLEADO, 
              EMP.FIIDENCUESTA, 
              EMP.FISUCURSALID,
              EMP.FCSUCURSAL,
              EMP.FCREGION,
              ENC.FCTITULO,
              ENC.FCDESCRIPCION,
              ENC.FDVIGENCIA,
              ENC.FDREGISTRO ENCREGISTRO,
              PREGXENC.FIIDPREGUNTA,
              PREGXENC.FIORDEN PREGORDEN,
              PREG.FCTEXTO PREGTEXTO,
              PREG.FDREGISTRO PREGREGISTRO,
              RESPXPREG.FIIDRESPUESTA,
              RESPXPREG.FIORDEN RESPORDEN,
              RESP.FCTEXTO RESPTEXTO,
              RESP.FDREGISTRO RESPREGISTRO
         FROM RHEKT.TAEMPLEADOSXENCUESTA EMP 
        INNER JOIN RHEKT.TAENCUESTAS ENC
           ON ENC.FIIDENCUESTA = EMP.FIIDENCUESTA
        INNER JOIN RHEKT.TAPREGUNTASXENCUESTA PREGXENC
           ON PREGXENC.FIIDENCUESTA = ENC.FIIDENCUESTA
        INNER JOIN RHEKT.TAPREGUNTAS PREG
           ON PREG.FIIDPREGUNTA = PREGXENC.FIIDPREGUNTA
        INNER JOIN RHEKT.TARESPUESTASXPREGUNTA RESPXPREG
           ON RESPXPREG.FIIDPREGUNTA = PREG.FIIDPREGUNTA
        INNER JOIN RHEKT.TARESPUESTAS RESP
           ON RESP.FIIDRESPUESTA = RESPXPREG.FIIDRESPUESTA
        WHERE EMP.FIIDEMPLEADO = paIdEmpleado
          AND FIBANDERARESP = cslFalso
          AND ENC.FDVIGENCIA >= TRUNC(SYSDATE)
        ORDER BY PREGORDEN, RESPORDEN;
   END SPCONSULTAENCUESTA;
   
  PROCEDURE SPGUARDARESPUESTA(
    paIdEmpleado    IN RHEKT.TARESPUESTASXEMPLEADO.FIIDEMPLEADO%TYPE,
    paIdEncuesta    IN RHEKT.TARESPUESTASXEMPLEADO.FIIDENCUESTA%TYPE,
    paIdPregunta    IN RHEKT.TARESPUESTASXEMPLEADO.FIIDPREGUNTA%TYPE,
    paIdRespuesta   IN RHEKT.TARESPUESTASXEMPLEADO.FIIDRESPUESTA%TYPE
  )
/*************************************************************
Proyecto:                         Uniformes
Descripcion:                      Guarda respuesta
Parametros de entrada:            paIdEmpleado  Número de empleado
                                  paIdEncuesta  Id de encuesta
                                  paIdPregunta  Id de pregunta
                                  paIdRespuesta Respuesta seleccionada
Parametros de salida:             No aplica
Parametros de entrada-salida      No aplica
Precondiciones:                   Tener creado el esquema
Creador:                          Othoniel García González
Fecha de creacion:                Febrero 2017
*************************************************************/  
  IS
  BEGIN
    MERGE INTO RHEKT.TARESPUESTASXEMPLEADO T
    USING (SELECT paIdEmpleado  IDEMPLEADO,
                  paIdEncuesta  IDENCUESTA,
                  paIdPregunta  IDPREGUNTA,
                  paIdRespuesta IDRESPUESTA
             FROM DUAL) S
       ON (T.FIIDEMPLEADO = S.IDEMPLEADO
      AND T.FIIDENCUESTA = S.IDENCUESTA
      AND T.FIIDPREGUNTA = S.IDPREGUNTA)
     WHEN MATCHED
     THEN UPDATE SET FIIDRESPUESTA = S.IDRESPUESTA,
                     FDFECHARESP = SYSDATE
     WHEN NOT MATCHED
     THEN INSERT (T.FIIDEMPLEADO
                 ,T.FIIDENCUESTA
                 ,T.FIIDPREGUNTA
                 ,T.FIIDRESPUESTA
                 ,T.FDFECHARESP)
          VALUES (S.IDEMPLEADO
                 ,S.IDENCUESTA
                 ,S.IDPREGUNTA
                 ,S.IDRESPUESTA
                 ,SYSDATE);
                 
  END SPGUARDARESPUESTA;

  PROCEDURE SPFINALIZAENCUESTA(
    paIdEmpleado    IN RHEKT.TAEMPLEADOSXENCUESTA.FIIDEMPLEADO%TYPE,
    paIdEncuesta    IN RHEKT.TAEMPLEADOSXENCUESTA.FIIDENCUESTA%TYPE,
    paComentarios   IN RHEKT.TAEMPLEADOSXENCUESTA.FCCOMENTARIOS%TYPE
  )
  /*************************************************************
Proyecto:                         Uniformes
Descripcion:                      Guarda respuesta
Parametros de entrada:            paIdEmpleado  Número de empleado
                                  paIdEncuesta  Id de encuesta
                                  paComentarios Comentarios adicionales
Parametros de salida:             No aplica
Parametros de entrada-salida      No aplica
Precondiciones:                   Tener creado el esquema
Creador:                          Othoniel García González
Fecha de creacion:                Febrero 2017
*************************************************************/  
  IS
    cslBanderaResp NUMBER(1) := 1;
  BEGIN
    UPDATE RHEKT.TAEMPLEADOSXENCUESTA
       SET FCCOMENTARIOS = NVL(paComentarios, ' '),
           FIBANDERARESP = cslBanderaResp,
           FDFECHARESP = SYSDATE
     WHERE FIIDEMPLEADO = paIdEmpleado
       AND FIIDENCUESTA = paIdEncuesta;
  END SPFINALIZAENCUESTA;
  
  PROCEDURE SPOBTENERNEGOCIO(paIdEmpleado IN RHEKT.TAEMPLEADOINFO.FIEMPLEADONUM%TYPE,
                             paCount      OUT NUMBER,
                             paCanal      OUT rcgCursor)
/*************************************************************
Proyecto:                         Uniformes
Descripcion:                      Obtiene la unidad de negocio
Parametros de entrada:            paIdEmpleado  Número de empleado
Parametros de salida:             paCount   Contador
                                  paCanal   Cursor de referencia
Parametros de entrada-salida      No aplica
Precondiciones:                   Tener creado el esquema
Creador:                          Othoniel García González
Fecha de creacion:                Febrero 2017
*************************************************************/  
  IS
    cslCExternos    NUMBER(1) := 3;
    
    vlFuncion       RHEKT.TAEMPLEADOINFO.FIFUNCIONNUM%TYPE := 0;
    vlIdCia         NUMBER(6) := 0;
    vlIdCanalCC     VARCHAR(4) := '';
    vlTab           TYPTABCANAL;
    
    vlNombre        RHEKT.UNI_CECO.NOMBRE%TYPE := '';
    vlEntidad       RHEKT.UNI_CECO.NOMBREENTIDAD%TYPE := '';
    vlAreaRH        RHEKT.UNI_CECO.AREARH%TYPE := '';
    
    cslNombrePP     VARCHAR(25) := 'PRESTA%PRENDA%';
    cslNombreEntPP  VARCHAR(25) := 'NEGOCIO PRENDARIO';
    cslFn1984       NUMBER(4) := 1984;
    cslIdCanalGCC   VARCHAR(2) := '23';
    cslAreaRhMAZ    VARCHAR(25) := 'MICRONEGOCIO AZTECA';
    cslNombreDEK    VARCHAR(10) := '%DEK%';
    cslNombreCyC    VARCHAR(10) := '%CYC%';
    
    cslIDCIADEK     NUMBER(6) := 4;
    cslIDCIACYC     NUMBER(6) := 6;
    cslIDCIAPP      NUMBER(6) := 8;
    cslIdCiaMaz     NUMBER(6) := 15;
    cslCero         NUMBER(1) := 0;
  BEGIN
      SELECT
        A.FIFUNCIONNUM,
        NVL(CIA.ID_CIA, cslCExternos),
        EC.IDCANAL
      INTO
          vlFuncion 
        , vlIdCia
        , vlIdCanalCC
      FROM RHEKT.TAEMPLEADOINFO A
        INNER JOIN RHEKT.UNI_CECO EC
          ON A.FICENCOSNUM = EC.IDCC
        LEFT JOIN RHEKT.UNI_CANAL_CIA CIA
          ON EC.IDCANAL = CIA.ID_CANAL
             AND EC.CANAL = CIA.CANAL
      WHERE A.FIEMPLEADONUM = paIdEmpleado;
      
      SELECT
        TYPREGCANAL(ID, CLAVE, DESCRIPCION)
      BULK COLLECT INTO vlTab
      FROM RHEKT.UNI_CAT_CIA CIA
        INNER JOIN RHEKT.TAFUNCIONESCIA FC
          ON FC.FICIAID = CIA.ID
        INNER JOIN RHEKT.TAEMPLEADOINFO RH
          ON RH.FIFUNCIONNUM = FC.FIFUNCIONUM
      WHERE RH.FIEMPLEADONUM = paIdEmpleado;
      
      IF (vlTab.COUNT > cslCero)
      THEN
        SELECT
          COUNT(ID)
        INTO paCount
        FROM (SELECT DISTINCT
                ID,
                CLAVE,
                DESCRIPCION
              FROM TABLE (CAST(vlTab AS TYPTABCANAL)));
              
        OPEN paCanal FOR
        SELECT DISTINCT
          ID,
          CLAVE,
          DESCRIPCION
        FROM TABLE (CAST(vlTab AS TYPTABCANAL));
      ELSE
        SELECT
          TRIM(EC.NOMBRE),
          TRIM(EC.NOMBREENTIDAD),
          TRIM(EC.AREARH)
        INTO
          vlNombre,
          vlEntidad,
          vlAreaRH
        FROM RHEKT.TAEMPLEADOINFO SAP
          INNER JOIN RHEKT.UNI_CECO EC
            ON SAP.FICENCOSNUM = EC.IDCC
        WHERE SAP.FIEMPLEADONUM = paIdEmpleado;

        IF (vlNombre LIKE cslNombrePP OR vlEntidad LIKE cslNombreEntPP)
        THEN
          vlIdCia := cslIDCIAPP;
        ELSIF (vlFuncion = cslFn1984)
        THEN
          IF (vlIdCanalCC = cslIdCanalGCC)
          THEN
            vlIdCia := cslIDCIACYC;
          ELSE
            vlIdCia := cslIdCiaMaz;
          END IF;
        ELSIF (vlAreaRH LIKE cslAreaRhMAZ)
          THEN
            vlIdCia := cslIdCiaMaz;
        ELSIF (vlNombre LIKE cslNombreCyC)
          THEN
            vlIdCia := cslIDCIACYC;
        ELSIF (vlNombre LIKE cslNombreDEK)
          THEN
            vlIdCia := cslIDCIADEK;
        END IF;

        OPEN paCanal FOR
        SELECT
          ID,
          CLAVE,
          DESCRIPCION
        FROM RHEKT.UNI_CAT_CIA
        WHERE ID = vlIdCia;
    END IF;
      
  END SPOBTENERNEGOCIO;
  
  PROCEDURE SPCONCAPTURASTALLAS(
    paIdEmpleado IN  RHEKT.TAEMPLEADOINFO.FIEMPLEADONUM%TYPE,
    paIdCarga    IN  RHEKT.TACARGATALLAS.FIIDCARGA%TYPE,
    curDatos     OUT rcgCursor)
  /*************************************************************
   Proyecto:                         Uniformes
   Descripcion:                      Obtiene las medidas que se requieren
   Parametros de entrada:            paIdEmpleado  Numero de empleado
                                     paIdCarga     Id de la carga
   Parametros de salida:             curDatos      Cursor de referencia
   Parametros de entrada-salida      No aplica
   Precondiciones:                   Tener creado el esquema
   Creador:                          Othoniel García González
   Fecha de creacion:                Octubre 2017
  *************************************************************/ 
  IS
    vlIdGenero             NUMBER(5) := 0;
    cslIdMujer             NUMBER(1) := 1;
    cslIdHombre            NUMBER(1) := 2;
    cslUnisex              NUMBER(1) := 3;
    cslCharMujer           VARCHAR(1) := 'M';
    cslCharHombre          VARCHAR(1) := 'H';
  BEGIN
    SELECT CASE
           WHEN FCEMPLEADOSEXO = cslCharMujer  THEN cslIdMujer
           WHEN FCEMPLEADOSEXO = cslCharHombre THEN cslIdHombre
           END
    INTO   vlIdGenero
    FROM   RHEKT.TAEMPLEADOINFO
    WHERE  FIEMPLEADONUM = paIdEmpleado;
    
    OPEN   curDatos FOR
    WITH T AS (
      SELECT CAP.FIIDCARGA, 
             CM.FIIDEMPLEADO, 
             CM.FIIDGENERO, 
             DET.FIIDMEDIDA, 
             DET.FNVALOR
      FROM   RHEKT.TACAPTURASXCARGA CAP
      INNER  JOIN RHEKT.TACAPTURAMEDIDAS CM
         ON  CM.FIIDCAPTURA = CAP.FIIDCAPTURA
      INNER  JOIN RHEKT.TACAPTURADETALLE DET
         ON  DET.FIIDCAPTURA = CM.FIIDCAPTURA
      WHERE  CAP.FIIDCARGA = paIdCarga
        AND  CM.FIIDEMPLEADO = paIdEmpleado
    )
    SELECT C.FIIDKIT, 
           MXT.FIIDTIPOPRENDA, 
           CAT.CATDESCR, 
           MXT.FIIDMEDIDA, 
           M.FCDESCRIPCION, 
           M.FCUNIDADDEMEDIDA,
           T.FNVALOR,
           MXT.FIORDEN
    FROM   RHEKT.TACARGATALLAS C
    INNER  JOIN RHEKT.TAMEDIDASXTIPOPRENDA MXT
       ON  MXT.FIIDGENERO IN (vlIdGenero, cslUnisex)
      AND  MXT.FIIDKIT = C.FIIDKIT
    INNER  JOIN RHEKT.UNI_PRODUCTO_CATEGORIA CAT
       ON  CAT.CATID = MXT.FIIDTIPOPRENDA
    INNER  JOIN RHEKT.TAMEDIDAS M
       ON  M.FIIDMEDIDA = MXT.FIIDMEDIDA
    LEFT   JOIN T
      ON   T.FIIDCARGA = C.FIIDCARGA
     AND   T.FIIDEMPLEADO = paIdEmpleado
     AND   T.FIIDGENERO = MXT.FIIDGENERO
     AND   T.FIIDMEDIDA = MXT.FIIDMEDIDA
    WHERE  C.FIIDCARGA = paIdCarga
    ORDER  BY MXT.FIORDEN;

  END SPCONCAPTURASTALLAS;

  PROCEDURE SPCONSULTACARGAACTIVA(
    paIdEmpleado  IN  RHEKT.TACAPTURAMEDIDAS.FIIDEMPLEADO%TYPE,
    paNegocio     IN  RHEKT.TACARGASXFUNCIONES.FIIDNEGOCIO%TYPE,
    paIdFunc      IN  RHEKT.TACARGASXFUNCIONES.FIIDFUNCION%TYPE,
    paIdCarga     OUT INTEGER,
    paBandCaptura OUT INTEGER,
    paBandModif   OUT INTEGER)
  /*************************************************************
   Proyecto:                         Uniformes
   Descripcion:                      Consulta si hay una carga activa
   Parametros de entrada:            paNegocio  Negocio
                                     paIdFunc   Funcion SAP
   Parametros de salida:             pdIdCarga  Id de la carga
   Parametros de entrada-salida      No aplica
   Precondiciones:                   Tener creado el esquema
   Creador:                          Othoniel García González
   Fecha de creacion:                Octubre 2017
  *************************************************************/ 
  IS
    cslFalso              INTEGER := 0;
    cslVerdadero          INTEGER := 1;
    
    vlCenCos              RHEKT.TAEMPLEADOINFO.FICENCOSNUM%TYPE := 0;
    vlFechaMov            RHEKT.TAEMPLEADOINFO.FDFECHAMOV%TYPE := NULL;
    vlVigenciaNvoIngreso  NUMBER(3) := NULL;
    vlLimiteModif         NUMBER(3) := NULL;
    cslLimiteModif        VARCHAR(50) := 'LimiteModifCapturaMedidas';
    cslVigNvoIngreso      VARCHAR(50) := 'VigNvoIngresoCapturaMedidas';
  BEGIN
    SELECT TO_NUMBER(FCVALORGENERICO)
      INTO vlLimiteModif
      FROM RHEKT.TACONFIGURACIONES
     WHERE FCNOMBREPARAM = cslLimiteModif;

    SELECT TO_NUMBER(FCVALORGENERICO)
      INTO vlVigenciaNvoIngreso
      FROM RHEKT.TACONFIGURACIONES
     WHERE FCNOMBREPARAM = cslVigNvoIngreso;
              
    SELECT FICENCOSNUM
          ,FDFECHAMOV
      INTO vlCenCos
          ,vlFechaMov
      FROM RHEKT.TAEMPLEADOINFO
     WHERE FIEMPLEADONUM = paIdEmpleado;

    BEGIN
		SELECT CXF.FIIDCARGA  
		  INTO paIdCarga   
		  FROM RHEKT.TACARGASXFUNCIONES CXF
		 INNER JOIN RHEKT.TACARGATALLAS C
			ON CXF.FIIDCARGA = C.FIIDCARGA
		 INNER JOIN RHEKT.TACENCOSXCARGA CC
			ON CC.FIIDCARGA = C.FIIDCARGA
		   AND CC.FICENCOSNUM = vlCenCos
		 WHERE C.FIBANDACTIVA = cslVerdadero
		   AND CXF.FIIDFUNCION = paIdFunc
		   AND CXF.FIIDNEGOCIO = paNegocio
		   AND C.FDFECHAINICIAL <= TRUNC(SYSDATE)
		   AND (C.FDFECHAFINAL >= TRUNC(SYSDATE) 
			OR vlFechaMov >= TRUNC(SYSDATE - vlVigenciaNvoIngreso)
			OR paIdEmpleado IN (SELECT E.FIEMPLEADONUM 
			                      FROM RHEKT.TAEXCEPCIONESCAPTURAS E
			                     WHERE E.FIIDCARGA = CXF.FIIDCARGA
			                       AND FDFECHAINICIAL <= TRUNC(SYSDATE) 
			                       AND (FDFECHAINICIAL + FIDIASVIGENCIA) >= TRUNC(SYSDATE))
			   );
    EXCEPTION
        WHEN NO_DATA_FOUND 
        THEN paIdCarga := NULL;
             paBandCaptura := cslFalso;
             paBandModif := cslFalso;
             RETURN;
    END;
    
    BEGIN
      SELECT cslVerdadero,
             CAP.FILIMITEMODIF - CAP.FIMODIFICACIONES
        INTO paBandCaptura, paBandModif
        FROM RHEKT.TACAPTURASXCARGA CXC
       INNER JOIN RHEKT.TACAPTURAMEDIDAS CAP
          ON CAP.FIIDCAPTURA = CXC.FIIDCAPTURA
       WHERE CXC.FIIDCARGA = paIdCarga
         AND CAP.FIIDEMPLEADO = paIdEmpleado;
    EXCEPTION
        WHEN NO_DATA_FOUND 
        THEN paBandCaptura := cslFalso;
             paBandModif := vlLimiteModif;
    END;
  END SPCONSULTACARGAACTIVA;

  PROCEDURE SPGUARDACAPTURAMEDIDA(
    paIdCarga         IN RHEKT.TACARGATALLAS.FIIDCARGA%TYPE,
    paIdEmpleado      IN RHEKT.TACAPTURAMEDIDAS.FIIDEMPLEADO%TYPE,
    paIdNegocio       IN RHEKT.TACAPTURAMEDIDAS.FINEGOCIO%TYPE,
    paFuncionSap      IN RHEKT.TACAPTURAMEDIDAS.FIFUNCIONSAP%TYPE,
    paIdGenero        IN RHEKT.TACAPTURAMEDIDAS.FIIDGENERO%TYPE,
    paIdCaptura       OUT RHEKT.TACAPTURAMEDIDAS.FIIDCAPTURA%TYPE
  )
  /*************************************************************
   Proyecto:                         Uniformes
   Descripcion:                      Guarda captura de medidas
   Parametros de entrada:            paIdCarga          Id de la carga masiva
                                     paIdEmpleado       Numero de empleado
                                     paIdNegocio        Negocio
                                     paFuncionSap       Funcion SAP
                                     paIdGenero         1 - Mujer, 2 - Hombre
   Parametros de salida:             paIdCaptura        Id de la captura
   Parametros de entrada-salida      No aplica
   Precondiciones:                   Tener creado el esquema
   Creador:                          Othoniel García González
   Fecha de creacion:                Octubre 2017
  *************************************************************/ 
  IS
    vlIdKit RHEKT.TACARGATALLAS.FIIDKIT%TYPE := 0;
    vlCenCos RHEKT.TAEMPLEADOINFO.FICENCOSNUM%TYPE := 0;
    vlLimiteModif NUMBER(3) := NULL;
    cslUno NUMBER(1) := 1;
    cslLimiteModif VARCHAR(50) := 'LimiteModifCapturaMedidas';
  BEGIN
    SELECT TO_NUMBER(FCVALORGENERICO)
      INTO vlLimiteModif
      FROM RHEKT.TACONFIGURACIONES
     WHERE FCNOMBREPARAM = cslLimiteModif;
     
    BEGIN
		SELECT C.FIIDCAPTURA
		  INTO paIdCaptura
		  FROM RHEKT.TACAPTURASXCARGA C
		 INNER JOIN RHEKT.TACAPTURAMEDIDAS M
			ON C.FIIDCAPTURA = M.FIIDCAPTURA
		 WHERE C.FIIDCARGA = paIdCarga
		   AND M.FIIDEMPLEADO = paIdEmpleado;
	EXCEPTION
		WHEN NO_DATA_FOUND THEN
		    paIdCaptura := RHEKT.SEQTACAPTURAMEDIDAS.NEXTVAL;
	END;
    
    SELECT FICENCOSNUM
      INTO vlCenCos
      FROM RHEKT.TAEMPLEADOINFO
     WHERE FIEMPLEADONUM = paIdEmpleado;     
     
    MERGE INTO RHEKT.TACAPTURAMEDIDAS T
    USING (SELECT paIdCaptura IDCAPTURA FROM DUAL) S
       ON (S.IDCAPTURA = T.FIIDCAPTURA)
     WHEN MATCHED
     THEN UPDATE
      SET FIMODIFICACIONES = FIMODIFICACIONES + cslUno
         ,FDFECHAMODIF = SYSDATE
     WHEN NOT MATCHED
     THEN INSERT (FIIDCAPTURA,
                  FIIDEMPLEADO,
                  FINEGOCIO,
                  FICENCOS,
                  FIFUNCIONSAP,
                  FIIDGENERO,
                  FILIMITEMODIF,
                  FDFECHACAPTURA,
                  FDFECHAMODIF)
          VALUES (paIdCaptura,
                  paIdEmpleado,
                  paIdNegocio,
                  vlCenCos,
                  paFuncionSap,
                  paIdGenero,
                  vlLimiteModif,
                  SYSDATE,
                  SYSDATE);
    
    MERGE INTO RHEKT.TACAPTURASXCARGA T
    USING (SELECT paIdCarga   IDCARGA
                 ,paIdCaptura IDCAPTURA
             FROM DUAL) S
       ON (S.IDCARGA = T.FIIDCARGA
      AND S.IDCAPTURA = T.FIIDCAPTURA)
     WHEN NOT MATCHED
     THEN INSERT (FIIDCARGA
                 ,FIIDCAPTURA)
          VALUES (paIdCarga
                 ,paIdCaptura);
  
  MERGE INTO RHEKT.TAEXCEPCIONESCAPTURAS T
  USING (SELECT paIdCarga    IDCARGA
               ,paIdEmpleado IDEMPLEADO
           FROM DUAL) S
     ON (S.IDCARGA = T.FIIDCARGA 
    AND S.IDEMPLEADO = FIEMPLEADONUM)
   WHEN MATCHED
   THEN UPDATE
    SET FIBANDCAPTURA = cslUno
       ,FDFECHACAPTURA = SYSDATE;
       
  END SPGUARDACAPTURAMEDIDA;
  
  PROCEDURE SPGUARDACAPTURADETALLE (
    paIdCaptura       IN RHEKT.TACAPTURAMEDIDAS.FIIDCAPTURA%TYPE,
    paIdMedida        IN RHEKT.TACAPTURADETALLE.FIIDMEDIDA%TYPE,
    paValor           IN RHEKT.TACAPTURADETALLE.FNVALOR%TYPE,
    paResult          OUT NUMBER
  )
    /*************************************************************
   Proyecto:                         Uniformes
   Descripcion:                      Guarda detalle de captura de medidas
   Parametros de entrada:            paIdCaptura        Id de la captura
                                     paIdMedida         Id de medida
                                     paValor            Valor medido
   Parametros de salida:             paResult           Registros insertados/actualizados
   Parametros de entrada-salida      No aplica
   Precondiciones:                   Tener creado el esquema
   Creador:                          Othoniel García González
   Fecha de creacion:                Febrero 2018
  *************************************************************/ 
  IS
  BEGIN
    MERGE INTO RHEKT.TACAPTURADETALLE T
    USING (SELECT paIdCaptura IDCAPTURA
                 ,paIdMedida  IDMEDIDA
             FROM DUAL) S
       ON (S.IDCAPTURA = T.FIIDCAPTURA AND S.IDMEDIDA = T.FIIDMEDIDA)
     WHEN MATCHED
     THEN UPDATE
      SET FNVALOR = paValor
     WHEN NOT MATCHED
     THEN INSERT (FIIDCAPTURA
                 ,FIIDMEDIDA
                 ,FNVALOR)
          VALUES (S.IDCAPTURA
                 ,S.IDMEDIDA
                 ,paValor);
    paResult := SQL%ROWCOUNT;
  END SPGUARDACAPTURADETALLE;
END PAWEBUNIFORMES;
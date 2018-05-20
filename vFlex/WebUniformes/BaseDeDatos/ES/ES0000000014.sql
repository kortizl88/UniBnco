/*********************************************
 * Tabla de estatus de SPPI                  *
 *********************************************/

CREATE TABLE RHEKT.TAESTATUSSPPI
(
	FIESTATUSSPPI 		  NUMBER(3) NOT NULL ,
	FCDESCRESTATUSSPPI    VARCHAR2(50 CHAR) NOT NULL
)
	TABLESPACE TBS_RHEKT_CAT_DAT
	LOGGING;

CREATE UNIQUE INDEX RHEKT.PK_TAESTATUSSPPI ON RHEKT.TAESTATUSSPPI
	(FIESTATUSSPPI ASC)
	LOGGING
	TABLESPACE TBS_RHEKT_CAT_IDX;
	
ALTER TABLE RHEKT.TAESTATUSSPPI
	ADD CONSTRAINT PK_TAESTATUSSPPI PRIMARY KEY (FIESTATUSSPPI) USING INDEX RHEKT.PK_TAESTATUSSPPI;

/*********************************************
 * Tabla de distribución de SPPI             *
 *********************************************/
 	
CREATE TABLE RHEKT.TADISTRIBUCIONSPPI
(
	FIEMPLEADO			NUMBER(10) NOT NULL,
	FISUCURSAL			NUMBER(10) NOT NULL,
	FIPEDIDO			NUMBER(10) NOT NULL,	
	FINEGOCIO			NUMBER(3) NOT NULL,
	FCFOLIOPEDIDO		VARCHAR(8 CHAR) NOT NULL,
	FISKU				NUMBER(10) NOT NULL,
	FNIMPORTE			NUMBER(10,2) NOT NULL,	
	FCCLAVEUSUARIO		VARCHAR(10 CHAR) DEFAULT ' ' NOT NULL,
	FISISTEMASATELITAL	NUMBER(10) DEFAULT 0 NOT NULL,	
	FIFOLIOCARGA		NUMBER(10) DEFAULT 0 NOT NULL,
	FIPORCENTAVANCE		NUMBER(3) DEFAULT 0 NOT NULL,
	FCDOCUMENTO			VARCHAR(30 CHAR) DEFAULT ' ' NOT NULL,
	FCOBSERVACIONES 	VARCHAR(255 CHAR) DEFAULT ' ' NOT NULL,
	FDFECHAENTREGA		DATE NOT NULL,
	FDFECHAENVIO		DATE DEFAULT TO_DATE('01011900','DDMMYYYY') NOT NULL,
	FDULTIMAACT			DATE DEFAULT TO_DATE('01011900','DDMMYYYY') NOT NULL,
	FIESTATUS			NUMBER(3) NOT NULL
)
	TABLESPACE TBS_RHEKT_OPE_DAT
	LOGGING;
	
CREATE UNIQUE INDEX RHEKT.PK_TADISTRIBUCIONSPPI ON RHEKT.TADISTRIBUCIONSPPI
	(FIEMPLEADO, FISUCURSAL, FIPEDIDO)
	LOGGING
	TABLESPACE TBS_RHEKT_OPE_IDX;

CREATE INDEX RHEKT.IX_TADISTRIBUCIONSPPI_01 ON RHEKT.TADISTRIBUCIONSPPI
	(FDFECHAENVIO)
	LOGGING
	TABLESPACE TBS_RHEKT_OPE_IDX;

CREATE INDEX RHEKT.IX_TADISTRIBUCIONSPPI_02 ON RHEKT.TADISTRIBUCIONSPPI
	(FIESTATUS)
	LOGGING
	TABLESPACE TBS_RHEKT_OPE_IDX;
		
ALTER TABLE RHEKT.TADISTRIBUCIONSPPI ADD 
(
	CONSTRAINT PK_TADISTRIBUCIONSPPI PRIMARY KEY (FIEMPLEADO, FISUCURSAL, FIPEDIDO) USING INDEX RHEKT.PK_TADISTRIBUCIONSPPI,
	CONSTRAINT FK_TADISTRIBUCIONSPPI_01 FOREIGN KEY (FIESTATUS) REFERENCES RHEKT.TAESTATUSSPPI(FIESTATUSSPPI),
	CONSTRAINT FK_TADISTRIBUCIONSPPI_02 FOREIGN KEY (FINEGOCIO) REFERENCES RHEKT.UNI_CAT_CIA(ID),
	CONSTRAINT FK_TADISTRIBUCIONSPPI_03 FOREIGN KEY (FISKU) REFERENCES RHEKT.UNI_PIEZA_UNIFORME(SKU)
);

ALTER TABLE RHEKT.TAKITUNIFORMES ADD 
	(
		FIMOSTRARGUIA	NUMBER(1) DEFAULT 0 NOT NULL,
		FCARCHIVOSGUIA	VARCHAR(100) DEFAULT ' ' NOT NULL 
	);

ALTER TABLE RHEKT.TASKUSXSUBKIT ADD (
	FIDISCONTINUO	NUMBER(1) DEFAULT 0 NOT NULL,
	FDFECHADISCONTINUO DATE DEFAULT TO_DATE('01011900','DDMMYYYY') NOT NULL
);

ALTER TABLE RHEKT.UNI_CAT_CIA ADD 
	(
		FIMESESRENOV	NUMBER(2) DEFAULT 6 NOT NULL
	);

ALTER TABLE RHEKT.TASUBKITSXKIT ADD
	(
		FIAGRUPAR		NUMBER(2) DEFAULT 0 NOT NULL
	);

ALTER TABLE RHEKT.TAFUNCIONESXNEGOCIO ADD
	(
		FCMANUALDEIMAGEN	VARCHAR(100) DEFAULT ' ' NOT NULL
	);
	
CREATE INDEX RHEKT.IX_TASKUSXSUBKIT_02 ON RHEKT.TASKUSXSUBKIT
	(FIDISCONTINUO)
	LOGGING
	TABLESPACE TBS_RHEKT_CAT_IDX;
	
CREATE INDEX RHEKT.IX_UNIPIEZAUNIFORME_01 ON RHEKT.UNI_PIEZA_UNIFORME
	(ID_GENERO)
	LOGGING
	TABLESPACE TBS_RHEKT_CAT_IDX;
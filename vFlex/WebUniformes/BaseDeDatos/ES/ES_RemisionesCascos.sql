CREATE TABLE RHEKT.TASOLICITUDESEXTERNAS(
  FIEMPLEADONUM       NUMBER(10)         NOT NULL, 
  FIIDCATEGORIA       NUMBER(10)         NOT NULL, 
  FDULTIMAREMISION    DATE               NOT NULL
)
TABLESPACE TBS_RHEKT_OPE_DAT
LOGGING;

CREATE UNIQUE INDEX RHEKT.PK_TASOLICITUDESEXTERNAS ON RHEKT.TASOLICITUDESEXTERNAS(FIEMPLEADONUM, FIIDCATEGORIA)
TABLESPACE TBS_RHEKT_OPE_IDX
LOGGING;

ALTER TABLE RHEKT.TASOLICITUDESEXTERNAS ADD CONSTRAINT PK_TASOLICITUDESEXTERNAS PRIMARY KEY (FIEMPLEADONUM, FIIDCATEGORIA)
USING INDEX RHEKT.PK_TASOLICITUDESEXTERNAS;

ALTER TABLE RHEKT.TASOLICITUDESEXTERNAS ADD CONSTRAINT FK_TASOLICITUDESEXTERNAS_0 FOREIGN KEY (FIIDCATEGORIA)
REFERENCES RHEKT.UNI_PRODUCTO_CATEGORIA(CATID);
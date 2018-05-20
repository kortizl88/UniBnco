package Com.Elektra.Uniformes.Services;

import Com.Elektra.Uniformes.Dao.TrackingDao;
import Com.Elektra.Uniformes.Dto.DatosTrackingDto;
import Com.Elektra.Uniformes.Dto.FiltroTrackingDto;
import Com.Elektra.Uniformes.Services.resp.ExcelResp;
import Com.Elektra.Uniformes.Services.resp.TrackingResp;
import org.apache.log4j.Logger;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeoutException;

@Service("trackingService")
public class TrackingService {

    private static final Logger log = Logger.getLogger(TrackingService.class);

    private final TrackingDao dao;

    private final DateFormat df;

    @Autowired
    public TrackingService(TrackingDao dao) {
        this.dao = dao;
        this.df = new SimpleDateFormat("dd/MMM/yyyy");
    }

    public TrackingResp consultaPedidos(FiltroTrackingDto filtro) {
        TrackingResp resp = new TrackingResp();
        try {
            resp.setPedidos(dao.consultaSolicitudes(filtro));
            resp.setCodigo(0);
        } catch (TimeoutException e) {
            resp.setCodigo(-1);
            resp.setDescripcionOperacion("La consulta ha excedido el límite permitido. Favor de agregar más criterios de búsqueda (número de empleado, tienda, fechas, etc.)");
        } catch (Exception e) {
            log.error("Ocurrió un error al consultar los datos", e);
            resp.setCodigo(-1);
            resp.setDescripcionOperacion("Ocurrió un error al consultar los datos, favor de contactar a soporte técnico.");
            resp.setDetalleTecnico(e.toString());
        }
        return resp;
    }

    public ExcelResp generaReporte(FiltroTrackingDto filtro) {
        ExcelResp resp = new ExcelResp();
        try {
            List<DatosTrackingDto> datos = dao.consultaSolicitudes(filtro);
            resp.setArchivo(generaReporte(datos));
            resp.setCodigo(0);
        } catch (TimeoutException e) {
            resp.setCodigo(-1);
            resp.setDescripcionOperacion("La consulta ha excedido el límite permitido. Favor de agregar más criterios de búsqueda (número de empleado, tienda, fechas, etc.)");
        } catch (Exception e) {
            log.error("Ocurrió un error al generar el reporte", e);
            resp.setCodigo(-1);
            resp.setDescripcionOperacion("Ocurrió un error al generar el reporte, favor de contactar a soporte técnico.");
            resp.setDetalleTecnico(e.toString());
        }
        return resp;
    }

    private byte[] generaReporte(List<DatosTrackingDto> datos) throws IOException {
        FileOutputStream fileOut = null;
        FileInputStream is = null;
        try {
            File temp = File.createTempFile("tempfile", ".tmp");
            fileOut = new FileOutputStream(temp);
            Workbook workbook = new HSSFWorkbook();
            llenarReporte(workbook, datos);
            workbook.write(fileOut);
            byte[] data = new byte[(int) temp.length()];
            is = new FileInputStream(temp);
            int n = 0;
            while ((n = is.read(data, n, data.length - n)) > 0) ;
            return data;
        } finally {
            if (fileOut != null) {
                try {
                    fileOut.close();
                } catch (IOException e) {
                    log.error("Error al cerrar el archivo temporal", e);
                }
            }
            if (is != null) {
                try {
                    is.close();
                } catch (IOException e) {
                    log.error("Error al cerrar el input stream", e);
                }
            }
        }


    }

    private void llenarReporte(Workbook workbook, List<DatosTrackingDto> datos) {
        Sheet hoja = workbook.createSheet();
        CellStyle cellStyle = workbook.createCellStyle();
        Row head = hoja.createRow(0);
        head.setRowStyle(cellStyle);
        buildHeaders(workbook, head);
        int i = 1;
        for (DatosTrackingDto data : datos) {
            Row content = hoja.createRow(i);
            buildRow(content, data, i);
            i++;
        }
        for (Cell cell : head) {
            hoja.autoSizeColumn(cell.getColumnIndex());
        }
    }

    private void buildHeaders(Workbook workbook, Row head) {
        head.createCell(0).setCellValue("Empleado");
        head.createCell(1).setCellValue("Nombre");
        head.createCell(2).setCellValue("Función");
        head.createCell(3).setCellValue("Puesto");
        head.createCell(4).setCellValue("C.C.");
        head.createCell(5).setCellValue("C.C. Nombre");
        head.createCell(6).setCellValue("Pedido");
        head.createCell(7).setCellValue("Estatus");
        head.createCell(8).setCellValue("Tienda");
        head.createCell(9).setCellValue("Nombre Tienda");
        head.createCell(10).setCellValue("Sku");
        head.createCell(11).setCellValue("Descripcion");
        head.createCell(12).setCellValue("Piezas");
        head.createCell(13).setCellValue("Fecha Solicitud");
        head.createCell(14).setCellValue("Remisión");
        head.createCell(15).setCellValue("Fecha Remisión");
        head.createCell(16).setCellValue("Fecha Entrega");

        CellStyle style = workbook.createCellStyle();
        Font font = workbook.createFont();
        style.setFont(font);
        font.setBold(true);
        font.setBoldweight(Font.BOLDWEIGHT_BOLD);
        for (Cell cell : head) {
            cell.setCellStyle(style);
        }
    }

    private void buildRow(Row row, DatosTrackingDto data, int i) {
        setCellValue(row, data.getIdEmpleado(), 0);
        setCellValue(row, data.getNombreEmpleado(), 1);
        setCellValue(row, data.getIdFuncion(), 2);
        setCellValue(row, data.getDescripcionPuesto(), 3);
        setCellValue(row, data.getCentroDeCostos(), 4);
        setCellValue(row, data.getNombreCC(), 5);
        setCellValue(row, data.getPedido(), 6);
        setCellValue(row, data.getEstatus(), 7);
        setCellValue(row, data.getIdTienda(), 8);
        setCellValue(row, data.getNombreTienda(), 9);
        setCellValue(row, data.getSku(), 10);
        setCellValue(row, data.getDescripcionSku(), 11);
        setCellValue(row, data.getCantidad(), 12);
        setCellValue(row, data.getFechaSolicitud(), 13);
        setCellValue(row, data.getRemision(), 14);
        setCellValue(row, data.getFechaRemision(), 15);
        setCellValue(row, data.getFechaEntrega(), 16);
    }

    private void setCellValue(Row row, String data, int column) {
        if (data != null) {
            row.createCell(column).setCellValue(data);
        }

    }

    private void setCellValue(Row row, Date data, int column) {
        if (data != null) {
            row.createCell(column).setCellValue(df.format(data));
        }

    }

    private void setCellValue(Row row, Integer data, int column) {
        if (data != null) {
            row.createCell(column).setCellValue(data);
        }

    }
}

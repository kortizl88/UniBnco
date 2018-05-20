package Com.Elektra.Uniformes.Dto;

import Com.Elektra.Uniformes.Dao.LogDao;

import java.math.BigDecimal;
import java.util.Date;

public class EmpleadoDesctoDto implements Cloneable {

    private Integer emplid;
    private String soc;
    private String ccnom;
    private String refe;
    private BigDecimal totdesc;
    private Date fecpago;
    private Integer semdescto;
    private Integer aniodescto;
    private BigDecimal saldo;
    private String descGral;
    private BigDecimal pago;
    private Integer periodos;

    public Integer getEmplid() {
        return emplid;
    }

    public void setEmplid(Integer emplid) {
        this.emplid = emplid;
    }

    public String getSoc() {
        return soc;
    }

    public void setSoc(String soc) {
        this.soc = soc;
    }

    public String getCcnom() {
        return ccnom;
    }

    public void setCcnom(String ccnom) {
        this.ccnom = ccnom;
    }

    public String getRefe() {
        return refe;
    }

    public void setRefe(String refe) {
        this.refe = refe;
    }

    public BigDecimal getTotdesc() {
        return totdesc;
    }

    public void setTotdesc(BigDecimal totdesc) {
        this.totdesc = totdesc;
    }

    public Date getFecpago() {
        return fecpago;
    }

    public void setFecpago(Date fecpago) {
        this.fecpago = fecpago;
    }

    public Integer getSemdescto() {
        return semdescto;
    }

    public void setSemdescto(Integer semdescto) {
        this.semdescto = semdescto;
    }

    public Integer getAniodescto() {
        return aniodescto;
    }

    public void setAniodescto(Integer aniodescto) {
        this.aniodescto = aniodescto;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public BigDecimal getPago() {
        return pago;
    }

    public void setPago(BigDecimal pago) {
        this.pago = pago;
    }

    @Override
    public boolean equals(Object obj) {
        EmpleadoDesctoDto desctoSap;
        if (obj instanceof EmpleadoDesctoDto) {
            desctoSap = (EmpleadoDesctoDto) obj;
        } else {
            return false;
        }
        return this.emplid.equals(desctoSap.getEmplid()) &&
                this.soc.equals(desctoSap.getSoc()) &&
                this.ccnom.equals(desctoSap.getCcnom()) &&
                this.refe.equals(desctoSap.getRefe()) &&
                this.totdesc.equals(desctoSap.getTotdesc()) &&
                this.fecpago.equals(desctoSap.getFecpago()) &&
                this.semdescto.equals(desctoSap.getSemdescto()) &&
                this.aniodescto.equals(desctoSap.getAniodescto()) &&
                this.saldo.equals(desctoSap.getSaldo());
    }

    @Override
    public int hashCode() {
        StringBuffer buffer = new StringBuffer();
        buffer.append(this.emplid);
        buffer.append(this.soc);
        buffer.append(this.ccnom);
        buffer.append(this.refe);
        buffer.append(this.totdesc);
        buffer.append(this.fecpago);
        buffer.append(this.fecpago);
        buffer.append(this.semdescto);
        buffer.append(this.aniodescto);
        buffer.append(this.saldo);
        return buffer.toString().hashCode();
    }

    ;

    public Object clone() {
        Object obj = null;
        try {
            obj = super.clone();
        } catch (CloneNotSupportedException ex) {
            LogDao.logExcepcion("No se puede duplicar objeto de tipo UniEmpDesctoSap" + ex);
        }
        return obj;
    }

    public void setDescGral(String descGral) {
        this.descGral = descGral;
    }

    public String getDescGral() {
        return descGral;
    }

    public Integer getPeriodos() {
        return periodos;
    }

    public void setPeriodos(Integer periodos) {
        this.periodos = periodos;
    }
}

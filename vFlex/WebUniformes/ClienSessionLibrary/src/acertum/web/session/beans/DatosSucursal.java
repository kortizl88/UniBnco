//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package acertum.web.session.beans;

import java.io.Serializable;

public class DatosSucursal implements Serializable {
    private final String MAC;
    private final String IP;
    private final int idSucursal;
    private final String nombreSucursal;
    private final String colonia;
    private final String terminalBancaria;
    private final String codigoPostal;
    private final int idCanal;
    private final String descCanal;
    private final String dispositivo;
    private final int idPais;
    private final String pais;
    private final String poblacion;
    private final String estado;
    private final String canalAlnova;
    private final String canalCU;
    private static final long serialVersionUID = 3149903686945691199L;

    public DatosSucursal(String MAC, String IP, int idSucursal, String nombreSucursal, String colonia, String terminalBancaria, String codigoPostal, int idCanal, String descCanal, String dispositivo, int idPais, String pais, String poblacion, String estado, String canalAlnova, String canalCU) {
        this.MAC = MAC;
        this.IP = IP;
        this.idSucursal = idSucursal;
        this.nombreSucursal = nombreSucursal;
        this.colonia = colonia;
        this.terminalBancaria = terminalBancaria;
        this.codigoPostal = codigoPostal;
        this.idCanal = idCanal;
        this.descCanal = descCanal;
        this.dispositivo = dispositivo;
        this.idPais = idPais;
        this.pais = pais;
        this.poblacion = poblacion;
        this.estado = estado;
        this.canalAlnova = canalAlnova;
        this.canalCU = canalCU;
    }

    public String getMAC() {
        return this.MAC;
    }

    public String getIP() {
        return this.IP;
    }

    public int getIdSucursal() {
        return this.idSucursal;
    }

    public String getNombreSucursal() {
        return this.nombreSucursal;
    }

    public String getColonia() {
        return this.colonia;
    }

    public String getTerminalBancaria() {
        return this.terminalBancaria;
    }

    public String getCodigoPostal() {
        return this.codigoPostal;
    }

    public int getIdCanal() {
        return this.idCanal;
    }

    public String getDescCanal() {
        return this.descCanal;
    }

    public String getDispositivo() {
        return this.dispositivo;
    }

    public int getIdPais() {
        return this.idPais;
    }

    public String getPais() {
        return this.pais;
    }

    public String getPoblacion() {
        return this.poblacion;
    }

    public String getEstado() {
        return this.estado;
    }

    public String getCanalAlnova() {
        return this.canalAlnova;
    }

    public String getCanalCU() {
        return this.canalCU;
    }
}

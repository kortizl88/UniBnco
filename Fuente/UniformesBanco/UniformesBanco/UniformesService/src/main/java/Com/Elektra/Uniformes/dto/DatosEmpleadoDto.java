package Com.Elektra.Uniformes.Dto;

import java.util.List;

public class DatosEmpleadoDto {
    private int fiEmpleadoNum;
    private int fnFuncionNum;
    private int sexo;
    private String fcEmpleadoNombre;
    private String fcPosicionDesc;
    private List<CanalDto> canal;
    private int pais;
    private List<String> manualDeImagen;
    private Boolean flagEntrega;
    private Boolean flagTracking;
    private List<String> mensajesInicio;

    public int getFiEmpleadoNum() {
        return fiEmpleadoNum;
    }

    public void setFiEmpleadoNum(int fiEmpleadoNum) {
        this.fiEmpleadoNum = fiEmpleadoNum;
    }

    public int getFnFuncionNum() {
        return fnFuncionNum;
    }

    public void setFnFuncionNum(int fnFuncionNum) {
        this.fnFuncionNum = fnFuncionNum;
    }

    public int getSexo() {
        return sexo;
    }

    public void setSexo(int sexo) {
        this.sexo = sexo;
    }

    public String getFcEmpleadoNombre() {
        return fcEmpleadoNombre;
    }

    public void setFcEmpleadoNombre(String fcEmpleadoNombre) {
        this.fcEmpleadoNombre = fcEmpleadoNombre;
    }

    public String getFcPosicionDesc() {
        return fcPosicionDesc;
    }

    public void setFcPosicionDesc(String fcPosicionDesc) {
        this.fcPosicionDesc = fcPosicionDesc;
    }

    public int getPais() {
        return pais;
    }

    public void setPais(int pais) {
        this.pais = pais;
    }

    public List<CanalDto> getCanal() {
        return canal;
    }

    public void setCanal(List<CanalDto> canal) {
        this.canal = canal;
    }

    public List<String> getManualDeImagen() {
        return manualDeImagen;
    }

    public void setManualDeImagen(List<String> manualDeImagen) {
        this.manualDeImagen = manualDeImagen;
    }

    public Boolean getFlagEntrega() {
        return flagEntrega;
    }

    public void setFlagEntrega(Boolean flagEntrega) {
        this.flagEntrega = flagEntrega;
    }

    public Boolean getFlagTracking() {
        return flagTracking;
    }

    public void setFlagTracking(Boolean flagTracking) {
        this.flagTracking = flagTracking;
    }

    public List<String> getMensajesInicio() {
        return mensajesInicio;
    }

    public void setMensajesInicio(List<String> mensajesInicio) {
        this.mensajesInicio = mensajesInicio;
    }
}

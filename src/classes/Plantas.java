package classes;

abstract class Plantas {

    private String colorPetalo;
    private String tipoMaceta;
    private String horasLuz;

    public Plantas(String colorPetalo, String tipoMaceta, String horasLuz) {
        this.colorPetalo = colorPetalo;
        this.tipoMaceta = tipoMaceta;
        this.horasLuz = horasLuz;
    }

    public String getColorPetalo() {
        return colorPetalo;
    }

    public void setColorPetalo(String colorPetalo) {
        this.colorPetalo = colorPetalo;
    }

    public String getTipoMaceta() {
        return tipoMaceta;
    }

    public void setTipoMaceta(String tipoMaceta) {
        this.tipoMaceta = tipoMaceta;
    }

    public String getHorasLuz() {
        return horasLuz;
    }

    public void setHorasLuz(String horasLuz) {
        this.horasLuz = horasLuz;
    }

}

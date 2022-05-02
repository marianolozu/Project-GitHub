package classes;

abstract class Plantas {

    private String colorPetalo;
    private String tipoMaceta;

    public Plantas(String colorPetalo, String tipoMaceta) {
        this.colorPetalo = colorPetalo;
        this.tipoMaceta = tipoMaceta;
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

}

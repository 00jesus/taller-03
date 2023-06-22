public class Notebook extends Dispositivo {
    private String resolucionPantalla;
    private String tipoTeclado;
    private String bateria;


    public Notebook(String marca, int memoriaAlmacenamiento, int memoriaRAM, String procesador, String modelo, String añoFabircacion, int stock, int precio, String resolucionPantalla, String tipoTeclado, String bateria) {
        super(marca, memoriaAlmacenamiento, memoriaRAM, procesador, modelo, añoFabircacion, stock, precio);
        this.resolucionPantalla = resolucionPantalla;
        this.tipoTeclado = tipoTeclado;
        this.bateria = bateria;
    }


    @Override
    public String getTipo () {
        return "Notebook";
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "resolucionPantalla='" + resolucionPantalla + '\'' +
                ", tipoTeclado='" + tipoTeclado + '\'' +
                ", bateria='" + bateria + '\'' +
                ", marca='" + marca + '\'' +
                ", memoriaAlmacenamiento=" + memoriaAlmacenamiento +
                ", memoriaRAM=" + memoriaRAM +
                ", procesador='" + procesador + '\'' +
                ", modelo='" + this.modelo + '\'' +
                ", añoFabircacion='" + añoFabircacion + '\'' +
                ", stock=" + stock +
                ", precio=" + precio +
                '}';
    }
}
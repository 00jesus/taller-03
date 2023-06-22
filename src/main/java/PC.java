public class PC extends Dispositivo {
    private String tarjetaVideo;
    private String fuentePoder;
    private String chasis;
    private Pantalla pantalla;


    public PC(String marca, int memoriaAlmacenamiento, int memoriaRAM, String procesador, String modelo, String añoFabircacion, int stock, int precio, String tarjetaVideo, String fuentePoder, String chasis, Pantalla pantalla) {
        super(marca, memoriaAlmacenamiento, memoriaRAM, procesador, modelo, añoFabircacion, stock, precio);
        this.tarjetaVideo = tarjetaVideo;
        this.fuentePoder = fuentePoder;
        this.chasis = chasis;
        this.pantalla = pantalla;
    }

    public PC(String tarjetaVideo, String fuentePoder, String chasis, Pantalla pantalla) {
        this.tarjetaVideo = tarjetaVideo;
        this.fuentePoder = fuentePoder;
        this.chasis = chasis;
        this.pantalla = pantalla;
    }


    public Pantalla getPantalla() {
        return pantalla;
    }

    public void setPantalla(Pantalla pantalla) {
        this.pantalla = pantalla;
    }

    public String getTarjetaVideo() {
        return tarjetaVideo;
    }

    public void setTarjetaVideo(String tarjetaVideo) {
        this.tarjetaVideo = tarjetaVideo;
    }

    public String getFuentePoder() {
        return fuentePoder;
    }

    public void setFuentePoder(String fuentePoder) {
        this.fuentePoder = fuentePoder;
    }

    public String getChasis() {
        return chasis;
    }

    public void setChasis(String chasis) {
        this.chasis = chasis;
    }

    @Override
    public String getTipo () {
        return "PC";
    }


    @Override
    public String toString() {
        return "PC{" +
                "tarjetaVideo='" + tarjetaVideo + '\'' +
                ", fuentePoder='" + fuentePoder + '\'' +
                ", chasis='" + chasis + '\'' +
                ", pantalla=" + pantalla +
                ", marca='" + marca + '\'' +
                ", memoriaAlmacenamiento=" + memoriaAlmacenamiento +
                ", memoriaRAM=" + memoriaRAM +
                ", procesador='" + procesador + '\'' +
                ", modelo='" + modelo + '\'' +
                ", añoFabircacion='" + añoFabircacion + '\'' +
                ", stock=" + stock +
                ", precio=" + precio +
                '}';
    }
}
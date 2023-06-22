public abstract class Dispositivo {
    private String marca;
    private int memoriaAlmacenamiento;
    private int memoriaRAM;
    private String procesador;
    private String modelo;
    private String añoFabircacion;
    private int stock;
    private int precio;

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getMemoriaAlmacenamiento() {
        return this.memoriaAlmacenamiento;
    }

    public void setMemoriaAlmacenamiento(int memoriaAlmacenamiento) {
        this.memoriaAlmacenamiento = memoriaAlmacenamiento;
    }

    public int getMemoriaRAM() {
        return this.memoriaRAM;
    }

    public void setMemoriaRAM(int memoriaRAM) {
        this.memoriaRAM = memoriaRAM;
    }
}
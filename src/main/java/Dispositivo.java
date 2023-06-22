public abstract class Dispositivo {
    protected String marca;
    protected int memoriaAlmacenamiento;
    protected int memoriaRAM;
    protected String procesador;
    protected String modelo;
    protected String añoFabircacion;
    protected int stock;
    protected int precio;


    public Dispositivo(String marca, int memoriaAlmacenamiento, int memoriaRAM, String procesador, String modelo, String añoFabircacion, int stock, int precio) {
        this.marca = marca;
        this.memoriaAlmacenamiento = memoriaAlmacenamiento;
        this.memoriaRAM = memoriaRAM;
        this.procesador = procesador;
        this.modelo = modelo;
        this.añoFabircacion = añoFabircacion;
        this.stock = stock;
        this.precio = precio;
    }
    public Dispositivo () {
    }

    public abstract String getTipo();

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

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAñoFabircacion() {
        return añoFabircacion;
    }

    public void setAñoFabircacion(String añoFabircacion) {
        this.añoFabircacion = añoFabircacion;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}
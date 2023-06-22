public class Pantalla {
    private String marca;
    private String modelo;
    private String añoFabricacion;

    public Pantalla(String marca, String modelo, String añoFabricacion) {
        this.marca = marca;
        this.modelo = modelo;
        this.añoFabricacion = añoFabricacion;
    }


    @Override
    public String toString() {
        return "Pantalla{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", añoFabricacion='" + añoFabricacion + '\'' +
                '}';
    }
}

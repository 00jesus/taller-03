public class Accesorio {
    private String tipo;

    public Accesorio(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }


    @Override
    public String toString() {
        return "Accesorio{" +
                "tipo='" + tipo + '\'' +
                '}';
    }
}

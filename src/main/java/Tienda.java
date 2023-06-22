import java.util.ArrayList;

public class Tienda {
    private String direccion;
    public ArrayList<Dispositivo> listaDispositivos;
    public Cuenta cuentaCliente;

    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
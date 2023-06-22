import java.util.ArrayList;
import java.util.Locale;

public class Tienda {
    private String direccion;
    private ArrayList<Dispositivo> listaDispositivos;
    private ArrayList<Cuenta> listaCuentas;

    public Tienda(String direccion, ArrayList<Dispositivo> listaDispositivos, ArrayList<Cuenta> listaCuentas) {
        this.direccion = direccion;
        this.listaDispositivos = listaDispositivos;
        this.listaCuentas = listaCuentas;
    }
    public Tienda (ArrayList<Cuenta> listaCuentas) {
        this.listaCuentas = listaCuentas;
    }

    public Cuenta agregarCliente (Cliente cliente, String user, String password) {
        Cuenta cuenta = null;
        Cuenta nuevaCuenta = new Cuenta(cliente.getNombre()+", "+cliente.getApellido(), user, password);
        for (Cuenta auxCuenta: listaCuentas) {
            if ((auxCuenta.getUsuario().toLowerCase(Locale.ROOT).equals(user.toLowerCase(Locale.ROOT)))) {
                cuenta = auxCuenta;
                break;
            }else {
                System.out.println("ya existe user");
                return null;
            }
        }
        return cuenta;
    }


    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ArrayList<Cuenta> getListaCuentas() {
        return listaCuentas;
    }

    public void setListaCuentas(ArrayList<Cuenta> listaCuentas) {
        this.listaCuentas = listaCuentas;
    }


    @Override
    public String toString() {
        return "Tienda{" +
                "direccion='" + direccion + '\'' +
                ", listaDispositivos=" + listaDispositivos +
                ", listaCuentas=" + listaCuentas +
                '}';
    }
}
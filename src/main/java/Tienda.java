import java.util.ArrayList;
import java.util.Locale;
import java.util.Objects;

public class Tienda {
    private String direccion;
    private ArrayList<Dispositivo> listaDispositivos;
    private ArrayList<Cuenta> listaCuentas;

    public Tienda(String direccion, ArrayList<Dispositivo> listaDispositivos, ArrayList<Cuenta> listaCuentas) {
        this.direccion = direccion;
        this.listaDispositivos = listaDispositivos;
        this.listaCuentas = listaCuentas;
    }


    public void agregarDispositivos (Dispositivo dispositivoNuevo) {
                listaDispositivos.add(dispositivoNuevo);
    }



    public ArrayList<Cuenta> agregarCliente (ArrayList<Cuenta> listaCuentas ,Cliente cliente, String user, String password) {
        Cuenta cuenta = new Cuenta(cliente.getNombre(), user, password);
        for (Cuenta cadaCuenta: listaCuentas) {
            if ((cadaCuenta.getUsuario().toLowerCase(Locale.ROOT).equals(user.toLowerCase(Locale.ROOT)))) {
                listaCuentas.add(cuenta);
            }else {
                System.out.println("ya existe user");
                return null;
            }
        }
        return listaCuentas;
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

    public ArrayList<Dispositivo> getListaDispositivos() {
        return listaDispositivos;
    }

    public void setListaDispositivos(ArrayList<Dispositivo> listaDispositivos) {
        this.listaDispositivos = listaDispositivos;
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
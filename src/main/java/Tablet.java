import java.util.ArrayList;

public class Tablet extends Dispositivo {
    private String resolucionPantalla;
    private ArrayList<Accesorio> listaAccesorios = new ArrayList<Accesorio>();


    public Tablet(String marca, int memoriaAlmacenamiento, int memoriaRAM, String procesador, String modelo, String añoFabircacion, int stock, int precio, String resolucionPantalla, ArrayList<Accesorio> listaAccsesorios) {
        super(marca, memoriaAlmacenamiento, memoriaRAM, procesador, modelo, añoFabircacion, stock, precio);
        this.resolucionPantalla = resolucionPantalla;
        this.listaAccesorios = listaAccsesorios;
    }

    public Tablet(String resolucionPantalla, ArrayList<Accesorio> listaAccesorios) {
        this.resolucionPantalla = resolucionPantalla;
        this.listaAccesorios = listaAccesorios;
    }

    @Override
    public String getTipo () {
        return "Tablet";
    }
}
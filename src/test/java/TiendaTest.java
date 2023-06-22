import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.swing.*;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class TiendaTest {

    @Test
    void agregarCliente() {
        ArrayList<Cuenta> listaCuentas = new ArrayList<>();
        ArrayList <Dispositivo> listaDispositivos = new ArrayList<>();
        Tienda tienda = new Tienda("", listaDispositivos, listaCuentas);
        Cliente cliente = new Cliente("jesus", "a");
        tienda.agregarCliente(listaCuentas,cliente, "asd", "2222");
        assertNotEquals(null, tienda.getListaCuentas());

    }

    @Test
    void agregarDispositivoNotebook () {
        ArrayList<Cuenta> listaCuentas = new ArrayList<>();
        ArrayList <Dispositivo> listaDispositivos = new ArrayList<>();
        Tienda tienda = new Tienda("",listaDispositivos, listaCuentas);
        Dispositivo notebook1 = new Notebook("Lenovo 32",0,0,"","","",0,0,"33x55","isla","35w");
        tienda.agregarDispositivos(notebook1);
        assertNotEquals(null, tienda.getListaDispositivos());
    }

    @Test
    void agregarDispositivoTablet () {
            ArrayList<Cuenta> listaCuentas = new ArrayList<>();
            ArrayList<Dispositivo> listaDispositivos = new ArrayList<>();
            Tienda tienda = new Tienda("", listaDispositivos, listaCuentas);
            Accesorio lapiz = new Accesorio("lapiz");
            ArrayList<Accesorio> listaAccesorios = new ArrayList<>();
            listaAccesorios.add(lapiz);
            Dispositivo tablet = new Tablet("Lenovo 32", 0, 0, "", "", "", 0, 0, "33x55",listaAccesorios);
            tienda.agregarDispositivos(tablet);
            assertNotEquals(null, tienda.getListaDispositivos());
        }
}
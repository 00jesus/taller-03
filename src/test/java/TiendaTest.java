import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class TiendaTest {

    @Test
    void agregarCliente() {
        ArrayList<Cuenta> listaCuentas = new ArrayList<>();
        Tienda tienda = new Tienda(listaCuentas);
        Cliente cliente = new Cliente("jesus", "a");
        tienda.agregarCliente(cliente, "asd", "2222");
        tienda.agregarCliente(cliente, "asd", "5555");
        so

    }
}
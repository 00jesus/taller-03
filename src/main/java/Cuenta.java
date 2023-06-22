public class Cuenta {
    private String nombreCompleto;
    private String usuario;
    private String contraseña;

  //  private Cliente cliente;

    public Cuenta(String nombreCompleto, String usuario, String contraseña) {
        this.nombreCompleto = nombreCompleto;
        this.usuario = usuario;
        this.contraseña = contraseña;
    }


    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
}

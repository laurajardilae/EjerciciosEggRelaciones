package entidad;

public class Cliente {
    private String nombre;
    private String apellido;
    private String documento;
    private String mail;
    private String domicilio;
    private String telefono;

    public Cliente() {
    }

    public Cliente(String nombre, String apellido, String documento, String mail, String domicilio, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.documento = documento;
        this.mail = mail;
        this.domicilio = domicilio;
        this.telefono = telefono;
    }

}

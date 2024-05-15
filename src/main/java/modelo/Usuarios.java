package modelo;

public class Usuarios {
    private String usuario;
    private String contrasena;

    public Usuarios() {
        // Constructor vacío
    }

    public Usuarios(String usuario, String contrasena) {
        this.usuario = usuario;
        this.contrasena = contrasena;
    }

    // Getters y Setters

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    @Override
    public String toString() {
        return "Usuarios{" +
                "usuario=" + usuario +
                ", contrasena='" + contrasena + '\'' +
                '}';
    }
}
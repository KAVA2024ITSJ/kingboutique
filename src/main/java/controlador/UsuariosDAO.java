package controlador;

import ConexionBD.ConexionBD;
import modelo.Usuarios;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class UsuariosDAO implements Runnable{
        private String filtro;

	public void setFiltro(String filtro) {
		this.filtro = filtro;
	}
    public boolean agregarUsuario(Usuarios usuario) {
        boolean resultado = false;

        resultado = ConexionBD.agregarUsuario(usuario);

        return resultado;
    }

    public boolean eliminarUsuario(String usuario) {
        boolean resultado = false;

        String sql = "DELETE FROM Usuarios WHERE Usuario='" + usuario + "'";
        resultado = ConexionBD.eliminar(sql);
        return resultado;
    }

    public boolean actualizarUsuario(Usuarios usuario) {
        boolean resultado = false;
        resultado = ConexionBD.actualizarUsuario(usuario);
        return resultado;
    }

    public ArrayList<Usuarios> buscarUsuario(String filtro) {
        ArrayList<Usuarios> listaUsuarios = new ArrayList<>();
        String sql = "SELECT * FROM Usuarios WHERE Usuario = '" + filtro + "'";

        if (ConexionBD.getConexion() == null) {
            System.out.println("La conexión no está inicializada.");
            return listaUsuarios;
        }

        ResultSet rs = ConexionBD.buscar(sql);

        try {
            if (!rs.next()) {
                return listaUsuarios;
            }

            do {
                String usuario = rs.getString("Usuario");
                String contrasena = rs.getString("Contraseña");

                Usuarios usuario1 = new Usuarios(usuario, contrasena);
                listaUsuarios.add(usuario1);
            } while (rs.next());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return listaUsuarios;
    }

    @Override
    public void run() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
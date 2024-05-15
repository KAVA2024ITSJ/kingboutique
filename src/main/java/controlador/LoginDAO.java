package controlador;
import modelo.Usuarios;
//import Vista.Login;
import ConexionBD.ConexionBD;

import javax.swing.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import com.mycompany.proyecokingboutique.Login;

//DAO - Data Access Object

public class LoginDAO implements Runnable{
	ConexionBD conexion;
	private String filtro;

	public void setFiltro(String filtro) {
		this.filtro = filtro;
	}
	//CONSULTAS
	public ArrayList<Usuarios> buscarUsuario (String filtro){
		ArrayList<Usuarios> listaUsuarios = new ArrayList<>();

		ResultSet rs= ConexionBD.buscar(filtro);

		try {
			if(rs.next()) {
				do {
		listaUsuarios.add(new Usuarios(
                   rs.getString(1),
                rs.getString(2)));
					Login.entrar = true;
				}while(rs.next());
			}else {
				Login.entrar = false;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			Login.entrar = false;
		}

		return listaUsuarios;
	}
	@Override
	public void run() {
		//JOptionPane.showMessageDialog(null,"Buscando Registro!!!!!!!!!");
		buscarUsuario(this.filtro);

	}

}
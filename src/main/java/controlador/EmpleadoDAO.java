package controlador;

import ConexionBD.ConexionBD;
import modelo.Empleados;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.sound.midi.Soundbank;

public class EmpleadoDAO {

    public boolean agregarEmpleado(Empleados empleado) {
        boolean resultado = false;

        resultado = ConexionBD.agregarEmpleado(empleado);

        return resultado;
    }

    public boolean eliminarEmpleado(int idEmpleado) {
        boolean resultado = false;

        String sql = "DELETE FROM Empleados WHERE Id_Empleado='" + idEmpleado + "'";
        resultado = ConexionBD.eliminar(sql);
        return resultado;
    }

    public boolean actualizarEmpleado(Empleados empleado) {
        boolean resultado = false;
        resultado = ConexionBD.actualizarEmpleado(empleado);
        return resultado;
    }

    public ArrayList<Empleados> buscarEmpleado(String filtro) {
        ArrayList<Empleados> listaEmpleados = new ArrayList<>();
        String sql = "SELECT * FROM Empleados WHERE Id_Empleado = '" + filtro + "'";

        if (ConexionBD.getConexion() == null) {
            System.out.println("La conexión no está inicializada.");
            return listaEmpleados;
        }

        ResultSet rs = ConexionBD.buscar(sql);
        
        try {
            if (!rs.next()) {
                return listaEmpleados;
            }

            do {
                int idEmpleado = rs.getInt("Id_Empleado");
                String nombre = rs.getString("Nombre");
                String direccion = rs.getString("Direccion");
                String telefono = rs.getString("Telefono");
                Double salario = rs.getDouble("Salario");
                String ocupacion = rs.getString("Ocupacion");

                Empleados empleado = new Empleados(idEmpleado, nombre, direccion, telefono, salario, ocupacion);
                listaEmpleados.add(empleado);
            } while (rs.next());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return listaEmpleados;
    }
}
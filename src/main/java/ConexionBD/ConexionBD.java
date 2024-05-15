package ConexionBD;

import modelo.Producto;
import modelo.Empleados;
import modelo.Usuarios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConexionBD {
    private static Connection conexion = null;
    private static PreparedStatement pstm;
    private static ResultSet rs;

    private ConexionBD() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String URL = "jdbc:mysql://localhost:3306/kingboutique";
            conexion = DriverManager.getConnection(URL, "root", "KevinDany1");
        } catch (ClassNotFoundException e) {
            System.out.println("Error en el controlador de conexión a MySQL");
        } catch (SQLException e) {
            System.out.println("Error en la ruta de conexión");
        }
    }

    public static Connection getConexion() {
        if (conexion == null) {
            new ConexionBD();
        }
        return conexion;
    }

    static void cerrarConexion() {
        try {
            if (rs != null) {
                rs.close();
            }
            if (pstm != null) {
                pstm.close();
            }
            if (conexion != null) {
                conexion.close();
            }
        } catch (SQLException e) {
            System.out.println("Error al cerrar la conexión");
            e.printStackTrace();
        }
    }

    public static boolean agregarProducto(Producto producto) {
        try {
            Connection conexion = getConexion();

            pstm = conexion.prepareStatement("INSERT INTO productos (Id_Productos, Nombre, Codigo, Precio, Descripcion, Cantidad, Estado) VALUES (?, ?, ?, ?, ?, ?, ?)");
            pstm.setInt(1, producto.getIdProducto());
            pstm.setString(2, producto.getNombre());
            pstm.setInt(3, producto.getCodigo());
            pstm.setDouble(4, producto.getPrecio());
            pstm.setString(5, producto.getDescripcion());
            pstm.setInt(6, producto.getCantidad());
            pstm.setString(7, producto.getEstado());

            pstm.execute();

            return true;
        } catch (SQLException e) {
            System.out.println("Error en instrucción DML");
            e.printStackTrace();
        }
        return false;
    }

    public static boolean eliminar(String instruccion) {
        try {
            String consulta = instruccion;
            pstm = conexion.prepareStatement(consulta);
            pstm.executeUpdate(consulta);
            return true;
        } catch (Exception ex) {
            System.out.println("ERROR");
        }
        return false;
    }

    public static boolean actualizarProducto(Producto producto) {
        try {
            Connection conexion = getConexion();
            pstm = conexion.prepareStatement("UPDATE productos SET Nombre=?, Codigo=?, Precio=?, Descripcion=?, Cantidad=?, Estado=? WHERE Id_Productos=?");
            pstm.setString(1, producto.getNombre());
            pstm.setInt(2, producto.getCodigo());
            pstm.setDouble(3, producto.getPrecio());
            pstm.setString(4, producto.getDescripcion());
            pstm.setInt(5, producto.getCantidad());
            pstm.setString(6, producto.getEstado());
            pstm.setInt(7, producto.getIdProducto());

            pstm.executeUpdate();

            return true;

        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
        return false;
    }

    public static ResultSet buscar(String consulta) {
        try {
            Connection conexion = getConexion();
            if (conexion != null) {
                PreparedStatement pstm = conexion.prepareStatement(consulta);
                return pstm.executeQuery();
            } else {
                System.out.println("Error: No se pudo obtener la conexión a la base de datos.");
            }
        } catch (SQLException e) {
            System.out.println("Error en instrucción SQL");
            e.printStackTrace();
        }
        return null;
    }

    public static boolean agregarEmpleado(Empleados empleado) {
        try {
            Connection conexion = getConexion();

            pstm = conexion.prepareStatement("INSERT INTO Empleados (Id_Empleado, Nombre, Direccion, Telefono, Salario, Ocupacion) VALUES (?, ?, ?, ?, ?, ?)");
            pstm.setInt(1, empleado.getIdEmpleado());
            pstm.setString(2, empleado.getNombre());
            pstm.setString(3, empleado.getDirecccion());
            pstm.setString(4, empleado.getTelefono());
            pstm.setDouble(5, empleado.getSalario());
            pstm.setString(6, empleado.getOcupacion());

            pstm.execute();

            return true;
        } catch (SQLException e) {
            System.out.println("Error en instrucción DML 1");
            e.printStackTrace();
        }
        return false;
    }

    public static boolean actualizarEmpleado(Empleados empleado) {
        try {
            Connection conexion = getConexion();
            pstm = conexion.prepareStatement("UPDATE Empleados SET Nombre=?, Direccion=?, Telefono=?, Salario=?, Ocupacion=? WHERE Id_Empleado=?");
            pstm.setString(1, empleado.getNombre());
            pstm.setString(2, empleado.getDirecccion());
            pstm.setString(3, empleado.getTelefono());
            pstm.setDouble(4, empleado.getSalario());
            pstm.setString(5, empleado.getOcupacion());
            pstm.setInt(6, empleado.getIdEmpleado());

            pstm.executeUpdate();

            return true;

        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
        return false;
    }
    
    public static boolean agregarUsuario(Usuarios usuario) {
        try {
            Connection conexion = getConexion();

            pstm = conexion.prepareStatement("INSERT INTO Usuarios (Usuario, contraseña) VALUES (?, ?)");
            pstm.setString(1, usuario.getUsuario());
            pstm.setString(2, usuario.getContrasena());

            pstm.execute();

            return true;
        } catch (SQLException e) {
            System.out.println("Error en instrucción DML");
            e.printStackTrace();
        }
        return false;
    }

    public static boolean actualizarUsuario(Usuarios usuario) {
        try {
            Connection conexion = getConexion();
            pstm = conexion.prepareStatement("UPDATE Usuarios SET Contraseña=? WHERE Usuario=?");
            pstm.setString(1, usuario.getUsuario());
            pstm.setString(2, usuario.getContrasena());

            pstm.executeUpdate();

            return true;

        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
        return false;
    }
    
    
    
    public static void main(String[] args) {
        new ConexionBD();
    }
}
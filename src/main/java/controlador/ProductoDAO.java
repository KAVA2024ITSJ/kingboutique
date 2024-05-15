package controlador;

import ConexionBD.ConexionBD;
import modelo.Producto;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ProductoDAO {

    public boolean agregarProducto(Producto producto) {
        boolean resultado = false;

        resultado = ConexionBD.agregarProducto(producto);

        return resultado;
    }

    public boolean eliminarProducto(int idProducto) {
        boolean resultado = false;

        String sql = "DELETE FROM productos WHERE Id_Productos='" + idProducto + "'";
        resultado = ConexionBD.eliminar(sql);
        return resultado;
    }

    public boolean actualizarProducto(Producto producto) {
        boolean resultado = false;
        resultado = ConexionBD.actualizarProducto(producto);
        return resultado;
    }

    public ArrayList<Producto> buscarProductos(String filtro) {
        ArrayList<Producto> listaProductos = new ArrayList<>();
        String sql = "SELECT * FROM productos WHERE Nombre LIKE '%" + filtro + "%'";

        if (ConexionBD.getConexion() == null) {
            System.out.println("La conexión no está inicializada.");
            return listaProductos;
        }

        ResultSet rs = ConexionBD.buscar(sql);

        try {
            if (!rs.next()) {
                return listaProductos;
            }

            do {
                int idProducto = rs.getInt("Id_Productos");
                String nombre = rs.getString("Nombre");
                int codigo = rs.getInt("Codigo");
                double precio = rs.getDouble("Precio");
                String descripcion = rs.getString("Descripcion");
                int cantidad = rs.getInt("Cantidad");
                String estado = rs.getString("Estado");

                Producto producto = new Producto(idProducto, nombre, codigo, precio, descripcion, cantidad, estado);
                listaProductos.add(producto);
            } while (rs.next());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return listaProductos;
    }
}
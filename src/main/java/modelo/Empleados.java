package modelo;

public class Empleados {
    private int idEmpleado;
    private String nombre;
    private String direcccion;
    private String telefono;
    private double salario;
    private String ocupacion;

    public Empleados() {
        // Constructor vacío
    }

    public Empleados(int idEmpleado, String nombre, String direcccion, String telefono, double salario, String ocupacion) {
        this.idEmpleado = idEmpleado;
        this.nombre = nombre;
        this.direcccion = direcccion;
        this.telefono = telefono;
        this.salario = salario;
        this.ocupacion = ocupacion;
    }

    // Getters y Setters

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDirecccion() {
        return direcccion;
    }

    public void setDirecccion(String direcccion) {
        this.direcccion = direcccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    @Override
    public String toString() {
        return "Empleados{" +
               "idEmpleado=" + idEmpleado + 
                ", nombre=" + nombre +  
                ", direcccion=" + direcccion + 
                ", telefono=" + telefono + 
                ", salario=" + salario + 
                ", ocupacion=" + ocupacion + '}';
    }    
}
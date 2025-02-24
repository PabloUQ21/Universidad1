import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String nombre, NIT;
    private List<Empleado> empleados;

    public Empresa(String nombre, String NIT) {
        this.nombre = nombre;
        this.NIT = NIT;
        this.empleados = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNIT() {
        return NIT;
    }

    public void setNIT(String NIT) {
        this.NIT = NIT;
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(List<Empleado> empleados) {
        this.empleados = empleados;
    }

    public void aniadirEmpleado(Empleado empleado) { empleados.add(empleado); }

    public void eliminarEmpleado(Empleado empleado) { empleados.remove(empleado); }

    public void mostrarInformacion() {
        System.out.println("Empresa: " + nombre);
        System.out.println("NIT: " + NIT);
        System.out.println("Lista de Empleados:");
        for (Empleado empleado : empleados) {
            System.out.println(empleado);
        }
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "nombre='" + nombre + '\'' +
                ", NIT='" + NIT + '\'' +
                ", empleados=" + empleados +
                '}';
    }
}


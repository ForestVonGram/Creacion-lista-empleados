import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private List<Empleado> empleados;

    public Empresa() {
        this.empleados = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    public void imprimirEmpleados() {
        for (Empleado empleado : empleados) {
            System.out.println(empleado.getNombre() + ", " +
                    empleado.getIdentificacion() + ", " +
                    empleado.getSalario() + ", " +
                    empleado.getTelefono() + ", " +
                    empleado.getCorreo());
        }
    }

    public static void main(String[] args) {
        Empresa empresa = new Empresa();

        Empleado empleado1 = new Empleado("Juan Perez", "12345", 2500.0, "555-1234", "juan.perez@correo.com");
        Empleado empleado2 = new Empleado("Maria Gomez", "67890", 3000.0, "555-5678", "maria.gomez@correo.com");

        empresa.agregarEmpleado(empleado1);
        empresa.agregarEmpleado(empleado2);

        empresa.imprimirEmpleados();
    }
}

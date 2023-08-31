import java.util.ArrayList;
import java.util.List;

abstract class Empleado {
    protected String nombre;

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    public abstract double calcularSalario();
}

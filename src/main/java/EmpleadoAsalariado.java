import java.util.ArrayList;
import java.util.List;

class EmpleadoAsalariado extends Empleado {
    private double salarioBase;

    public EmpleadoAsalariado(String nombre, double salarioBase) {
        super(nombre);
        this.salarioBase = salarioBase;
    }

    @Override
    public double calcularSalario() {
        return salarioBase;
    }
}
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Empleado> listaEmpleados = new ArrayList<>();

        System.out.print("Ingrese el número de empleados: ");
        int numEmpleados = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numEmpleados; i++) {
            System.out.print("Ingrese el nombre del empleado " + (i + 1) + ": ");
            String nombre = scanner.nextLine();

            System.out.print("¿Es asalariado o trabaja por horas? (asalariado/horas): ");
            String tipoEmpleado = scanner.nextLine();

            if (tipoEmpleado.equalsIgnoreCase("asalariado")) {
                System.out.print("Ingrese el salario base: ");
                double salarioBase = scanner.nextDouble();
                scanner.nextLine();

                EmpleadoAsalariado empleado = new EmpleadoAsalariado(nombre, salarioBase);
                listaEmpleados.add(empleado);
            } else if (tipoEmpleado.equalsIgnoreCase("horas")) {
                System.out.print("Ingrese el salario por hora: "); //pongale que trabaje 80 horas a la semana y 1000 la hora de paga
                double salarioPorHora = scanner.nextDouble();
                System.out.print("Ingrese las horas trabajadas: ");
                int horasTrabajadas = scanner.nextInt();
                scanner.nextLine();

                EmpleadoPorHoras empleado = new EmpleadoPorHoras(nombre, salarioPorHora, horasTrabajadas);
                listaEmpleados.add(empleado);
            }
        }

        System.out.println("Lista de empleados y salarios:");
        for (Empleado empleado : listaEmpleados) {
            System.out.println("Nombre: " + empleado.nombre);
            System.out.println("Salario: " + empleado.calcularSalario());
            System.out.println("-----------------------------");
        }
    }
}
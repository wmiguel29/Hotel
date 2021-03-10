public class Botones extends Empleado{
    public Botones(String horario, double salario, int diasTrabajados) {
        super(horario, salario, diasTrabajados);
    }

    @Override
    public double calcularSalario() {
        return salario *(1.10);
    }
}

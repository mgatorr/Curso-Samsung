package expertos;

public class Nomina {

	public Nomina() {
	}

	public double totalNominas(Empleado[] empleados) {
		double nominas = 0;
		for (Empleado emp : empleados) {
			nominas = emp.salario() + nominas;
		}
		return nominas;

	}
}

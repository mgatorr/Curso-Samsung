package expertos;

public abstract class Empleado {
	private String dni;
	private int horas;

	public Empleado(String dni) {
		this.dni = dni;
		this.setHoras(0);

	}

	public Empleado(String dni, int horas) {
		this(dni);
		this.setHoras(horas);
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	public String getDni() {
		return dni;
	}

	public abstract double salario();

}

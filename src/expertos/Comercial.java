package expertos;

public class Comercial extends Empleado {
	private double comision;

	public Comercial(String dni) {
		super(dni);
	}

	public Comercial(String dni, int horas, double comision) {
		super(dni, horas);
		this.setComision(comision);
	}

	public double getComision() {
		return this.comision;
	}

	public void setComision(double comision) {
		if (comision < 0) {
			this.comision = 0;
		} else {
			this.comision = comision;
		}
	}

	@Override
	public double salario() {

		return this.getComision() + this.getHoras() * 8;
	}

}

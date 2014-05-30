package pruebasIniciales;

public class Angulo {
	private double grados;

	public Angulo(double angulo) {
		this.setGrados(angulo);
	}

	public Angulo() {
		this.setGrados(0);
	}

	public double getGrados() {
		return grados;
	}

	public void setGrados(double grados) {
		this.grados = grados;
	}

	public double conversorRadGrad() {

		return ((this.grados * 180) / 3.14);
	}

	public double conversorGrandRad() {

		return ((this.grados * 3.14) / 180);
	}
}

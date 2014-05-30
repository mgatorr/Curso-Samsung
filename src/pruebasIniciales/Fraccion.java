package pruebasIniciales;

public class Fraccion {
	private double dividendo, divisor, cociente, resto;

	public Fraccion(double dividendo, double divisor) {
		super();
		this.dividendo = dividendo;
		this.divisor = divisor;
	}

	public double getDividendo() {
		return dividendo;
	}

	public double getDivisor() {
		return divisor;
	}

	public void setCociente(double cociente) {
		this.cociente = cociente;
	}

	public void setResto(double resto) {
		this.resto = resto;
	}

	public void setDividendo(double dividendo) {
		this.dividendo = dividendo;
	}

	public void setDivisor(double divisor) {
		this.divisor = divisor;
	}

	public double division(double dividendo, double divisor) {
		return 0;
	}
	
	public Fraccion division(Fraccion fraccionDividir){
		return null;
	}

	public double getCociente() {
		return cociente;
	}

	public double getResto() {
		return resto;
	}

}

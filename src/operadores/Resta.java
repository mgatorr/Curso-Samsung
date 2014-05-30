package operadores;

public class Resta extends Calculadora {

	public Resta(String ope) {
		super(ope);
	}

	public Resta(double value1, double value2, String ope) {
		super(value1, value2, ope);
	}

	@Override
	public double operacion() {

		return this.getValue1() - this.getValue2();
	}

}

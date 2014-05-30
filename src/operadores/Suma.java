package operadores;

public class Suma extends Calculadora {

	public Suma(String ope) {
		super(ope);
	}

	public Suma(double value1, double value2, String ope) {
		super(value1, value2, ope);
	}

	@Override
	public double operacion() {

		return this.getValue1() + this.getValue2();
	}

}

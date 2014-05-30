package operadores;

public abstract class Calculadora {
	private double value1;
	private double value2;
	private String operaciones;

	public Calculadora(String ope) {
		this.operaciones = ope;
	}

	public Calculadora(double value1, double value2, String ope) {
		this(ope);
		this.setValue1(value1);
		this.setValue2(value2);

	}

	public double getValue1() {
		return value1;
	}

	public void setValue1(double value1) {
		this.value1 = value1;
	}

	public double getValue2() {
		return value2;
	}

	public void setValue2(double value2) {
		this.value2 = value2;
	}

	public String getOperaciones() {
		return operaciones;
	}
	
	abstract public double operacion();

}

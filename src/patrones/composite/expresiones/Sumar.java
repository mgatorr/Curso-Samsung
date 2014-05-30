package patrones.composite.expresiones;

public class Sumar extends Operacion {

	public Sumar(Expresion op1, Expresion op2) {
		super(op1, op2);
	}

	@Override
	public int operar() {

		return this.getOp1().operar() + this.getOp2().operar();
	}

	@Override
	public String ver() {

		return "(" + this.getOp1().ver() + "+" + this.getOp2().ver() + ")";
	}

}

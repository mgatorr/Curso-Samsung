package patrones.composite.expresiones;

public abstract class Operacion extends Expresion {
	private Expresion op1;
	private Expresion op2;

	public Operacion(Expresion op1, Expresion op2) {
		this.op1 = op1;
		this.op2 = op2;
	}

	@Override
	public abstract int operar();

	public Expresion getOp1() {
		return this.op1;
	}

	public Expresion getOp2() {
		return this.op2;
	}

	@Override
	public abstract String ver();
}

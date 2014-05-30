package patrones.composite.expresiones;

public class Numero extends Expresion {
	private int op;

	public Numero(int op) {
		this.op = op;
	}

	@Override
	public int operar() {
		return this.op;
	}

	@Override
	public String ver() {

		return "" + this.op;
	}

}

package patrones.visitor.visitante2;

public class Visitador2 extends Visitador {
	private int as, bs;

	public Visitador2() {
		super();
		this.as = 0;
		this.bs = 0;
	}

	@Override
	public void visitarElementoA(ElementoA elemento) {

		this.as++;

	}

	@Override
	public void visitarElementoB(ElementoB elemento) {

		this.bs++;
	}

	public int getAs() {

		return as;
	}

	public int getBs() {

		return bs;
	}

}

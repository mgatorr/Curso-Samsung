package patrones.visitor.visitador3;

public class Visitador3 extends Visitador {
	private int as, bs, maxAS, maxBS;

	public Visitador3() {
		super();
		this.as = 0;
		this.bs = 0;
		this.maxAS = 0;
		this.maxBS = 0;

	}

	@Override
	public void visitarElementoA(ElementoA elemento) {
		as++;
		if (bs > maxBS) {
			this.maxBS = this.bs;
			this.bs = 0;
		}

	}

	@Override
	public void visitarElementoB(ElementoB elemento) {
		bs++;
		if (as > maxAS) {
			this.maxAS = this.as;
			this.as = 0;
		}
	}

	public int getAs() {

		return maxAS;
	}

	public int getBs() {

		return maxBS;
	}

}

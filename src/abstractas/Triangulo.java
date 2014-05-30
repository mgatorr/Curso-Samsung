package abstractas;

public class Triangulo extends Figura {
	private double base;
	private double altura;
	final private int LADOS_TRIANGULO = 3;

	public Triangulo() {
		super("triangulo");
		this.setAltura(0);
		this.setBase(0);

	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = this.positivo(base);
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.base = this.positivo(altura);
	}

	@Override
	public double area() {

		return this.getBase() * this.getAltura();
	}

	@Override
	public int numLados() {

		return LADOS_TRIANGULO;
	}

}

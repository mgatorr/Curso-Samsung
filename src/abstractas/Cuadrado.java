package abstractas;

public class Cuadrado extends Figura {
	private double lado;
	final private int LADO_CUADRADO = 4;

	public Cuadrado(String tipo, double lado) {
		super(tipo);
		this.setLado(lado);
	}

	public double getLado() {
		return lado;
	}



	@Override
	public double area() {

		return this.getLado() * this.getLado();
	}

	@Override
	public int numLados() {

		return LADO_CUADRADO;
	}

}

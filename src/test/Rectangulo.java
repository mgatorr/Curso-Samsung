package test;

public class Rectangulo {
	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	private int base, altura;

	public Rectangulo() {
		this.base = 0;
		this.altura = 0;

	}

	public Rectangulo(int base, int altura) {
		if (base <= 0) {
			this.base = 0;
		} else {
			this.base = base;
		}
		if (altura <= 0) {
			this.altura = 0;
		} else {
			this.altura = altura;
		}

	}

	public double area() {
		return this.base * this.altura;

	}

	public double perimetro() {
		return (this.base * 2) + (this.altura * 2);

	}

}

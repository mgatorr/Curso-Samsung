package test;

public class Intervalo {
	private int maximo;
	private int minimo;

	public Intervalo(int min, int max) {
		this.minimo = min;
		this.setMaximo(max);
	}

	public Intervalo() {
		this(0, 0);
	}

	public int getMaximo() {
		return this.maximo;
	}

	public void setMaximo(int max) {
		if (max < this.getMinimo()) {
			this.maximo = this.getMinimo();
		} else {
			this.maximo = max;
		}
	}

	public int getMinimo() {
		return this.minimo;
	}

	public boolean solapado(Intervalo inter) {
		boolean resultado = false;
		if (this.maximo >= inter.getMinimo()) {
			resultado = true;
		}
		return resultado;

	}

	public boolean incluido(Intervalo inter) {
		boolean resultado = false;
		if (this.solapado(inter) && this.maximo >= inter.getMaximo()) {
			resultado = true;
		}
		return resultado;

	}
}

package pruebasIniciales;

public class ColeccionDecimales {
	public static final int MAX_DECIMALES = 20;
	private double[] decimales;

	public ColeccionDecimales(double[] decimales) {

		this.setDecimales(decimales);
	}
	
	public ColeccionDecimales (){
		this(0.0);	
	}

	public ColeccionDecimales(double decimal) {
		decimales = new double[20];
		for (int cont = 0; cont < MAX_DECIMALES; cont++) {
			this.decimales[cont] = 0.0;
		}
		this.introducirDecimales(decimal);
	}

	public void setDecimales(double[] decimales) {

		this.decimales = new double[MAX_DECIMALES];
		this.decimales = decimales;
	}

	public double[] introducirDecimales(double decimal) {
		for (int indice = 0; indice < MAX_DECIMALES; indice++) {
			if (this.decimales[indice] == 0.0) {
				this.decimales[indice] = decimal;
			} 
		}

		return decimales;
	}

	public double mayor() {
		double mayor = 0;
		int cont = 1;
		int indice = 0;

		while (cont < MAX_DECIMALES) {
			if (this.decimales[indice] > this.decimales[cont]) {
				mayor = this.decimales[indice];
			} else {
				mayor = this.decimales[cont];
			}
			cont++;
			indice++;
		}
		return mayor;
	}

	public double menor() {
		int cont = 1;
		double menor = 0;
		for (int indice = 0; cont < MAX_DECIMALES; indice++) {
			if (this.decimales[indice] < this.decimales[cont]) {
				menor = this.decimales[indice];
			} else {
				menor = this.decimales[cont];
			}
			cont++;
		}

		return menor;
	}

	public double media() {
		double total = 0;
		for (double elem : this.decimales) {
			 total = elem + total;
		}
		return (total/MAX_DECIMALES);
	}

}

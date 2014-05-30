package abstractas;

public class ManejadorFiguras {

	public Figura mayor(Figura[] figuras) {
		Figura figuraFinal = null;
		for (int cont = 1; cont < figuras.length; cont++) {
			int cont2 = 0;
			if (figuras[cont].area() >= figuras[cont2].area()) {
				figuraFinal = figuras[cont];
			} else {
				figuraFinal = figuras[cont2];
			}
			cont2++;
		}
		return figuraFinal;
	}

	public double areaTotal(Figura[] figuras) {
		double area = 0;
		for (Figura fig : figuras) {
			area = fig.area() + area;
		}
		return area;
	}

	public double ladosTotal(Figura[] figuras) {
		double lado = 0;
		for (Figura fig : figuras) {
			lado = fig.numLados() + lado;
		}
		return lado;
	}

}

package operadores;

public class Operando {

	public Operando() {
	}

	public double total(Calculadora[] cal) {
		double total = 0;
		for (Calculadora calculo : cal) {
			total = calculo.operacion() + total;
		}
		return total;

	}

}

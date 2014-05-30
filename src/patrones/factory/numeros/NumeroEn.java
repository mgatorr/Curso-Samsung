package patrones.factory.numeros;

public class NumeroEn extends Numero {
	private String[] texto = {"zero","one","two","three","four","five"};

	@Override
	public String convertir(int numero) {
		if (0 <= numero && numero <= 5) {
			return texto[numero];
		} else {
			return "???";
		}
	}

}

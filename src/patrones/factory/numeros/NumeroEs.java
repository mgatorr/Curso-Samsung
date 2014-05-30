package patrones.factory.numeros;

public class NumeroEs extends Numero {
	private String[] texto = {"cero","uno","dos","tres","cuatro","cinco"};

	@Override
	public String convertir(int numero) {
		if (0 <= numero && numero <= 5) {
			return texto[numero];
		} else {
			return "???";
		}
	}

}

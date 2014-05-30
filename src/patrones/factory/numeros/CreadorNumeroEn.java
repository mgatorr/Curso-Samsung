package patrones.factory.numeros;

public class CreadorNumeroEn extends CreadorNumero {

	@Override
	public Numero createNumero() {
	
		return new NumeroEn();
	}

}

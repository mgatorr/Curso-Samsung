package patrones.factory.numeros;

public class CreadorNumeroEs extends CreadorNumero {

	@Override
	public Numero createNumero() {
		
		return new NumeroEs();
	}

}

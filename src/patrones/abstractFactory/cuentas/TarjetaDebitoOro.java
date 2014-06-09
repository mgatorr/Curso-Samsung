package patrones.abstractFactory.cuentas;

public class TarjetaDebitoOro extends TarjetaDebito {
	private final double COSTE = 5;
	
	public TarjetaDebitoOro(){
		
	}
	
	public double getCoste(){
		return this.COSTE;
	}
}

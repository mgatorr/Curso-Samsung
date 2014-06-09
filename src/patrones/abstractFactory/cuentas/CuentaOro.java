package patrones.abstractFactory.cuentas;

public class CuentaOro extends TarjetaDebito {
	private final double INTERES = 2.5;
	
	public CuentaOro(){
		
	}
	
	public double getInteres(){
		return this.INTERES;
	}
}

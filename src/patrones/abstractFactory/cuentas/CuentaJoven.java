package patrones.abstractFactory.cuentas;

public class CuentaJoven extends TarjetaCredito {
	private final double INTERES = 1;
	
	public CuentaJoven(){
		
	}
	
	public double getInteres(){
		return this.INTERES;
	}
}

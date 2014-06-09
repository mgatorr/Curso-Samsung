package patrones.abstractFactory.cuentas;

public class TarjetaCredito10 extends Cuenta {

	private final double COSTE = 10;
	private final double MAX_MENSUAL = 2000;

	public TarjetaCredito10() {
	}

	public double getCOSTE() {
		return COSTE;
	}

	public double getMAX_MENSUAL() {
		return MAX_MENSUAL;
	}

}

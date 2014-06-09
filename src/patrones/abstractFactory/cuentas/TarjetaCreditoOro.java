package patrones.abstractFactory.cuentas;

public class TarjetaCreditoOro extends TarjetaDebito {
	private final double COSTE = 20;
	private final double MAX_MENSUAL = 4000;

	public TarjetaCreditoOro() {

	}

	public double getCOSTE() {
		return COSTE;
	}

	public double getMAX_MENSUAL() {
		return MAX_MENSUAL;
	}

}

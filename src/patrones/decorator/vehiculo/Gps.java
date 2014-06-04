package patrones.decorator.vehiculo;

public class Gps extends Extras {
	private final static int PRECIO_GPS = 500;
	private final static String DESCRIPCION = "Gps";

	public Gps(Vehiculo vehiculo) {
		super(vehiculo, PRECIO_GPS, DESCRIPCION);
	}

}

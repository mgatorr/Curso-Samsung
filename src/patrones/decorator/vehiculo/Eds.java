package patrones.decorator.vehiculo;

public class Eds extends Extras {
	private final static int PRECIO_EDS = 1000;
	private final static String DESCRIPCION = "Eds";

	public Eds(Vehiculo vehiculo) {
		super(vehiculo, PRECIO_EDS, DESCRIPCION);
	}

}

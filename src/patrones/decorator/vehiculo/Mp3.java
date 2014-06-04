package patrones.decorator.vehiculo;

public class Mp3 extends Extras {
	private final static int PRECIO_MP3 = 150;
	private final static String DESCRIPCION = "MP3";

	public Mp3(Vehiculo vehiculo) {
		super(vehiculo, PRECIO_MP3, DESCRIPCION);
	}

}

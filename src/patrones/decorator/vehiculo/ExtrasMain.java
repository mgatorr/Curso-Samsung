package patrones.decorator.vehiculo;

public class ExtrasMain {

	public static void main(String[] args) {
		Vehiculo coche1 = new VehiculoA(15000,"Seat leon");
		Vehiculo extra = new Gps(coche1);
		Vehiculo extra2 = new Eds(extra);
		Vehiculo extra3 = new Mp3(extra2);
		
		System.out.println(""+extra3.descripcion()+"\nPrecio: "+extra3.precio()+"€");

	}

}

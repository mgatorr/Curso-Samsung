package patrones.decorator.vehiculo;

public abstract class Extras extends Vehiculo {
	private Vehiculo vehiculo;

	public Extras (Vehiculo vehiculo,int precio,String descripcion){
		super(precio,descripcion);
		this.vehiculo = vehiculo;
	}

	public Vehiculo getVehiculo() {
		return vehiculo;
	}
	@Override
	public String descripcion() {

		return this.getVehiculo().descripcion()+this.getDescripcion()+" ";
	}

	@Override
	public int precio() {

		return this.getVehiculo().precio()+this.getPrecio();
	}
	

}

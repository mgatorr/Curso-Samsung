package patrones.decorator.vehiculo;

public class VehiculoA extends Vehiculo {
	
	public VehiculoA(int precio,String descripcion){
		super(precio,descripcion);
	}

	@Override
	public String descripcion() {
		
		return "Modelo: "+this.getDescripcion()+"\nExtras: ";
	}

	@Override
	public int precio() {
		
		return this.getPrecio();
	}

}

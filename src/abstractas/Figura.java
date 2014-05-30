package abstractas;

public abstract class Figura {
	private String descripcion;

	public Figura(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getDescripcion() {
		return descripcion;
	}

	abstract public double area();

	abstract public int numLados();
	
	protected double positivo(double num){
		if (num<0){
			num = num*(-1);
		}else if(num == 0){
			num = 1;
		}
		return num;
	}

}

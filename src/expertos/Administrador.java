package expertos;

public class Administrador extends Empleado {
	
	public Administrador(String dni){
		super(dni);
	}
	public Administrador(String dni,int horas){
		super(dni,horas);
	}

	@Override
	public double salario() {
		
		return this.getHoras()*10;
	}

}

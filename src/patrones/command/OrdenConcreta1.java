package patrones.command;

public class OrdenConcreta1 implements Orden {
	private Receptor receptor;

	public OrdenConcreta1(Receptor receptor) {
		this.receptor = receptor;
	}

	@Override
	public void ejecutar() {
		this.receptor.accion1();
	}
}
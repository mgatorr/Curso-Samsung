package patrones.command;

import upm.jbb.IO;

public final class MainCommand {
	private Orden orden1, orden2;

	public MainCommand() {
		Receptor receptor = new Receptor();
		this.orden1 = new OrdenConcreta1(receptor);
		this.orden2 = new OrdenConcreta2(receptor);
	}

	public void invocador() {
		Orden[] ordenes = new Orden[2];
		ordenes[0] = this.orden1;
		ordenes[1] = this.orden2;
		Orden orden = (Orden) IO.in.select(ordenes);
		orden.ejecutar();
	}

	public void invocador1() {
		this.orden1.ejecutar();
	}

	public void invocador2() {
		this.orden2.ejecutar();
	}

	public static void main(String[] args) {
		IO.in.addController(new MainCommand());
	}
}
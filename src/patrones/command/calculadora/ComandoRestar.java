package patrones.command.calculadora;

import upm.jbb.IO;

public class ComandoRestar implements Comando {
	private Calculadora calculadora;

	public ComandoRestar(Calculadora calculadora) {
		this.calculadora = calculadora;
	}

	@Override
	public void execute() {
		this.calculadora.restar(IO.in.readInt());

	}

}

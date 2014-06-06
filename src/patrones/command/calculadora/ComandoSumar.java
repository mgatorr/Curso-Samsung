package patrones.command.calculadora;

import upm.jbb.IO;

public class ComandoSumar implements Comando {
	private Calculadora calculadora;

	public ComandoSumar(Calculadora calculadora) {
		this.calculadora = calculadora;

	}

	@Override
	public void execute() {
		this.calculadora.sumar(IO.in.readInt());
		
	}

}

package patrones.command.calculadora;

import upm.jbb.IO;

public class ComandoImprimir implements Comando {
	private Calculadora calculadora;

	public ComandoImprimir (Calculadora calculadora){
		this.calculadora = calculadora;
	}
	@Override
	public void execute() {
		IO.out.print(this.calculadora.toString());
		
	}

}

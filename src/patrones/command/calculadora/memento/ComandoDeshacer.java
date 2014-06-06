package patrones.command.calculadora.memento;

import patrones.command.calculadora.Comando;
import upm.jbb.IO;

public class ComandoDeshacer implements Comando {
	private CalculadoraMementable calculadora;
	private GestorMementos<MementoCalculadora> gestor;

	public ComandoDeshacer(CalculadoraMementable calc,
			GestorMementos<MementoCalculadora> gestor) {
		this.calculadora = calc;
		this.gestor = gestor;
	}

	@Override
	public void execute() {
		this.calculadora.restoreMemento(this.gestor.getMemento((String) IO.in.select(gestor.keys())));

	}

}

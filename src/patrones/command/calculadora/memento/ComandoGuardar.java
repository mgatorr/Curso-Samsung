package patrones.command.calculadora.memento;

import patrones.command.calculadora.Comando;
import upm.jbb.IO;

public class ComandoGuardar implements Comando {
	private CalculadoraMementable calculadora;
	private GestorMementos<MementoCalculadora> gestor;

	public ComandoGuardar(CalculadoraMementable calc,
			 GestorMementos<MementoCalculadora> gestor) {
	this.calculadora = calc;
	this.gestor = gestor;
	}
	@Override
	public void execute() {
		this.gestor.addMemento(IO.in.readString("Escribir nombre del backup"), this.calculadora.createMemento());
		
	}



}

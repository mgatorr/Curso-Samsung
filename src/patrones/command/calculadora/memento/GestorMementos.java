package patrones.command.calculadora.memento;

import java.util.HashMap;
import java.util.Map;

public class GestorMementos<T> {
	private Map<String, T> gestor = new HashMap<String, T>();

	public void addMemento(String key, T memento) {
		this.gestor.put(key, memento);
	}

	public T getMemento(String key) {
		return this.gestor.get(key);

	}
	public String[] keys() {
		return this.gestor.keySet().toArray(new String[0]);
		}

}

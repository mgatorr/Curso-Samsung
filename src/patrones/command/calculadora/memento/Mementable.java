package patrones.command.calculadora.memento;

public interface Mementable<T> {
	T createMemento();
	void restoreMemento(T memento);
}

package patrones.decorator;

import upm.jbb.IO;

public class DecoradorA extends Decorador {
	public DecoradorA(Componente c) {
		super(c);
	}

	@Override
	public void view() {
		IO.out.print(">>> ");
		this.getC().view();
	}
}
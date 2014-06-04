package patrones.decorator;

import upm.jbb.IO;

public class DecoradorB extends Decorador {
	public DecoradorB(Componente c) {
		super(c);
	}

	@Override
	public void view() {
		IO.out.println();
		IO.out.println("***************");
		this.getC().view();
		IO.out.println();
		IO.out.println("***************");
	}
}
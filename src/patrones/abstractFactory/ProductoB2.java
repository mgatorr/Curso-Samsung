package patrones.abstractFactory;

import upm.jbb.IO;

public class ProductoB2 extends ProductoAbstractoB {
	@Override
	public void view() {
		IO.out.println("ProductoB2");
	}
}
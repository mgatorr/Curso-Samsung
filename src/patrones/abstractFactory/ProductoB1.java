package patrones.abstractFactory;

import upm.jbb.IO;

public class ProductoB1 extends ProductoAbstractoB {
	@Override
	public void view() {
		IO.out.println("ProductoB1");
	}
}
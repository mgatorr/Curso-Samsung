package patrones.abstractFactory;

import upm.jbb.IO;

public class ProductoA1 extends ProductoAbstractoA {
	@Override
	public void view() {
		IO.out.println("ProductoA1");
	}
}
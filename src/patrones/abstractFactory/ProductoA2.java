package patrones.abstractFactory;

import upm.jbb.IO;

public class ProductoA2 extends ProductoAbstractoA {
	@Override
	public void view() {
		IO.out.println("ProductoA2");
	}
}
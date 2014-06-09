package patrones.abstractFactory;

public class FabricaConcreta2 extends FabricaAbstracta {
	@Override
	public ProductoAbstractoA crearProductoA() {
		return new ProductoA2();
	}

	@Override
	public ProductoAbstractoB crearProductoB() {
		return new ProductoB2();
	}

	@Override
	public String toString() {
		return "FabricaConcreta2";
	}
}
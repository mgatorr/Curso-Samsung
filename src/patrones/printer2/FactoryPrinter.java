package patrones.printer2;

import java.util.HashMap;
import java.util.Map;

public class FactoryPrinter {
	private Map<String, Printer> impresoras = new HashMap<String, Printer>();

	public FactoryPrinter() {
		impresoras.put("A", new PrinterA());
		impresoras.put("B", new PrinterB());
		impresoras.put("C", new PrinterC());
	}
	
	public Printer getImpresora(String key){
		return impresoras.get(key);
	}
}

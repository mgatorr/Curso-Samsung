package patrones.printer2;


import upm.jbb.IO;

public class PrinterC implements Printer {

	@Override
	public void print(String msg) {
		IO.out.println("PrinterA >>> " + msg);
	}

}

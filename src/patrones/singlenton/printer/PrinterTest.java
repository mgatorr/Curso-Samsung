package patrones.singlenton.printer;

import static org.junit.Assert.*;

import org.junit.Test;

public class PrinterTest {

	@Test
	public void testIsSingleton() {
		assertSame(PrinterFactory.getPrinterFactory(),
				PrinterFactory.getPrinterFactory());
	}

	@Test
	public void testIsFactory() {
		PrinterAMock pam = new PrinterAMock();
		PrinterBMock pbm = new PrinterBMock();
		PrinterFactory.getPrinterFactory().setPrinter(pam);
		assertSame(pam, PrinterFactory.getPrinterFactory().getPrinter());
		assertSame(pam, PrinterFactory.getPrinterFactory().getPrinter());
		PrinterFactory.getPrinterFactory().setPrinter(pbm);
		assertSame(pbm, PrinterFactory.getPrinterFactory().getPrinter());
	}

}

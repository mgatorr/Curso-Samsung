package patrones.singlenton.logger;

import static org.junit.Assert.*;

import org.junit.Test;

public class LoggerSinglentonTest {
	@Test
	public void testIsSingleton() {
		assertSame("No es la misma referencia", LoggerSinglenton.getLoggerSinglenton(),
				LoggerSinglenton.getLoggerSinglenton());
	}

	@Test
	public void testSingletonNotNull() {
		assertNotNull(LoggerSinglenton.getLoggerSinglenton());
	}
}
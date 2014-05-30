package patrones.singlenton;

import static org.junit.Assert.*;

import org.junit.Test;

public class SingletonTest {
	@Test
	public void testIsSingleton() {
		assertSame(Singleton.getSingleton(), Singleton.getSingleton());
	}

	@Test
	public void testSingletonNotNull() {
		assertNotNull(Singleton.getSingleton());
	}
}
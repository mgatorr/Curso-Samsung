package test;

import static org.junit.Assert.*;

import org.junit.Test;

public class IntervaloTest {
	private int[] minimos =          {0,-4,8,2,2};
	private int[] maximos =          {0,8,4,4,8};
	private int[] minimosEsperados = {0,-4,8,2,2};
	private int[] maximosEsperados = {0,8,8,4,8};
	private int[] minimosOtros = {2,8,8,1,4};
	private int[] maximosOtros = {2,10,8,5,6};
	private boolean[] solapado = {false, true,true, true, true};
	private boolean[] incluido = {false,false,true,false,true};

	@Test
	public void testIntervalo() {
		Intervalo inter = new Intervalo();
		assertEquals(inter.getMaximo(),0);
		assertEquals(inter.getMinimo(), 0);
	}

	@Test
	public void testIntervaloIntInt() {
		for(int cont = 0; cont<minimos.length;cont++){
			Intervalo inter = new Intervalo(minimos[cont],maximos[cont]);
			assertEquals(inter.getMinimo(),minimosEsperados[cont]);
			assertEquals(inter.getMaximo(),maximosEsperados[cont]);
		}
	}

	@Test
	public void testSolapado() {
		for(int cont = 0;cont<minimosEsperados.length;cont++){
			Intervalo inter = new Intervalo(minimosEsperados[cont],maximosEsperados[cont]);
			Intervalo otro = new Intervalo(minimosOtros[cont],maximosOtros[cont]);
			assertEquals(inter.solapado(otro),solapado[cont]);
		}
	}

	@Test
	public void testIncluido() {
		for(int cont = 0;cont<minimosEsperados.length;cont++){
			Intervalo inter = new Intervalo(minimosEsperados[cont],maximosEsperados[cont]);
			Intervalo otro = new Intervalo(minimosOtros[cont],maximosOtros[cont]);
			assertEquals(inter.incluido(otro),incluido[cont]);
		}
	
	}

}

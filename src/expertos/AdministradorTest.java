package expertos;

import static org.junit.Assert.*;

import org.junit.Test;

public class AdministradorTest {
	private String[] dni = { "1234567D", "1234568A", "1234569S", "1234561D" };
	private int[] horas = { 10, 15, 18, 20, 24, 28, 4 };

	@Test
	public void testSalario() {
		for(String dnis:dni) {
			for(int hora:horas){
			Administrador emp1 = new Administrador(dnis,hora);
			assertEquals(hora*10,emp1.salario(),0.001);
			
			}
		}
		
	}

	@Test
	public void testAdministradorString() {
		for(String dnis:dni){
			Administrador emp1 = new Administrador(dnis);
			assertEquals(dnis,emp1.getDni());
		}
	}

	@Test
	public void testAdministradorStringInt() {
		for(String dnis:dni) {
			for(int hora:horas){
			Administrador emp1 = new Administrador(dnis,hora);
			assertEquals(dnis,emp1.getDni());
			assertEquals(hora,emp1.getHoras());
			}
		}
	}

}

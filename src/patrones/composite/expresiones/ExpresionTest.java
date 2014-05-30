package patrones.composite.expresiones;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class ExpresionTest {
    private Expresion exp1, exp2, exp3, exp4, exp5, exp6;

    @Before
    public void ini() {
        exp1 = new Numero(4);
        exp2 = new Sumar(exp1, new Numero(2));
        exp3 = new Restar(exp1, new Numero(3));
        exp4 = new Multiplicar(exp1, new Numero(2));
        exp5 = new Dividir(exp1, new Numero(3));
        exp6 = new Sumar(new Restar(new Numero(3), new Multiplicar(
                new Dividir(exp1, new Numero(2)), new Numero(3))), exp1); // ((3-((4/2)*3))+4)
    }

    @Test
    public void testValor() {
        assertEquals(4, exp1.operar());
    }

    @Test
    public void TestSuma() {
        assertEquals(6, exp2.operar());
    }

    @Test
    public void testResta() {
        assertEquals(1, exp3.operar());
    }

    @Test
    public void testMultiplicacion() {
        assertEquals(8, exp4.operar());
    }

    @Test
    public void testDivision() {
        assertEquals(1, exp5.operar());
    }

    @Test
    public void testCompuesto() {
        assertEquals(1, exp6.operar());
    }

    @Test
    public void testVer() {

        assertEquals("((3-((4/2)*3))+4)", exp6.ver());
    }
}
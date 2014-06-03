package patrones.texto;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

public class TextoTest {
    private Componente H, o, l, a, pf, txt;

    @Before
    public void ini() {
        H = FactoriaCaracter.getFactoria().get('H');
        o = FactoriaCaracter.getFactoria().get('o');
        l = FactoriaCaracter.getFactoria().get('l');
        a = FactoriaCaracter.getFactoria().get('a');
        pf = new Parrafo();
        pf.add(H);
        pf.add(o);
        pf.add(l);
        pf.add(a);
        txt = new Texto();
        txt.add(pf);
        txt.add(pf);
    }

    @Test
    public void testCaracterFlyweight() {
        assertSame(H, FactoriaCaracter.getFactoria().get('H'));
    }

    @Test
    public void testCaracterAddCaracter() {
        H.add(o);
    }

    @Test
    public void testDibujarCaracterNormal() {
        assertEquals("o", o.dibujar(false));
    }

    @Test
    public void testDibujarCaracterMayusculas() {
        assertEquals("O", o.dibujar(true));
    }

    // ----------------------------------------------

    @Test
    public void testParrafoNormal() {
        assertEquals("Hola\n", pf.dibujar(false));
    }

    @Test
    public void testParrafoMayusculas() {
        assertEquals("HOLA\n", pf.dibujar(true));
    }

    @Test
    public void testParrafoNoAddParrafo() {
        try {
            pf.add(pf);
            fail("");
        } catch (UnsupportedOperationException ignored) {
            ignored.toString();
        }
    }

    // ----------------------------------------------

    @Test
    public void testTextoNormal() {
        assertEquals("Hola\nHola\n---o---\n",txt.dibujar(false));
    }
    
    @Test
    public void testTextoMayusculas() {
        assertEquals("HOLA\nHOLA\n---o---\n",txt.dibujar(true));
    }
    
    @Test
    public void testTextoNoAddCaracter() {
        try {
            txt.add(H);
            fail();
        } catch (UnsupportedOperationException ignored) {
            ignored.toString();
        }
    }

}
package patrones.compisite.arbol;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

public class NodoTest {
    private NodoComponente raiz;

    private NodoComponente inter;

    private NodoHoja hoja;

    @Before
    public void ini() {
        this.raiz = new NodoCompuesto("raiz");
        this.hoja = new NodoHoja(1);
        this.raiz.add(hoja);
        this.inter = new NodoCompuesto("sub");
        this.inter.add(new NodoHoja(4));
        this.inter.add(new NodoHoja(3));
        this.inter.add(new NodoHoja(2));
        NodoComponente no = new NodoHoja(-1);
        this.inter.add(no);
        this.inter.remove(no);
        this.raiz.add(this.inter);
        this.raiz.add(new NodoHoja(5));
    }

    @Test
    public void testNumHijos() {
		assertEquals(3, this.raiz.numHijos());
        assertEquals(3, this.inter.numHijos());
        assertEquals(0, this.hoja.numHijos());
    }

    @Test
    public void testAddNull() {
        this.raiz.add(null);
        assertEquals(3, this.raiz.numHijos());
    }
    
    @Test
    public void testRemoveNull() {
        this.raiz.remove(null);
    }

    @Test
    public void testSuma() {
        assertEquals(15, this.raiz.suma());
        assertEquals(9, this.inter.suma());
    }

    @Test
    public void testMayor() {
        assertEquals(5, this.raiz.mayor());
        assertEquals(4, this.inter.mayor());
    }

    @Test
    public void testNoSoportado() {
        NodoComponente excp = new NodoHoja(0);
        try {
            excp.add(new NodoHoja(2));
            fail();
        } catch (UnsupportedOperationException ignored) {
            ignored.toString();
        }
    }

}
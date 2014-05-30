package patrones.compisite;

import java.util.ArrayList;
import java.util.List;

import upm.jbb.IO;

public class CompositeMain {

    private List<Componente> compuestos = new ArrayList<Componente>();

    private Componente raiz;

    public CompositeMain() {
        this.raiz = new Compuesto("raiz");
        this.compuestos.add(raiz);
    }

    public void addCompuesto() {
        Componente com = (Componente) IO.in.select(compuestos.toArray());
        Componente nuevo = new Compuesto(IO.in.readString("Nombre"));
        com.add(nuevo);
        this.compuestos.add(nuevo);
    }

    public void addHoja1() {
        Componente com = (Componente) IO.in.select(compuestos.toArray());
        com.add(new Hoja1(IO.in.readString("Nombre")));
    }

    public void addHoja2() {
        Componente com = (Componente) IO.in.select(compuestos.toArray());
        com.add(new Hoja2(IO.in.readString("Nombre")));
    }

    public void view() {
        IO.out.clear();
        this.raiz.view("");
    }

    public static void main(String[] args) {
        IO.in.addController(new CompositeMain());
    }

}
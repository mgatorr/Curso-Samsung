package patrones.visitor;

import java.util.ArrayList;
import java.util.Collection;

import upm.jbb.IO;

public final class MainVisitor {
    private Collection<Elemento> coleccion = new ArrayList<Elemento>();

    public MainVisitor() {
        coleccion.add(new ElementoA());
        coleccion.add(new ElementoA());
        coleccion.add(new ElementoB());
        coleccion.add(new ElementoA());
    }

    public void visitador1() {
        Visitador1 v1 = new Visitador1();
        for (Elemento elemento : coleccion) {
            elemento.aceptar(v1);
        }
    }

    public static void main(String[] args) {
        IO.in.addController(new MainVisitor());
    }
}
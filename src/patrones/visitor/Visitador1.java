package patrones.visitor;


import upm.jbb.IO;

public class Visitador1 extends Visitador {

    @Override
    public void visitarElementoA(ElementoA e) {
        IO.out.println("Visitador 1 --> elemento: " + e.getAtributoA());
    }

    @Override
    public void visitarElementoB(ElementoB e) {
        IO.out.println("Visitador 1 --> elemento: " + e.getAtributoB());
    }

}
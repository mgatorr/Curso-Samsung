package patrones.visitor;

public class ElementoA implements Elemento {
    private String atributoA;

    public ElementoA() {
        this.setAtributoA("A");
    }

    public String getAtributoA() {
        return atributoA;
    }

    public void setAtributoA(String atributoA) {
        this.atributoA = atributoA;
    }

    @Override
    public void aceptar(Visitador v) {
        v.visitarElementoA(this);
    }

}
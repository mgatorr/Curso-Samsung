package patrones.flyweight;

import upm.jbb.IO;

public class PesoLigeroConcreto {
    private String intrinseco;

    public PesoLigeroConcreto(String intrinseco) {
        this.intrinseco = intrinseco;
    }

    public String getIntrinseco() {
        return this.intrinseco;
    }

    public void operacion(String extrinseco) {
        IO.out.println(extrinseco + this.intrinseco + extrinseco);
    }
}
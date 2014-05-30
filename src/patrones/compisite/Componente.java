package patrones.compisite;

public abstract class Componente {
    private String nombre;

    protected Componente(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public abstract void remove(Componente cc);

    public abstract void add(Componente cc);

    public abstract boolean isCompuesto();

    public abstract void view(String cabecera);

}
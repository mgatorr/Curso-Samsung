package test;

public class Angulo {
	private int grados;
	
	public Angulo(int grados) {
		this.setGrados(grados);
	}
	
	public Angulo() {
		this(0);
	}
	
	public int getGrados() {
		return this.grados;
	}

	public void setGrados(int grados) {
		this.grados = ((grados % 360) + 360) % 360;
	}

	public void suma(int grados) {
		this.setGrados(this.grados + grados);
	}

}

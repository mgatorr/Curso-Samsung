package herencias;

public class Punto {
	private int x, y;

	public Punto(int x, int y) {
		this.setX(x);
		this.setY(y);
	}

	public Punto() {
		this(0, 0);
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getX() {
		return this.x;
	}

	public int getY() {
		return this.y;
	}

	public double modulo() {
		return Math.sqrt(this.x * this.x + this.y * this.y);
	}

	public double fase() {
		return Math.atan((double) this.y / this.x);
	}

	@Override
	public String toString() {
		return "Punto[" + x + "," + y + "]";
	}
}

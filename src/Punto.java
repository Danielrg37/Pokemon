package Figura;

public class Punto {
	private int x;
	private int y;


public Punto(int x, int y){
	super();
	this.x = x;
	this.y = y;
}
	
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}


	public void modificarX(int x) {
	this.x = x;
	}


	public void modificarY(int y) {
	this.y = y;
	}
}


package Figura;

public class Cuadrado extends Figura {
	private int lado;

	
	public Cuadrado(String color, int lado) {
		super(color);
		this.lado = lado;
	}
	


public Cuadrado(int lado) {
	super("verde");
	this.lado = lado;
	
}
	public double calcularArea() {
		return Math.pow(this.lado, 2);
	}
	
	public double calcularPerimetro() {
		return this.lado * 4;
	}
}


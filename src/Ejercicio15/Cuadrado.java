package Ejercicio15;

public class Cuadrado extends Figura {
	private int lado;


	public Cuadrado(int x, int y, int r, int g, int b,  int lado){
		super(x, y, getColor());	
		this.lado = lado;
			
		}

	public int getLado() {
	return lado;
}

	public void setLado(int lado) {
	this.lado = lado;
}

	public double calcularArea() {
		return Math.pow(this.lado, 2);
	}
	
	public double calcularPerimetro() {
		return this.lado * 4;
	}
}


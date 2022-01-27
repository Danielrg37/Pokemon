package Ejercicio15;

import java.awt.Color;

public class Cuadrado extends Figura {
	private int lado;

	public Cuadrado(int x, int y, Color color, int lado) {
		super(x, y, color);
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


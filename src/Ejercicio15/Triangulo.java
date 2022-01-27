package Ejercicio15;

import java.awt.Color;

public class Triangulo extends Figura{


	private int base;
	private int altura;
	private int lado1;
	private int lado2;
	
	public Triangulo(int x, int y, Color color, int base, int altura, int lado1, int lado2) {
		super(x, y, color);
		this.base = base;
		this.lado1= lado1;
		this.lado2 = lado2;
		this.altura = altura;
	}

	public double calcularArea() {
		return this.base * this.altura / 2;
	}
	
	public double calcularPerimetro() {
		return this.lado1 + this.lado2 + base;
	}
}

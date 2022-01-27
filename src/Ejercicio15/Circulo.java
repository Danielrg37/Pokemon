package Ejercicio15;

import java.awt.Color;

public class Circulo extends Figura{
	private int radio;

	public Circulo(int x, int y, Color color, int radio) {
		super(x, y, color);
		this.radio = radio;
	}




public double calcularArea() {
	return Math.PI * Math.pow(this.radio, 2);

}

public double calcularPerimetro() {
	return 2 * Math.PI * this.radio;

}

public int getRadio() {
	return radio;
}


public void setRadio(int radio) {
	this.radio = radio;
}

}


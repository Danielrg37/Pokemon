
package Ejercicio15;

import java.awt.Color;
import java.awt.Point;

public abstract class Figura
{
private Point centro;
private Color color;

public Figura(int x, int y, Color color){
	centro = new Point(x, y);
	this.color = color;
}


public abstract double calcularArea();

public abstract double calcularPerimetro();

public String mostrarAreaYPerimetro() {
	StringBuilder sb = new StringBuilder();
	sb.append("Area=");
	sb.append(this.calcularArea());
	System.out.println("Perimetro=");
	sb.append(this.calcularPerimetro());
	sb.append("\n");
	
	return sb.toString();
}


public Point getCentro() {
	return centro;
}


public void setCentro(Point centro) {
	this.centro = centro;
}


public Color getColor() {
	return color;
}


public void setColor(Color color) {
	this.color = color;
}

}



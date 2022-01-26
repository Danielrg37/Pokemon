package Ejercicio15;


public class Circulo extends Figura{
	private int radio;

	
public Circulo(int x, int y, int r, int g, int b,  int radio){
	super(x, y, r, g, b);	
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


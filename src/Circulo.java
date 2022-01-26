package Figura;



public class Circulo extends Figura{
	private int radio;
	private Punto punto;

	
public Circulo(String color, int radio, Punto punto){
		super(color);
		this.radio = radio;
		this.punto = punto;
	}

public Circulo(Punto punto, int radio){
	super("azul");
	this.radio = radio;
	this.punto = punto;
}

public double calcularArea() {
	return Math.PI * Math.pow(this.radio, 2);

}

public double calcularPerimetro() {
	return 2 * Math.PI * this.radio;

}
}

package Figura;

public abstract class Figura
{
    private String color;


public Figura(String color){
	super();
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
	}

package Figura;



public class Rectangulo extends Figura{
	private int base;
	private int altura;
	
	public Rectangulo(String color, int base, int altura) {
		super(color);
		this.base = base;
		this.altura = altura;
	}

	public Rectangulo(int base, int altura) {
		super("rojo");
		this.base = base;
		this.altura = altura;
	}	
		public double calcularArea() {
			return this.base * this.altura;
		}
		
		public double calcularPerimetro() {
			return this.base * 2 + this.altura * 2;
		}
	}


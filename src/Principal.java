package Figura;

public class Principal
{
	public static void main(String[] args) {
		Figura[] figuras = new Figura[10];
		figuras[0] = new Circulo(new Punto(0,0), 5);
		figuras[1] = new Cuadrado("amarillo", 4);
		figuras[2] = new Rectangulo("rosa", 5, 4);
		figuras[3] = new Triangulo(6, 3, 3, 4);
		
	
		Figura f = null;
		for(int i = 0; i < figuras.length; i++) {
			f = figuras[i];
			if(f != null) {
				System.out.println(f.mostrarAreaYPerimetro());
		
	}

}
	}
}

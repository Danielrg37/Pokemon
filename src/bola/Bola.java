package bola;

public class Bola {
	
private static Color color;
private int numero;
	
	public Bola() {
		numero = (int) (Math.random() * (99 - 1) + 1);
		if(numero % 2 == 0) {
			color = Color.NEGRO;
		} else {
			color = Color.BLANCO;
		}
	}
		
 public void getColorString() {
	Color variable = Bola.color;
	System.out.println(variable);
 } 
 
 public String toString() {	 
return ("La bola es de color" + getColor());
}
 

 public boolean esBlanca() {
	 boolean blanca = false;
	 if(Bola.color == Color.BLANCO) {
		 blanca = true;
	 }
	 return blanca;
 }
 
 public boolean esNegra() {
	 boolean negra = false;
	 if(Bola.color == Color.NEGRO) {
		 negra = true;
	 }
	 return negra;
 }

public Color getColor() {
	return color;
}

public static void setColor(Color color) {
	Bola.color = color;
}
 
 
 }
		

package bola;

import java.util.Random;

public class Bola {
	
private Color color;
private int numero;
	
	public Bola() {
		Random r = new Random();
		int numero = r.nextInt(100) + 1;
		if(numero % 2 == 0) {
			color = Color.NEGRO;
		} else {
			color = Color.BLANCO;
		}
	}
		
 public void getColorString() {
	Color variable = color;
	System.out.println(variable);
 } 
 
 public String toString() {	 
return ("La bola es de color" + " " + getColor());
}
 

 public boolean esBlanca() {
	 boolean blanca = false;
	 if(color == Color.BLANCO) {
		 blanca = true;
	 }
	 return blanca;
 }
 
 public boolean esNegra() {
	 boolean negra = false;
	 if(color == Color.NEGRO) {
		 negra = true;
	 }
	 return negra;
 }

public Color getColor() {
	return color;
}

 }
		

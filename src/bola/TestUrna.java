package bola;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestUrna {
	
	public static void main(String[] args) throws Exception {
	Urna urna = new Urna();
	Scanner sc = new Scanner(System.in);
	System.out.println("Introduce número que quieres añadir:");
	int numero = sc.nextInt();
	
	for(int i = 0; i < numero; i++) {
		urna.meterBola(new Bola());
	}
	
	System.out.println("Bola sacada aleatoria: " + urna.sacarBola());
	System.out.println("Bolas blancas:" + urna.cuantasBlancas());
	System.out.println("Bolas negras" + urna.cuantasNegras());
	urna.mostrarUrna();
	urna.borrarBlancas();
	urna.mostrarUrna();
	
}
}



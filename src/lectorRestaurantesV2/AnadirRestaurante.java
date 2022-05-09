package lectorRestaurantesV2;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class AnadirRestaurante {
	public 	static Scanner sc = new Scanner(System.in);
	
	
	public static void anadirRestaurante() throws IOException {
	System.out.println("xd");
	String cadena = sc.nextLine();
	
	String[] datos = cadena.split(",");
	
	
	
	try {
	PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("restaurantes.csv", true)));
	pw.println(datos);
	pw.close();
	} catch (IOException e) {
		System.out.println("Error");
	}
	}
}
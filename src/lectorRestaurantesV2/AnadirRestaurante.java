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
	System.out.println("Introduce los datos (Pon comas entre ellos):");
	String cadena = sc.nextLine();
	
	String[] datos = cadena.split(",");
	
	try {
	PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("restaurantes.csv", true)));
	pw.write("\n");
	pw.write(datos[0]);
	for(int i = 1; i < datos.length; i++) {
		pw.write( "," + datos[i]);
	}
	
	pw.close();
	} catch (IOException e) {
		System.out.println("Error");
	}
	}
}
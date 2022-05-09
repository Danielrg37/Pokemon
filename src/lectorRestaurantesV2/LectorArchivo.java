package lectorRestaurantesV2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class LectorArchivo {

	public static String linea = "";
	public static Scanner sc = new Scanner(System.in);
	public static String resultado = null;
	public static BufferedReader br = null;
	
	public static void mostrarFichero() throws IOException {
		try {
			br = new BufferedReader(new FileReader("restaurantes.csv"));
			while ((linea = br.readLine()) != null) {
				resultado = linea;
				System.out.println(resultado);
			}
		} finally {
			if (br != null)
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
	}

	public static void mostrarFicheroNombre() throws IOException {

		System.out.println("Introduce la subcadena para filtrar:");
		String cadena = sc.next();
		try {
			br = new BufferedReader(new FileReader("restaurantes.csv"));
			while ((linea = br.readLine()) != null) {
				int pos = linea.indexOf(",");
				String nombre = linea.substring(0, pos);
				if (nombre.contains(cadena)) {
					System.out.println(linea);
				}
			}
		} finally {
			if (br != null)
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
	}
}

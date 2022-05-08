package reader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class LectorArchivo {

	public static String linea = "";
	public 	static Scanner sc = new Scanner(System.in);
	public static String resultado = null;

	public static void main(String[] args) throws Exception {
		

BufferedReader br = null;
System.out.println("Introduce codigo postal:");
String opcion = sc.next();
System.out.println("---------------------------");


try {
	br = new BufferedReader(new FileReader("restaurantes.csv"));
while ((linea = br.readLine()) != null) {
	if(linea.contains(opcion)) {
		resultado = linea;
		System.out.println(resultado);
	}
}
if(resultado == null) {
	System.out.println("Este código postal no está en el fichero");
}

	} finally {
	    if ( br != null)
	        try {
	            br.close();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	}
}





package reader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class LectorArchivo {

	private static boolean SALIR = false;
	 public static final String SEPARATOR=",";
	   public static final char QUOTE= '"';
	   public static String linea = "";
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) throws IOException {
		

BufferedReader br = null;

System.out.println("Introduce codigo postal:");
String opcion = sc.next();



try {
	br = new BufferedReader(new FileReader("restaurantes.csv"));
while ((linea = br.readLine()) != null) {
	if(linea.contains(opcion)) {
		System.out.println(linea);
	}
}
	} catch (FileNotFoundException e) {
	    e.printStackTrace();
	} catch (IOException e) {
	    e.printStackTrace();
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





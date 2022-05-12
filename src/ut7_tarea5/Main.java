package ut7_tarea5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {
	private static String linea = " ";
	private static String[] cadena;
	
	public static void main(String[] args) throws IOException {

		BufferedReader br = null;
		try {
		
			br = new BufferedReader(new FileReader("src/ut7_tarea_5/psicopata.txt"));
			while ((linea = br.readLine()) != null) {
				cadena = linea.split(" ");
			}
		} finally {

		}
		if (br != null)
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
	}

	public static void mostrarPalabras() {
	for(String c : cadena) {
		System.out.println(c);
	}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}


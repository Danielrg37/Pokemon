package ut7_tarea5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeMap;
import java.util.Scanner;

public class Main {
	public static Scanner sc = new Scanner(System.in);
	private static String linea = " ";
	private static String[] cadena;
	static TreeMap<String, Integer> mapa =  new TreeMap<String, Integer>(); 
	private static int opcion = 0;

	

	public static void main(String[] args) throws IOException {
		
		while (opcion != 2) {
			System.out.println("MENU");
			System.out.println("-------------------");
			System.out.println("1- Introducir archivo");
			System.out.println("2- Salir");
			System.out.println("-------------------");
			System.out.println("Introduce opción:");
			opcion = sc.nextInt();
			System.out.println("-------------------");

			switch (opcion) {
			case 1:
				comprobarFichero();
				break;

			case 2:
				System.out.println("Seleccionaste salir, chao");
				break;

			default:
				System.out.println("Error al introducir número");
				break;
			}
		}
	}
	
	
	public static void comprobarFichero() throws IOException {
		Scanner sc = new Scanner(System.in);
		File archivo = null;
		System.out.println("Introduzca el nombre del fichero a tratar > ");
		String nombre = sc.nextLine();
		
		try {
			archivo = new File("src/ut7_tarea5/" + nombre);
		} catch (NullPointerException e) {
			System.out.println("Tiene que introducir algún nombre");
			System.out.println("-------------------");
		}
		if (!archivo.exists()) {
			System.out.println("No se encuentra un archivo con este nombre");
			System.out.println("-------------------");
		} else {
			nuevoFichero(archivo);
		}
	}

	
		public static void nuevoFichero(File archivo) throws IOException {
		BufferedReader br = null;
		try {
		
			br = new BufferedReader(new FileReader(archivo));
			ArrayList<String> palabras = new ArrayList<>();
			while ((linea = br.readLine()) != null) {
			String lineaMinisculas = linea.toLowerCase();
			cadena = lineaMinisculas.split( " ");
			palabras.addAll(Arrays.asList(cadena));
			
			}
			
			
			for(String c : palabras) {
				if(mapa.containsKey(c)) {
					mapa.put(c, mapa.get(c) + 1);
				} else {
					mapa.put(c, 1);
				}
			}
			System.out.println("\n");
			imprimirMapa();
		} finally {

		}
		if (br != null)
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
	}
		
		public static void imprimirMapa() {
			int maximo = 0;
			String palabraMax = null;
		for(String x : mapa.keySet()) {
			System.out.println(x + " " + mapa.get(x));
			if(mapa.get(x) > maximo) {
				palabraMax = x;
				maximo = mapa.get(x);
			}
		}
		System.out.println("Palabras con más ocurrencias:" + "  " + palabraMax + " " + maximo);
		System.out.println("\n");
		}
		}

		
				
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


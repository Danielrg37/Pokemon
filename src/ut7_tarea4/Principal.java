package ut7_tarea4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Principal {
	public static Scanner sc = new Scanner(System.in);
	private static int opcion = 0;
	private static String nombre;
	private static String linea = " ";

	public static void main(String[] args) throws IOException {
		
		while (opcion != 2) {
			System.out.println("Preprocesador de comentarios en Java");
			System.out.println("-------------------");
			System.out.println("1- Eliminar comentarios");
			System.out.println("2- Salir");
			System.out.println("-------------------");
			System.out.println("Introduce opción:");
			opcion = sc.nextInt();
			System.out.println("-------------------");

			switch (opcion) {
			case 1:
				eliminar();
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

	public static void eliminar() throws IOException {
		Scanner sc = new Scanner(System.in);
		File archivo = null;
		System.out.println("Introduzca el nombre del fichero a tratar > ");
		nombre = sc.nextLine();
		
		try {
			archivo = new File("src/ut7_tarea4/" + nombre);
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
			PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("src/ut7_tarea4/out/" + nombre)));
			br = new BufferedReader(new FileReader("src/ut7_tarea4/" + nombre));
			while ((linea = br.readLine()) != null) {
				if(linea.contains("/*") || linea.contains( "/**") || linea.contains("//") || linea.contains("*/") || linea.contains("*")){
				} else {
				pw.write(linea);
				}
			
			}
			pw.close();
		} finally {

		}
		if (br != null)
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
	}
	
	
}



package lectorRestaurantesV2;
import java.io.IOException;
import java.util.Scanner;

public class Principal {
	public 	static Scanner sc = new Scanner(System.in);
	private static int opcion = 0;
	
	public static void main(String[] args) throws IOException {

		
	while (opcion != 5) {
	System.out.println("-------------------");
	System.out.println("Menu (Restaurantes V2)");
	System.out.println("1- Añadir restaurante");
	System.out.println("2- Listar restaurantes");
	System.out.println("3 - Buscar por nombre");
	System.out.println("4");
	System.out.println("5- Salir");
	System.out.println("-------------------");
	System.out.println("Introduce opción:");
	opcion = sc.nextInt();
	System.out.println("-------------------");
	
	switch(opcion) {
	case 1:
		AnadirRestaurante.anadirRestaurante();
		break;
		
	case 2:
		LectorArchivo.mostrarFichero();
		break;
		
	case 3:
		LectorArchivo.mostrarFicheroNombre();
		break;
		
	case 4:
		break;
		
	case 5:
		System.out.println("Seleccionaste salir, chao");
		break;
		
	default:
		
		break;
	}
	}
	}
}

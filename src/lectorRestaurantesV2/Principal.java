package lectorRestaurantesV2;
import java.io.IOException;
import java.util.Scanner;

public class Principal {
	public 	static Scanner sc = new Scanner(System.in);
	private static int opcion = 0;
	
	public static void main(String[] args) throws IOException {

		
	while (opcion != 5) {
	System.out.println("-------------------");
	System.out.println("Menu");
	System.out.println("1");
	System.out.println("2");
	System.out.println("3");
	System.out.println("4");
	System.out.println("5");
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
		System.out.println("Sales del programa, chao");
		break;
		
	default:
		
		break;
	}
	}
	}
}

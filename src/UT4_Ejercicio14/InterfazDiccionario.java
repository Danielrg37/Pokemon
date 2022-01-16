package UT4_Ejercicio14;

import java.util.Scanner;
/**
 * Write a description of class InterfazDiccionario here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class InterfazDiccionario
{
    // instance variables - replace the example below with your own
    private static Scanner sc = new Scanner(System.in);
    Diccionario diccionario = new Diccionario(5);
public InterfazDiccionario() {
		int opcion;
		int posicion;
		do {
			System.out.println();
			System.out.println("*************************");
			System.out.println("Elija la opción");
			System.out.println("1. Añadir palabra");
			System.out.println("2. Obtener palabra");
			System.out.println("3. Traducir palabra");
			System.out.println("4. toString");
			System.out.println("5. Escribir diccionario");
			System.out.println("6. Salir");
			System.out.println("*************************");
			System.out.println();
			opcion = sc.nextInt();
			
			if(opcion == 1) {
        			
			    diccionario.insertarPalabra(null);	      
			}else if(opcion == 2) {
				posicion = sc.nextInt();
        			Diccionario.obtenerPalabra(posicion);
				
			}else if(opcion == 3){
		            posicion = sc.nextInt();		
			    Diccionario.traducirPalabra(posicion);
				
			}else if(opcion == 4) {
				diccionario.toString();
				
			}else if(opcion == 5){
				Diccionario.escribirDiccionario();
				
                        }else if(opcion == 6){
                                System.out.println("Has escogido la opción de Salir");
			}else {
				System.out.println("Opcion incorrecta.");
				
			}
			
		} while(opcion != 6);
}
}

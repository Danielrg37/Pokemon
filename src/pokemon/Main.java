package pokemon;

import java.util.Scanner;

import UT4_Ejercicio14.Diccionario;

/**
 * Write a description of class Main here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Main
{
    private static final int NUM_POKEMONS = 5;
    private static Pokemon[] pokemons = new Pokemon[NUM_POKEMONS];
    private static Scanner scanner = new Scanner(System.in);
   
    public static void main(String[] args) {
       boolean Salir = false;
       int opcion;         
       while(!Salir){
            System.out.println();
            System.out.println("**********************************");
            System.out.println();
            System.out.println("Elija la opción:");
            System.out.println("1. Utilizar los pokemon del juego");
            System.out.println("2. Crear los pokemon aleatoriamente");
            System.out.println("3. Salir");
            System.out.println();
            System.out.println("**********************************");
            System.out.println();
            opcion = scanner.nextInt();
        
        	int opcion;
    		int posicion;
    		do {
    			System.out.println();
    			System.out.println("*************************");
    			System.out.println("Elija la opciÃ³n");
    			System.out.println("1. AÃ±adir palabra");
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
                                    System.out.println("Has escogido la opciÃ³n de Salir");
    			}else {
    				System.out.println("Opcion incorrecta.");
    				
    			}
    			
    		} while(opcion != 6);
           switch(opcion){
               case 1:
                   initPokemons();
                   initCombat();
                   break;
               case 2:
                   initPokemonsRandomly();
                   initCombat();
                   break;
                case 3:
                   System.out.println("Escogiste la opción 3 de salir, hasta luego!");
                   Salir = true;
                   break;
                default:
                   System.out.println("Solo se permiten números entre 1 y 3(Opción incorrecta)");
           }
            
       }
        
    }
    private static void initPokemons() {
        Pokemon charizard = new Pokemon(100, 50, 50, "charizard");
        pokemons[0] = charizard;
        Pokemon blastoise= new Pokemon(150, 25, 150, "blastoise");
        pokemons[1] = blastoise;
        Pokemon venusaur= new Pokemon(300, 10, 100, "venusaur");
        pokemons[2] = venusaur;
        Pokemon bulbasaur= new Pokemon(250, 20, 180, "bulbasaur");
        pokemons[3] = bulbasaur;
        Pokemon pikachu= new Pokemon(300, 40, 200, "pikachu");
        pokemons[4] = pikachu;
    }
    
    private static void initPokemonsRandomly(){
        for(int i = 0; i < pokemons.length; i++){
            pokemons[i] = new Pokemon();
            pokemons[i].setName("pokemon" + (i + 1));
        
        }
    }
    
    private static void showPokemons(){
    for (int i = 0; i < pokemons.length; i++) {
        System.out.printf("\n%d. %S", (i + 1), pokemons[i].getName());
    }

    }
    
    private static void initCombat(){
        showPokemons();
        System.out.println("\nEscoge a tu primer Pokemon: ");
    int primerPokemon = scanner.nextInt() - 1;
    System.out.println("\nEscoge a tu segundo Pokemon: ");
    int segundoPokemon = scanner.nextInt() - 1;
    Battle.initBattle(pokemons[primerPokemon], pokemons[segundoPokemon]);
    }
}


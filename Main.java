import java.util.Scanner;

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
            pokemons[i].setName("pokemon" + i);
		
        }
    }
    
    private static void showPokemons(){
        System.out.println();
	for (int i = 0; i < pokemons.length; i++) {
	System.out.print(pokemons[i] + " ");
	}
    }
    
    private static void initCombat(){
        showPokemons();
        System.out.println("Escoge a tu primer Pokemon: ");
	int primerPokemon = scanner.nextInt() - 1;
	System.out.println("Escoge a tu segundo Pokemon: ");
	int segundoPokemon = scanner.nextInt() - 1;
	Battle.initBattle(pokemons[primerPokemon], pokemons[segundoPokemon]);
    }
    
    private static void main(String[] args){
    int opcion;
    do{
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
        if (opcion == 1){
            initPokemons();
            initCombat();
        
        } else if (opcion == 2){
            initPokemonsRandomly();
            initCombat();
        
        } else if (opcion == 3){
            System.out.println("Has escogido la opción 3 (Salir)");
        
        }else {
            System.out.println("Opción incorrecta");
        }
        } while (opcion != 3);
    }
}


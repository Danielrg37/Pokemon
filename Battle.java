
/**
 * Write a description of class Battle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Battle
{
    public static void initBattle(Pokemon pokemon1, Pokemon pokemon2){
        while( pokemon1.getHealth() > 0 && pokemon2.getHealth() > 0){
            
            if(pokemon2.getSpeed() > pokemon1.getSpeed()){
            
            pokemon2.setHealth(pokemon1.getHealth() - pokemon2.getStrength());
            pokemon1.setHealth(pokemon2.getHealth() - pokemon1.getStrength());
            System.out.printf("%S comienza el ataque contra %S", pokemon2.getName(), pokemon1.getName());
            System.out.printf("%S daña %d a %S y a %S le quedan %d vida", pokemon2.getName(), pokemon2.getStrength(), pokemon1.getName(), pokemon1.getName(), pokemon1.getHealth());
            System.out.printf("%S daña %d a %S y a %S le quedan %d vida", pokemon1.getName(), pokemon1.getStrength(), pokemon2.getName(), pokemon2.getName(), pokemon2.getHealth());
        } else {
            pokemon1.setHealth(pokemon2.getHealth() - pokemon1.getStrength());
            pokemon2.setHealth(pokemon1.getHealth() - pokemon2.getStrength());
            System.out.printf("%S comienza el ataque contra %S", pokemon1.getName(), pokemon2.getName());
            System.out.printf("%S daña %d a %S y a %S le quedan %d vida", pokemon1.getName(), pokemon1.getStrength(), pokemon2.getName(), pokemon2.getName(), pokemon2.getHealth());
            System.out.printf("%S daña %d a %S y a %S le quedan %d vida", pokemon2.getName(), pokemon2.getStrength(), pokemon1.getName(), pokemon1.getName(), pokemon1.getHealth());
        }
        }
        if(pokemon2.getHealth() <= 0){
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("%S ha perdido el combate", pokemon2.getName());
        }
        if(pokemon1.getHealth() <= 0){
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("%S ha perdido el combate", pokemon1.getName());    
        }
    }
    
}

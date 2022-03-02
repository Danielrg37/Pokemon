package mario;

public class Main {

	public static void main(String[] args) {
	//Creación de carrera y karts
	Race race = new Race("Super cup");
	race.addKart(new Kart("Daisy"));
	race.addKart(new Kart("Estela"));
	race.addKart(new Kart("Mario"));
	race.setCircuit(new Circuit("Mina de Wario", 100));
	
	System.out.println("**** Init Super Mario Kart  *****");
	System.out.println(race.toString()); race.run();
	System.out.println("**** GAME OVER ****");
	System.out.println(race.showResult());
	}
}
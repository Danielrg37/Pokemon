package mario;

import java.util.Random;

public class Circuit{
	private String nombre;
	private int distance;

	
	public Circuit(String nombre, int distance) {
	this.nombre = nombre;
	this.distance = distance;
}

	public int difficulty() {
		Random random= new Random();
		// just in 33% of the cases
		if(random.nextInt(3) == 0) {
			return random.nextInt(5);
			} else{
				return 0;
				}}
	

	public String getName() {
		return nombre;
	}


	public void setName(String nombre) {
		this.nombre = nombre;
	}


	public int getDistance() {
		return distance;
	}


	public void setDistance(int distance) {
		this.distance = distance;
	}


	@Override
	public String toString() {
		return "Circuit [nombre=" + nombre + ", distance=" + distance + "]";
	}

	
	
}
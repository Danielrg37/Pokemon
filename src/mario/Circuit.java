package mario;

import java.util.Random;

public class Circuit{
	private String nombre;
	private int distance;

	
	public Circuit(String nombre, int distance) {
	this.nombre = nombre;
	this.distance = distance;
}


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
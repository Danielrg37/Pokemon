package Ejercicio16;

public abstract class Animal extends Persona
{
private String nombre;
private int numPatas;

public Animal(String dueño, String nombre, int numPatas) {
	super(dueño);
	this.nombre = nombre;
	this.numPatas = numPatas;	
}

public abstract String emitirSonido();

public abstract String comidaAnimal();

public abstract void RepresentacionAnimal();


public String getNombre() {
	return nombre;
}


public void setNombre(String nombre) {
	this.nombre = nombre;
}


public int getNumPatas() {
	return numPatas;
}


public void setNumPatas(int numPatas) {
	this.numPatas = numPatas;
}
}




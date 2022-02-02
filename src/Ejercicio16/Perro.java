package Ejercicio16;


public class Perro extends Animal {
	private String lugarfavorito;




	public Perro(String due�o, String nombre, int numPatas, String lugarfavorito) {
		super(due�o, nombre, numPatas);
		this.lugarfavorito = lugarfavorito;
	}



	public void setLugarfavorito(String lugarfavorito) {
		this.lugarfavorito = lugarfavorito;
	}

	@Override
	public String emitirSonido() {
		return null;
	}



	@Override
	public String comidaAnimal() {
		return "Comer hueso";
	}



	@Override
	public void RepresentacionAnimal() {
		System.out.println("Soy el perro" + getNombre() + ",mi due�o es" + this.getDue�o()+ "y tengo" + this.getNumPatas() + "patas y mi lugar favorito es:" + this.lugarfavorito);	
	}



	public String getLugarfavorito() {
		return lugarfavorito;
	}



}



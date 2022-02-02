package Ejercicio16;


public class Gato extends Animal {
	private String juguetefavorito;



	public Gato(String nombre,String dueño, int numPatas, String juguetefavorito) {
		super(nombre, dueño, numPatas);
		this.setJuguetefavorito(juguetefavorito);
	}



	public String getJuguetefavorito() {
		return juguetefavorito;
	}



	public void setJuguetefavorito(String juguetefavorito) {
		this.juguetefavorito = juguetefavorito;
	}



	@Override
	public String emitirSonido() {
		return "Miau";
	}



	@Override
	public String comidaAnimal() {
		return "Comer pescado";
	}



	@Override
	public void RepresentacionAnimal() {
		System.out.println("Soy el gato" + getNombre() + ",mi dueño es" + this.getDueño()+ "y tengo" + this.getNumPatas() + "patas y mi jugete favorito es:" + this.juguetefavorito);
	}
}
		


package Ejercicio16;

public class Vaca extends Animal {

	public Vaca(String due�o, String nombre, int numPatas) {
		super(due�o, nombre, numPatas);
	}

	@Override
	public String emitirSonido() {
		return "MUUUUUUU";
	}

	@Override
	public String comidaAnimal() {
		return "Comer hierba";
	}

	@Override
	public void RepresentacionAnimal() {
		System.out.println("Soy la vaca" + getNombre() + ",mi due�o es" + this.getDue�o()+ "y tengo" + this.getNumPatas() + "patas");
		
	}
	}




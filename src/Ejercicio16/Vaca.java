package Ejercicio16;

public class Vaca extends Animal {

	public Vaca(String dueño, String nombre, int numPatas) {
		super(dueño, nombre, numPatas);
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
		System.out.println("Soy la vaca" + getNombre() + ",mi dueño es" + this.getDueño()+ "y tengo" + this.getNumPatas() + "patas");
		
	}
	}




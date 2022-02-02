package Ejercicio16;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Granja {
	private List<Animal> animales;
	
	public Granja() {
		animales = new ArrayList<Animal>();
	}
	

public void addFigura(Animal a) {
	animales.add(a);
}


public void ListarAnimales() {
	for(Animal i: animales) i.RepresentacionAnimal();
	}
	



public Animal getAnimal(int i) {
	return animales.get(i);
}

public int cuantosPerros() {
	int cantPerros = 0;
	for(Animal i: animales) {
		if(i instanceof Perro) cantPerros++;
	}
	return cantPerros;
}

public void borrarGatos() {
	Iterator<Animal> a = animales.iterator();
	while(a.hasNext()) {
		if(a.next() instanceof Gato) a.remove();
	}
}
}


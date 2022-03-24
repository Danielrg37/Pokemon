package CincoDieciocho;

import java.util.ArrayList;
import java.util.Iterator;

public class CollecionEnteros{
	
	private ArrayList<Integer> miLista;
	
	
	public CollecionEnteros() {
		ArrayList<Integer> miLista= new ArrayList<Integer>();
	
	}
	public void inicializarColeccion() {
		for(int i = 0; i < 10; i++) {
			int numero = (int) (Math.random() * (21 - 1) + 1);
			miLista.add(numero);
			if(numero == 0) {
				break;
			}
		}
	}
	
	public int sumar() {
		int suma = 0;
	
	for(Integer i : miLista) {
		suma += i;
	}
	
	Iterator<Integer> it = miLista.iterator();
	
	
	while(it.hasNext()) {
		Integer e = it.next();
		suma += e;
		
		}
	return suma;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CollecionEnteros [miLista=");
		builder.append(miLista);
		builder.append("]");
		return builder.toString();
	}

	


	
	
}
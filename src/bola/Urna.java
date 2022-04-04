package bola;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Urna {
List<Bola> bolas;

public Urna() {
	bolas = new ArrayList<Bola>();
}

public void meterBola(Bola b) {
	bolas.add(b);
}

public Bola sacarBola() throws Exception {
	if(bolas.isEmpty()) {
		throw new Exception("Sus. Urna vacía");
	} else {
		return bolas.get(obtenerPosicionAleatoria(bolas.size()));
	}	
}
	
private int obtenerPosicionAleatoria(int hasta) {
	int posicion =(int)( Math.random() * hasta + 1);
	return posicion;
	
}

public int cuantasBlancas() {
	int contador = 0;
	for(Bola u : bolas) {
		if(u.getColor() == Color.BLANCO) {
			contador++;
		}
	}
	return contador;
}

public int cuantasNegras() {
	int contador = 0;
	for(int i = 0; i < bolas.size(); i++) {
		if(bolas.get(i).getColor() == Color.NEGRO){
			contador++;
		}
	}
	return contador;
}

public void mostrarUrna() {
StringBuilder resultado = new StringBuilder();
resultado.append("Urna:" + "\n");
Iterator<Bola> it = bolas.iterator();
	
	while(it.hasNext()) {
		resultado.append(it.next().toString() + "\n");
		
		}
	
	System.out.println(resultado.toString());
	}



public void borrarBlancas() {
	Iterator<Bola> it = bolas.iterator();
	
	while(it.hasNext()) {
		Bola b = it.next();
		if(b.getColor() == Color.BLANCO) {
			it.remove();
		}
	}
}
}


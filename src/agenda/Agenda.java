package agenda;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Agenda {
	private List<String> notas;
	private Set<Asignatura> asignaturas;
	
/*** Constructor*/
public Agenda(){
	notas = new ArrayList<String>();
	asignaturas = new TreeSet<Asignatura>();
}
	public void añadirNota(String nota){
		notas.add(nota);
		}
	
	public void añadirAsignatura(Asignatura asignatura) {
		asignaturas.add(asignatura);
	}
	
	public int numeroNotas() {
		return notas.size();
		}
	
	public int numeroAsignaturas() {
		return asignaturas.size();
	}
	
	public void  mostrarNota(int numeroNota){
		if (numeroNota >= 0 && numeroNota <numeroNotas()) {
			System.out.println((numeroNota + 1) + " " + notas.get(numeroNota));
			}else {
				System.out.println("Indice incorrecto");
			}
						 
	}
	
	
	public void mostrarAsignatura() {
		for(Asignatura a : asignaturas) {
			System.out.println(a);
		}
	}
	
public void borrarNota(int numeroNota) {
{if (numeroNota >= 0 && numeroNota < numeroNotas()) {
	notas.remove(numeroNota);
	} else {
		System.out.println("Indice incorrecto, " +" el índice máximo es " +  (notas.size() -1));
		}
}
}



	public void listarNotas() {
		int cuantas = notas.size();
		int indice = 0;
		while (indice < cuantas) {
			System.out.println((indice + 1) + " " + notas.get(indice));
			indice++;
		}
	}
		

public void listarNotasConIterator(){
	Iterator<String> it = notas.iterator();        
while (it.hasNext()){
	String nota = it.next();
	System.out.println(nota);}}

}



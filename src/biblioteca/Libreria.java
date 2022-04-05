package biblioteca;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Libreria {
	List<Libro> libros;
	private String nombre;
	
	
public Libreria() {
	libros = new ArrayList<Libro>();
}

public String getNombre() {
	return nombre;
}


public int cantidadLibros() {
	return libros.size();
}

public void anadirLibro(Libro l) {
	libros.add(l);
}


public String buscarLibro(String titulo) {
	Iterator<Libro> it = libros.iterator();
	StringBuilder resultado = new StringBuilder();
	while(it.hasNext()) {
		Libro i = it.next();
		if(i.getTitulo().equals(titulo)) {
		resultado.append(titulo);
		}
	}
	return resultado.toString();
}


public boolean buscarAutor(String autor) {
	boolean estaAutor = false;
	Iterator<Libro> it = libros.iterator();
	while(it.hasNext()) {
		Libro i = it.next();
		if(i.getAutor().equals(autor)) {
			estaAutor = true;
		}
		
	}
	return estaAutor;
}

public void borrarLibro(String autor) {
	int i = 0;
	while(i < libros.size()) {
		if(libros.get(i).getAutor().equals(autor)) {
			i--;
		} else {
			i++;
		}
		
	}
}

public String relacionLibros() {
	StringBuilder resultado = new StringBuilder();
	for(Libro l : libros) {
		resultado.append(l);
	}
	
return resultado.toString();
}

public String prestarDeterminado(String titulo) {
	StringBuilder resultado = new StringBuilder();
	if(buscarLibro(titulo).equals(null)) {
		resultado.append("nO tA");
	}
	
	for(Libro l : libros) {
		if(l.getTitulo().equals(titulo) && l.getEstadoLibro().equals(Estado.PRESTADO)) {
			resultado.append("El libro está prestado");
		} else if(l.getTitulo().equals(titulo) && l.getEstadoLibro().equals(Estado.NOPRESTADO)) {
			l.prestar();
			resultado.append("El libro ha sido prestado");
		}
	}
	return resultado.toString();

}
}

	
	
	
	


package biblioteca;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Libreria {
	List<Libro> libros;
	private String nombre;
	
	
public Libreria(int tamañoLibros, String nombre) {
	libros = new ArrayList<Libro>(tamañoLibros);
	this.nombre = nombre;
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


public Libro buscarLibro(String titulo) {
	Libro auxiliar = null;
	Iterator<Libro> it = libros.iterator();
	while(it.hasNext()) {
		Libro i = it.next();
		if(i.getTitulo().equals(titulo)) {
		auxiliar = i;
		}
	}
	return auxiliar;
	
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
			libros.remove(i);
			if(i == 0) {
				break;
			}
			i--;
		} else {
			i++;
		}
		
	}
}

public String relacionLibros() {
	StringBuilder resultado = new StringBuilder();
	for(Libro l : libros) {
		resultado.append(l.toString());
		resultado.append("\n");
	}
	
return resultado.toString();

}

public String prestarDeterminado(String titulo) throws Exception {
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

	
	
	
	


package biblioteca;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Libro {
	private String titulo;
	private String autor;
	private int numPaginas;
	private Estado estadoLibro;
	private String fechaPrestamo;

	public Libro(String titulo, String autor, int numPaginas, Estado estadoLibro) {
		this.titulo = titulo;
		this.autor = autor;
		this.numPaginas = numPaginas;
		this.estadoLibro = estadoLibro;
	}

	public String getTitulo() {
		return titulo;
	}


	public String getAutor() {
		return autor;
	}

	public int getNumPaginas() {
		return numPaginas;
	}

	public Estado getEstadoLibro() {
		return estadoLibro;
	}

	public void prestar() {
		this.estadoLibro = Estado.PRESTADO;
		this.fechaPrestamo = obtenerFechaPrestamo();
		
	}
	
	public void devolver() {
		this.estadoLibro = Estado.NOPRESTADO;
	}
	
	public boolean estaPrestado() {
		boolean prestado = false;
		if(this.estadoLibro.equals(Estado.PRESTADO)) {
		prestado = true;
		}
		return prestado;
	}
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Libro [titulo=");
		builder.append(titulo);
		builder.append(", autor=");
		builder.append(autor);
		builder.append(", numPaginas=");
		builder.append(numPaginas);
		builder.append(", estadoLibro=");
		builder.append(estadoLibro);
		builder.append(", fecha=");
		builder.append(obtenerFechaPrestamo());
		builder.append("]");
		return builder.toString();
	}

	public String obtenerFechaPrestamo() {
		LocalDate fecha = LocalDate.now();
		 DateTimeFormatter formateador = DateTimeFormatter.ofPattern("yyyy MM dd");
		  String f = fecha.format(formateador);
		return f;
	}

	
	
}
		

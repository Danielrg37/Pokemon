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

	public void prestar() throws Exception {
		
		if(this.estadoLibro.equals(Estado.PRESTADO)) {
			throw new Exception("El libro ya se encuentra prestado xd");
		} else {
			this.estadoLibro = Estado.PRESTADO;
			this.fechaPrestamo = obtenerFechaPrestamo();
			
		}
		
	}
	
	public void devolver() throws Exception {
		if(this.estadoLibro.equals(Estado.NOPRESTADO)) {
			throw new Exception("El libro no está prestado");
		} else {
			this.estadoLibro = Estado.NOPRESTADO;
			this.fechaPrestamo = obtenerFechaPrestamo();
			
		}
		
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
		builder.append("Titulo=");
		builder.append(titulo + "\n");
		builder.append("Autor=");
		builder.append(autor + "\n");
		builder.append("Num de Paginas=");
		builder.append(numPaginas + "\n");
		builder.append("EstadoLibro=");
		builder.append(estadoLibro + "\n");
		builder.append("Fecha=");
		builder.append(obtenerFechaPrestamo());
		builder.append("\n");
		return builder.toString();
	}

	public String obtenerFechaPrestamo() {
		LocalDate fecha = LocalDate.now();
		 DateTimeFormatter formateador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		  String f = fecha.format(formateador);
		return f;
	}

	
	
}
		

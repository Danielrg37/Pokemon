package agenda;

import java.util.Objects;

public class Asignatura implements Comparable<Asignatura>{
	private String nombre;
	private int numeroHoras;
	
	
	
	public Asignatura(String nombre, int numeroHoras) {
		this.nombre = nombre;
		this.numeroHoras = numeroHoras;
	}
	
	


	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getNumeroHoras() {
		return numeroHoras;
	}
	public void setNumeroHoras(int numeroHoras) {
		this.numeroHoras = numeroHoras;
	}




	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Asignatura [nombre=");
		builder.append(nombre);
		builder.append(", numeroHoras=");
		builder.append(numeroHoras);
		builder.append("]");
		return builder.toString();
	}





	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Asignatura))
			return false;
		Asignatura other = (Asignatura) obj;
		return Objects.equals(nombre, other.nombre) && numeroHoras == other.numeroHoras;
	}




	@Override
	public int compareTo(Asignatura o) {
		return this.nombre.compareTo(o.nombre);
	}







	
	
	
	
}

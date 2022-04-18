package prueba;

import java.util.Objects;

public class Estudiante implements Comparable {
	
	private String nombre;
	private int nota;
	
	public Estudiante(String nombre, int i) {
	this.nombre = nombre;
	this.nota = i;
	}

	@Override
	public int compareTo(Object arg0) {
		// TODO Apéndice de método generado automáticamente
		return 0;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nombre, nota);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Estudiante))
			return false;
		Estudiante other = (Estudiante) obj;
		return Objects.equals(nombre, other.nombre) && nota == other.nota;
	}
	
	
}

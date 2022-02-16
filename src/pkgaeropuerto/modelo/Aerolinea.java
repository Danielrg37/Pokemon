package pkgaeropuerto.modelo;

import java.util.ArrayList;
import java.util.List;


public class Aerolinea implements Comparable<Aerolinea>{
	private String nombre;
	private List<Vuelo> vuelos = new ArrayList<Vuelo>();
	
	
	public Aerolinea(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public List<Vuelo> getVuelos() {
		return vuelos;
	}
	public void setVuelos(List<Vuelo> vuelos) {
		this.vuelos = vuelos;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Aerolinea))
			return false;
		Aerolinea aerolinea = (Aerolinea) obj;
		return nombre.equals(aerolinea.nombre);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("\n" + nombre + "\n==========\n");
		
		for(Vuelo v: this.vuelos) {
			sb.append(v.toString());
	}
		return sb.toString();
	
	
}

	@Override
	public int compareTo(Aerolinea o) {
		return this.nombre.compareTo(o.nombre);
	}

}
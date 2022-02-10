package pkgaeropuerto.modelo;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Aerolinea implements Comparable<Aerolinea> {
	private String nombre;
	private List<Vuelo> vuelos;
	
	public Aerolinea(String nombre, Vuelo vuelo){
		this.nombre = nombre;
		this.vuelos = new ArrayList<Vuelo>();
		vuelos.add(vuelo);
	}

	
	public Aerolinea(String nombre) {
		this.nombre = nombre;
		this.vuelos = new ArrayList<Vuelo>();
	}
		
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public List<Vuelo> getListaVuelos() {
		return vuelos;
	}


	public void setVuelos(List<Vuelo> vuelos) {
		this.vuelos = vuelos;
	}
	
	public void addVuelo(Vuelo vuelo) {
		vuelos.add(vuelo);
	}


	@Override
	public int compareTo(Aerolinea o) {
		return this.nombre.compareTo(o.nombre);
	}
}
package aeropuerto2_lapesadilla;

import java.util.ArrayList;
import java.util.Collections;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;


public class Aeropuerto {
private Map<String, ArrayList<Vuelo>> Vuelos;


	public Aeropuerto() {
	Vuelos = new TreeMap<>();
	
	}

	/**
	 * A�ade un vuelo a la aerolinea correspondiente solo en el caso de que el vuelo
	 * no estuviese ya introducido, si la aerolinea no existiese se a�ade tanto la
	 * aerolinea como el vuelo.
	 */
	public void addVuelo(String aerolinea, Vuelo vuelo) {
		for(String a : Vuelos.keySet()) {
			if(a.equals(aerolinea)) {
			Vuelos.get(a).add(vuelo);			
			}
		}
			
			
		
		ArrayList<Vuelo> tmp2 = new ArrayList<Vuelo>();
		tmp2.add(vuelo);
		Vuelos.put(aerolinea, tmp2);
	}


	/**
	 * Imprime los vuelos por cada aerolinea ordenados por destino, tanto aerolineas
	 * como vuelos estaran ordenados alfabeticamente (Ver resultados de ejecucion)
	 */
	public void ordenAerolineasAlfabetico() {
	System.out.println(Vuelos);
	}
	

	/**
	 * Muestra los vuelos regulares de la aerolinea pasada por parametro, se
	 * visualizaran de mayor a menor segun el numero de plazas
	 * 
	 * @param aerolinea
	 *            Aerolinea de la que se imprimiran los vuelos regulares
	 */
	public void regularPorPlazas(String aerolinea) {
	
		Set<Entry<String, ArrayList<Vuelo>>> entradas = this.Vuelos.entrySet();

		for(Entry<String, ArrayList<Vuelo>> e : entradas){
			for(Vuelo v : e.getValue()) {
			if(v instanceof Regular) {
				System.out.println(e.getValue());
			}
			}
		}	
	}
			

	/**
	 * Devuelve una lista con vuelos regulares con plazas libres
	 * 
	 * @return aerolina Aerolina del avion charter con m�s capacidad
	 */
	public List<Vuelo> plazasLibres() {
		List<Vuelo> regulares = new ArrayList<Vuelo>();
		
		Set<Entry<String, ArrayList<Vuelo>>> entradas = this.Vuelos.entrySet();

		for(Entry<String, ArrayList<Vuelo>> e : entradas){
			for(Vuelo v : e.getValue()) {
				if(v instanceof Regular && ((Regular) v).getPlazaslibres() >= 1) {
					regulares.add((Regular) v);
				}
			}
			}
		
		
		
			Collections.sort(regulares, new ComparadorPlazas());
			Collections.reverse(regulares);
			return regulares;
				
}
		
	

	

	/**
	 * Muestra el numero de vuelos de cada aerolinea que llegan al destino pasado
	 * por parametro, ver resultados de ejecucion
	 * 
	 * @param destino
	 *            Destino del que se debe sacar la estadistica
	 */
	public void estadisticaDestino(String destino) {
	Set<Entry<String, ArrayList<Vuelo>>> entradas = this.Vuelos.entrySet();
	int contador = 0;
	for(Entry<String, ArrayList<Vuelo>> e : entradas) {
		for(Vuelo v : e.getValue()) {
			if(v.getDestino().equals(destino)) {
				contador++;
			}
		}
		System.out.printf("\nAerolinea %S cuenta con el %d n�mero de vuelos al destino %S", e.getKey(), contador, destino);
	}		
	}

	/**
	 * Borra los vuelos reservados por una empresa y devuelve el numero de vuelos
	 * borrados, utiliza un conjunto de entradas
	 * 
	 * @param nifEmpresa
	 * @return numero de vuelos borrados
	 */
	public int borrarVuelosEmpresa(String nifEmpresa) {
		Set<Entry<String, ArrayList<Vuelo>>> entradas = this.Vuelos.entrySet();
		for(Entry<String, ArrayList<Vuelo>> e : entradas) {
			
			}
		return 0;
		}


	/**
	 * Imprime la lista de vuelos pasada por parametro
	 * 
	 * @param listaVuelos
	 */
	public void imprimirListaVuelos(List<Vuelo> listaVuelos) {
		for(Vuelo i : listaVuelos) {
			System.out.println(i.toString());
		}
	}
	

	/**
	 * Rellena el mapa haciendo uso de un fichero de texto
	 */
	public void leerFicheroCursos() {
		Scanner entrada = null;
		try {
			entrada = new Scanner(this.getClass().getResourceAsStream("aviones.txt"));
			while (entrada.hasNextLine()) {
				String linea = entrada.nextLine();
				int pos = linea.indexOf(":");
				String aerolinea = linea.substring(0, pos);
				String[] vuelo = linea.substring(pos + 1).split(":");
				String destino = vuelo[1];
				String avion = vuelo[2];
				int plazas = Integer.parseInt(vuelo[3].trim());
				int plazasLibres = Integer.parseInt(vuelo[4].trim());
				if (vuelo[0].equals("R")) {
					this.addVuelo(aerolinea, new Regular(destino, avion, plazas, plazasLibres));
				}
				else {
					String nifEmpresa = vuelo[4];
					this.addVuelo(aerolinea, new Charter(destino, avion, plazas, nifEmpresa));
				}
			}

		}

		finally {
			try {
				entrada.close();
			}
			catch (NullPointerException e) {
				System.out.println("Error en IO , no se ha creado el fichero");
			}
		}

	}

}

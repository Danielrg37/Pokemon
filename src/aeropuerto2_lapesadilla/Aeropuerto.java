package aeropuerto2_lapesadilla;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.HashMap;
import java.util.Iterator;


public class Aeropuerto {
private Map<String, ArrayList<Vuelo>> vuelos;


	public Aeropuerto() {
	vuelos = new HashMap<>();
	
	}

	/**
	 * Añade un vuelo a la aerolinea correspondiente solo en el caso de que el vuelo
	 * no estuviese ya introducido, si la aerolinea no existiese se añade tanto la
	 * aerolinea como el vuelo.
	 */
	public void addVuelo(String aerolinea, Vuelo vuelo) {
		
		
		for(String clave : vuelos.keySet()) {
		if(clave.equals(aerolinea)) {
			vuelos.get(clave).add(vuelo);
		}
		}
		
	Set<String> claves = vuelos.keySet();
	if(!claves.contains(aerolinea)) {
		ArrayList<Vuelo> nuevaLista = new ArrayList<Vuelo>();
		nuevaLista.add(vuelo);
		vuelos.put(aerolinea, nuevaLista);
	}
	}

	/**
	 * Imprime los vuelos por cada aerolinea ordenados por destino, tanto aerolineas
	 * como vuelos estaran ordenados alfabeticamente (Ver resultados de ejecucion)
	 */
	public void ordenAerolineasAlfabetico() {
		
		for(String clave : vuelos.keySet()) {
		System.out.println(vuelos.get(clave));
		}
		
		}


	

	/**
	 * Muestra los vuelos regulares de la aerolinea pasada por parametro, se
	 * visualizaran de mayor a menor segun el numero de plazas
	 * 
	 * @param aerolinea
	 *            Aerolinea de la que se imprimiran los vuelos regulares
	 */
	public void regularPorPlazas(String aerolinea) {
	
		
		List<Vuelo> regulares = new ArrayList<Vuelo>();
		
		for(String clave : vuelos.keySet()) {
			if(clave.equals(aerolinea)) {
				for(Vuelo v : vuelos.get(clave)) {
					if(v instanceof Regular) {
						regulares.add(v);
					}
				}
			}
		}
		Collections.sort(regulares, new ComparadorPlazas());
		Collections.reverse(regulares);
		System.out.println(regulares);
	}

	/**
	 * Devuelve una lista con vuelos regulares con plazas libres
	 * 
	 * @return aerolina Aerolina del avion charter con más capacidad
	 */
	public List<Vuelo> plazasLibres() {
		List<Vuelo> regulares = new ArrayList<Vuelo>();
		
		for(String clave : vuelos.keySet()) {
			for(Vuelo v : vuelos.get(clave)) {
				if(v instanceof Regular) {
					if(((Regular) v).getPlazaslibres() >= 1) {
						regulares.add(v);
					}
				}
			}
		}
		
		
			
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
	
	for(String clave : vuelos.keySet()) {
		int contador = 0;
		int contadorViajesTotal = 0;
		for(Vuelo v : vuelos.get(clave)) {
			
			contadorViajesTotal++;
			if(v.getDestino().equals(destino)) {
				contador++;
			}
		}
	
		System.out.printf("\nAerolinea %S cuenta con %d de %d número de vuelos al destino %S", clave, contador, contadorViajesTotal, destino);
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
		int contador = 0;
Set<Entry<String, ArrayList<Vuelo>>> entradas = this.vuelos.entrySet();
		
		for(Entry<String, ArrayList<Vuelo>> e : entradas){
			ArrayList<Vuelo> tmp = e.getValue();
			Iterator<Vuelo> it = tmp.iterator();
			while(it.hasNext()) {
				Vuelo v = it.next();
				if(v instanceof Charter) {
					if(((Charter) v).getNif().equals(nifEmpresa)) {
					it.remove();
					contador++;
				}
			
			vuelos.put(e.getKey(), tmp);
		}
		}
		}
		return contador;
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

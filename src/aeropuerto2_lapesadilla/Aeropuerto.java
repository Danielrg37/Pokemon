package aeropuerto2_lapesadilla;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Aeropuerto {

	private Map<String, Vuelo> vuelos;

	public Aeropuerto() {
		vuelos = new HashMap<String, Vuelo>();
	}

	/**
	 * A�ade un vuelo a la aerolinea correspondiente solo en el caso de que el vuelo
	 * no estuviese ya introducido, si la aerolinea no existiese se a�ade tanto la
	 * aerolinea como el vuelo.
	 */
	public void addVuelo(String aerolinea, Vuelo vuelo) {
		Set<String> conjuntoAerolineas = vuelos.keySet();
		Iterator<String> it = con
		if(vuelos.containsKey(aerolinea)) {
			
		} else {
			vuelos.put(aerolinea, vuelo);
		}

		
	
	}

	/**
	 * Imprime los vuelos por cada aerolinea ordenados por destino, tanto aerolineas
	 * como vuelos estaran ordenados alfabeticamente (Ver resultados de ejecucion)
	 */
	public void ordenAerolineasAlfabetico() {
		TreeSet<Vuelo> ordenarVuelos = new TreeSet<Vuelo>();
		TreeSet<String> ordenarAerolineas = new TreeSet<String>();
		
			
		}
	

	/**
	 * Muestra los vuelos regulares de la aerolinea pasada por parametro, se
	 * visualizaran de mayor a menor segun el numero de plazas
	 * 
	 * @param aerolinea
	 *            Aerolinea de la que se imprimiran los vuelos regulares
	 */
	public void regularPorPlazas(String aerolinea) {
		Set<Entry<String, Vuelo>> vuelos = this.vuelos.entrySet();
		
		for(Entry<String, Vuelo> e : vuelos) {
			if(e instanceof Regular) {
				
			}
		}
	}

	/**
	 * Devuelve una lista con vuelos regulares con plazas libres
	 * 
	 * @return aerolina Aerolina del avion charter con m�s capacidad
	 */
	public String plazasLibres() {
		StringBuilder resultado = new StringBuilder();
		Set<Entry<String, Vuelo>> entradas = this.vuelos.entrySet();
		
		for(Entry<String, Vuelo> e : entradas) {
			if(e instanceof Regular) {
				if(((Regular) e).getPlazaslibres() >= 1) {
					resultado.append(e);
				}
			}
		}
		return resultado.toString();
	}

	/**
	 * Muestra el numero de vuelos de cada aerolinea que llegan al destino pasado
	 * por parametro, ver resultados de ejecucion
	 * 
	 * @param destino
	 *            Destino del que se debe sacar la estadistica
	 */
	public void estadisticaDestino(String destino) {
		Set<Entry<String, Vuelo>> entradas = this.vuelos.entrySet();
		
		for(Entry<String, Vuelo> e : entradas) {
			
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
		int borrados = 0;
	
		vuelos.remove(nifEmpresa);
		return 0;
	}

	/**
	 * Imprime la lista de vuelos pasada por parametro
	 * 
	 * @param listaVuelos
	 */
	public void imprimirListaVuelos(List<Vuelo> listaVuelos) {

	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Aeropuerto [vuelos=");
		builder.append(vuelos);
		builder.append("]");
		return builder.toString();
	}

	/**
	 * Rellena el mapa haciendo uso de un fichero de texto
	 */
	public void leerFicheroCursos() {
		Scanner entrada = null;
		try {
			entrada = new Scanner(this.getClass().getResourceAsStream("/aviones.txt"));
			while (entrada.hasNextLine()) {
				String linea = entrada.nextLine();
				int pos = linea.indexOf(":");
				String aerolinea = linea.substring(0, pos);
				String[] vuelo = linea.substring(pos + 1).split(":");
				String destino = vuelo[1];
				String avion = vuelo[2];
				int plazas = Integer.parseInt(vuelo[3].trim());
				if (vuelo[0].equals("R")) {
					int plazasLibres = Integer.parseInt(vuelo[4].trim());
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

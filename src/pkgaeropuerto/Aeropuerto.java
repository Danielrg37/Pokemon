package pkgaeropuerto;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Aeropuerto {

	private List<Aerolinea> Aerolines;

	public Aeropuerto() {
		Aerolines = new ArrayList<Aerolinea>();
	}

	/**
	 * Añade un vuelo a la aerolinea correspondiente solo en el caso de que el vuelo
	 * no estuviese ya introducido, si la aerolinea no existiese se añade tanto la
	 * aerolinea como el vuelo.
	 */
	public void addVuelo(String aerolinea, Vuelo vuelo) {
		 for(Aerolinea x : Aerolines) {
			 if(x.getNombre().equals(aerolinea)) {
				 x.addVuelo(vuelo);
			 
		 }
	}
		 }
	
	/**
	 * Imprime los vuelos por cada aerolinea ordenados por destino, tanto aerolineas
	 * como vuelos estaran ordenados alfabeticamente (Ver resultados de ejecucion)
	 */
	public void ordenAerolineasAlfabetico() {
		Collections.sort(Aerolines); 
		for (Aerolinea a : Aerolines) {
			System.out.println(a.getNombre());
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
		List<Vuelo> tmp = null;
		List<Regular> regular = new ArrayList<Regular>();
		 for(Aerolinea x : Aerolines) {
			 if(x.getNombre().equals(aerolinea)) {
				tmp = x.getListaVuelos();
			 }
		for(Vuelo v : tmp) {
			if(v instanceof Regular) regular.add((Regular)v);
		}
		 }
		 Collections.sort(regular,new Comparator<Regular>() {

				public int compare(Regular v1 , Regular v2) {
					int res;
					if(v1.getPlazasLibres() > v2.getPlazasLibres()) res = 1;
					else if(v1.getPlazasLibres() < v2.getPlazasLibres()) res = -1;
					else res = 0;
					return res;
				}
			});
			
			for(Regular r: regular)System.out.println(r.toString());
		}
	

	/**
	 * Devuelve una lista con vuelos regulares con plazas libres
	 * 
	 * @return aerolina Aerolina del avion charter con más capacidad
	 */
	public List<Vuelo> plazasLibres() {
		List<Vuelo> tmp = null;
		List<Regular> regular = new ArrayList<Regular>();
		 for(Aerolinea x : Aerolines) {
			 if(x.getNombre().equals(aerolinea)) {
				tmp = x.getListaVuelos();
			 }
		for(Vuelo v : tmp) {
			if(v instanceof Regular) regular.add((Regular)v);
		}

	/**
	 * Muestra el numero de vuelos de cada aerolinea que llegan al destino pasado
	 * por parametro, ver resultados de ejecucion
	 * 
	 * @param destino
	 *            Destino del que se debe sacar la estadistica
	 */
	public void estadisticaDestino(String destino) {
		 for(Aerolinea x : Aerolines) {
			 int numVecesDestino = 0;
			 List<Vuelo> vuelos = x.getListaVuelos();
			 for(Vuelo v : vuelos) {
				 if(v.getDestino().equals(destino)) 
			   numVecesDestino++;
			 }
		System.out.printf("\nAerolinea %S cuenta con el %d número de vuelos al destino %S", x.getNombre(), numVecesDestino, destino);
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
		int numeroBorrados = 0;
		 for(Aerolinea x : Aerolines) {
			 
	}
		return numeroBorrados;

	}

	/**
	 * Imprime la lista de vuelos pasada por parametro
	 * 
	 * @param listaVuelos
	 */
	public void imprimirListaVuelos(List<Vuelo> listaVuelos) {
		
	}

	/**
	 * Represetación textual del mapa tal y como se muestra en el enunciado
	 */
	public String toString() {

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
					this.addVuelo(aerolinea, new (destino, avion, plazas, nifEmpresa));
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

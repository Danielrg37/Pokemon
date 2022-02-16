package pkgaeropuerto.modelo;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

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
		int pos = this.Aerolines.indexOf(new Aerolinea(aerolinea)); // Dice posicion aerolinea
		
		if(pos < 0) { //Aerolinea no existe
			Aerolinea a = new Aerolinea(aerolinea);
			List<Vuelo> vuelos = new ArrayList<Vuelo>();
			vuelos.add(vuelo);
			a.setVuelos(vuelos);
			this.Aerolines.add(a);
		} else {
			List<Vuelo> vuelos = this.Aerolines.get(pos).getVuelos();
			if(!vuelos.contains(vuelo)) {
				vuelos.add(vuelo);
			}
			this.Aerolines.get(pos).setVuelos(vuelos);
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
	}

	/**
	 * Devuelve una lista con vuelos regulares con plazas libres
	 * 
	 * @return aerolina Aerolina del avion charter con más capacidad
	 */
	public List<Vuelo> plazasLibres() {
		List<Vuelo> PlazasLib = new ArrayList<Vuelo>();
		for (Aerolinea a : Aerolines) {
			List<Vuelo> v = a.getVuelos();
			for(Vuelo x : v) {
				if(v instanceof Regular) { 
					if(((Regular)x).getPlazaslibres() > 0) 
					PlazasLib.add(x);
				}
			}
	}
		return PlazasLib;
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
			 List<Vuelo> vuelos = x.getVuelos();
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
		int Borrados = 0;
		for(Aerolinea i : Aerolines) {
			List<Vuelo> vuelos = i.getVuelos();
			Iterator<Vuelo> it = vuelos.iterator();
			while(it.hasNext()) {
				Vuelo v = it.next();
				if(v instanceof Charter && ((Charter) v).getNif().equals(nifEmpresa)) {
					it.remove();;
					Borrados++;
				}
			}
			i.setVuelos(vuelos);
		}
		return Borrados;
	}
	
	
	/**
	 * Ordenar vuelos por precio
	 */
	public void imprimirVuelosPorAerolineaOrdenadosPorPrecio(String aerolinea) {
		int pos = this.Aerolines.indexOf(new Aerolinea(aerolinea)); // Le pasas la aerolinea
		
		if(pos >= 0) { // si existe
			Aerolinea a = this.Aerolines.get(pos);
			List<Vuelo> precio = new ArrayList<Vuelo>();
			for(Vuelo v : a.getVuelos()) {
					precio.add(v);
			}
		
			Collections.sort(precio, new Comparator<Vuelo>() {
				public int compare(Vuelo v1, Vuelo v2) {
					return (int) (v1.calcularPrecioFinal() - v2.calcularPrecioFinal());
				}
			});
			imprimirListaVuelos(precio);
		} else {
			System.out.println("La aerolinea" + aerolinea + "no existe");
		}
	}
	
	/**
	 * Represetación textual del mapa tal y como se muestra en el enunciado
	 */

	/**
	 * Imprime la lista de vuelos pasada por parametro
	 * 
	 * @param listaVuelos
	 */
	public void imprimirListaVuelos(List<Vuelo> listaVuelos) {
		for(Vuelo v : listaVuelos) {
			System.out.println(v);
		}
	}


	/**
	 * Represetación textual del mapa tal y como se muestra en el enunciado
	 */
	public String toString() {
			StringBuilder sb = new StringBuilder();
			for(Aerolinea a: this.Aerolines) {
				sb.append(a);
			}
			return sb.toString();
			
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
				double precio = Integer.parseInt(vuelo[5].trim());
				if (vuelo[0].equals("R")) {
					this.addVuelo(aerolinea, new Regular(destino, avion, plazas, precio, plazasLibres));
				}
				else {
					String nifEmpresa = vuelo[4];
					this.addVuelo(aerolinea, new Charter(destino, avion, plazas, precio, nifEmpresa));
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

package Ej11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

	/**
	 * La clase mantiene una lista de nombres
	 * en orden l�xicogr�fico  
	 * 
	 */

import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class ListaNombres {
	
private String[] lista;
private int pos;

	/**
	 * Constructor de la clase ListaNombres
	 */
	public ListaNombres(int n) {
		lista = new String[n];
	}

	/**
	 * @return true si la lista est� vac�a
	 */
	public boolean listaVacia() {
		boolean vacia = true;
		for (int i = 0; i < lista.length; i++) {
			if (lista[i] != null) {
				vacia = false;
			}
		}
		return vacia;

	}

	/**
	 * 
	 * @return true si la lista est� llena
	 */
	public boolean listaLlena() {
		boolean llena = true;
		for (int i = 0; i < lista.length; i++) {
			if (lista[i] == null) {
				llena = false;
			}
		}
		return llena;

	}

	/**
	 * Inserta un nombre en la lista �nicamente si no est� y la lista no est� llena.
	 * La inserci�n se hace de tal manera que el nombre queda colocado en el lugar
	 * que le corresponde manteniendo el orden de la lista (no se utiliza ning�n
	 * algoritmo de ordenaci�n) Importan may�sculas y min�sculas
	 * 
	 * @param nombre el nombre a insertar
	 * @return true si la inserci�n se hace con �xito
	 *
	 */
	public boolean insertarNombre(String nombre) {
		boolean insercion = false;

	}

	/**
	 * Busca un nombre en la lista Puesto que la lista est� en todo momento ordenada
	 * se hace una b�squeda binaria
	 * 
	 * @param nombre el nombre a buscar
	 * @return true si ya existe el nombre en la lista
	 * 
	 */
	private boolean estaNombre(String nombre) {
		boolean esta = false;
		int pos = Arrays.binarySearch(lista, nombre);
		if (pos > 0) {
			esta = true;
		}
		return esta;

	}

	/**
	 * Busca y devuelve el nombre de mayor longitud en la lista. Si hay varios
	 * devuelve el primero encontrado Si la lista est� vac�a devuelve null
	 * 
	 * @return el nombre m�s largo
	 * 
	 */
	public String nombreMasLargo() {
		String nombreLargo = null;
		int maximo = 0;
		if (listaVacia() == true) {
			return null;
		}

		for (int i = 0; i < lista.length; i++) {
			if (lista[i].length() > maximo) {
				maximo = lista[i].length();
				nombreLargo = lista[i];
			}
		}
		return nombreLargo;

	}

	/**
	 * Borra de la lista los nombres que empiezan por una letra determinada (s�
	 * importan may�sculas y min�sculas) No es lo mismo borrarLetra('A') que
	 * borrarLetra('a')
	 *
	 * @param letra la letra por la que han de empezar los nombres
	 * 
	 */
	public void borrarLetra(char letra) {
		for(int i = 0; i < lista.length; i++) {
			
			if(lista[i].charAt(0) == letra) {
				lista[i] = null;
			}
		}
	}
	

	/**
	 * Borra un nombre de la posici�n indicada
	 * 
	 *
	 * @param p posici�n del nombre a borrar
	 * 
	 */
	private void borrarDePosicion(int p) {
		lista[p] = null;
	}

	/**
	 * Cuenta cu�ntos nombres empiezan por una determinada cadena sin importar si es
	 * may�scula o min�scula
	 *
	 * @param la cadena de comienzo
	 * @return la cantidad de nombres calculados
	 */
	public int empiezanPor(String inicio) {
		int contador = 0;
		for(int i = 0; i < lista.length; i++) {
			if(lista[i].startsWith(inicio)) {
				contador++;
			}
		}
		return contador;
	}

	/**
	 * 
	 * Devuelve un array con los nombres que empiezan por una determinada letra sin
	 * importar si es may�scula o min�scula
	 * 
	 * @param la letra de comienzo
	 * @return la cantidad de nombres encontrados con esa letra
	 */
	public String[] empiezanPorLetra(char letra) {
		List<String> nombres = new ArrayList<String>();
		String[] resultado = new String[lista.length];

		if (Character.isUpperCase(letra)) {
			char miniscula = Character.toLowerCase(letra);
			for (int i = 0; i < lista.length; i++) {
				if (lista[i].charAt(0) == letra && lista[i].charAt(0) == miniscula) {
					nombres.add(lista[i]);
				}
			}
		}

		if (Character.isUpperCase(letra)) {
			char mayuscula = Character.toUpperCase(letra);
			for (int i = 0; i < lista.length; i++) {
				if (lista[i].charAt(0) == letra && lista[i].charAt(0) == mayuscula) {
					nombres.add(lista[i]);
				}
			}
		}

		resultado = nombres.toArray(resultado);
		return resultado;
	}

	/**
	 * Representaci�n textual de la cadena
	 * 
	 * @return la cadena resultante
	 */
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ListaNombres [lista=");
		builder.append(Arrays.toString(lista));
		builder.append(", pos=");
		builder.append(pos);
		builder.append("]");
		return builder.toString();

	}

	
	/**
	 * Lee de un fichero de texto una serie de nombres con ayuda de un objeto de la
	 * clase Scanner y los almacena en la lista
	 */
	public void cargarDeFichero() {
		try {
			Scanner sc = new Scanner(new File("nombres.txt"));
			while (sc.hasNextLine() && !listaLlena())
				insertarNombre(sc.nextLine());
			sc.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

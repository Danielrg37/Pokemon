package ut7_tarea5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeMap;

public class Main {
	private static String linea = " ";
	private static String[] cadena;
	static TreeMap<String, Integer> mapa =  new TreeMap<String, Integer>(); 

	public static void main(String[] args) throws IOException {

		BufferedReader br = null;
		try {
		
			br = new BufferedReader(new FileReader("archivopsicopata.txt"));
			ArrayList<String> palabras = new ArrayList<>();
			
			while ((linea = br.readLine()) != null) {
			String lineaMinusculas = linea.toLowerCase();
			cadena = lineaMinusculas.split(" ");
			palabras.addAll(Arrays.asList(cadena));
			}
			
			for(String c : palabras) {
				if(mapa.containsKey(c)) {
					mapa.put(c, mapa.get(c) + 1);
				} else {
					mapa.put(c, 1);
				}
			}
			imprimirMapa();
		} finally {

		}
		if (br != null)
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
	}
		
		public static void imprimirMapa() {
			int maximo = 0;
			String palabraMax = null;
		for(String x : mapa.keySet()) {
			System.out.println(x + " " + mapa.get(x));
			if(mapa.get(x) > maximo) {
				palabraMax = x;
				maximo = mapa.get(x);
			}
		}
		System.out.println("Palabras con más ocurrencias:" + "  " + palabraMax + " " + maximo);
		}
		}

				
				
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


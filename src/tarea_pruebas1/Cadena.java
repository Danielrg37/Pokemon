package tarea_pruebas1;


public class Cadena{
	
	public int longitud(String cadena) {
	int longitud = 0;
	for(int i = 0; i < cadena.length(); i++) {
		longitud++;
	}
	return longitud;
	}
	
	public int vocales(String cadena) {
		int vocales = 0;
		for(int i = 0; i < cadena.length(); i++) {
			if(cadena.charAt(i) == 'a' || cadena.charAt(i) == 'e' || cadena.charAt(i) == 'i' || cadena.charAt(i) == 'o' || cadena.charAt(i) == 'u') {
				vocales++;
			}
	}
		return vocales;
	}
	
	public String invertir(String cadena) {
		String resultado;
		
		StringBuilder auxiliar = new StringBuilder(cadena);
		resultado = auxiliar.reverse().toString();
		
		return resultado;
	}
	
	public int contarLetra(String cadena, char caracter) {
		int contador = 0;
		for(int i = 0; i < cadena.length(); i++) {
			if(cadena.charAt(i) == caracter) {
				contador++;
			}
	}
		return contador;
	}
	
	
	
	
	
	
	
	
	
}
package tarea_pruebas1;


public class tarea1{
	
	public int longitud(String cadena) {
	int longitud = 0;
	for(int i = 0; i < cadena.length(); i++)
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
		return 
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
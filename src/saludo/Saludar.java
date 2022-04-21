package saludo;

/**
 * 
 */

/**
 * @author Bad Taste
 * Saludos en diferentes idiomas
 */
public class Saludar {

	/**
	 * Saludos 
	 * @param lenguaje a escoger
	 * @param repeticion (cuantas veces lo repite)
	 * @return saludo (Resultado del saludo)
	 */
	public static String greet_method (int lenguaje, int repeticion) {
		String saludo = "";
		String auxiliar = "";
		
		switch (lenguaje) {
			case 0 : auxiliar = "hola";
					 break;
			case 1 : auxiliar = "hello";
					 break;
			case 2 : auxiliar = "kaixo";
			 		 break;
			 default:
				 	 break;	
		 }
		
		// Repetir saludo
		for (int contador = 0; contador < repeticion; contador++) {
			saludo += auxiliar;
		}
		
		return saludo;
	}
}

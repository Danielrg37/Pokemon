package generadorIp;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class TestIP {
	
	private GeneradorIP prueba;

	@Test
	void testGenerarNumero() {
		this.prueba = new GeneradorIP();
		boolean correcto = true;
		for(int i = 0; i <= 1000; i++) {
			int actual = this.prueba.generarNumero(0, 254);
			assertTrue(actual >= 0 && actual <= 254);
			}
		}
		

	
	@Test
	void testGeneraIp() {
	this.prueba = new GeneradorIP();
	
	String texto = this.prueba.generarCadena();
	String[] numeros = texto.split("\\.");
	
	assertFalse(numeros[0].equals("0")); 
	assertFalse(numeros[numeros.length -1].equals("0"));
	}
	
}

	

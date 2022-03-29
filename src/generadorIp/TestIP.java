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
			if(this.prueba.generarNumero(0, 254) > 255) {
				correcto = false;
			}
		}
		assertEquals(correcto, true, "Error");
	}
	
	@Test
	void testGeneraIp() {
	this.prueba = new GeneradorIP();
	boolean resultado = false;
	
	String texto = this.prueba.generarCadena();
	if(texto.charAt(0) == 0 || texto.charAt(texto.length() - 1) == 0 && texto.charAt(texto.length() - 2) == '.') {
		resultado = true;
	}
	
	assertEquals(resultado, false, "Error con primer o ultimo digito");
	}
	
}

	

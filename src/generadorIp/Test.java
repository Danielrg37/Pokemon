package generadorIp;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import org.junit.Test;





class Test {

	private GeneradorIP prueba;

	@org.junit.jupiter.api.Test
	void testGenerarNumero() {
		boolean mal = false;
		this.prueba = new GeneradorIP();
		for(int i = 0; i < 1000; i++) {
		this.prueba.generarNumero(0, 254);
		if((this.prueba.generarNumero(0, 254) < 255)){
			mal = true;
		}
		}
		assertEquals(mal, false, "Error al generar numeros");
	}
	
	

	@org.junit.jupiter.api.Test
	void testGeneraIp() {
		this.prueba = new GeneradorIP();
	boolean resultado = false;
	
	String texto = this.prueba.generarCadena();
	if(texto.charAt(0) == 0 || texto.charAt(texto.length() - 1) == 0) {
		resultado = true;
	}
	assertEquals(resultado, false, "Error con primer o ultimo digito");
	}
}

	

package generadorIp;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import org.junit.Test;





class Test {

	private GeneradorIP prueba;

	@org.junit.jupiter.api.Test
	void testGenerarNumero() {
		boolean error = false;
		boolean comprobar = true;
		this.prueba = new GeneradorIP();
		for(int i = 0; i < 1000; i++) {
		this.prueba.generarNumero(0, 254);
		if((this.prueba.generarNumero(0, 254) > 255)){
			error = true;
		}
		}
		assertEquals(error, comprobar, "Error al generar numeros");
	}
}

	

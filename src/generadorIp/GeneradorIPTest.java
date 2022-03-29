package generadorIp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;





class GeneradorIpTest {

	private GeneradorIP prueba;

	@Test
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

	

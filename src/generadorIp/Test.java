package generadorIp;


import static org.junit.jupiter.api.Assertions.assertEquals;





class Test {

	private GeneradorIP prueba;

	void testGenerarNumero() {
		this.prueba = new GeneradorIP();
		boolean correcto = true;
		for(int i = 0; i < 1000; i++) {
			if(this.prueba.generarNumero(0, 254) > 255) {
				correcto = false;
			}
		}
		assertEquals(correcto, false, "Error");
	}
	
	


	void testGeneraIp() {
		this.prueba = new GeneradorIP();
	boolean resultado = false;
	
	String texto = this.prueba.generarCadena();
	for(int i = 0; i < 4000; i++) {
	if(texto.charAt(0) == 0 || texto.charAt(texto.length() - 1) == 0) {
		resultado = true;
	}
	}
	assertEquals(resultado, false, "Error con primer o ultimo digito");
	}
}

	

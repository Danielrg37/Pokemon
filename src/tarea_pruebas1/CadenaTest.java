package tarea_pruebas1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CadenaTest {

	private Cadena tarea;

	@Test
	void testlongitud() {
		this.tarea = new Cadena();
		int expected = 5;
		int actual = this.tarea.longitud("Alpine");
	}

	
	@Test
	void testvocales() {
		this.tarea = new Cadena();
		int expected = 2;
		int actual = this.tarea.vocales("Clase");
	}
	
	@Test
	void testinvertir() {
		this.tarea = new Cadena();
		String expected = "aduyA";
		String actual = this.tarea.invertir("Ayuda");
	}
	
	@Test
	void testcontar() {
		this.tarea = new Cadena();
		int expected = 1;
		int actual = this.tarea.contarLetra("Xocas", 'o');
	}
}


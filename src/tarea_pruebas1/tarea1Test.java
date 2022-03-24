package tarea_pruebas1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class tarea1Test {

	private tarea1 tarea;

	@Test
	void testlongitud() {
		this.tarea = new tarea1();
		int expected = 5;
		int actual = this.tarea.longitud("Pacos");
	}

	
	@Test
	void testvocales() {
		this.tarea = new tarea1();
		int expected = 2;
		int actual = this.tarea.vocales("Pacos");
	}
	
	@Test
	void testinvertir() {
		this.tarea = new tarea1();
		String expected = "socap";
		String actual = this.tarea.invertir("Pacos");
	}
	
	@Test
	void testcontar() {
		this.tarea = new tarea1();
		int expected = 1;
		int actual = this.tarea.contarLetra("Pacos", 'a');
	}
}


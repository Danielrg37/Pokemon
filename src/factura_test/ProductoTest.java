package factura_test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class ProductoTest {

	private Producto productos;

	@Test
	void testNuevo() {
	
	Producto p = new Producto("pan", 0.50f, 1);
	
	assertEquals(p.getNombre(), "pan", "Fallo");
	assertEquals(p.getPrecio(), 0.50f, "Fallo");
	assertEquals(p.getCantidad(), 1, "Fallo");
	}

	
	@Test
	void testPrecioTotal() {
		Producto p = new Producto("Chiclana", 50, 20);
		float expected = 1000;
		float actual = p.getCantidad() * p.getPrecio();
		assertEquals(expected, actual, "Error");
	}
	
}

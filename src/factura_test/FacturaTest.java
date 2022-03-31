package factura_test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Vector;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FacturaTest {


	private Factura factura;
	
	@Test
	void testTotalFactura() {
		Vector<Producto> productos = new Vector<Producto>();
		this.factura = new Factura(productos);
		Producto Xiaomi = new Producto("Xiaomi", 30, 40);
		Producto Switch = new Producto("Switch", 19, 15);
		Producto Disco = new Producto("Disco", 5, 5);
		
		
		factura.meterProducto(Xiaomi);
		factura.meterProducto(Switch);
		factura.meterProducto(Disco);
		
		float total = 0;
		for(Producto p : productos) {
			total += p.getPrecio() * p.getCantidad();
		}
		
		assertEquals(total, factura.totalFactura(), "Error");
	}
	
	@Test
	void testAplicarIva() {
		Vector<Producto> productos = new Vector<Producto>();
		this.factura = new Factura(productos);
		Producto p = new Producto("A", 30, 40);
	
		
		factura.meterProducto(p);
	
		
		float iva = 1.21f;
		
		float expected = factura.totalFactura() * iva;
		
	
		
		assertEquals(expected, factura.totalFactura() * 1.21f, "Error");
		
	}
}

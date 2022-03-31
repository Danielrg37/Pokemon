package factura;

import java.util.Vector;

public class Factura {
Vector<Producto> productos;
	
	
	
	public Factura(Vector<Producto> productos) {
	this.productos = productos;
}
	
	public void meterProducto(Producto p) {
		productos.add(p);
	}
	

	public float totalFactura() {
		float total = 0;
		for(Producto p : productos) {
			total += p.getPrecio() * p.getCantidad();
		}
		return total;
	}
	
	public float aplicarIVA(float iva) {
		return totalFactura() * iva;
	}
}

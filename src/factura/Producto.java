package factura;

public class Producto {
String nombre;
float precio;
int cantidad;


public Producto(String nombre, float precio, int cantidad) {
	this.nombre = nombre;
	this.precio = precio;
	this.cantidad = cantidad;
}

public float precioTotal() {
	return precio * cantidad;
}

@Override
public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append("Producto [nombre=");
	builder.append(nombre);
	builder.append(", precio=");
	builder.append(precio);
	builder.append(", cantidad=");
	builder.append(cantidad);
	builder.append("]");
	return builder.toString();
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public float getPrecio() {
	return precio;
}

public void setPrecio(float precio) {
	this.precio = precio;
}

public int getCantidad() {
	return cantidad;
}

public void setCantidad(int cantidad) {
	this.cantidad = cantidad;
}



}

package ut5_tarea18;

//Atributos y constructor
public class Producto{
	private int id;
	private String nombre;
	private int cantidad;
	
	public Producto(int id, String nombre, int cantidad) {
		this.id = id;
		this.nombre = nombre;
		this.cantidad = cantidad;
	}

	
	//Getters and Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	
	//Metodos de incrementar stock y vender
	public void incrementarCantidad(int aumento) {
		this.cantidad = cantidad + aumento;
	}
	
	public void vender() {
		this.cantidad = cantidad - 1;
	}


	//toString()
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Producto");
		builder.append("/n" + "ID:");
		builder.append(" " + id);
		builder.append(" " + "nombre=");
		builder.append(" " + nombre);
		builder.append(" " + "cantidad=");
		builder.append(" " + cantidad);
		return builder.toString();
		
}
}

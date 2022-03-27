package ut5_tarea18;

 

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


//Creo el arraylist
public class GestorStock{
	private List<Producto> productos;
	
//Inicializo el arraylist
	public GestorStock() {
		this.productos = new ArrayList<Producto>();
	}


//Recorro el arraylist y si tienen mismo id, no añado. Al final añade producto si no está ya
public void añadirProducto(Producto p) {
	for(Producto r : productos) {
		if(r.getId() == p.getId()) {
			System.out.println("Producto ya existente. Cagaste");
		}
	}
		productos.add(p);
			
		
	}


//Hago el stringBuilder y voy recorriendo el arraylist y añadiendole el toString por cada producto
public String escribirDetallesProductos() {
	StringBuilder resultado = new StringBuilder();
	for(int i = 0; i < productos.size(); i++) {
		resultado.append(productos.get(i).toString());
	}
	return resultado.toString();
}

//Hago el stringBuilder y voy recorriendo el arraylist y añadiendole el toString por cada producto
public String escribirDetallesProductos2() {
	StringBuilder resultado = new StringBuilder();
	for(Producto p : productos) {
		resultado.append(p.toString());
	}
	return resultado.toString();
}

//Creo el iterador para ir recorriendo el arraylist y añadiendole el toString al StringBuilder por cada producto
public String escribirDetallesProductos3() {
	Iterator<Producto> it = productos.iterator();
	StringBuilder resultado = new StringBuilder();
	while(it.hasNext()) {
		Producto e = it.next();
		resultado.append(e.toString());
	}
	return resultado.toString();
}


//Creo un producto a null, recorro el arraylist y si encuentra un producto con el mismo id, producto recoge los valores de dicho producto
//En caso no de estar en el ArrayList, devuelve null y si lo está, lo devuelve con los valores como dije antes
public Producto localizarProducto(int id) {
	Producto producto = null;
	for(Producto p : productos) {
		if(id == p.getId()) {
			producto = p;
		}
	}	
		 return producto;
	}


//Recorro el arraylist, si coincide el id, le paso a cantidad el valor del getCantidad() de dicho producto
public int cantidadEnStock(int id) {
	int cantidad = 0;
	for(Producto p : productos) {
		if(id == p.getId()) {
			cantidad = p.getCantidad();
		}
	}
	return cantidad;
}

//Creo un producto a null, recorro el arraylist y con equals compruebo si coinciden en nombre
//Si coincide, le paso los valores a producto y los devolverá en el return, en caso contrario devolverá null
public Producto localizarProducto(String nombre) {
	Producto producto = null;
	
	for(int i = 0; i < productos.size(); i++){
	    if (productos.get(i).getNombre().equals(nombre)){
	    		producto = productos.get(i);
}
	}
	return producto;
}

//Creo de nuevo un producto a null, recorro arraylist y si coincide id, primero le incremento la cantidad y luego se lo paso a auxiliar
//Asi devuelvo null si no está o el producto de la manera correcta si está
public Producto recibirProducto(int id, int aumento) {
	Producto auxiliar = null;
	for(Producto p : productos) {
		if(p.getId() == id) {
			p.incrementarCantidad(aumento);
			auxiliar = p;
	}
	}
	return auxiliar;
	}
	
//Creo StringBuilder, voy recorriendo arraylist y sacando la cantidad de cda producto, si está por debajo del nivelStock, lo añado al StringBuilder
//Devuelvo el StringBuilder al final
public String escribirMenorQue(int nivelStock) {
	StringBuilder resultado = new StringBuilder();
	for(Producto p : productos) {
		if(p.getCantidad() < nivelStock) {
			resultado.append(p.toString());
		}
	}
	return resultado.toString();
}
	
}







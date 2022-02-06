package Casa;

import java.time.LocalDate;

public class Casa{
	private int superficie;
    private int precio;
    private int numhabitaciones;
    private int numba�os;
    private LocalDate fecha;
    
    
public Casa(int superficie, int precio, int numhabitaciones, int numba�os, LocalDate fecha) {
	this.superficie = superficie;
	this.precio = precio;
	this.numhabitaciones = numhabitaciones;
	this.numba�os = numba�os;
	this.fecha = fecha;
}
    
    
	public int getSuperficie() {
		return superficie;
	}


	public void setSuperficie(int superficie) {
		this.superficie = superficie;
	}


	public int getPrecio() {
		return precio;
	}


	public void setPrecio(int precio) {
		this.precio = precio;
	}


	public int getNumhabitaciones() {
		return numhabitaciones;
	}


	public void setNumhabitaciones(int numhabitaciones) {
		this.numhabitaciones = numhabitaciones;
	}


	public int getNumba�os() {
		return numba�os;
	}


	public void setNumba�os(int numba�os) {
		this.numba�os = numba�os;
	}


	public LocalDate getFecha() {
		return fecha;
	}


	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}



	public String toString() {
		String resultado = "";
		resultado += "\nSuperficie : " + this.superficie;
		resultado += "\nPrecio : " + this.precio;
		resultado += "\nHabitaciones : " + this.numhabitaciones;
		resultado += "\nBa�os : " + this.numba�os;
		resultado += "\nFecha publicacion : " + fecha.toString();
		return resultado;
	}
	


}
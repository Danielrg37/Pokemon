package pkgaeropuerto.modelo;


public class Regular extends Vuelo {
	private int plazaslibres;
	
	public Regular(String destino, String modelo, int numplazas, double precio, int plazaslibres) {
		super(destino, modelo, numplazas, precio);
		this.plazaslibres = plazaslibres;
	}


	/**
	 * @return el plazaslibres
	 */
	public int getPlazaslibres() {
		return plazaslibres;
	}

	/**
	 * @param plazaslibres el plazaslibres a establecer
	 */
	public void setPlazaslibres(int plazaslibres) {
		this.plazaslibres = plazaslibres;
	}

	@Override
	public String toString() {
		return "\nVuelo Regular" + super.toString() + "\nPlazas Libres: " + plazaslibres;
	}

@Override
public int getNumeroPasajeros() {
	return getNumplazas() - plazaslibres;
}

@Override
public double calcularPrecioFinal() {
	return getPrecio() * 1.1 + 5 * plazaslibres;
}
}




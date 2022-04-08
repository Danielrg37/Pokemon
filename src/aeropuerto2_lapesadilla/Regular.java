package aeropuerto2_lapesadilla;


public class Regular extends Vuelo {
	private int plazaslibres;
	
	public Regular(String destino, String modelo, int numplazas, int plazaslibres) {
		super(destino, modelo, numplazas);
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
		return "\nVuelo Regular" + super.toString() + "\nPlazas Libres: " + plazaslibres + "\n";
	}






@Override
public int getNumeroPasajeros() {
	return getNumplazas() - plazaslibres;
}

}




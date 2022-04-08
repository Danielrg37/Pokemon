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
		StringBuilder sb = new StringBuilder();
		sb.append("\n\nVuelo " + this.getClass().getSimpleName());
		sb.append("\n-------------------------");
		sb.append("\n\nDestino: " + this.getDestino());
		sb.append("\nAvion: " + this.getModelo());
		sb.append("\nPlazas: " + this.getNumplazas());
		sb.append("\nPlazas libres: " + this.getPlazaslibres()); 
		return sb.toString();
	}





@Override
public int getNumeroPasajeros() {
	return getNumplazas() - plazaslibres;
}

}




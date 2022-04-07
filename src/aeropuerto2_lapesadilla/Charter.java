package aeropuerto2_lapesadilla;


public class Charter extends Vuelo {
	private String nif;

	
	public Charter(String destino, String modelo, int numplazas, String nif) {
		super(destino, modelo, numplazas);
		this.nif = nif;
	}

/**
 * @return el nif
 */
public String getNif() {
	return nif;
}


/**
 * @param nif el nif a establecer
 */
public void setNif(String nif) {
	this.nif = nif;
}


@Override
public String toString() {
	StringBuilder sb = new StringBuilder();
	sb.append("\n\nVuelo " + this.getClass().getSimpleName());
	sb.append("\n-------------------------");
	sb.append("\n\nDestino: " + this.getDestino());
	sb.append("\nAvion: " + this.getModelo());
	sb.append("\nPlazas: " + this.getNumplazas());
	sb.append("\nNIF Empresa: " + this.nif);
	return sb.toString();
}
}










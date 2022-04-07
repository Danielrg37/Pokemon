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
	return "\nVuelo Charter" + super.toString() + "\nNif Empresa: " + nif + "\n";
}


}








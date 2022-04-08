package aeropuerto2_lapesadilla;

import java.util.Comparator;

public class ComparadorPlazasLibres implements Comparator<Vuelo> {

	
	@Override 
	public int compare(Vuelo v1, Vuelo v2) {
		if( ((Regular) v1).getPlazaslibres() > ((Regular) v2).getPlazaslibres()) return 1;
		if(((Regular) v1).getPlazaslibres() < ((Regular) v2).getPlazaslibres()) return -1;
		else return 0;
	}
}

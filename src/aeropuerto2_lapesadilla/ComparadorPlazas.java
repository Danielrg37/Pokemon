package aeropuerto2_lapesadilla;

import java.util.Comparator;

public class ComparadorPlazas implements Comparator<Vuelo> {

	
	@Override 
	public int compare(Vuelo v1, Vuelo v2) {
		if( ((Regular) v1).getNumplazas() > ((Regular) v2).getNumplazas()) return 1;
		if(((Regular) v1).getNumplazas() < ((Regular) v2).getNumplazas()) return -1;
		else return 0;
	}
}



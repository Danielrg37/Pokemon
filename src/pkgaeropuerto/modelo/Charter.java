package pkgaeropuerto.modelo;


public abstract class Charter extends Vuelo {
	int Nif;


public Charter(String destino, String modelo, int numPlazas, int Nif) {
		super(destino, modelo, numPlazas);
		this.Nif = Nif;
	}

public int getNIF() {
	return Nif;
}

public void setNIF(int Nif) {
	this.Nif = Nif;
}
	
@Override
public String toString() {
	StringBuilder sb = new StringBuilder();
	sb.append("\n\nVuelo " + this.getClass());
	sb.append("\n---------------------");
	sb.append("\n\nDestino: " + this.destino);
	sb.append("\nAvion: " + this.avion);
	sb.append("\nPlazas: " + this.numPlazas);
	sb.append("\nNIF Empresa: " + this.Nif);
	return sb.toString();
}
}
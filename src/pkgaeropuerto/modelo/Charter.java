package pkgaeropuerto;


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
	return super.toString();
}

}
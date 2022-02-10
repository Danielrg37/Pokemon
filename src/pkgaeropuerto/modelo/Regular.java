package pkgaeropuerto;


public abstract class Regular extends Vuelo {
	int plazasLibres;
	public Regular(String destino, String modelo, int numPlazas, int plazasLibres) {
		super(destino, modelo, numPlazas);
		this.plazasLibres = plazasLibres;
	}
	public int getPlazasLibres() {
		return plazasLibres;
	}
	public void setPlazasLibres(int plazasLibres) {
		this.plazasLibres = plazasLibres;
	}
	@Override
	public String toString() {
		return super.toString();
	}
	
}
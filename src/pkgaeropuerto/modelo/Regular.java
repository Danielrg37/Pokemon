package pkgaeropuerto.modelo;


public abstract class Regular extends Vuelo {
	int plazasLibres;
	
	public Regular(String destino, String modelo, int numPlazas) {
		super(destino, modelo, numPlazas);
	
	}
	public int getPlazasLibres() {
		return plazasLibres;
	}
	public void setPlazasLibres(int plazasLibres) {
		this.plazasLibres = plazasLibres;
	}
	
	
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("\n\nVuelo " + this.getClass());
		sb.append("\n---------------------");
		sb.append("\n\nDestino: " + this.destino);
		sb.append("\nAvion: " + this.avion);
		sb.append("\nPlazas: " + this.numPlazas);
		sb.append("\nPlazas libres: " + this.plazasLibres); 
		return sb.toString();
	}
}

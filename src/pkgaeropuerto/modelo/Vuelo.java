package pkgaeropuerto.modelo;



public class Vuelo implements Comparable<Vuelo>{
String destino;
String avion;
int numPlazas;

public Vuelo(String destino, String avion, int numPlazas) {
	this.destino = destino;
	this.avion = avion;
	this.numPlazas = numPlazas;
}

public String getDestino() {
	return destino;
}

public void setDestino(String destino) {
	this.destino = destino;
}

public String getAvion() {
	return avion;
}

public void setAvion(String avion) {
	this.avion = avion;
}

public int getNumPlazas() {
	return numPlazas;
}

public void setNumPlazas(int numPlazas) {
	this.numPlazas = numPlazas;
}

public String toString() {
	StringBuilder sb = new StringBuilder();
	sb.append("\n\nVuelo " + this.getClass());
	sb.append("\n---------------------");
	sb.append("\n\nDestino: " + this.destino);
	sb.append("\nAvion: " + this.avion);
	sb.append("\nPlazas: " + this.numPlazas);
	
	return sb.toString();
}

@Override
public int compareTo(Vuelo o) {
	return this.destino.compareTo(o.destino); 
}


}
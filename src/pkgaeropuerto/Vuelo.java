package pkgaeropuerto;
import java.util.Collections;
import java.util.Comparator;

public class Vuelo {
String destino;
String modelo;
int numPlazas;

public Vuelo(String destino, String modelo, int numPlazas) {
	this.destino = destino;
	this.modelo = modelo;
	this.numPlazas = numPlazas;
}

public String getDestino() {
	return destino;
}

public void setDestino(String destino) {
	this.destino = destino;
}

public String getModelo() {
	return modelo;
}

public void setModelo(String modelo) {
	this.modelo = modelo;
}

public int getNumPlazas() {
	return numPlazas;
}

public void setNumPlazas(int numPlazas) {
	this.numPlazas = numPlazas;
}


Comparator<Vuelo> comparator = new Comparator<>(){
    public int compare(Vuelo v1, Vuelo v2){
         return v1.getDestino().compareTo(v2.getDestino());
    }
};


public String toString() {
	return "Vuelo [destino=" + destino + ", modelo=" + modelo + ", numPlazas=" + numPlazas + ", comparator="
			+ comparator + "]";
}


}
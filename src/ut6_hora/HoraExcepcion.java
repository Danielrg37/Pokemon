package ut6_hora;

public class HoraExcepcion extends Exception {
private String valorErroneo;


public HoraExcepcion(String valorErroneo) {
	this.valorErroneo = valorErroneo;
}

public String toString() {
	return "Se ha introducido un valor incorrecto" + valorErroneo;
}
}

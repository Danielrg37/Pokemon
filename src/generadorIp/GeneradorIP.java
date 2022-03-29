package generadorIp;

import org.junit.jupiter.api.Test;

public class GeneradorIP{
	
	


	

	@Test
	public int generarNumero(int min, int max) {
		int numero = (int)(Math.random()* max + min);
		return numero;
	}
	
	@Test
	public String generarCadena() {
		StringBuilder builder = new StringBuilder();
		builder.append("GeneradorIP [min=");
		builder.append(generarNumero(0, 254));
		builder.append(".");
		builder.append(generarNumero(0, 254));
		builder.append(".");
		builder.append(generarNumero(0, 254));
		builder.append(".");
		builder.append(generarNumero(0, 254));
		
		return builder.toString();
	}
}
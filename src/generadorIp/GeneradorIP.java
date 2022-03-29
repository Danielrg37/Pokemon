package generadorIp;


public class GeneradorIP{
	
	


	

	
	public int generarNumero(int min, int max) {
		int numero = (int)(Math.random()* max + min);
		return numero;
	}
	

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
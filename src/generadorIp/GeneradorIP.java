package generadorIp;


public class GeneradorIP{
	
	
	
	private int min;
	private int max;
	
	

	
	public int generarNumero(int min, int max) {
		int numero = (int)(Math.random()*(max-min+1)+min);
		return numero;
	}
	

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("GeneradorIP [min=");
		builder.append(generarNumero(min, max));
		builder.append(".");
		builder.append(generarNumero(min, max));
		builder.append(".");
		builder.append(generarNumero(min, max));
		builder.append(".");
		builder.append(generarNumero(min, max));
		
		return builder.toString();
	}
}
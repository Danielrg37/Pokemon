package ut6_hora;

public class Hora {
	private int horas;
	private int minutos;
	private int segundos;
	
	
	
	
	public Hora(int horas, int minutos, int segundos) {
		this.horas = horas;
		this.minutos = minutos;
		this.segundos = segundos;
		
		if(this.horas < 0 && this.horas > 24) {
			throw new IllegalArgumentException("Las horas están fuera del plazo");
		}
		
		if(this.minutos > 59) {
			throw new IllegalArgumentException("Los minutos son superiores a 59");
		}
		
		if(this.segundos > 59) {
			throw new IllegalArgumentException("Los segundos son superiores a 59");
		}
	}




	public int getHoras() {
		return horas;
	}




	public void setHoras(int horas) {
		this.horas = horas;
	}




	public int getMinutos() {
		return minutos;
	}




	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}




	public int getSegundos() {
		return segundos;
	}




	public void setSegundos(int segundos) {
		this.segundos = segundos;
	}




	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Hora [horas=");
		builder.append(horas);
		builder.append(", minutos=");
		builder.append(minutos);
		builder.append(", segundos=");
		builder.append(segundos);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
}



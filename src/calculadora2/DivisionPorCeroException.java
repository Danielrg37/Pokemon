package calculadora2;

public class DivisionPorCeroException extends Exception {
	String texto;
	
	
	public DivisionPorCeroException(String string) {
	this.texto = texto;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("DivisionPorCeroException [texto=");
		builder.append(texto);
		builder.append("]");
		return builder.toString();
	}

	

}

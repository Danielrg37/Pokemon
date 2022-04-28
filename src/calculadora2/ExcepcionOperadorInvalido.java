package calculadora2;

public class ExcepcionOperadorInvalido extends Exception {
	String texto;
	
	public ExcepcionOperadorInvalido(String string) {
		this.texto = texto;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ExcepcionOperadorInvalido [texto=");
		builder.append(texto);
		builder.append("]");
		return builder.toString();
	}

}

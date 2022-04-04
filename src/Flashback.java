
public class Flashback {

	public int calcularRetencion(int renta) {
		int retencion = 0;

		if (renta < 10000) {
			retencion = 5;
		} else if (renta < 20000) {
			retencion = 15;
		} else if (renta < 35000) {
			retencion = 20;
		} else if (renta < 60000) {
			retencion = 30;
		} else {
			retencion = 45;
		}

		return retencion;
	}
	
	public String traducirNota(float nota) {
		String notaNominal = "";

		if (nota < 0) {
			notaNominal = "nota no válida";
		} else if (nota < 5) {
			notaNominal = "suspenso";
		} else if (nota < 6) {
			notaNominal = "aprobado";
		} else if (nota < 7) {
			notaNominal = "bien";
		} else if (nota < 9) {
			notaNominal = "notable";
		} else if (nota < 10) {
			notaNominal = "sobresaliente";
		} else {
			notaNominal = "matrícula de honor";
		}

		return notaNominal;
	}
	
	private float realizarCambio(float dinero, float cantidad) {
		String tipoDinero = "Billetes";
		float dineroRestante = dinero;

		if (cantidad < 5) {
			tipoDinero = "Monedas";
		}

		if (dineroRestante >= cantidad) {
			System.out.println(tipoDinero + " de " + cantidad + "€: " + (int)(dinero / cantidad));
			dineroRestante %= cantidad;
		}

		return dineroRestante;
	}
}

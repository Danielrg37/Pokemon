package calculadora2;

import java.util.ArrayList;
import java.io.IOException;
import java.util.Scanner;
public class Calculadora {

	private Character operacion;
	private static Double operando_2;
	private static Double operando_1;
	private double total;
	private static String numero1;
	private static String numero2;
	
	
	static boolean encendido = true;

	static Scanner sc = new Scanner(System.in);
	static String opcion;
	static Calculadora calcu = new Calculadora();
	
	public static void main(String[] args) throws ExcepcionOperadorInvalido {
		
	
	
		
			
	while(encendido) {
		if(operando_1 == null && operando_2 == null) {
		introducirNumeros();
		}
		
		System.out.println("-----------------------------------------------");
		System.out.println("Escribe el simbolo (/ + - * ");
		System.out.println("Escribe = para mostrar el resultado");
		System.out.println("Escribe SALIR para salir del menú");
		System.out.println("-----------------------------------------------");
	
	
		opcion = sc.next();
	
	
	
	
	switch(opcion) {	
	case "/":
	case "+":
	case "-":
	case "*":
		try {
			calcu.leerOperador(opcion);
		} catch (Exception e) {
			e = new Exception("Fallo con el operador");
			e.printStackTrace();
		}
		System.out.println("Operador guardado");
		break;
			
			
		
	case "=":
		try {
			calcu.realizarOperacion();
		} catch (DivisionPorCeroException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		calcu.mostrarResultado();
		break;
		
	case "SALIR":
		System.out.println("Chao");
		encendido = false;
		break;
	}
	
		}
	
				
		
}

	
	public void leerOperandos(String num1, String num2) {
		try {
			setOperando_1(Double.parseDouble(num1));

			setOperando_2(Double.parseDouble(num2));

		} catch (NumberFormatException e) {
			System.out.println("Cagaste");
		}

	}

	public void leerOperador(String operador) throws ExcepcionOperadorInvalido {
		switch (operador) {
		case "-":
			operacion = '-';
			break;

		case "+":
			operacion = '+';
			break;

		case "/":
			operacion = '/';
			break;

		case "*":

			operacion = '*';
			break;
		default:
			throw new ExcepcionOperadorInvalido("No es un operador válido");
		}
	}

	public void realizarOperacion() throws DivisionPorCeroException {
		switch (operacion) {
		case '-':
			total = operando_1 - operando_2;
			operando_1 = null;
			operando_2 = null;
			break;

		case '+':
			total = operando_1 + operando_2;
			operando_1 = null;
			operando_2 = null;
			break;

		case '*':
			total = operando_1 * operando_2;
			operando_1 = null;
			operando_2 = null;
			break;

		case '/':
				total = operando_1 / operando_2;
				operando_1 = null;
				operando_2 = null;
				if(operando_2 == 0) {
					throw new DivisionPorCeroException("Estás diviendo entre 0");
				}
			break;

		}
	}
	
	
	public static void introducirNumeros() {
		System.out.println("Introduce el primer operador");
		numero1 = sc.next();

		System.out.println("Introduce el segundo operador");
		numero2 = sc.next();
	
		calcu.leerOperandos(numero1, numero2);
		if(calcu.getOperando_1() != null  && calcu.getOperando_2() != null) {
		System.out.println("Operandos guardados.");
		}  else {
			System.out.println("Error, vuelve a intentarlo.");
		}
}
	

	public void mostrarResultado() {
		System.out.println("El resultado es de" + " "+ total);
		System.out.println("\n");
	}

	public Double getOperando_1() {
		return operando_1;
	}

	public void setOperando_1(double operando_1) {
		this.operando_1 = operando_1;
	}

	public Double getOperando_2() {
		return operando_2;
	}

	public void setOperando_2(double operando_2) {
		this.operando_2 = operando_2;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public Character getSimbolo() {
		return operacion;
	}

	public void setSimbolo(Character simbolo) {
		this.operacion = simbolo;
	}
	
	
	
}

	


package calculadora2;

import java.util.ArrayList;
import java.io.IOException;
import java.util.Scanner;
public class Calculadora {

	private static Character operacion;
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
	
	//Mientras encendido se encuentre a true	
	while(encendido) {
		
		//Si los números se encuentran a null, llamo al método introducirNumeros que se encuentra más abajo
		//Para que vuelva a pedir números al mostrar resultado, los paso a null a la hora de mostrar el resultado por pantalla
		if(operando_1 == null && operando_2 == null) {
		introducirNumeros();
		}
		
		//Menu de seleccionar opcion
		System.out.println("-----------------------------------------------");
		System.out.println("Escribe el simbolo ( / + - * )");
		System.out.println("Escribe = para mostrar el resultado");
		System.out.println("Escribe SALIR para salir del menú");
		System.out.println("-----------------------------------------------");
	
		opcion = sc.next();
	
	//Como los números ya estan introducidos, en caso de cualquiera de los operadores, lee el operador
	//Si no se encuentra en la lista, muestra un ExcepcionOperadorInvalido
	switch(opcion) {	
	case "/":
	case "+":
	case "-":
	case "*":
		try {
			calcu.leerOperador(opcion);
		} catch (Exception e) {
			e = new ExcepcionOperadorInvalido("Fallo con el operador");
			e.printStackTrace();
		}
		System.out.println("\n");
		System.out.println("Operador guardado");
		break;
			
			
	//En caso de introducir igual, si no había operador, se muestra una Exception	
	case "=":
		try {
			if(operacion == null) {
				throw new Exception("No se ha introducido signo previamente");
			}
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		//Se hace operacion y se muestra resultado;
		try {
			calcu.realizarOperacion();
		} catch (DivisionPorCeroException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		calcu.mostrarResultado();
		break;
	
		
	//Si el usuario escribe SALIR, sale del menu
	case "SALIR":
		System.out.println("Chao");
		encendido = false;
		break;
	}
	
		}
	
				
		
}

	//Lee los operadores y los pasa a Double
	public void leerOperandos(String num1, String num2) {
		try {
			setOperando_1(Double.parseDouble(num1));

			setOperando_2(Double.parseDouble(num2));

		} catch (NumberFormatException e) {
			System.out.println("Cagaste");
		}

	}
	
	//Lee el operador y lo pasa a su equivalente en Character
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

	//Realiza la operación necesaria y al acabar, pasa los operandos a null para que vuelva a pedir número
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

		//En caso de que el operando_2 sea 0, sale una excepcion para mostrar que estás dividiendo entre 0
		case '/':
				total = operando_1 / operando_2;
				if(operando_2 == 0) {
					throw new DivisionPorCeroException("Estás diviendo entre 0");
				}
				operando_1 = null;
				operando_2 = null;
				
			break;

		}
	}
	
	//Introduce los números, método llamado en el menú
	public static void introducirNumeros() {
		System.out.println("Introduce el primer operador");
		numero1 = sc.next();

		System.out.println("Introduce el segundo operador");
		numero2 = sc.next();
	
		calcu.leerOperandos(numero1, numero2);
		if(calcu.getOperando_1() != null  && calcu.getOperando_2() != null) {
		System.out.println("\n");
		System.out.println("Operandos guardados.");
		}  else {
			System.out.println("Error, vuelve a intentarlo.");
		}
}
	
	//Imprime resultado
	public void mostrarResultado() {
		System.out.println("El resultado es de" + " "+ total);
		System.out.println("\n");
	}

	
	//Getters y setters
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

	


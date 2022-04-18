package palindromo;
import java.util.Stack;



public class DetectorPalindromos {
private static String cadena ="xd";

public DetectorPalindromos(String cadena) {
	this.cadena = cadena;
}


public static boolean verificarReves() {
 
	Stack<Character> pila = new Stack<Character>();
	
	for(int i = 0; i < cadena.length(); i++) {
		pila.push(cadena.charAt(i));
	}
	

	
	
	
for(int p = 0; p < cadena.length(); p++) {
	if(cadena.charAt(p) != pila.pop()){
		return false;
	}
}
	
return true;

}


}




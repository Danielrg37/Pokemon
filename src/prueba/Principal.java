package prueba;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class Principal {
	
	public static void main(String [] args) {
	ArrayList<Estudiante> lista = new ArrayList<>();
	Estudiante estudiante = new Estudiante("Ana", 7);
	lista.add(estudiante);
	System.out.println(lista.contains(new Estudiante("Ana", 7)));
	System.out.println(lista.contains(lista.indexOf(estudiante) == -1));
	System.out.println(lista.remove(estudiante));
	System.out.println(lista.remove(new Estudiante("Ana", 7)));
	
	
	
	//APARTADO 2
	HashSet<Estudiante> conjunto1 = new HashSet<>();
	TreeSet<Estudiante> conjunto2 = new TreeSet<>();
	//TreeSet necesita comparable en la clase
conjunto1.add(estudiante);
conjunto2.add(estudiante);
conjunto1.remove(estudiante);
conjunto2.remove(estudiante);
//Necesita HashCode
System.out.println(conjunto1.remove(new Estudiante("Ana", 7)));
//Equals
System.out.println(conjunto2.remove(estudiante));
//El treeset utiliza el compareTo
System.out.println(conjunto2.remove(new Estudiante("Ana", 9)));
System.out.println(conjunto1.contains(estudiante));
//No coinciden nombre y nota
System.out.println(conjunto1.contains(new Estudiante("Ana", 9)));
}
	
	
//Hashmap se ordena por estudiante
//TreeMap por nombre de estudiante
	
	//Si no tiene compareTo estudiante, treemap peta
	
	//En caso de TreeMap<Integer, Estudiante>, se ordena sin compareTo ya que ya lo tiene el propio Integer
	TreeMap<Integer, Estudiante> map3 = new TreeMap<>();
	map3.put(4, estudiante);
	map3.put(4, new Estudiante("Ana", 7));
	
}

package agenda;

public class Principal{
	
	public static void main(String[] args) {
		Agenda a = new Agenda();
		
		a.a�adirAsignatura("Programacion");
		a.a�adirAsignatura("Bases de datos");
		a.a�adirAsignatura("FOL");
		a.a�adirAsignatura("Sistemas");
		a.a�adirAsignatura("Programacion");
		
		a.mostrarAsignatura();
	}
}
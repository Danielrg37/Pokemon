package agenda;

public class Principal{
	
	public static void main(String[] args) {
		Agenda a = new Agenda();
		
		a.a�adirAsignatura(new Asignatura("Programacion", 224));
		a.a�adirAsignatura(new Asignatura("Bases de datos", 192));
		a.a�adirAsignatura(new Asignatura("FOL", 92));
		a.a�adirAsignatura(new Asignatura("Sistemas", 160));
		a.a�adirAsignatura(new Asignatura("Programacion", 224));
		
		a.mostrarAsignatura();
	}
}
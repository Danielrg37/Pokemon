package agenda;

public class Principal{
	
	public static void main(String[] args) {
		Agenda a = new Agenda();
		
		a.añadirAsignatura(new Asignatura("Programacion", 224));
		a.añadirAsignatura(new Asignatura("Bases de datos", 192));
		a.añadirAsignatura(new Asignatura("FOL", 92));
		a.añadirAsignatura(new Asignatura("Sistemas", 160));
		a.añadirAsignatura(new Asignatura("Programacion", 224));
		
		a.mostrarAsignatura();
	}
}
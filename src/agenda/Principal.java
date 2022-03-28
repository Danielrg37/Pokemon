package agenda;

public class Principal{
	
	public static void main(String[] args) {
		Agenda a = new Agenda();
		
		a.añadirAsignatura("Programacion");
		a.añadirAsignatura("Bases de datos");
		a.añadirAsignatura("FOL");
		a.añadirAsignatura("Sistemas");
		a.añadirAsignatura("Programacion");
		
		a.mostrarAsignatura();
	}
}
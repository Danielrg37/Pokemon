package agenda2;

import agenda.Agenda;
import agenda.Asignatura;

public class Principal2{
	
	public static void main(String[] args) {
		AgendaV2 a = new AgendaV2();
		
		a.añadirEstudiante(1, "Mathieu");
		a.añadirEstudiante(2, "Julien");
		a.añadirEstudiante(3, "Rick");
		a.añadirEstudiante(4, "Will");
		a.añadirEstudiante(5, "Chris");
		a.añadirEstudiante(4, "Jack");
		a.añadirEstudiante(6, "Will");
		
		System.out.println("N de estudiantes" + a.getNumeroEstudiantes());
		System.out.println(a.toString());
		System.out.println(a.getNombresEstudiantes());
		System.out.println(a.getIdsEstudiantes());
		System.out.println(a.getNombreEstudiante(4));
		System.out.println(a.getNombreEstudiante(5));
		System.out.println(a.getIdsEstudiantes());
		System.out.println(a.getIds());
	}
}
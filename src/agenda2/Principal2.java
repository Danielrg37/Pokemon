package agenda2;

import agenda.Agenda;
import agenda.Asignatura;

public class Principal2{
	
	public static void main(String[] args) {
		AgendaV2 a = new AgendaV2();
		
		a.a�adirEstudiante(1, "Mathieu");
		a.a�adirEstudiante(2, "Julien");
		a.a�adirEstudiante(3, "Rick");
		a.a�adirEstudiante(4, "Will");
		a.a�adirEstudiante(5, "Chris");
		a.a�adirEstudiante(4, "Jack");
		a.a�adirEstudiante(6, "Will");
		
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
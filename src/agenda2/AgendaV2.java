package agenda2;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class AgendaV2 {
	private Map<Integer, String> estudiantes;

/*** Constructor*/
public AgendaV2(){
	estudiantes = new HashMap<Integer, String>();
	
}
	public void añadirEstudiante(Integer id, String nombre){
		estudiantes.put(id, nombre);
		}
	
	public int getNumeroEstudiantes() {
		return estudiantes.size();
	}
	public Collection<String> getNombresEstudiantes() {
		return estudiantes.values();
		}

	public Set<Integer> getIdsEstudiantes(){
		return estudiantes.keySet();
	}
	
	
	public String getNombreEstudiante(int id) {
		return estudiantes.get(id);
			}
	
	public String borrarEstudiante(int id) {
		return estudiantes.remove(id);
	}
	
	public String getIds() {
	StringBuilder resultado = new StringBuilder();
	Set<Integer> claves = this.getIdsEstudiantes();
	for(Integer c : claves) {
	resultado.append(this.getNombreEstudiante(c));
	resultado.append("\n");
		}
	return resultado.toString();
	}
	
	
	public String recorrerConEntrySet() {
		StringBuilder resultado = new StringBuilder();
		Set<Entry<Integer, String>> entradas = this.estudiantes.entrySet();
		
		for(Entry<Integer, String> e : entradas){
			resultado.append(e.getKey());
			resultado.append(": ");
			resultado.append(e.getValue());
			resultado.append("\n");
		}
		return resultado.toString();
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("AgendaV2 [estudiantes=");
		builder.append(estudiantes);
		builder.append("]");
		return builder.toString();
	}
}



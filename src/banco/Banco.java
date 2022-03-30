package banco;

import java.util.HashMap;
import java.util.Set;
import java.util.Map.Entry;


public class Banco{
	HashMap<String, Cuenta> cuentasBancarias;

	public Banco(HashMap<String, Cuenta> cuentas) {
		
	}
	
	public void addCuenta(String nombre, Cuenta cuenta) {
		cuentasBancarias.put(nombre, cuenta);
	}
	
	
	public Cuenta getCuenta(String nombre) {
		return cuentasBancarias.get(nombre);
	}

	
	public Set<String> getIdsCuentas(){
		return cuentasBancarias.keySet();
	}
	
	
	
	
	public void listarClientes() {
		StringBuilder resultado = new StringBuilder();
		for(String c : cuentasBancarias.keySet()) {
			resultado.append(this.getCuenta(c));
			resultado.append("\n");
		}
		System.out.println(resultado);
	}
	
	
	public void añadirCuenta(String nombre, Cuenta cuenta){
		cuentasBancarias.put(nombre, cuenta);
		}

	
	
	
	public String recorrerConEntrySet() {
		StringBuilder resultado = new StringBuilder();
		Set<Entry<String, Cuenta>> cuentas = this.cuentasBancarias.entrySet();
		
		for(Entry<String, Cuenta> c : cuentas){
			resultado.append(c.getKey());
			resultado.append(": ");
			resultado.append(c.getValue());
			resultado.append("\n");
		}
		return resultado.toString();
	}
	
}
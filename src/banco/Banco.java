package banco;

import java.util.HashMap;

import com.sun.xml.internal.bind.v2.model.core.ID;

public class Banco{
	HashMap<String, Cuenta> cuentas;

	public Banco(HashMap<String, Cuenta> cuentas) {
		
	}
	
	public void addCuenta(String nombre, int numCuenta, int balance) {
		cuentas.put(nombre, numCuenta, balance);
	}
	
	
	public Cuenta getCuenta(String nombre) {
		
	}
	
	
	public void listarClientes() {
		StringBu
	}
}
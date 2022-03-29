package banco;

public class Cuenta {
	public int numCuenta;
	public int balance;
	
	public Cuenta(int numCuenta, int balance) {
		this.numCuenta = numCuenta;
		this.balance = balance;
	}

	public int getNumCuenta() {
		return numCuenta;
	}

	public void setNumCuenta(int numCuenta) {
		this.numCuenta = numCuenta;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

}
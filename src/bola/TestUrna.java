package bola;

import java.util.ArrayList;
import java.util.List;

public class TestUrna {
	
	public static void main(String[] args) {
	Urna u = new Urna();
	try {
		u.sacarBola();
	} catch (Exception e) {
		System.out.print(e.getMessage());
	}

}
}



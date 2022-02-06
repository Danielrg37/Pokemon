package Casa;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;





public class Portal{
	private List<Casa> casas = new ArrayList<Casa>();
	int seleccion;
	int opciondireccion; 
	int direccion;

	public void añadirCasa(int superficie, int precio, int numhabitaciones, int numbanos, LocalDate fecha) {
		casas.add(new Casa(superficie, precio, numhabitaciones, numbanos, fecha));
	}
	   
public void menu() {
			Scanner sc = new Scanner(System.in);
			int opcionmenu;
			do {
				System.out.println("PORTAL INMOBILIARIO");
	            System.out.println();
	            System.out.println("**********************************");
	            System.out.println();
	            System.out.println("Ordenar por:");
	            System.out.println("1. Superficie");
	            System.out.println("2. Precio");
	            System.out.println("3. Numero de habitaciones");
	            System.out.println("4. Numero de baños");
	            System.out.println("5. Fecha de publicación");
	            System.out.println("6. Salir");
				opcionmenu = sc.nextInt();
			}while(opcionmenu < 1 || opcionmenu > 6);
			
			if(opcionmenu == 6) System.exit(0);
		
			if(opciondireccion == 1) {
				direccion = 1;
				ordenarcasas(opcionmenu, direccion);
			}
			if(opciondireccion == 2) {
				direccion = 2;
				ordenarcasas(opcionmenu, direccion);
			}
			if(opciondireccion == 3) {
				direccion = 3;
				menu();
			}
			for(Casa home : casas) System.out.println(home.toString());

		}
	 
		public int menu2() {
			Scanner sc = new Scanner(System.in);
			
			do {
				System.out.println("En orden: ");
				System.out.println("1. Ascendente");
				System.out.println("2. Descendente");
				System.out.println("3. Volver");
				System.out.println();
				opciondireccion = sc.nextInt();
			}while(opciondireccion < 1 || opciondireccion > 3);
			
			sc.close();
			return opciondireccion;
			
		}

		public void ordenarcasas(int ordencasas, int direccion) {
			switch(ordencasas) {
			case 1: 
				Collections.sort(casas, new Comparator<Casa>() {

					@Override
					public int compare(Casa c1, Casa c2) {
						int resultado;
						if(c1.getSuperficie() > c2.getSuperficie()) resultado = 1;
						if(c1.getSuperficie() < c2.getSuperficie()) resultado = -1;
						else resultado = 0;
						return resultado;
					}
					
				});
				break;
			case 2:
				Collections.sort(casas, new Comparator<Casa>() {

					@Override
					public int compare(Casa c1, Casa c2) {
						int resultado;
						if(c1.getPrecio() > c2.getPrecio()) resultado = 1;
						if(c1.getPrecio() < c2.getPrecio()) resultado = -1;
						else resultado = 0;
						return resultado;
					}
					
				});
				break;
			case 3:
				Collections.sort(casas, new Comparator<Casa>() {

					@Override
					public int compare(Casa c1, Casa c2) {
						int resultado;
						if(c1.getNumhabitaciones() > c2.getNumhabitaciones()) resultado = 1;
						if(c1.getNumhabitaciones() < c2.getNumhabitaciones()) resultado = -1;
						else resultado = 0;
						return resultado;
					}
					
				});
				break;
			case 4: 
				Collections.sort(casas, new Comparator<Casa>() {

					@Override
					public int compare(Casa c1, Casa c2) {
						int resultado;
						if(c1.getNumbanos() > c2.getNumbanos()) resultado = 1;
						if(c1.getNumbanos() < c2.getNumbanos()) resultado = -1;
						else resultado = 0;
						return resultado;
					}
					
				});
				break;
			case 5:
				Collections.sort(casas, new Comparator<Casa>() {

					@Override
					public int compare(Casa c1, Casa c2) {
						return c2.getFecha().compareTo(c2.getFecha());
					}
					
				});
				break;
			}
			if(direccion == 2) Collections.reverse(casas);
		}
}



package Ejercicio15;
import java.util.ArrayList;


public class GestorFiguras{
	
	

private ArrayList<Figura> figuras;

public GestorFiguras(){
	figuras = new ArrayList<Figura>();	
}

public void addFigura(Figura f) {
	figuras.add(f);
}


public void ListarFiguras() {
	for(int i = 0; i < figuras.size(); i++) {
		System.out.println(figuras.get(i));
	}
	
}


public Figura mayorArea() {
	double mayorArea = 0;
	int posicion = 0;
	for(int i = 0; i < figuras.size(); i++) {
		if(figuras.get(i).calcularArea() > mayorArea) {
			mayorArea =  figuras.get(i).calcularArea();
			posicion = i;
		}
		
	}
	}
		
	



public void borrarDeColor(Color color) {

Iterator<Figura> it = figuras.iterator()
while (it.hasNext())
{
Figura f = it.next();
if (f.getColor().equals(color))
{
it.remove();
	
}


public void borrarIgualesA(Figura f) {
	
	
}
}





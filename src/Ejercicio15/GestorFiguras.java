package Ejercicio15;
import java.util.ArrayList;


public class GestorFiguras {
	
	ArrayList<Figura> figuras = new ArrayList<Figura>();


public void addFigura(Figura f) {
	figuras.add(f);
}


public void ListarFiguras() {
	for(int i = 0; i < figuras.size(); i++) {
		System.out.println(figuras.get(i));
	}
	
}


public Figura mayorArea() {
        Figura mFigura=null;
        double areaMayor=0.0;
        for(int i=0; i<figuras.size(); i++){
            if(figuras.get(i).calcularArea()>areaMayor){
                areaMayor=figuras.get(i).calcularArea();
                mFigura=figuras.get(i);
            }
        }
        return mFigura;
    }


public void borrarDeColor(Color color) {
		






public void borrarIgualesA(Figura f) {
	
	
}

}



package Ejer213;


/**
 * Write a description of class EstadisticaLuzSolar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EstadisticaLuzSolar
{
    private String[ ] nombresMeses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
    int [ ] horas;

    /**
     * Constructor for objects of class EstadisticaLuzSolar
     */
    public EstadisticaLuzSolar()
    {
        
        horas = new int[] {100, 90, 120, 150, 210, 250, 300, 310, 280, 230, 160, 120};
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public double getMediaSol()
    {
      double sumaHoras = 0;
      for (int i = 0; i < nombresMeses.length; i++){
          sumaHoras += horas[i];
      }
      
      return sumaHoras / horas.length;
    } 
    
    public String mesMasSoleado(){
        int maximo = 0;
        int mes = 0;
        for (int i = 0; i < horas.length; i++){
            if(horas[i] > maximo){
                maximo = horas[i];
                mes = i;
            }
        }
        return nombresMeses[mes];
    }
    
    public String mesMenosSoleado(){
        int minimo = 2000;
        int mes = 0;
        for(int i = 0; i < horas.length; i++){
            if(horas[i] < minimo){
                minimo = horas[i];
                mes = i;
            }
        }
        return nombresMeses[mes];
}
}

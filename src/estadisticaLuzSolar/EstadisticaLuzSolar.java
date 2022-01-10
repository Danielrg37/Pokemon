package estadisticaLuzSolar;

/**
 * Write a description of class EstadisticaLuzSolar here.
 * 
 * @Daniel (your name) 
 * @EstadisticaLuzSolar 
 */
public class EstadisticaLuzSolar
{
	// Atributos
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
     * Método que calcula la media de horas
     * Descripción: Con el for, la i va aumentando y recorriendo el array de Meses, y va aumentando a sumaHoras, el valor de la posición i que tenga en el array horas.
     * Ejemplo: Mes enero, suma a sumaHoras 100h
     */
    public double getMediaSol()
    {
      double sumaHoras = 0;
      for (int i = 0; i < nombresMeses.length; i++){
          sumaHoras += horas[i];
      }
      
      return sumaHoras / horas.length;
    } 
    
    /**
     * Método que calcula el mes con más sol
     * Descripción: Con el for, la i va aumentando y recorriendo el array de horas y si la posición que ocupa i en el array Horas, tiene un valor mayor al maximo actual, es el nuevo max.
     * Ejemplo: Mes Enero- 100h, al llegar a Marzo el nuevo max es 120h
     */
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
    
    /**
     * Método que calcula el mes con menos sol
     * Descripción: Con el for, la i va aumentando y recorriendo el array de horas y si la posición que ocupa i en el array Horas, tiene un valor menor al minimo actual, es el nuevo min.
     * Ejemplo: Mes Enero- 100h, al llegar a Febrero el nuevo min es 90h
     */
    public String mesMenosSoleado(){
        int minimo = 10000;
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


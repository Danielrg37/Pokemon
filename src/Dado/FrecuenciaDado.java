package Dado;


/**
 *  clase FrecuenciaDado 
 *  
 */
public class FrecuenciaDado
{
    private Dado dado;
    private int [] frecuencia;

    /**
     * Constructor de la clase FrecuenciaDado
     */
    public FrecuenciaDado()
    {
        frecuencia = new int[7];
    }

    /** 
     * tirar el dado n veces y contabilizar la frecuencia de aparición
     * de la tirada
     */
    public void tirarDado(int veces)
    {
         for(int i = 0; i < veces; i++){
        dado.tirarDado();
        if(dado.getCara() == 1){
            frecuencia[1]++;
        }
        if(dado.getCara() == 2){
            frecuencia[2]++;
        }
        if(dado.getCara() == 3){
            frecuencia[3]++;
        }
        if(dado.getCara() == 4){
            frecuencia[4]++;
        }
        if(dado.getCara() == 5){
            frecuencia[5]++;
        }
        if(dado.getCara() == 6){
            frecuencia[6]++;
        }
    }
    escribirFrecuencia();
}
    /**
     *  Mostrar las frecuencias
     */
    public void escribirFrecuencia()
    {
       int[] valores2 = new int[frecuencia.length];
       System.arraycopy(frecuencia, 0, valores2, 0, frecuencia.length); 



    }

}

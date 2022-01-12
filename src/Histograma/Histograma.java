package Histograma;

/**
 * La clase contiene un array que se inicializa 
 * con una serie de valores y se utiliza para dibujar
 * un histograma
 */

public class Histograma
{
    private final static int MAX = 10;
    public final char ASTERISCO = '*';
    private int[] valores ;
    
    /**
     * Constructor
     */
    public Histograma()
    {
         valores = new int[MAX];
         inicializar();
    }

    /**
     * inicializa el array con valores aleatorios
     */
    private void inicializar()
    {
        for(int i = 0; i < valores.length; i++){
            valores[i] = generarAleatorio();
        }
    }

    /**
     * genera y devuelve un aleatorio entre 5 y 50 inclusive
     */
    private int generarAleatorio(){
        int aleatorio = 0;
        for(int i = 0; i < valores.length; i++){
            aleatorio = (int)Math.floor(Math.random()*(50-5+1)+(5));
        
    }
    return aleatorio;
    }

    /**
     *  muestra el histograma
     */
    public void escribirHistograma()
    {
    
}
    

 
    /**
     * 
     * devuelve una copia del array 
     */
    public int[] getValoresV1()
    {
       int[] valores2 = new int[valores.length];
       System.arraycopy(valores, 0, valores2, 0, valores.length); 
       return valores2;
    }

     /**
     * 
     * devuelve una copia del array 
     */
    public int[] getValoresV2()
    {
        return valores.clone();
    }
       
}

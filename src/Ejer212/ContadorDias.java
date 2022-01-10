package Ejer212;

/**
 * Write a description of class ContadorDias here.
 * 
 * @Daniel (your name) 
 * @EjercicioContadorDias
 */
public class ContadorDias
{
    // instance variables - replace the example below with your own
    private int transcurridos;
    private  int diasMes[];
    /**
     * Constructor for objects of class ContadorDias
     */
    public ContadorDias()
    {
        diasMes = new int[] {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    private boolean esBisiesto(int anio) {
    boolean esBisiesto = false;   
        if(anio % 4 == 0 && anio % 100 != 0 || anio % 400 == 0){
         diasMes = new int[] {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
         esBisiesto = true;
    }
    return esBisiesto;
    }
    
    public int contarDias(int dia, int mes, int anio){
        esBisiesto(anio);
        transcurridos = 0;
        for (int i = 0; i < (mes - 1); i++){
            transcurridos += diasMes[i];
        }
        return transcurridos + dia;
    }
}
    

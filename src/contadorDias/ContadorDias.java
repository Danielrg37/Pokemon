package contadorDias;

/**
 * Write a description of class ContadorDias here.
 * 
 * @Daniel (your name) 
 * @EjercicioContadorDias
 */
public class ContadorDias
{
    // Atributos
    private int transcurridos;
    private int diasMes[];
    
    /**
     * Constructor for objects of class ContadorDias
     */
    public ContadorDias()
    {
        diasMes = new int[] {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    }

    /**
     * Método para averiguar si el año es bisiesto o no
     * Descripción: Si cumple las condiciones para ser bisiesto, vuelve esBisiesto a true y sobreescribe el array de diasMes con febrero teniendo 29 días.
     * Ejemplo: Año Bisiesto - 2004
     */
    private boolean esBisiesto(int anio) {
    boolean esBisiesto = false;   
        if(anio % 4 == 0 && anio % 100 != 0 || anio % 400 == 0){
         diasMes = new int[] {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
         esBisiesto = true;
    } else {
        diasMes = new int[] {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        esBisiesto = false;
    }
    return esBisiesto;
    }
    
    
    
    /**
     * Método para contar días desde el 1 de Enero.
     * Descripción: En primer lugar, se llama al método esBisiesto para comprobar si lo es o no
     * 				Posteriormente el for recorre hasta el mes anterior de la fecha que ofrecemos, sumandole a transcurridos los días del array diasMes por los meses que va pasando
     * 				Finalmente, a dicha cantidad se le suman los días de la variable int día
     * Ejemplo: 6/6/2004 Se llama a esBisiesto, al ser esBisiesto se sustituye el array
     * 			 Se suman los días de los 5 meses anteriores y posteriormente se suman los 6 días de junio
     */
    public int contarDias(int dia, int mes, int anio){
        esBisiesto(anio);
        transcurridos = 0;
        for (int i = 0; i < (mes - 1); i++){
            transcurridos += diasMes[i];
        }
        return transcurridos + (dia - 1);
    }
}
    

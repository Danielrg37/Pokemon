package UT4_Ejercicio14;


/**
 * Write a description of class Palabra here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Palabra
{
    public String ingles;
    public String castellano;

    /**
     * Constructor for objects of class Palabra
     */
    public Palabra(String palabraIngles, String palabraCastellano)
    {
        ingles = palabraIngles;
        castellano = palabraCastellano;
    }

    public String getCastellano()
    {
         return castellano;
    }
    
    public String getIngles()
    {
         return ingles;
    }
    
    public String toString(){
        return ingles + "-" + castellano;
    }
}

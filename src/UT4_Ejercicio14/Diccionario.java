package UT4_Ejercicio14;

import java.util.Arrays;

/**
 * Write a description of class Diccionario here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Diccionario
{
    
    private static Palabra[] listaPalabras;
    public final static int MAX_PALABRAS = 5;
    int pos = 0;
    

    /**
     * Constructor for objects of class Diccionario
     */
    public Diccionario(int numPalabras)
    {
      if (numPalabras > MAX_PALABRAS){
          Palabra listaPalabras[] = new Palabra[MAX_PALABRAS];
      } else {
           Palabra listaPalabras[] = new Palabra[numPalabras];
      }
    }
    
    public void insertarPalabra(Palabra palabra)
    {
          for(int i = 0; listaPalabras[i] != null; i++){
              pos++;
              if(pos == 0){
              System.out.println("Array completo)");
          } else {
              pos = pos + 1;
              listaPalabras[pos] = palabra;
          }
          }
    }
    
    public static Palabra obtenerPalabra(int posicion)
    {
         if (posicion > MAX_PALABRAS){
             return null;
         }
         if (listaPalabras[posicion] == null){
             return null;
         }
         return listaPalabras[posicion];
    }
    
    public static String traducirPalabra(int posicion){
        return listaPalabras[posicion].getIngles();
    }
    
    public String toString(){
        StringBuilder resultado = new StringBuilder();
        resultado.append(listaPalabras);
        
        return resultado.toString();
    }
    
    public static void escribirDiccionario()
    {
         System.out.println(Arrays.toString(listaPalabras));
    }
    
    }
    


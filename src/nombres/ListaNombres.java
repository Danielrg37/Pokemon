package nombres;

 

 



import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ListaNombres
{
        private String[]  lista;
        private int pos;
		
        /**
         * Constructor de la clase ListaNombres
         */
        public ListaNombres(int n) 
        {              
              lista = new String[n];
              lista[1] = "aLba";
        }
        
      
        /**
         * @return  true si la lista est� vac�a   
         */
        public boolean  listaVacia()
        {
            //Por defecto, vacia en true. Si encuentra algo con valor en el array, pasa a false
            boolean vacia = true;
            for(String l: lista) {
                if(l != null) {
                    vacia = false;
                }
            }
       
           return vacia;
       }
        
        
        /**
         * 
         * @return  true si la lista est� llena   
         */
        public boolean  listaLlena()
        {
            //Por defecto, llena en true. Si encuentra algo a null en el array, pasa a false
            boolean llena = true;
             for(String l: lista) {
                 if(l == null) {
                     llena = false;
                 }
             }
        
            return llena;
        }
        
        /**
         * Inserta un nombre en la lista �nicamente
         * si no est� y la lista no est� llena. La inserci�n se hace de tal
         * manera que el nombre queda colocado en el 
         * lugar que le corresponde manteniendo el orden 
         * de la lista (no se utiliza ning�n algoritmo de ordenaci�n)
         * Importan may�sculas y min�sculas
         * 
         * @param nombre el nombre a insertar
         * @return  true si la inserci�n se hace con �xito   
         *
         */
        public boolean insertarNombre(String nombre) {
       
            //Odio este metodo, lo he intentado como de 4 formas distintas ayer y durante Avelino hasta dar con esta ahora
            //Intentaba hacerlo sacando la inicial de nombre y en función si era mayus o minus pero era caotico
            
            //Declaro la boolean insercion a false
            boolean insercion = false;
            
            //Esta variable me sirve para más adelante
            int contador = 0;
            
            //En primer lugar, compruebo si el nombre ya está o la lista ya está llena 
            
            //Como para introducir el nombre, tiene que haber minimo un null, recorro array y pongo a los null el nombre (Daba problema si había varios null)
            //Por ello, puse la variable contador que una vez añadido valor al primer null, la aumento y me sirve para que solo la pase a el primer null
            //Al haber insertado el nombre, paso contador a 1
             for(int i = 0; i < lista.length; i++) {
                 if(lista[i] == nombre) {
                     insercion = false;
                 }
                 
                 if(listaLlena() == true) {
                     insercion = false;
                 }
             
               if(contador == 0){
               if(lista[i] == null){
                   lista[i] = nombre;
                   insercion = true;
                   contador++;
               }}}
               
             //Este me sirve para ordenar el array, simplemente voy comparando los valores e intercambiando
             //Como si encontraba un nulo en i o j, petaba porque claro no hay char que comparar
             //He metido el if de comparación dentro de otro if para que no compare valores nulos
                 for(int i = 0; i < lista.length; i++){
                     for(int j = i + 1; j < lista.length; j++){
                         //Pero probandolo, me di cuenta de un problema y es si la letra inicial era igual
                         if(lista[i] != null && lista[j] != null){
                        
                        //Si coinciden, va recorriendo las letras hasta que encuentre una distinta
                       //Una vez hecho eso, intercambia posiciones
                         if(lista[i].charAt(0) == lista[j].charAt(0)){
                             for(int c = 0; c < lista[i].length() - 1; c++){
                                 if(lista[i].charAt(c) > lista[j].charAt(c)){
                             String auxiliar = lista[i];
                             lista[i] = lista[j];
                             lista[j] = auxiliar;
                         }
                             }
                         }
                         //Este es más simple, no coinciden y directamente se pone a intercambiar
                         if(lista[i].charAt(0) > lista[j].charAt(0)){
                             String auxiliar = lista[i];
                             lista[i] = lista[j];
                             lista[j] = auxiliar;
                         }
                         }
                     }
                 }
           return insercion;        
        }
                                                                                                                                                                                                                                                                           
        /**
         *  Busca un nombre en la lista
         *  Puesto que la lista est� en todo momento ordenada
         *  se hace una b�squeda binaria
         *  @param  nombre el nombre a buscar
         *  @return   true si ya existe el nombre en la lista  
         *   
         */
        private boolean estaNombre(String nombre)
        {
            //Como int por defecto es 0, hago una busqueda binaria con el método que nos dijiste en clase, con el array de lista
            // Si index pasa a ser mayor que 0, por tanto existe y el boolean de que el nombre existe, pasa a true
            boolean esta = false;
            int tope = 1;
            int contador = 0;
            int pos = 0;
            for(int i =0; i < lista.length; i++) {
                
                    if(lista[i] == null) {
                        contador++;
                        pos = i;
                    if(contador == tope) {
                        break;
                    }
                }
            }
            
                int index = Arrays.binarySearch(lista, 0, pos, nombre);
            
            
            if(index > 0) {
                esta = true;
            }
            return esta;
        
        }
        /**
         *  Busca y devuelve el nombre de mayor longitud
         *  en la lista. Si hay varios devuelve el
         *  primero encontrado
         *  Si la lista est� vac�a devuelve null
         *  
         *  @return   el nombre m�s largo  
         *  
         */
        public String nombreMasLargo()
        {
            //Variable maxima y el String inicializado a nulo
           int maximo = 0;
           String nombre = null;
           //Recorro lista
           for(int i = 0; i < lista.length; i++) {
           //Saco cuanto de largo es la palabra
           //Como al recorrer, petaba porque le pasaba a un int algo null, hice el if xd
               if(lista[i] != null) {
               int cantidad = lista[i].length();
              //Si supera al maximo, actualizo maximo y actualizo nombre
              if(cantidad > maximo) {
                  maximo = cantidad;
                  nombre = lista[i];
               }
              if(listaVacia() == true) {
                  return null;
              }
           }
           }
        return nombre;
                    
            
        }
        
        /**
         * Borra de la lista los nombres que empiezan por 
         * una letra determinada (s� importan may�sculas y min�sculas)
         * No es lo mismo borrarLetra('A') que borrarLetra('a')
         *
         * @param letra la letra por la que han de empezar los nombres 
         *    
         */
        public void borrarLetra(char letra)
        {
            //Saco la primera letra del elemento del array y si coinciden, pongo a nulo
            for(int i = 0; i < lista.length; i++) {
                char primeraletra = lista[i].charAt(0);
                if(primeraletra == letra){
                    lista[i] = "";
             }
                }
            }
            
            
        
        
        /**
         * Borra un nombre de la posici�n indicada
         * 
         *
         * @param  p posici�n del nombre a borrar
         *  
         */
        private void borrarDePosicion(int p)
        {
            //Recorro array y cuando i tenga mismo valor que p, lo paso a nulo
             for(int i = 0; i < lista.length; i++) {
                 if(i == p) {
                     lista[i] = "";
                 }
             }
        }
         
       
        
        /**
         * Cuenta cu�ntos nombres empiezan por una determinada 
         * cadena sin importar si es may�scula o min�scula
         *
         * @param  la cadena de comienzo
         * @return  la cantidad de nombres calculados   
         */
        public int empiezanPor(String inicio)
        {
            //Aqui intente de entrada hacerlo con String inicio pero me petaba
            //Asi que hice la variable auxiliar y si la lista[i] empieza por auxiliar, sube contador
            int contador = 0;
            String minisculas = inicio.toLowerCase();
            String[] lista2 = new String[lista.length];
            for(int i = 0; i < lista.length; i++){
                lista2[i] = lista[i];
        }
        for(int j = 0; j < lista2.length; j++){
        	if(lista[j] != null) {	
            lista2[j] = lista2[j].toLowerCase();
        }
        }
         Arrays.sort(lista2);
        for(int i = 0; i < lista2.length; i++){
      for(int j = i + 1; j < lista2.length; j++){
         if(i != j)
         {
         if(lista2[i].equals(lista2[j]))
            {
               lista2[j] = "";
            }
         }
      }
   }

          for(int i = 0; i < lista2.length; i++){
              if(lista2[i] != null){
                  if(lista2[i].startsWith(minisculas)){
                      contador++;
                  }
              }
          }
           
            return contador;
        }
         /** 
         * 
         * Devuelve un array con los  nombres que empiezan por una determinada 
         * letra sin importar si es may�scula o min�scula
         * 
         * @param  la letra de comienzo
         * @return  la cantidad de nombres encontrados
         *          con esa letra   
         */ 
        public String empiezanPorLetra(char letra)
        {
             //Aqui se me fue un poco la olla, no sé si es la manera más eficiente
            
            int contador = 0;
            
            //Aqui hice el array donde almacenar el resultado final
            String[] empiezan = new String[lista.length];
            
            //Con el UpperCase, compruebo si es mayuscula y con el toLowerCase, la paso a miniscula
            if(Character.isUpperCase(letra)) {
                char miniscula = Character.toLowerCase(letra);
                //Recorro el array, saco primera letra y si coinciden con la letra original o la pasada a miniscula, añado a auxiliar
            
                    for(int i = 0; i < lista.length; i++) {
                        if(lista[i].charAt(0) == letra || lista[i].charAt(0) == miniscula) {
                            empiezan[contador] = lista[i];
                            contador++;
                        } else {
                        	lista[i] = "";
            }
        }
    }       //Con el LowerCase, compruebo si es miniscula y con el toUpperCase, la paso a mayuscula
            if(Character.isLowerCase(letra)) {
                char mayuscula = Character.toUpperCase(letra);
                //Recorro el array, saco primera letra y si coinciden con la letra original o la pasada a mayuscula, añado a auxiliar
                for(int i = 0; i < lista.length; i++) {
                	if(lista[i] != "") {
                    if(lista[i].charAt(0) == letra || lista[i].charAt(0) == mayuscula) {
                        empiezan[contador] = lista[i];
                        contador++;
                    } else {
                    	lista[i] = "";
                    }
                }
                }
            }
			return Arrays.toString(empiezan);
        }   
        
      
          
            
        
		
        
         
        
       /**
         * Representaci�n textual de la cadena
         * 
         * @return la cadena resultante    
         */

		public String toString() {
			StringBuilder builder = new StringBuilder();
			for(String s : lista){
				builder.append("\n" + s);
			}
			return builder.toString();
		}

        
        
          /**
         * Lee de un fichero de texto una serie 
         * de nombres con ayuda de un objeto de la 
         * clase Scanner y los almacena en la lista
         */
        public void cargarDeFichero() 
        {
             try
             {
                     Scanner sc = new Scanner(new File("nombres.txt"));
                     while (sc.hasNextLine() && !listaLlena())
                           insertarNombre(sc.nextLine());
                     sc.close();
             }
             catch (IOException e)
             {
                     e.printStackTrace();
             }
        }
}




        



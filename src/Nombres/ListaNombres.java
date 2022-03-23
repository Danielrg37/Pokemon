package Nombres;

 



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
       
        	//Este lo he intentado resolver pero no me ha salido
        	boolean insercion = false;
        	int contadormayus = 0;
             for(int i = 0; i < lista.length; i++) {
            	 if(lista[i] == nombre) {
            		 insercion = false;
            	 }
            	 if(listaLlena() == true) {
            		 insercion = false;
            	 }
             }
             
           char auxiliar = nombre.charAt(0);
           
           
           for(int i = 0; i <lista.length; i++) {
        	   char primeraletra = lista[i].charAt(0);
        	   
        	   if(Character.isUpperCase(primeraletra) && Character.isUpperCase(auxiliar)) {
        		   
        		   if(auxiliar < lista[1].charAt(0)) {
        			   String tmp = lista[0];
        			   for(int x = 0; x < lista.length; i++) {
        				   lista[x] = lista[x + 1];
        			   }
        			   lista[0] = tmp;
        		   }
        		   
        		   
        		   if(auxiliar > lista[i -1].charAt(0) && auxiliar < lista[i + 1].charAt(0)){
        			   String tmp = lista[i];
        			   for(int x = i; x < lista.length; x++) {
        				   lista[x] = lista[x + 1];   
        			   }
        			   lista[i] = tmp;
        		   }
        		   contadormayus++;
        	   }
        	   
        	   
        	   if(Character.isLowerCase(primeraletra) && Character.isLowerCase(auxiliar)) {
        		   
        		   
        		   if(auxiliar < lista[contadormayus + 1].charAt(0)) {
        			   String tmp = lista[contadormayus + 1];
        			   for(int x = 0; x < lista.length; i++) {
        				   lista[x] = lista[x + 1];
        			   }
        			   lista[contadormayus + 1] = tmp;
        		   }
        		   
        		   if(auxiliar > lista[i -1].charAt(0) && auxiliar < lista[i + 1].charAt(0)){
        			   String tmp = lista[i];
        			   for(int x = i; x < lista.length; x++) {
        				   lista[x] = lista[x + 1];   
        			   }
        			   lista[i] = tmp;
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
        	int index = Arrays.binarySearch(lista, nombre);
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
           //Como al borrar, petaba porque le pasaba a un int algo con valor null, hice el while xd
        	   while(lista[i] != null) {
               int cantidad = lista[i].length();
              //Si supera al maximo, actualizo maximo y actualizo nombre
          	if(cantidad > maximo) {
          		maximo = cantidad;
          		nombre = lista[i];
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
            	    lista[i] = null;
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
            		 lista[i] = null;
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
        	String auxiliar = inicio;
               for(int i = 0; i < lista.length; i++) {
            	   if(lista[i].startsWith(auxiliar)) {
            		   contador++;
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
        public String[] empiezanPorLetra(char letra)
        {
        	 //Aqui se me fue un poco la olla, no sé si es la manera más eficiente
        	
        	//Hice un List porque vagancia sinceramente, era más cómodo para filtrar
            List<String> auxiliar = new ArrayList<String>();
            
            //Aqui hice el string donde almacenar el resultado final
            String[] empiezan = new String[lista.length];
            
            //Con el UpperCase, compruebo si es mayuscula y con el toLowerCase, la paso a miniscula
            if(Character.isUpperCase(letra)) {
            	char miniscula = Character.toLowerCase(letra);
            	//Recorro el array, saco primera letra y si coinciden con la letra original o la pasada a miniscula, añado a auxiliar
            	for(int i = 0; i < lista.length; i++) {
            	   char primeraletra = lista[i].charAt(0);
            		if(primeraletra == letra || primeraletra == miniscula) {
            			auxiliar.add(lista[i]);
            }
        }
            	  //Con el LowerCase, compruebo si es miniscula y con el toUpperCase, la paso a mayuscula
            if(Character.isLowerCase(letra)) {
            	char mayuscula = Character.toUpperCase(letra);
            	//Recorro el array, saco primera letra y si coinciden con la letra original o la pasada a mayuscula, añado a auxiliar
            	for(int i = 0; i < lista.length; i++) {
            	    char primeraletra = lista[i].charAt(0);
            		if(primeraletra == letra || primeraletra == mayuscula) {
            			auxiliar.add(lista[i]);
            		}
            	}
            }
               
       
    
            //Luego aqui al final, convierto el List de auxiliar al array empiezan
            
            return empiezan = auxiliar.toArray(empiezan);
}
			return empiezan;
        }
        
       /**
         * Representaci�n textual de la cadena
         * 
         * @return la cadena resultante    
         */
        public String toString()
        {
        	
        		StringBuilder builder = new StringBuilder();
        		builder.append("ListaNombres [lista=");
        		builder.append(Arrays.toString(lista));
        		builder.append("]");
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
                     while (sc.hasNextLine() && !listaLlena()) {
                           insertarNombre(sc.nextLine());
                     sc.close();
                     }
             }
             
             catch (IOException e)
             {
                     e.printStackTrace();
             }
        }
}
        


        



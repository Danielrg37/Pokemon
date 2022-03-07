package array2D;

import java.util.Arrays;

/**
 *  Clase que guarda un array bidimensional
 *  y permite hacer ciertas operaciones sobre él
 */
public class Array2D
{
    public static char LLAVE_APERTURA = '{';
    public static char LLAVE_CIERRE = '}';
    private int[][] matriz;

    /**
     * Constructor  
     */
    public Array2D()
    {
        matriz = new int[][]{  {1, 2, 3, 4},
            {14, 5, 26, 7},
            {17, 8, 19, 10},
            {10, 11, 12, 13} } ;
    }

    /**
     * Constructor  - crea  un array de 2 dimensiones con las filas y columnas
     * indicadas
     * @param filas  nº de filas del array 
     *  @param columnas nº de columnas del array
     */
    public Array2D(int filas, int columnas)
    {
        matriz = new int[filas][columnas];

    }

    /**
     *  Inicializa la matriz con valores aleatorios entre 3 y 30 inclusive
     * Usa el mutador setValor
     */
    public void inicializar()
    {
    
    		
    		for(int f = 0; f < matriz.length; f++) {
    			for(int c = 0; c < matriz[f].length; c++) {
    				setValor(f, c, (int) Math.floor(Math.random() * 31));
    			}
    		}
    	}
    

    /**
     * @return el nº total de filas de la matriz 
     */
    public int getFilas()
    {
    	int filas = 0;
         for(int f = 0; f < matriz.length; f++) {
        	 filas++;
         }
         return filas;
    }

    /**
     * @return el nº total de columnas de la matriz 
     */
    public int getColumnas(int filas){
    {

    	int columnas = 0;
         for(int f = 0; f < matriz.length; f++) {
        	 columnas++;
         }
         return columnas;
    }

    }
    /**
     *  deja un valor en la fila y columna indicadas como parámetro
     *  asumimos f y c correctos
     *
     */
    public void setValor(int f, int c, int valor)
    {
     matriz[f][c] = valor;
    }

    /**
     *  Representación textual de la matriz
     *
     */
    public String toString()
    {
    		StringBuilder builder = new StringBuilder();
    		builder.append("Array2D [matriz=");
    		builder.append(Arrays.toString(matriz));
    		builder.append("]");
    		return builder.toString();
    	
		
        
    }

    /**
     *  
     * Escribir la matriz bidimensional en pantalla
     */
    public void escribir()
    {
        System.out.println(this.toString());
    }

    /**
     * @param f la fila cuyos valores hay que sumar
     *          suponemos f correcto
     */
    public   int sumarFila(int f)
    {
    	int suma;
    	for(int c = 0; c < matriz[f].length; c++) {
			suma += matriz[f][c];
    	}
		return suma;
    }
    

    /**
     * @param c la columna cuyos valores hay que sumar
     *          suponemos c correcto
     */
    public   int sumarColumna(int c)
    {
    	int suma = 0;
    	for(int f = 0; f < matriz.length; f++) {
    		suma += matriz[f][c];
    	}
		return suma;
    }

    /**
     * Calcula y devuelve un array en el que cada elemento es la suma de las filas de matriz
     */
    public  int[] sumarFilas()
    {
    	 int[] sumaFilas= null;
    	 int suma = 0;
    	for(int f = 0; f < matriz.length; f++) {
			for(int c = 0; c < matriz[f].length; c++) {
				suma += matriz[f][c];
				sumaFilas[f] = suma;
			}
    	}
		return sumaFilas;
        	
        
        
        
    }

    /**
     * Calcula y devuelve un array en el que cada elemento es la suma de las columnas de matriz
     */
    public  int[] sumarColumnas()
    {
        int [] sumaColumnas = null;
        int suma = 0;
        for(int f = 0; f < matriz.length; f++) {
			for(int c = 0; c < matriz[f].length; c++) {
				suma += matriz[f][c];
				sumaColumnas[c] = suma;
			}
        }
		return sumaColumnas;
    
        
        
    }

    /**
     * @return calcula y devuelve la suma de la diagonal principal (suponiendo la
     * matriz cuadrada)
     */
    public   int sumarDiagonalPrincipal()
    {
    	int suma = 0;
        for(int f = 0; f < matriz.length; f++) {
        	for(int c = 0; c < matriz[f].length; c++) {
        		if(f == c) {
        			suma += matriz[f][c];
        		}
        	}
        }
		return suma;
    }

    /**
     * @return calcula y devuelve la suma de la diagonal secundaria (suponiendo la
     * matriz cuadrada)
     */
    public   int sumarDiagonalSecundaria()
    {
    	int suma = 0;
      for(int f = matriz.length; f > matriz.length; f--) {
    	  for(int c = matriz[f].length; c > matriz[f].length; c--)
    		  if(f == c) {
    			  suma += matriz[f][c];
    		  }
    	  }
	return suma;
      }
        
        
    

    /**
     *   1  22  3   44
     *   3  7   5   11
     *   4  5   6   9
     *   La traspuesta es
     *   1   3   4
     *   22  7   5
     *   3   5   6
     *   44  11   9
     */
    public  int[][] traspuesta()
    {
    	  int[][] traspuesta = new int[getFilas()][getColumnas(getFilas())];
    	  

  		for(int f = 0; f < matriz.length; f++) {
  			for(int c = 0; c < matriz[f].length; c++) {
  				traspuesta[c][f] = matriz[f][c];
  			}   
  		}
		return traspuesta;
    }

    /**
     * Calcula y devuelve la posición de la columna con suma máxima
     * Puedes ayudarte del método sumarColumna()
     */
    public  int columnaSumaMaxima()
    {
    	int maximo = 0;
    	int posicion = 0;
    
    	for(int f = 0; f < matriz.length; f++) {
			for(int c = 0; c < matriz[f].length; c++) {
				int suma = 0;
				suma += matriz[f][c];
				if(suma > maximo) {
					maximo = suma;
					posicion = c;
				}
			}
			}
		return posicion;
				
		
	
        
        
        
    }

    /**
     * Intercambia la columna de suma máxima con la primera columna
     * Si son la misma no hace falta el intercambio
     */
    public  void intercambiar()
    {
    int suma = 0;
     for(int f = 0; f < 1; f++) {
    	 for(int c = 0; c < 1; c++) {
    		 
    	 }
     }
      columnaSumaMaxima.posicion;
        
    }

    /**
     *  Devuelve un ragged array donde la 1ª fila contiene el primer elemento de la 1ª fila de matriz,
     *  la 2ª fila los 2 primeros elementos de la 2ª fila de matriz, la 3ª fila los 3 primeros elementos de la 3ª fila de matriz, ...
     *  1	2	3	4	
     *  14	5	26	7	
     *  17	8	19	10	
     *  10	11	12	13	
     *  Resultado
     *  [1]
     *  [14, 5]
     *  [17, 8, 19]
     *  [10, 11, 12, 13]
     *  
     */
    public int[][] arrayRagged()
    {
       return null;
        		
        	
        
        
    }

    /**
     *  Muestra el array pero de la forma indicada. Cada nº formateado a 5 posiciones.
     *  Usa las constantes definidas en la clase
     *  
     *  {   {    1,     2,     3,     4    }
     *      {   14,     5,    26,     7    }
     *      {   17,     8,    19,    10    }
     *      {   10,    11,    12,    13    }    }

     */
    public void escribirConLlaves()
    {
        
        
        
    }

    /**
     *  Calcula y devuelve el total de impares en el array
     *  Hay que hacer uso del método contarImpares(int[], int n)
     *
     */
    public int contarImpares()
    {
        return 0;
        
    }

    /**
     *  Cuenta los impares en el array unidimensional array de tamaño n
     *  
     *
     */
    private int contarImpares(int[] array, int n)
    {
    	array = new int[n];
    	int contadorimpares = 0;
    	for(int i = 0; i < array.length; i++) {
    		if(array[i] % 2 != 0) {
    			contadorimpares++;
    		}
    	}
    	return contadorimpares;
    }

    /**
     *  Devuelve el subarray obtenido a partir de matriz entre las filas fila1 y fila2
     *  y columnas col1 y col2 (ambas inclusive)
     *  Asumimos todos los valores correctos
     *  13	20	30	25	16	
     *  12	27	24	17	27	
     *  3	12	11	28	29	
     *  21	11	20	25	8	

     *  Subarray desde filas  1 a  3 y columnas 2 a 3
     *  [24, 17]
     *  [11, 28]
     *  [20, 25]
     *  
     *
     */
    public  int [][] obtenerSubArray(int fila1, int fila2, int col1, int col2)
    {
    	int subfilas = fila2 - fila1;
    	int subcolumnas = col2 - col1;
    	int[][] subArray;
    	subArray = new int[subfilas][subcolumnas];

    
    	
    
    	for(int f = 0; f < matriz.length; f++) {
			for(int c = 0; c < matriz[f].length; c++) {
				if(f == fila1 && c == col1) {
					int f1 = f;
					int c1 = c;
					int f2 = fila2;
					int c2 = col2;
				while(f1 < f2 && c1 < c2) {
					
					subArray[f1][c1] = matriz[f][c];
					f1++;
					c1++;
				}
				
        
    } 
			}
    	}
		return subArray;
    }
}

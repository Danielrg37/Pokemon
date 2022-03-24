package nombres;



/**
 * 
 * Acepta como argumento del main el tama�o m�ximo de la lista
 * Si no se pasan argumentos se muestra un mensaje de error, se le informa al usuario
 * de la sintaxis a utilizar y se acaba el programa
 * 
 * En otro caso se crea la lista y:
 *  - se llama al m�todo cargarDeFichero() 
 *  - se muestra la lista
 *  - se muestra el nombre m�s largo
 *  - se borran los que empiezan por 'r'
 *  - se muestra la lista
 *  - se muestra cu�ntos empiezan por 'aL'
 *  - se muestran los nombres que empiezan por "a"
 */
public class AppListaNombres
{

    /**
     *  
     */
    public static void main(String[] args)
    {
    	ListaNombres lista = new ListaNombres(22);

    	   lista.cargarDeFichero();
    	   lista.toString();
           System.out.println("El nombre m�s largo es");
           lista.nombreMasLargo();
           lista.empiezanPorLetra('r');
           System.out.println("Despu�s de los que empiezan por r");
           lista.toString();
           System.out.println("Empiezan por al");
           lista.empiezanPor("aL");
           System.out.println("Empiezan por a");
           lista.empiezanPor("a");
    }
}

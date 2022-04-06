package biblioteca; 

public class TestLibreria {

	public static void main(String[] args) {
		Libreria libreria = new Libreria(50, "Xtra");
		Libro libro1 = new Libro("Pokemon", "Nintendo", 20, Estado.NOPRESTADO);
		Libro libro2 = new Libro("A", "B", 50, Estado.NOPRESTADO);
		Libro libro3 = new Libro("La rueda del tiempo", "Brandon Sanderson", 30, Estado.PRESTADO);
		
		libreria.anadirLibro(libro1);
		libreria.anadirLibro(libro2);
		libreria.anadirLibro(libro3);
		
		System.out.println("Libreria:" +"\n" + libreria.relacionLibros());
		System.out.println("El tamaño de la libreria es:" + libreria.cantidadLibros() + "\n");
		System.out.println("Retornar libro:" + libreria.buscarLibro("Pokemon") + "\n");
		System.out.println("Retornar libro que sean null:" + libreria.buscarLibro("Z") + "\n");
		System.out.println("Retornar autor:" + libreria.buscarAutor("Brandon Sanderson") + "\n");
		libreria.borrarLibro("Nintendo");
		System.out.println("Prueba de que borro el libro" + "\n" + libreria.relacionLibros() + "\n");
		
		try {
			libreria.prestarDeterminado("A");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.getMessage();
		}
		
		System.out.println("Prueba de que presto el libro" + "\n" + libreria.relacionLibros() + "\n");

	}

}

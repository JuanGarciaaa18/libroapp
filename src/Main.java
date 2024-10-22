public class Main {
    public static void main(String[] args) {
        Booksdao libroDAO = new Booksdao();

        libroDAO.agregarLibro(new Libro(0, "Cien años de soledad", "Gabriel García Márquez", 1967));
        libroDAO.agregarLibro(new Libro(0, "Don Quijote de la Mancha", "Miguel de Cervantes", 1605));


        System.out.println("Libros en la biblioteca:");
        for (Libro libro : libroDAO.obtenerTodosLosLibros()) {
            System.out.println(libro);
        }


        System.out.println("\nObteniendo libro con ID 1:");
        System.out.println(libroDAO.obtenerLibro(1));


        System.out.println("\nActualizando libro con ID 1:");
        libroDAO.actualizarLibro(new Libro(1, "En busca de las mujeres", "Juan Manuel Garcia Espinosa", 2007));
        System.out.println(libroDAO.obtenerLibro(1));


        System.out.println("\nEliminando libro con ID 2:");
        libroDAO.eliminarLibro(2);
        System.out.println("Libros restantes:");
        for (Libro libro : libroDAO.obtenerTodosLosLibros()) {
            System.out.println(libro);
        }
    }
}

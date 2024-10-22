import java.util.ArrayList;
import java.util.List;

public class Booksdao implements BOOKDAO {
    private List<Libro> libros = new ArrayList<>();
    private int contadorId = 1;

    @Override
    public void agregarLibro(Libro libro) {
        libro = new Libro(contadorId++, libro.getTitulo(), libro.getAutor(), libro.getAñoPublicacion());
        libros.add(libro);
    }

    @Override
    public Libro obtenerLibro(int id) {
        for (Libro libro : libros) {
            if (libro.getId() == id) {
                return libro;
            }
        }
        return null;
    }

    @Override
    public List<Libro> obtenerTodosLosLibros() {
        return new ArrayList<>(libros);
    }

    @Override
    public void actualizarLibro(Libro libroActualizado) {
        for (int i = 0; i < libros.size(); i++) {
            Libro libro = libros.get(i);
            if (libro.getId() == libroActualizado.getId()) {
                libros.set(i, libroActualizado);
                return;
            }
        }
    }

    @Override
    public void eliminarLibro(int id) {
        libros.removeIf(libro -> libro.getId() == id);
    }
}

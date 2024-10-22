import java.util.List;

public interface BOOKDAO {
    void agregarLibro(Libro libro);
    Libro obtenerLibro(int id);
    List<Libro> obtenerTodosLosLibros();
    void actualizarLibro(Libro libro);
    void eliminarLibro(int id);
}

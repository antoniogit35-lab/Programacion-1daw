import java.util.ArrayList;

public class Biblioteca {
    //Ejercicio 1: Gestion de biblioteca
    //Descripción: Crea una clase Libro con atributos como titulo, autor y añoPublicacion. Luego,
    //crea una clase Biblioteca que use un ArrayList para almacenar objetos Libro. Implementa
    //métodos para agregar libros, buscar libros por autor y listar todos los libros publicados
    //después de un año específico.

    private ArrayList<Libro> almacen;

    public Biblioteca(ArrayList<Libro> almacen) {
        this.almacen = almacen;
    }                                               // Metodo para crear la biblioteca con Libros

    @Override
    public String toString() {
        return "Biblioteca{" +
                "almacen=" + almacen +
                '}';
    }                                       //Es necesario para listar los libros de la biblioteca

    public void agregarLibros(Libro miLibro){   //Método para agregar libros
        this.almacen.add(miLibro);
    }

    public Libro buscarAutor(String autor){ //Método para buscar libro por autor
        for (Libro librillo :almacen){
            if (librillo.getAutor().equals(autor)){
                return librillo;
            }
        }
        return null;
    }
    public void listarLibros(int anio){ //Método para buscar libros superiores al año elegido
        for (Libro librillo :almacen){
            if (librillo.getAnioPublicacion() > anio){
                System.out.println(librillo);
            }
        }
    }
}

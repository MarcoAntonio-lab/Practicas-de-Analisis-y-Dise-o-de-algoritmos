
package ListasInvertidas;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Crear lista de libros peruanos
        List<Libro> libros = new ArrayList<>();
        libros.add(new Libro(1, "Los rios profundos"));
        libros.add(new Libro(2, "La ciudad y los perros"));
        libros.add(new Libro(3, "Conversacion en la catedral"));
        libros.add(new Libro(4, "El pez de oro"));
        libros.add(new Libro(5, "El sexto"));

        // Crear y construir el índice invertido
        IndiceInvertido indice = new IndiceInvertido();
        indice.construirIndice(libros);

        // Mostrar el índice completo
        System.out.println("---------INDICE INVERTIDO-------");
        indice.mostrarIndice();

        Scanner sc = new Scanner(System.in);
        System.out.print("\nIngrese una palabra a buscar: ");
        String palabra = sc.nextLine();

        Set<Integer> resultados = indice.buscarPalabra(palabra);
        if (resultados.isEmpty()) {
            System.out.println("No se encontro la palabra \"" + palabra + "\" en ningun libro.");
        } else {
            System.out.println("\nLa palabra \"" + palabra + "\" se encuentra en el libro con :");
            for (Libro libro : libros) {
                if (resultados.contains(libro.getID())) {
                    System.out.println("ID: " + libro.getID() + " ==> " + "y Titulo: "+ libro.getTitulo());
                }
            }
        }

    }
}


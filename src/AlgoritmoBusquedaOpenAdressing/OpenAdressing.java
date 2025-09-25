
package AlgoritmoBusquedaOpenAdressing;


public class OpenAdressing {
       
    public static void main(String[] args) {
        // Crear una tabla hash con tamaño 7
        TablaHashDoble tabla = new TablaHashDoble(7);

        // Insertar elementos
        tabla.insertar("gato", "10");
        tabla.insertar("perro", "30");
        tabla.insertar("tigre", "80");
        tabla.insertar("raton", "25");
        tabla.insertar("loro", "15");

        // Buscar elementos
        System.out.println("Valor de 'gato': " + tabla.obtener("gato"));
        System.out.println("Valor de 'tigre': " + tabla.obtener("tigre"));
        System.out.println("Valor de 'loro': " + tabla.obtener("loro"));
        System.out.println("Valor de 'conejo': " + tabla.obtener("conejo")); // No existe
        
        // Mostrar contenido de la tabla
        System.out.println("\nContenido de la tabla:");
        tabla.mostrarTabla();
        }
        
   }


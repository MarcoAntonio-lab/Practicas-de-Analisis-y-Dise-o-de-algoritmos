
package AlgoritmoBusquedaEncadenamiento;

public class Main {
    
     public static void main(String[] args) {
        // Crear la tabla hash con encadenamiento separado
        TablaHash tablaHash = new TablaHash(5);

        // Insertar valores, incluyendo colisiones
        tablaHash.insertar("gato", 10);
        tablaHash.insertar("perro", 20);
        tablaHash.insertar("Gallo", 50);

        // Colisionará con "gato" si usan el mismo índice
        tablaHash.insertar("tigre", 30);
        

        // Imprimir la tabla hash
        tablaHash.imprimir();

        // Obtener el valor de una clave
        System.out.println("Valor de 'gato': " + tablaHash.obtener("gato"));
        System.out.println("Valor de 'tigre': " + tablaHash.obtener("tigre"));
    }
}
 



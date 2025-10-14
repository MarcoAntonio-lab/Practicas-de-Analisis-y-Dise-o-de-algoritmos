
package Hash.Busqueda;
import java.util.HashMap;

public class BusquedaHash {
    static final int TAMANIO = 10; // Define el tamaño de la tabla hash

   static class Dato {
      int clave;
   }

   static HashMap<Integer, Dato> tablaHash = new HashMap<>(); // Define la tabla hash como un HashMap

   static int codigoHash(int clave) {
      // Devuelve un valor hash basado en la clave
      return clave % TAMANIO;
   }

   static Dato buscar(int clave) {
      // Obtener el hash
      int indiceHash = codigoHash(clave);
      
      // Recorre el mapa hasta encontrar una celda vacía o la clave buscada
      while (tablaHash.get(indiceHash) != null) {
         // Si la clave es encontrada, devuelve el Dato correspondiente
         if (tablaHash.get(indiceHash).clave == clave)
            return tablaHash.get(indiceHash);
         
         // Pasa a la siguiente celda
         ++indiceHash;
         
         // Regresa al inicio si se llega al final de la tabla
         indiceHash %= TAMANIO;
      }
      
      // Si la clave no se encuentra, devuelve null
      return null;
   }

   public static void main(String[] args) {
      // Se inicializa la tabla hash con algunos datos de ejemplo
      
      Dato dato2 = new Dato();
      dato2.clave = 25; // Suponiendo que la clave es 25
      
      Dato dato3 = new Dato();
      dato3.clave = 64; // Suponiendo que la clave es 64
      
      Dato dato4 = new Dato();
      dato4.clave = 22; // Suponiendo que la clave es 22
      
      // Calcula el índice hash para cada dato y los coloca en la tabla
      int indiceHash2 = codigoHash(dato2.clave);
      tablaHash.put(indiceHash2, dato2);
      
      int indiceHash3 = codigoHash(dato3.clave);
      tablaHash.put(indiceHash3, dato3);
      
      int indiceHash4 = codigoHash(dato4.clave);
      tablaHash.put(indiceHash4, dato4);
      
      // Llama a la función buscar para probarla
      int claveABuscar = 64; // La clave que se desea buscar en la tabla hash
      Dato resultado = buscar(claveABuscar);
      
      System.out.print("Elemento a buscar: " + claveABuscar);
      if (resultado != null) {
         System.out.println("\nElemento encontrado");
      } else {
         System.out.println("\nElemento no encontrado");
      }
   }
    
    
}

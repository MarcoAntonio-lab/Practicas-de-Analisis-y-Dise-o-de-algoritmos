
package ListasInvertidas;
import java.util.*;
public class IndiceInvertido {
    Map<String, Set<Integer>> indice = new HashMap<>();
    
    public void construirIndice(List<Libro> libros) {
        for (Libro libro : libros) {
            String[] palabras = libro.getTitulo().toLowerCase().split(" ");
            for (String palabra : palabras) {
                palabra = palabra.replaceAll("[^a-záéíóúñ]", "");
                if (!palabra.isEmpty()) {
                    if (!indice.containsKey(palabra)) {
                        indice.put(palabra, new HashSet<>());
                    }
                    indice.get(palabra).add(libro.getID());
                }
            }
        }
    }

    public void mostrarIndice() {
        for (String palabra : indice.keySet()) {
            System.out.println(palabra + " ==> " + indice.get(palabra));
        }
    }

    public Set<Integer> buscarPalabra(String palabra) {
        return indice.getOrDefault(palabra.toLowerCase(), new HashSet<>());
    }
}
    


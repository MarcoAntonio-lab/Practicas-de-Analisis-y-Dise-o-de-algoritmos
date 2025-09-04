
package AlgoritmoMezclaDirecta;


public class DirectMergeSort {
    
    public static void mezclaDirecta(int[] arr, int inicio, int fin) {
        if (inicio < fin) {
            int medio = (inicio + fin) / 2;

            // Ordenar la primera mitad
            mezclaDirecta(arr, inicio, medio);

            // Ordenar la segunda mitad
            mezclaDirecta(arr, medio + 1, fin);

            // Mezclar ambas mitades
            mezclar(arr, inicio, medio, fin);
        }
     }
    public static void main(String[] args) {
        
       int[] numeros = {8, 3, 1, 9, 5, 4, 2, 7, 6};

        System.out.println("Arreglo original:");
        mostrarArreglo(numeros);

        mezclaDirecta(numeros, 0, numeros.length - 1);

        System.out.println("\nArreglo ordenado:");
        mostrarArreglo(numeros);
    }
    }
}

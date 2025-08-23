
package ejer3;


public class Ejer3 {
 

    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            // Mueve los elementos que son mayores que key una posición adelante
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] numeros = { 5, 2, 9, 1, 7 };

        System.out.println("Antes de ordenar:");
        for (int num : numeros) {
            System.out.print(num + " ");
        }

        insertionSort(numeros);

        System.out.println("\nDespués de ordenar:");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
    }
}
    

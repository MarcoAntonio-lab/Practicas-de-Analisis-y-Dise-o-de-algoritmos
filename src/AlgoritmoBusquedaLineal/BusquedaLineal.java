
package AlgoritmoBusquedaLineal;


public class BusquedaLineal {
    public static int seqSearch(int[] list, int target) {
        for (int j = 0; j < list.length; j++){
            if (list[j] == target) {             // compara si el elemento actual es igual al que buscamos
            return j;   // si lo encuentra, devuelve la posición (índice) donde está
            }
        }
        return -1;   // si no lo encuentra en todo el arreglo, devuelve -1
    }

public static void main(String[] args) {
        int[] numeros = {10, 25, 30, 5, 18};

        int resultado = seqSearch(numeros, 5);

        if (resultado != -1) {
            System.out.println("Elemento encontrado en la posición: " + resultado);
        } else {
            System.out.println("Elemento no encontrado.");
        }    
    }
}

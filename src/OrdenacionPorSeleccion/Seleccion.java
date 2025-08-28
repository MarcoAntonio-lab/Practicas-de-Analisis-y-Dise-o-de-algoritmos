
package OrdenacionPorSeleccion;


public class Seleccion {
    public static void seleccion(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n-1; i++){
            int min_idx = i;
            for (int j= i+1; j < n; j++){
                if (arr[j] < arr[min_idx]){
                    min_idx = j;
                }
        }
        // Intercambiar arr[i] y arr[min_idx]
        int temp = arr[min_idx];
        arr[min_idx] = arr[i];
        arr[i] = temp;
        }
    }
    public static void main(String[] args) {
       // ordenacion por seleccion
    int [] numeros = {4, 6, 5, 8, 9}; 
    seleccion(numeros);
    for (int num : numeros) {
            System.out.print(num + " ");                 
        }
    }
}
 

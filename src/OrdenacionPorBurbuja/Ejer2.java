
package OrdenacionPorBurbuja;


public class Ejer2 {
    public static void burbuja(int [] arr){
        int n = arr.length; 
        for (int i = 0; i < n-1; i++){
            for (int j = 0; j < n-i-1; j++){
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
     }
    public static void main(String[] args) {
       // ordenacion por burbuja 
    int [] numeros = {4, 6, 5, 7, 8}; 
    burbuja(numeros);
    for (int num : numeros) {
            System.out.print(num + " ");
        }
    } 
}
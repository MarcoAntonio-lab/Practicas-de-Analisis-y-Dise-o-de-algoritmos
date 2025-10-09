
package AlgoritmoBusquedaBloques;
import java.io.*;
import java.util.Scanner;
import java.lang.Math;

public class BusquedaSecuencialMedianteBloques {
    
   static int jump_search(int arr[], int n, int key) {
      int i, j, m, k;
      i = 0;
      m = (int)Math.sqrt(n);
      k = m;
      while(arr[m] <= key && m < n) {
         i = m;
         m += k;
         if(m > n - 1)
            return -1;
      }
      
      // búsqueda lineal en el bloque
      for(j = i; j<m; j++) {
         if(arr[j] == key)
            return j;
      }
      return -1;
   }
   public static void main(String args[]) {
      int i, n, key, index;
      int arr[] = {0, 6, 12, 14, 19, 22, 48, 66, 79, 88, 104, 126, 150};
	  System.out.println("Los elementos de la matriz son : ");
	  for(int j = 0; j<arr.length; j++){
	     System.out.print(arr[j] + " ");
	  }
      n = 12;
      key = 66;
	  System.out.println("\nEl elemento a buscar: "+ key);
      index = jump_search(arr, n, key);
      if(index >= 0)
         System.out.print("El elemento es encontrado en la posicion " + (index+1));
      else
         System.out.print("Busqueda fallida");
   }
   
}


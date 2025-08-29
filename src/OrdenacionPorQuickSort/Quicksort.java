
package OrdenacionPorQuickSort;

import java.util.Arrays;

public class Quicksort {
    // Método para realizar QuickSort en el array 
    public  static  void  quickSort ( int [] array, int low, int high) { 
        if (low < high) { 
            // Particionar el array y obtener el índice pivote 
            int  pivotIndex  = partition(array, low, high); 

            // Ordenar recursivamente los elementos antes y después de la partición
            quickSort(array, low, pivotIndex - 1 ); 
            quickSort(array, pivotIndex + 1 , high); 
        } 
    } 

    // Método para particionar el array 
    public  static  int  partition ( int [] array, int low, int high) { 
        // Elegir el último elemento como pivote 
        int  pivot  = array[high]; 
        
        // Puntero para el elemento mayor 
        int  i  = low - 1 ; 

        // Recorre todos los elementos 
        // Si el elemento es menor o igual que el pivote, cámbialo 
        for ( int  j  = low; j < high; j++) { 
            if (array[j] <= pivot) { 
                i++; 

                // Intercambia los elementos en i y j 
                int  temp  = array[i]; 
                array[i] = array[j]; 
                array[j] = temp; 
            } 
        } 

        // Intercambia el elemento pivote con el elemento en i+1 
        int  temp  = array[i + 1 ]; 
        array[i + 1 ] = array[high]; 
        array[high] = temp; 

        // Devuelve el índice de partición 
        return i + 1 ; 
    } 

    // Método de utilidad para imprimir el array 
    public  static  void  printArray ( int [] array) { 
        System.out.println(Arrays.toString(array)); 
    } 

    public  static  void  main (String[] args) { 
        int [] arr = { 9 , 7 , 5 , 11 , 12 , 2 , 14 ,3 , 10 , 6 }; 
        System.out.println( "Matriz original:" ); 
        printArray(arr); 

        // Realizar ordenamiento rápido
         quickSort(arr, 0 , arr.length - 1 ); 

        System.out.println( "Matriz ordenada:" ); 
        printArray(arr); 
    } 
}
    


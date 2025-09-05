
package OrdenacionPorQuickSort;
import java.util.Random;
import java.util.Arrays;

public class Quicksort {
    private static void quicksort(int[] array) {
    quicksort(array, 0, array.length - 1);
  }

  private static void quicksort(int[] array, int lowIndex, int highIndex) {

    if (lowIndex >= highIndex) {
      return;
    }
    //Se selecciona un pivote 
    int pivotIndex = new Random().nextInt(highIndex - lowIndex) + lowIndex;
    int pivot = array[pivotIndex];
    swap(array, pivotIndex, highIndex);
    
    int leftPointer = partition(array, lowIndex, highIndex, pivot);

    quicksort(array, lowIndex, leftPointer - 1);
    quicksort(array, leftPointer + 1, highIndex);

  }

  private static int partition(int[] array, int lowIndex, int highIndex, int pivot) {
    // Se crea dos punteros 
    int leftPointer = lowIndex;
    int rightPointer = highIndex - 1;

    while (leftPointer < rightPointer) {

      // Camnia desde la izquierda hasta encontrar un número mayor que el pivote o llegar al puntero derecho.
      while (array[leftPointer] <= pivot && leftPointer < rightPointer) {
        leftPointer++;
      }

      // Camina desde la derecha hasta que encontremos un número menor que el pivote o lleguemos al puntero izquierdo.
      while (array[rightPointer] >= pivot && leftPointer < rightPointer) {
        rightPointer--;
      }

      swap(array, leftPointer, rightPointer);
    }
    
    return leftPointer;
  }
  //Metodo de intercambio
  private static void swap(int[] array, int index1, int index2) {
    int temp = array[index1];
    array[index1] = array[index2];
    array[index2] = temp;
  }

  private static void printArray(int[] numbers) {
    for (int i = 0; i < numbers.length; i++) {
      System.out.println(numbers[i]);
    }
  }
   public static void main(String[] args) {
    Random rand = new Random();
    int[] numbers = new int[10];

    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = rand.nextInt(100);
    }

    System.out.println("Before:");
    printArray(numbers);

    quicksort(numbers);

    System.out.println("\nAfter:");
    printArray(numbers);
  }
}
    


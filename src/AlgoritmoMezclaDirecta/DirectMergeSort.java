
package AlgoritmoMezclaDirecta;

import java.util.Random;
public class DirectMergeSort {
    
    private static void mergeSort(int[] inputArray){
        int inputLenght = inputArray.length;
        if (inputLenght < 2){
            return;
        }
        //Dividir la matriz original 
        int midIndex = inputLenght/2;
        int [] leftHalf = new int[midIndex];
        int [] rightHalf = new int[inputLenght-midIndex];
        
        //rellenar la matriz dividida 
        for(int i = 0; i < midIndex; i++){
            leftHalf[i] = inputArray[i];        
        }
        for(int i = midIndex; i < inputLenght; i++){
            rightHalf[i-midIndex] = inputArray[i];        
        }
        //Llamamos recursivamente al metodo para que combine y ordene la matriz de la izquierda y derecha 
        mergeSort(leftHalf);
        mergeSort(rightHalf);
        
        merge(inputArray, leftHalf, rightHalf);
    }
    private static void merge(int[] inputArray, int[] leftHalf, int[] rightHalf){
        int leftSize = leftHalf.length;
        int rightSize = rightHalf.length;
        
        int i = 0; //iterador izquierda
        int j = 0; //iterador derecha 
        int k = 0; //iterador matriz fusionada 
        
        while (i < leftSize && j < rightSize){
            if (leftHalf[i] <= rightHalf[j]){
                inputArray[k] = leftHalf[i];
                i++;
            }
            else {
                inputArray[k] = rightHalf[i];
                j++;
            }
            k++;
        }
        while (i < leftSize){
            inputArray[k] = leftHalf[i];
            i++;
            k++;
        }
         while (j < rightSize){
            inputArray[k] = rightHalf[j];
            j++;
            k++;
        }
    }
    private static void printArray(int[] numbers){
        for (int i = 0; i < numbers.length; i++) {
        System.out.println(numbers[i]);
        }  
    } 
    public static void main(String[] args) {
        
        Random rand = new Random();
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(10);
        }

        System.out.println("Before:");
        printArray(numbers);

        mergeSort(numbers);

        System.out.println("\nAfter:");
        printArray(numbers);

        
    
    }
}

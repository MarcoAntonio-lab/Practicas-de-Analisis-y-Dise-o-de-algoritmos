
package AlgortimoPorMezclaNatural;
import java.util.ArrayList;
import java.util.List;
public class MezclaNatural {
     public static void fusionNatural(int[] arr) {
        if (arr.length <= 1) return;

        boolean ordenado = false;

        while (!ordenado) {
            List<int[]> runs = new ArrayList<>();
            int i = 0;

            // Detectar runs naturales
            while (i < arr.length) {
                int start = i;
                while (i < arr.length - 1 && arr[i] <= arr[i + 1]) {
                    i++;
                }
                int end = i;
                int[] run = new int[end - start + 1];
                for (int k = 0; k < run.length; k++) {
                    run[k] = arr[start + k];
                }
                runs.add(run);
                i++;
            }

            // Si solo hay un run, el arreglo está ordenado
            if (runs.size() == 1) {
                ordenado = true;
                break;
            }

            // Fusionar runs en pares
            List<int[]> mergedRuns = new ArrayList<>();
            for (int j = 0; j < runs.size(); j += 2) {
                if (j + 1 < runs.size()) {
                    mergedRuns.add(merge(runs.get(j), runs.get(j + 1)));
                } else {
                    mergedRuns.add(runs.get(j)); // Si hay uno sobrante
                }
            }

            // Combinar runs fusionados en el array original
            int index = 0;
            for (int[] run : mergedRuns) {
                for (int val : run) {
                    arr[index++] = val;
                }
            }
        }
    }

    // Método para fusionar dos arrays ordenados
    private static int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                result[k++] = left[i++];
            } else {
                result[k++] = right[j++];
            }
        }
        while (i < left.length) {
            result[k++] = left[i++];
        }
        while (j < right.length) {
            result[k++] = right[j++];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {5, 7, 9, 3, 4, 8, 1, 2};

        System.out.println("Antes de ordenar:");
        for (int n : arr) {
            System.out.print(n + " ");
        }

        fusionNatural(arr);

        System.out.println("\nDespues de ordenar:");
        for (int n : arr) {
            System.out.print(n + " ");
        }
    }
}
    


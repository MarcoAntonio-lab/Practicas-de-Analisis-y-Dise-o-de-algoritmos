
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
    
}

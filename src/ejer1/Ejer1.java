
package ejer1;


public class Ejer1 {

    public static void main(String[] args) {
        
        int[] numeros ={ 1, 2, 4, 60, 54};
        boolean buscar = Buscar.buscarElemento(numeros, 54);

        if (buscar) {
            System.out.println("Elemento encontrado en la lista");
        } else {
            System.out.println("Elemento NO encontrado en la lista");
        }
    }
    }
    


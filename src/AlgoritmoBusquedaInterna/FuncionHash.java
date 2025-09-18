
package AlgoritmoBusquedaInterna;


public class FuncionHash {
    public static int funcionHash(String clave, int tamanioTabla) {
       int valorHash = 0;

       for (int i = 0; i < clave.length(); i++) {
            char c = clave.charAt(i);
            valorHash += ((int) c - (int) 'a') + 1; //convierte a codigo ASCII
       }

       return valorHash % tamanioTabla;
    }
    public static void main(String[] args) {
        // Inicializamos la tabla hash de tamaño 7
        String[] tablaHash = new String[7];

        // Valores a insertar
        String[] strings = {"ab", "cd", "efg"};
        int tamanioTabla = tablaHash.length;

        // Insertamos los valores
        for (String string : strings) {
            int indice = funcionHash(string, tamanioTabla);
            tablaHash[indice] = string;
        }

        // Imprimimos la tabla hash
        for (int i = 0; i < tablaHash.length; i++) {
            System.out.println("indice " + i + ": " + tablaHash[i]);
        }
    } 
}

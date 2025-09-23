
package AlgoritmoBusquedaEncadenamiento;
import java.util.LinkedList;

public class TablaHash {
    private int tamano;
    private LinkedList<Par>[] tabla;

    // Clase interna para almacenar clave-valor
    private static class Par {
        String clave;
        int valor;
        Par(String clave, int valor) {
            this.clave = clave;
            this.valor = valor;
        }
        @Override
        public String toString() {
        return "(" + clave + " -> " + valor + ")";
        }
    }
    // Implementación de una tabla hash con encadenamiento separado
    public TablaHash(int tamano) {
        this.tamano = tamano;
        tabla = new LinkedList[tamano];
        for (int i = 0; i < tamano; i++) {
            tabla[i] = new LinkedList<>();
        }
    }
    // Calculamos el índice usando la suma de los valores ASCII de los caracteres mod el tamaño de la tabla
    private int funcionHash(String clave) {
        int suma = 0;
        for (char c : clave.toCharArray()) {
            suma += (int) c; // valor ASCII
        }
        return suma % tamano;
    }
    // Añadimos el par clave-valor en la lista del indice correspondiente
    public void insertar(String clave, int valor) {
       int indice = funcionHash(clave);
       tabla[indice].add(new Par(clave, valor));
    }
    public Integer obtener(String clave) {
        int indice = funcionHash(clave);
        // Buscamos en la lista enlazada del índice por la clave
        for (Par par : tabla[indice]) {
            if (par.clave.equals(clave)) {
                return par.valor;
            }
        }
        return null; // No se encontró la clave
    }
    public void imprimir() {
        for (int i = 0; i < tabla.length; i++) {
            System.out.println("indice " + i + ": " + tabla[i]);
        }
    }
}

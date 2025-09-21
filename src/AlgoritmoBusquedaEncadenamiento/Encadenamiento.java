
package AlgoritmoBusquedaEncadenamiento;
import java.util.LinkedList;

public class Encadenamiento {
    private int tamano;
    private LinkedList<Par>[] tabla;

    // Clase interna para almacenar clave-valor
    private static class Par {
        String clave;
        String valor;

        Par(String clave, String valor) {
            this.clave = clave;
            this.valor = valor;
        }
    }

    // Constructor
    public Encadenamiento(int tamano) {
        this.tamano = tamano;
        tabla = new LinkedList[tamano];
        for (int i = 0; i < tamano; i++) {
            tabla[i] = new LinkedList<>();
        }
    }
    private int funcionHash(String clave) {
        int suma = 0;
        for (char c : clave.toCharArray()) {
            suma += (int) c; // valor ASCII
        }
        return suma % tamano;
    }

}

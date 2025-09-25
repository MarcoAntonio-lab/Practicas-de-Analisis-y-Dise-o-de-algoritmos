
package AlgoritmoBusquedaColisiones2;

public class TablaHashDoble {
    
    private int tamano;
    private Object[] tabla;

    public TablaHashDoble(int tamano) {
        this.tamano = tamano;
        this.tabla = new Object[tamano];
    }

    // Función hash primaria
    public int funcionHashPrimaria(String clave) {
        int suma = 0;
        for (char c : clave.toCharArray()) {
            suma += (int) c;
        }
        return suma % tamano;
    }

    // Función hash secundaria (debe ser diferente de cero)
    public int funcionHashSecundaria(String clave) {
        int suma = 0;
        for (char c : clave.toCharArray()) {
            suma += (int) c;
        }
        return 1 + (suma % (tamano - 1));
    }

    public void insertar(String clave, Object valor) {
        int indice = funcionHashPrimaria(clave);
        int desplazamiento = funcionHashSecundaria(clave);

        // Aplicamos doble hashing hasta encontrar un índice vacío
        while (tabla[indice] != null) {
            indice = (indice + desplazamiento) % tamano;
        }
        tabla[indice] = valor;
    }
}

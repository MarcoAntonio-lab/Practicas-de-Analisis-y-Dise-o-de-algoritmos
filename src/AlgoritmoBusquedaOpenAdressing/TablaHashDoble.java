
package AlgoritmoBusquedaOpenAdressing;

public class TablaHashDoble {
    
    private int tamano;
    private Entrada[] tabla;

    // Clase interna para representar pares clave-valor
    private static class Entrada {
        String clave;
        String valor;

        Entrada(String clave, String valor) {
            this.clave = clave;
            this.valor = valor;
        }
    }

    public TablaHashDoble(int tamano) {
        this.tamano = tamano;
        this.tabla = new Entrada[tamano];
    }

    // Función hash primaria
    private int funcionHashPrimaria(String clave) {
        int suma = 0;
        for (char c : clave.toCharArray()) {
            suma += (int) c;
        }
        return suma % tamano;
    }

    // Función hash secundaria
    private int funcionHashSecundaria(String clave) {
        int suma = 0;
        for (char c : clave.toCharArray()) {
            suma += (int) c;
        }
        return 1 + (suma % (tamano - 1));
    }

    // Método para insertar clave-valor
    public void insertar(String clave, String valor) {
        int indice = funcionHashPrimaria(clave);
        int desplazamiento = funcionHashSecundaria(clave);

        while (tabla[indice] != null) {
            indice = (indice + desplazamiento) % tamano;
        }

        tabla[indice] = new Entrada(clave, valor);
    }

    public String obtener(String clave) {
        int indice = funcionHashPrimaria(clave);
        int desplazamiento = funcionHashSecundaria(clave);

        // Buscamos en la tabla usando doble hashing
        while (tabla[indice] != null) {
            if (tabla[indice].clave.equals(clave)) {
                return tabla[indice].valor;
            }
                indice = (indice + desplazamiento) % tamano;
        }
    return null; // No se encontró la clave
    }
    public void mostrarTabla() {
        for (int i = 0; i < tamano; i++) {
            if (tabla[i] != null) {
                System.out.println("Indice " + i + " : " + tabla[i].clave + " → " + tabla[i].valor);
            } else {
                System.out.println("Indice " + i + ": vacio");
            }        
        }
    }
 }
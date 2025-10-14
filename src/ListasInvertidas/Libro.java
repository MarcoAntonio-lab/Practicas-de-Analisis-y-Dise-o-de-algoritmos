
package ListasInvertidas;

public class Libro {
    private int ID; 
    private String titulo; 

    public Libro(int ID, String titulo) {
        this.ID = ID;
        this.titulo = titulo;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "Libro{" + "ID=" + ID + ", titulo=" + titulo + '}';
    }
    
    
    
}

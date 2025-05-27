
public class Celda {

    private char contenido; // Ej: ' ', 'S', '*', 'L', 'C', etc.
    private Personaje personaje;
    private Objeto Objeto;

    //CONSTRUCTOR
    public Celda(char contenido) {
        this.contenido = contenido;

    }

    //GETTERS AND SETTERS
    public char getContenido() {
        return contenido;
    }

    public void setContenido(char contenido) {
        this.contenido = contenido;
    }

    public Personaje getPersonaje() {
        return personaje;
    }

    public void setPersonaje(Personaje personaje) {
        this.personaje = personaje;
    }

    public Objeto getObjeto() {
        return Objeto;
    }

    public void setObjeto(Objeto Objeto) {
        this.Objeto = Objeto;
    }

    //METODOS
    /*public boolean estaVacia() {
        return contenido == ' ' && personaje ==  null && Objeto == null;
    }
     */
}


public class Celda {

    private char inicial; // Ej: ' ', 'S', '*', 'L', 'C', etc.
    private Personaje personaje;
    private Objeto Objeto;

    //CONSTRUCTOR
    public Celda(char inicial) {
        this.inicial = inicial;

    }

    //GETTERS AND SETTERS
    public char getInicial() {
        return inicial;
    }

    public void setInicial(char inicial) {
        this.inicial = inicial;
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
  
}

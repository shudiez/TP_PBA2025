/*
Esta clase representa a una SOLA celda del mapa del juego. 
*/
public class Celda {

    //Una inicial (como ' ', 'S', '*', 'L', 'C'.) que es lo que se va a ver en el mapa
    private char inicial; 
    //Un personaje que es el que va a estar parado en la celda (Snake, guardia).
    private Personaje personaje;
    //Un objeto, que nos va a servir para agarrarlo como la llave, C4 o por ejemplo entrar al Hangar, la puerta, etc.
    private Objeto objeto;

    //CONSTRUCTOR
    /*
    Cuando creo una celda, le tengo que pasar la inicial que quiero que tenga. Esto puede cambiar despues con los setters igual.
    */
    public Celda(char inicial) {
        this.inicial = inicial;

    }

    //GETTERS AND SETTERS
    /*
    Los metodos get y set van a  leer o modificar los atributos privados. 
    Uso esto para mantener el encapsulamiento.
    */
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
        return objeto;
    }

    public void setObjeto(Objeto Objeto) {
        this.objeto = Objeto;
    }


   
}

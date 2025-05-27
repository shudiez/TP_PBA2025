public class Objeto {
    private String tipo;
    private char inicial;

    //CONSTRUCTOR
    public Objeto(String tipo, char inicial) {
        this.tipo = tipo;
        this.inicial = inicial;
    }

    //GETTERS 
    public String getTipo() {
        return tipo;
    }

    public char getinicial() {
        return inicial;
    }
}

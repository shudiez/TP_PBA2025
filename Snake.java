package tp1_pba;

public class Snake extends Personaje {

    //Atributos 
    private boolean tarjetaDeAcceso;
    private boolean exploxivo_C4;

    //constructor
    public Snake(boolean tarjetaDeAcceso, boolean exploxivo_C4, String nombre_personaje, int vida_personaje, boolean estaVivoONo, char inicial_personaje, Posicion posicion_personaje) {
        super(nombre_personaje, vida_personaje, estaVivoONo, inicial_personaje, posicion_personaje);
        this.tarjetaDeAcceso = false;//lo inicializo con un false porque no tiene
        this.exploxivo_C4 = false;//lo inicializo con un false porque no tiene
    }

    //getters and setters

    public boolean TarjetaDeAcceso() {
        return tarjetaDeAcceso;
    }

    public void setTarjetaDeAcceso(boolean tarjetaDeAcceso) {
        this.tarjetaDeAcceso = tarjetaDeAcceso;
    }

    public boolean Exploxivo_C4() {
        return exploxivo_C4;
    }

    public void setExploxivo_C4(boolean exploxivo_C4) {
        this.exploxivo_C4 = exploxivo_C4;
    }
    
    
    //metodo
    @Override
    public void mover() {
//Falta armar
    }
}

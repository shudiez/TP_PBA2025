package tp1_pba;

//Enemigo patrullante, hereda de Personaje e implementa Enemigo
public class Guardia extends Personaje implements Enemigo {

    //Constructor
    public Guardia(String nombre_personaje, int vida_personaje, boolean estaVivo, char inicial_personaje, Posicion posicion_personaje) {
        super(nombre_personaje, vida_personaje, estaVivo, inicial_personaje, posicion_personaje);
    }

    //Metodos
    @Override
    public void mover() {
        //Falta cargar
    }
    /*
    @Override
    public void patrullar() {
//falta cargar
    }

    @Override
    public void atacar() {
//falta cargar
    }
     */
}

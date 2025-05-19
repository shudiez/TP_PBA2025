package tp1_pba;

public class Guardia extends Personaje implements Enemigo {

    //Constructor
    public Guardia(String nombre_personaje, int vida_personaje, boolean estaVivoONo, char inicial_personaje, Posicion posicion_personaje) {
        super(nombre_personaje, vida_personaje, estaVivoONo, inicial_personaje, posicion_personaje);
    }

    
    //Metodos
    @Override
    public void mover() {
        //Falta cargar
    }

    @Override
    public void patrullar() {
//falta cargar
    }

    @Override
    public void atacar() {
//falta cargar
    }

}

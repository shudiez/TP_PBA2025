package tp1_pba;

//Enemigo final, hereda de Personaje e implementa Enemigo
public class MetalGear extends Personaje implements Enemigo {

    //Constructor
    public MetalGear(String nombre_personaje, int vida_personaje, boolean estaVivo, char inicial_personaje, Posicion posicion_personaje) {
        super(nombre_personaje, vida_personaje, estaVivo, inicial_personaje, posicion_personaje);
    }

    //Metodos que implementa de la clase abstacta Enemigo
    @Override
    public void mover() {
//falta cargar
    }

    public void patrullar() {
//falta cargar
    }

    public void atacar() {
//falta cargar
    }

    boolean estaVivo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

  

}

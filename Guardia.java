package tp1_pba;

//Enemigo patrullante, hereda de Personaje e implementa Enemigo
public class Guardia extends Personaje implements Enemigo {

    //Constructor
    public Guardia(Posicion posicion){
        super("Guardia",posicion);
    }

    //Metodos
    @Override
    public void mover(string direccion) {
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

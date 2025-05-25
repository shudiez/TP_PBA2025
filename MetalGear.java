package tp1_pba;

//Enemigo final, hereda de Personaje e implementa Enemigo
import java.util.Random;

public class MetalGear extends Personaje implements Enemigo {

    //Constructor     
    public MetalGear(String nombre, int vida, char inicial, Posicion posicion) {
        super("REX", 100, 'M', new Posicion(0, 0));
    }

    //Metodos que implementa de la clase abstacta Enemigo
    public void atacar() {

        Random random = new Random();
        //esto va a hacer un daño aleatorio entre 15 y 40 a Rex
        int danio = random.nextInt(40 - 15 + 1) + 15;

    }

    @Override
    public void mover(String direccion, Mapa mapa) {
    }

    @Override
    public void patrullar(Mapa mapa) {
    }

    @Override
    public boolean detectarSnake(Snake snake) {
        return true;
    }

}

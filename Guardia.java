
import java.util.Random;

//CONSTRUCTOR
public class Guardia extends Personaje implements Enemigo {

    public Guardia(String nombre, Posicion posicion) {
        super(nombre, 50, '*', posicion);
    }

    //METODOS
    @Override
    public void patrullar(Mapa mapa) {
        Random rand = new Random();
        int direccion = rand.nextInt(4); // 0=arriba, 1=abajo, 2=izq, 3=der
        String dir = "";

        if (direccion == 0) {
            dir = "arriba";
        }
        if (direccion == 1) {
            dir = "abajo";
        }
        if (direccion == 2) {
            dir = "izq";
        }
        if (direccion == 3) {
            dir = "der";
        }

        mapa.moverPersonaje(this, dir);
    }

    @Override
    public boolean detectarSnake(Snake snake) {
        // Si Snake está a 1 bloque de distancia (horizontal o vertical)
        int dx = Math.abs(this.posicion.getX() - snake.getPosicion().getX());
        int dy = Math.abs(this.posicion.getY() - snake.getPosicion().getY());
        return (dx + dy == 1);
    }

    @Override
    public void atacar(Snake snake) {
        // Ataque simple
        snake.recibirDanio(15);
    }

    @Override
    public void mover(Mapa mapa, String direccion) {
        mapa.moverPersonaje(this, direccion);
    }
}

import java.util.Random;

public class MetalGear extends Personaje implements Enemigo {
   
    //CONSTRUCTOR
    public MetalGear(Posicion posicion) {
        super("Metal Gear REX", 100, posicion);
    }

    //METODOS
    @Override
    public void patrullar(Mapa mapa) {
        // No patrulla, es fijo
    }

    @Override
    public boolean detectarSnake(Snake snake) {
        // No se usa en la batalla final
        return false;
    }

    @Override
    public void atacar(Snake snake) {
        Random rand = new Random();
        int danio = rand.nextInt(26) + 15; // 15 a 40
        snake.recibirDanio(danio);
    }

    public void recibirDanio(int danio) {
        this.vida = this.vida - danio;
        if (this.vida < 0) {
            this.vida = 0;
        }
    }

    @Override
    public void mover(Mapa mapa, String direccion) {
        //No se mueve, es fijo
    }
}

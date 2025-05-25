package tp1_pba;

//Enemigo patrullante, hereda de Personaje e implementa Enemigo
public class Guardia extends Personaje implements Enemigo {

    //Constructor
    public Guardia(String nombre, int vida, char inicial, Posicion posicion) {
        super("Guardia", vida, '*', posicion);
    }

    //Metodos
    @Override
    public void mover(String direccion, Mapa mapa) {

    }

    @Override
    public void patrullar(Mapa mapa) {
        int x = posicion.getX();
        int y = posicion.getY();

        if (x + 1 < 7) {
            posicion.setX(x + 1);
        } else {
            posicion.setX(x - 1);
        }
    }

    @Override
    public boolean detectarSnake(Snake snake) {
        return posicion.distancia(snake.getPosicion()) <= 1;
    }

}

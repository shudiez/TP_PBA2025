
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
        String direc = "";

        if (direccion == 0) {
            direc = "arriba";
        }
        if (direccion == 1) {
            direc = "abajo";
        }
        if (direccion == 2) {
            direc = "izq";
        }
        if (direccion == 3) {
            direc = "der";
        }

        mapa.moverPersonaje(this, direc);
    }

    @Override
     public boolean detectarSnake(Snake snake) {
    // Obtener la posición del guardia (este objeto)
    int guardiaX = this.posicion.getX();
    int guardiaY = this.posicion.getY();

    // Obtener la posición de Snake
    int snakeX = snake.getPosicion().getX();
    int snakeY = snake.getPosicion().getY();

    // Comparar si están arriba, abajo, izquierda o derecha (uno al lado del otro)
    // Arriba
    if (guardiaX - 1 == snakeX && guardiaY == snakeY) {
        return true;
    }
    // Abajo
    if (guardiaX + 1 == snakeX && guardiaY == snakeY) {
        return true;
    }
    // Izquierda
    if (guardiaX == snakeX && guardiaY - 1 == snakeY) {
        return true;
    }
    // Derecha
    if (guardiaX == snakeX && guardiaY + 1 == snakeY) {
        return true;
    }
    // Si no está en ninguna de esas posiciones, no lo detecta
    return false;
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

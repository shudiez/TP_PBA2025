
import java.util.Random;

/*
La clase Guardia representa a un enemigo del juego. Heredan de la clase Personaje, y tambien, implementa la interfaz Enemigo.
Como hereda de Personaje, puede usar todo lo que tiene la clase Personaje, nombre, vida, posición, etc.
Como implementa Enemigo, esta obligado a escribir los metodos patrullar, detectarSnake y atacar.
 */
public class Guardia extends Personaje implements Enemigo {

//CONSTRUCTOR
    // Cuando creo un guardia, le paso el nombre y la posición. 
    public Guardia(String nombre, Posicion posicion) {
        super(nombre, 100, posicion);
    }

    //METODOS
    /*
    Este método usa Random para moverse aleatoriamente
    0: arriba,1: abajo, 2: izquierda,3: derecha
    Después llama a mapa.moverPersonaje(...) para moverse en esa dirección.
     */
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

    /*
    Este metodo detecta si el personaje Snake esta justo al lado del guardia (arriba, abajo, izquierda o derecha). 
    Devuelve true si esta cerca y false si no.
    Esto sirve para que el guardia sepa cuando atacar.
     */
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

    /*
    Este metodo hace que el guardia le saque puntos de vida a Snake. Llama a snake.recibirDanio(100).
     */
    @Override
    public void atacar(Snake snake) {
        // Ataque simple
        snake.recibirDanio(100);
    }

    /*
    Este metodo viene de la clase Personaje y lo sobreescribi para que el guardia pueda moverse manualmente si lo necesita.
     */
    @Override
    public void mover(Mapa mapa, String direccion) {
        mapa.moverPersonaje(this, direccion);
    }
}

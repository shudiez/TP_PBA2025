
public interface Enemigo {

    // Este metodo va a hacer que los enemigos tengan un comportamiento de patrullaje, o sea, que se muevan por el mapa de forma automatica.
    void patrullar(Mapa mapa);

    //Este metodo devuelve true si el enemigo logra detectar a Snake a una celda de distancia, o false si no lo ve.
    boolean detectarSnake(Snake snake);

    //Si el enemigo detecta a Snake, este metodo le permite atacarlo.
    void atacar(Snake snake);
}

/*
La interfaz Enemigo permite tener distintos tipos de enemigos (como guardias, metalGear) que se comportan distinto,
pero todos cumplen las mismas funciones basicas como patrullar, detectar y atacar.
*/
public interface Enemigo {

    // Este metodo va a hacer que los enemigos tengan un comportamiento de patrullaje, o sea, que se muevan por el mapa de forma automatica.
    void patrullar(Mapa mapa);

    //Este metodo devuelve true si el enemigo logra detectar a Snake a una celda de distancia, o false si no lo ve.
    boolean detectarSnake(Snake snake);

    //Si el enemigo detecta a Snake, este metodo le permite atacarlo.
    void atacar(Snake snake);
}

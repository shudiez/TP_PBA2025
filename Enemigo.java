
public interface Enemigo {

    void patrullar(Mapa mapa);

    boolean detectarSnake(Snake snake);

    void atacar(Snake snake);
}

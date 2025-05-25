package tp1_pba;

//Interfaz para comportamiento de enemigos
public interface Enemigo {

    //meotodos
    public void patrullar(Mapa mapa);

    public boolean detectarSnake(Snake snake);

}

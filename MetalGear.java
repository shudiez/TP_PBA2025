
public abstract class Mision {

    protected boolean completada = false;

    public abstract void iniciar(Snake snake, Mapa mapa);

    public boolean estaCompleta() {
        return completada;
    }
}

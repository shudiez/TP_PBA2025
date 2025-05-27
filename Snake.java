public class Snake extends Personaje {
    
    //CONSTRUCTOR
    public Snake(Posicion posicion) {
        super("Snake", 100,  posicion);
    }

    //METODOS
    @Override
    public void mover(Mapa mapa, String direccion) {
        // Movimiento del jugador, ej: "arriba", "abajo", "izq", "der"
        mapa.moverPersonaje(this, direccion);
    }

    public void recibirDanio(int danio) {
        this.vida = this.vida - danio;
        if (this.vida < 0) {
            this.vida = 0;
        }
    }
}

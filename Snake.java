package tp1_pba;

//Jugador, hereda de Personaje
public class Snake extends Personaje {

    //constructor
    public Snake(String nombre, int vida, char inicial, Posicion posicion) {
        super("Snake", vida, 'S', posicion);
    }

    //metodos
    @Override
    public void mover(String direccion, Mapa mapa) {
        int x = posicion.getX();
        int y = posicion.getY();

        if (direccion.equals("Arriba") && x > 0) {
            posicion.setX(x - 1);
        } else if (direccion.equals("Abajo") && x < 6) {
            posicion.setX(x + 1);
        } else if (direccion.equals("Izquierda") && y > 0) {
            posicion.setY(y - 1);
        } else if (direccion.equals("Derecha") && y < 6) {
            posicion.setY(y + 1);
        } else {
            System.out.println("La direccion no es correcta.");
        }
    }
}

/* public void dispararMisil(Personaje Metalgear) {
        //Si le dispara a Rex(Metal Gear), le resta -20 HP
        Random random = new Random();

        //esto va a hacer un daño aleatorio entre 10 y 30 a Rex
        int danio = random.nextInt(30 - 10 + 1) + 10;

        //MetalGear.recibirDanio(danio);
        //System.out.println("¡Le diste a " + MetalGear.getNombre() + ("! ) ((-") + danio + (" HP") );
        //System.out.println("Vida de " + MetalGear.getNombre() + (":") + MetalGear.vida + (" HP"));
    }

    public void esquivar() {

    }

}
 */

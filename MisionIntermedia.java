
import java.util.Scanner;

public class MisionIntermedia extends Mision {

    private int numero; // 1 o 2

    //CONSTRUCTOR
    public MisionIntermedia(int numero) {
        this.numero = numero;
    }

    //METODOS
    @Override
    public void iniciar(Snake snake, Mapa mapa) {
        Scanner scanner = new Scanner(System.in);

        if (numero == 1) {
            // Misión 1: SOLO llave y puerta
            mapa.getCelda(2, 4).setObjeto(new Objeto("Tarjeta", 'L'));
            mapa.getCelda(2, 4).setContenido('L');
            mapa.getCelda(0, 6).setContenido('H'); // Puerta
            // Inicializar mapa, colocar Snake, enemigos y tarjeta (L)
            mapa.colocarPersonaje(snake, snake.getPosicion());

            // Supongamos 3 guardias aleatorios, lejos de Snake
            Guardia[] guardias = new Guardia[3];
            guardias[0] = new Guardia("G1", new Posicion(1, 2));
            guardias[1] = new Guardia("G2", new Posicion(3, 5));
            guardias[2] = new Guardia("G3", new Posicion(5, 3));
            for (int i = 0; i < guardias.length; i++) {
                mapa.colocarPersonaje(guardias[i], guardias[i].getPosicion());
            }
            // Colocar llave (tarjeta) en una celda específica
            Objeto llave = new Objeto("Tarjeta", 'L');
            mapa.getCelda(2, 4).setObjeto(llave);
            mapa.getCelda(2, 4).setContenido('L');

            // Colocar puerta de salida (hangar) en (0, 6)
            mapa.getCelda(0, 6).setContenido('H');

            boolean tieneLlave = false;
            boolean capturado = false;
            boolean llegoAPuerta = false;

            while (!completada && !capturado) {
                mapa.mostrar();
                System.out.println("Movete con: arriba, abajo, izq, der");
                String mov = scanner.next();

                // Mover Snake
                snake.mover(mapa, mov);

                // Revisar si está en la celda de la llave
                Celda celdaActual = mapa.getCelda(snake.getPosicion().getX(), snake.getPosicion().getY());
                if (celdaActual.getObjeto() != null && celdaActual.getObjeto().getNombre().equals("Tarjeta")) {
                    tieneLlave = true;
                    System.out.println("¡Agarraste la llave!");
                    celdaActual.setObjeto(null);
                    celdaActual.setContenido(' '); // La celda queda vacía para futuros movimientos
                }
                // Revisar si llegó a la puerta con la tarjeta
                if (snake.getPosicion().getX() == 0 && snake.getPosicion().getY() == 6 && tieneLlave) {
                    System.out.println("Llegaste a la puerta con la llave!");
                    completada = true;
                }
                // Mueven los guardias y verifican si capturan a Snake
                for (int i = 0; i < guardias.length; i++) {
                    guardias[i].patrullar(mapa);
                    if (guardias[i].detectarSnake(snake)) {
                        capturado = true;
                        System.out.println("Un guardia te vio! Mision fallida.");
                    }
                }
            }
            if (completada) {
                System.out.println("Mision completa!");
            } else if (capturado) {
                System.out.println("Intentalo de nuevo");
            }
        }
        if (numero == 2) {
            // Misión 2: SOLO explosivo C4 y puerta
            mapa.getCelda(4, 5).setObjeto(new Objeto("C4", 'C'));
            mapa.getCelda(4, 5).setContenido('C');
            mapa.getCelda(0, 7).setContenido('P'); // Puerta, ajustá la posición si querés

            mapa.colocarPersonaje(snake, snake.getPosicion());

            // Supongamos 4 guardias aleatorios
            Guardia[] guardias = new Guardia[4];
            guardias[0] = new Guardia("G1", new Posicion(2, 3));
            guardias[1] = new Guardia("G2", new Posicion(6, 2));
            guardias[2] = new Guardia("G3", new Posicion(3, 6));
            guardias[3] = new Guardia("G4", new Posicion(7, 7));
            for (int i = 0; i < guardias.length; i++) {
                mapa.colocarPersonaje(guardias[i], guardias[i].getPosicion());
            }

            boolean tieneC4 = false;
            boolean capturado = false;

            while (!completada && !capturado) {
                mapa.mostrar();
                System.out.println("Movete con: arriba, abajo, izq, der");
                String mov = scanner.next();

                // Mover Snake
                snake.mover(mapa, mov);

                // Revisar si está en la celda del C4
                Celda celdaActual = mapa.getCelda(snake.getPosicion().getX(), snake.getPosicion().getY());
                if (celdaActual.getObjeto() != null && celdaActual.getObjeto().getNombre().equals("C4")) {
                    tieneC4 = true;
                    System.out.println("¡Agarraste el C4!");
                    celdaActual.setObjeto(null);
                    celdaActual.setContenido(' ');
                }
                // Revisar si llegó a la puerta con el C4
                if (snake.getPosicion().getX() == 0 && snake.getPosicion().getY() == 7 && tieneC4) {
                    System.out.println("Llegaste a la puerta con el C4. ¡Misión completada!");
                    completada = true;
                }
                // Mueven los guardias y verifican si capturan a Snake
                for (int i = 0; i < guardias.length; i++) {
                    guardias[i].patrullar(mapa);
                    if (guardias[i].detectarSnake(snake)) {
                        capturado = true;
                        System.out.println("Un guardia te vio! Misión fallida.");
                    }
                }
            }
            if (completada) {
                System.out.println("¡Misión completada!");
            } else if (capturado) {
                System.out.println("Intentalo de nuevo.");
            }
        }
    }
}


import java.util.Scanner;

public class Juego {
// este atributo va a guardar las misiones que completo el jugador. Por eso arranca en 0.
    private int misionesCompletas = 0;

    public void mostrarMenu() {

        Scanner scanner = new Scanner(System.in);

        boolean salir = false;
//Arme un menu dentro de un while que se repite hasta que el jugador ponga la opcion 4 "salir"
        // el menú tiene 4 opciones: 1. inicia la mision. 2. muestra  el nunero de misiones conpletadas. 3. 
        while (!salir) {
            System.out.println("----- MENU PRINCIPAL -----");
            System.out.println("1. Iniciar mision");
            System.out.println("2. Guardar estado");
            System.out.println("3. Cargar estado");
            System.out.println("4. Salir");

            int opcion = scanner.nextInt();
            if (opcion == 1) {

                iniciarMision();

            } else if (opcion == 2) {

                System.out.println("Codigo de progreso: " + misionesCompletas);

            } else if (opcion == 3) {

                System.out.print("Ingresa el codigo: ");

                int codigo = scanner.nextInt();

                misionesCompletas = codigo;

                System.out.println("Estado cargado.");

            } else if (opcion == 4) {

                salir = true;
            } else {
                System.out.println("La opcion es incorrecta.");
            }
        }

    }

    private void iniciarMision() {
        if (misionesCompletas == 0) {
            // Mision 1
            Mapa mapa = new Mapa(7, 7);
            Snake snake = new Snake(new Posicion(6, 0));
            MisionIntermedia mision1 = new MisionIntermedia(1);
            mision1.iniciar(snake, mapa);
            if (mision1.estaCompleta()) {
                misionesCompletas++;
            }
        } else if (misionesCompletas == 1) {
            // Mision 2
            Mapa mapa = new Mapa(9, 9);
            Snake snake = new Snake(new Posicion(8, 0));
            MisionIntermedia mision2 = new MisionIntermedia(2);
            mision2.iniciar(snake, mapa);
            if (mision2.estaCompleta()) {
                misionesCompletas++;
            }
        } else if (misionesCompletas == 2) {
            // Misión 3
            Snake snake = new Snake(new Posicion(0, 0));
            Mapa mapa = new Mapa(0, 0);
            MisionFinal mision3 = new MisionFinal();
            mision3.iniciar(snake, mapa);
            if (mision3.estaCompleta()) {
                misionesCompletas++;
            }
        } else {
            System.out.println("El juego ha terminado!");
        }
    }

    public static void main(String[] args) {
        Juego juego = new Juego();
        juego.mostrarMenu();
    }
}

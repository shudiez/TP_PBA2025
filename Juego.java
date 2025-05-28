
import java.util.Scanner;

public class Juego {
// Este atributo va a guardar las misiones que completo el jugador. Por eso arranca en 0.
    private int misionesCompletas = 0;

    public void mostrarMenu() {

        Scanner scanner = new Scanner(System.in);
   //Arme un menu dentro de un while que se repite hasta que el jugador ponga la opcion 4 "salir"
        // El menú tiene 4 opciones: 1. Inicia la mision. 2. Muestra  el nunero de misiones conpletadas. 
        //3. Permite que el jugador cargue su progreso anterior nediante un codigo. esto se guarda en misionesConpletas. 
        //4. Sale del juego
        boolean salir = false;
    
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
//Segun el num de misiones completas,, se va desbloqueando la que le sigue:
//Si misionesCompletas == 0, se crea el mapa de 7x7 y empieza la Mision 1.
//Si misionesCompletas == 1, se crea el mapa de 9x9 y empieza la Mision 2.
//Si misionesCompletas == 2, empieza la Mision Final.
//Si se completo todo, se imprime “¡El juego ha terminado!”.
//Cada vez que una mision se completa (usando mision.estaCompleta()), se suma uno a misionesCompletas.
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
/*
   El main va a ser donde le damos play al programa. 
    Crea un objeto de la clase Juego y llama al metodo mostrarMenu() para arrancar el juego.
    */
    public static void main(String[] args) {
        Juego juego = new Juego();
        juego.mostrarMenu();
    }
}

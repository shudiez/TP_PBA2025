package tp1_pba;

import java.util.Random;
import java.util.Scanner;

public class MisionFinal extends Mision {

    //Constructor
    public MisionFinal(boolean completa) {
        super(completa);
    }

    @Override
    public void iniciar(Snake snake, Mapa mapa) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("¡Metal Gear REX aparece!");
        while (snake.estaVivo() && rex.estaVivo()) {
            System.out.println("Tu vida: " + snake.getVida() + "HP" + " | Vida de REX: " + rex.getVida() + "HP");
            System.out.println("1 - Disparar misil");
            System.out.println("2 - Esquivar");
            String opcion = scanner.nextLine();

            if (opcion.equals("1")) {

                Random random = new Random();

                //esto va a hacer un daño aleatorio entre 10 y 30 a Rex
                int danio = random.nextInt(30 - 10 + 1) + 10;
                rex.recibirDanio(danio);
                System.out.println("¡Le diste a REX! -" + danio + " HP");
                System.out.println("Vida de REX: " + rex.getVida() + "HP");
            } else if (opcion.equals("2")) {
                int danio = rex.atacar() / 2;
                snake.recibirDanio(danio);
                System.out.println("¡Esquivaste! Daño reducido a " + danio);
            }

            if (rex.estaVivo()) {
                int ataque = rex.atacar();
                snake.recibirDanio(ataque);
                System.out.println("Metal Gear ataca con un Cañón Láser! -" + ataque + " HP");
            }
        }

        if (snake.estaVivo()) {
            System.out.println("¡Ganaste! REX fue destruido.");
            completa = true;
        } else {
            System.out.println("Game over. Snake ha sido derrotado.");
        }
    }
}


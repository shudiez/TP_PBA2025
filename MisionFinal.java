import java.util.Random;
import java.util.Scanner;

public class MisionFinal extends Mision {
   
    //METODOS
    @Override
    public void iniciar(Snake snake, Mapa mapa) {
        MetalGear rex = new MetalGear(new Posicion(0, 0));
        Scanner scanner = new    Scanner (System.in);
        Random rand = new Random();
        System.out.println("¡Metal Gear REX aparece!");
        while (snake.getVida() > 0 && rex.getVida() > 0) {
            System.out.println("Tu vida: " + snake.getVida() + " | Vida de REX: " + rex.getVida());
            System.out.println("Turno de Snake:");
            System.out.println("1 - Disparar misil\n2 - Esquivar");
            int opcion = scanner.nextInt();
            if (opcion == 1) {
                int danio = rand.nextInt(21) + 10; // 10 a 30
                rex.recibirDanio(danio);
                System.out.println("¡Le diste a REX! (-" + danio + " HP)");
            } else {
                System.out.println("¡Esquivaste! Daño reducido.");
            }
            if (rex.getVida() > 0) {
                int danioRex = rand.nextInt(26) + 15;
                if (opcion == 2) danioRex = danioRex / 2;
                snake.recibirDanio(danioRex);
                System.out.println("¡Metal Gear ataca! (-" + danioRex + " HP)");
            }
        }
        if (snake.getVida() > 0) {
            System.out.println("¡Ganaste! REX destruido.");
            completada = true;
        } else {
            System.out.println("Game Over...");
        }
    }
}

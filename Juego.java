package tp1_pba;

//CLASE PRINCIPAL
import java.util.Scanner;

//datos generales y config del juego
public class Juego {

    //private Snake snake;
    public static void main(String[] args) {

           Scanner scanner = new Scanner(System.in);
        System.out.println("Escape de la base");
        System.out.println("1. Iniciar misión");
        System.out.println("2. Guardar estado");
        System.out.println("3. Cargar estado");
        
        int opcion = scanner.nextInt();
        
        switch (opcion) {
            case 1 -> iniciarMision();
            case 2 -> guardarEstado();
            case 3 -> cargarEstado();
        }
        //metodos
 
        public void iniciar() {
        //falta cargar
    }
        
 public void iniciarMision() {
        System.out.println("Misión 1 - Hangar de Entrada");
     //falta cargar 
    }
      

    public void guardarEstado() {
        System.out.println("Código de guardado: 1234");
        //falta cargar
    }

    public void cargarEstado() {
        System.out.println("Ingresa el código:");
        //falta cargar
    }

    public void salirJuego() {
        //falta cargar
    }
         
        
        }
    }

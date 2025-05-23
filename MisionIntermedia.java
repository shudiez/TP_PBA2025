package tp1_pba;

//Implementa mision 1 y 2
public class MisionIntermedia extends Mision {

//Atributos
    private final int numeroMision;

//Constructor
    public MisionIntermedia(String nombre, int numeroMision) {
        super(nombre); //Hereda de Mision
        this.numeroMision = numeroMision;
    }

//Metodos
    @Override
    public boolean iniciar(Snake snake) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
//Metodo para iniciar
    /*   @Override
    public boolean iniciar(Snake snake) {
        if (numeroMision == 1) {
            return iniciarMision1(snake);
        } else if (numeroMision == 2) {
            return iniciarMision2(snake);
        }
        return false;
    }
     */

//Metodo para iniciar Mision 1
    /*   private boolean iniciarMision1(Snake snake) {
        System.out.println("--- MISIÓN 1: HANGAR DE ENTRADA ---");
        System.out.println("Objetivo: Encontrar la llave (L) y dirigirte al hangar (H)");

//Creo el mapa
        Mapa mapa = new Mapa(7, 7);

//-----------------------FALTA CONTINUAR CODIGO-----------------

    }
     */
//Metodo para iniciar Mision 2
    /*private boolean iniciarMision2(Snake snake) {
        System.out.println("--- MISIÓN 2: ALMACÉN DE ARMAS ---");
        System.out.println("Objetivo: Recoger C4 y dirigirte a la puerta (P)");

        Mapa mapa = new Mapa(9, 9);

    }
     */
}

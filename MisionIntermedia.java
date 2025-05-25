package tp1_pba;

//Implementa mision 1 y 2
public class MisionIntermedia extends Mision {

//Atributos
    private final int numeroMision;

//Constructor
    public MisionIntermedia(int numeroMision, boolean completa) {
        super(completa);
        this.numeroMision = numeroMision;
    }

//Metodos
    @Override
    public void iniciar(Snake snake, Mapa mapa) {
        if (numeroMision == 1) {
            System.out.println("Misión 1 - Hangar de Entrada");
            // lógica más adelante
        } else if (numeroMision == 2) {
            System.out.println("Misión 2 - Almacén de Armas");
            // lógica más adelante
        }
    }
}

package tp1_pba;

//Gestiona los objetivos y desbloqueo de zonas
public abstract class Mision {

//Atributos
    protected boolean completa;

//Constructor
    public Mision(boolean completa) {
        this.completa = false;
    }

    //Getter
    public boolean isCompleta() {
        return completa;
    }

//Metodos
    public abstract void iniciar(Snake snake, Mapa mapa);
}

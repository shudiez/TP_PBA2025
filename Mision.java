package tp1_pba;

//Gestiona los objetivos y desbloqueo de zonas
public abstract class Mision {

//Atributos
    protected boolean completa;
    protected String nombre;

//Constructor
    public Mision(String nombre) {
        this.nombre = nombre;
        this.completa = false;
    }

//Getter
    public String getNombre() {
        return nombre;
    }

//Metodo para iniciar
    public abstract boolean iniciar(Snake snake);

    public boolean estaCompleta() {
        return completa;
    }

}

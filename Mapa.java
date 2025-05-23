package tp1_pba;

public class Mapa {

    private int N;
    private int M;
    
    //creo matriz para recorrer
    private Celda[][] celdas;


    public Mapa(int N, int M) {
        this.N=N;
        this.M=M;
        this.celdas = new Celda[N][M];
            //recorro matriz NxM
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                celdas[i][j] = new Celda();
            }
        }
    }

    //metodos
    public void colocarPersonaje(Persona personaje, Posicion pos ) {
    celdas.[pos.y][pos.x].setPersonaje(personaje);
    }

    public void moverPersonaje() {
        //falta cargar

    }

    public void mostrar() {
        //falta cargar
    }
    
    
}

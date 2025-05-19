package tp1_pba;

public class Mapa {

    //creo matriz para recorrer
    private Celda[][] celdas;

    //recorro matriz NxM
    public Mapa(int N, int M) {
        celdas = new Celda[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                celdas[i][j] = new Celda();
            }
        }
    }

    //metodos
    public void colocarPersonaje() {
        //falta cargar
    }

    public void moverPersonaje() {
        //falta cargar

    }

    public void mostrar() {
        //falta cargar
    }
    
    
}

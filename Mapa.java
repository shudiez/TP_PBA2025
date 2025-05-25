package tp1_pba;

public class Mapa {

    //Atributos
    private int N; //Filas
    private int M; //Columnas

    private Celda[][] celdas;     //creo matriz para recorrer

    //CONSTRUCTOR
    public Mapa(int N, int M) {
        this.N = N;
        this.M = M;
        celdas = new Celda[N][M];
        iniciarCeldas();
    }

    //metodos
    public void colocarPersonaje(Personaje personaje, Posicion position) {

    }

    public void moverPersonaje() {
        //falta cargar

    }

    public void mostrar() {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(celdas[i][j].getInicial() + " ");
            }
        }
    }

    private void iniciarCeldas() {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                celdas[i][j] = new Celda(" ");
            }
        };
    }

    public void ponerInicial(int x, int y, char inicial) {
        if (x >= 0 && x < N && y >= 0 && y < M) {
            celdas[x][y].setInicial(inicial);
        }
    }

    /*   public char obtenerInicial(int x, int y) {
        if (x >= 0 && x < N && y >= 0 && y < M) {
            return celdas[x][y].getInicial();
        }
    }
     */
}

/*
La clase Mapa es el mapa del juego, una matriz de celdas, donde ubico a los personajes, 
objetos y todo lo que pasa en el juego.
 */
public class Mapa {
//filasN y columnas sin las que determinan el tamaño del mapa 

    private int filasN;
    private int columnasM;
    //celdas es una matriz  de objetos Celda 
    private Celda[][] celdas;

    //CONSTRUCTOR
    /*    Cuando creo un mapa, le digo cuantas filas y columnas va a tener.
    Despues, inicializo cada celda vacia con un espacio (' ') para que todo arranque sin personajes ni objetos.
     */
    public Mapa(int filasN, int columnasM) {
        this.filasN = filasN;
        this.columnasM = columnasM;
        celdas = new Celda[filasN][columnasM];
        for (int i = 0; i < filasN; i++) {
            for (int j = 0; j < columnasM; j++) {
                celdas[i][j] = new Celda(' ');
            }
        }
    }

    //GETTERS
    //Sirven para acceder a las dimensiones del mapa y a una celda puntual. 
    public int getfilasN() {
        return filasN;
    }

    public int getcolumnasM() {
        return columnasM;
    }

    public Celda getCelda(int x, int y) {
        return celdas[x][y];
    }

    //METODOS
    /*
    Este metodo pone un personaje en una celda del mapa, usando su posicion. 
    Tambien actualiza el contenido de esa celda (setPersonaje) y la posicion del personaje (setPosicion).
     */
    public void colocarPersonaje(Personaje perso, Posicion position) {
        Celda celda = celdas[position.getX()][position.getY()];
        celda.setPersonaje(perso);
        celda.setInicial(celda.getInicial());
        perso.setPosicion(position);
    }

    /*
    Este metodo mueve un personaje en el mapa hacia una direccion ("arriba", "abajo", "izq", "der").
     */
    public void moverPersonaje(Personaje perso, String direccion) {
        // Borro al personaje de su celda actual.
        Posicion actual = perso.getPosicion();
        // Actualizo el símbolo de la celda actual si habia un objeto, deja el simbolo del objeto, si no, la deja vacia.
        Celda celdaActual = celdas[actual.getX()][actual.getY()];

        celdaActual.setPersonaje(null);

        if (!celdaActual.getObjeto().getTipo().equals("")) {
            celdaActual.setInicial(celdaActual.getObjeto().getinicial());
        } else {
            celdaActual.setInicial(' ');
        }

        // Calculo nueva posicion del personaje
        int x = actual.getX();
        int y = actual.getY();
        if (direccion.equals("arriba") && x > 0) {
            x--;
        } else if (direccion.equals("abajo") && x < filasN - 1) {
            x++;
        } else if (direccion.equals("izq") && y > 0) {
            y--;
        } else if (direccion.equals("der") && y < columnasM - 1) {
            y++;
        }

        // Muevo al  personaje a la nueva celda
        Posicion nueva = new Posicion(x, y);
        colocarPersonaje(perso, nueva);
    }

    /*    Este metodo imprime el mapa por consola.
Si la celda esta vacia (' '), imprime un punto (.) para que se vea  en el mapa.
Si no esta vacia, muestra el simbolo que haya (S, P, etc.).
Asa podemos ver lo que esta pasando en el mapa.
     */
    public void mostrar() {
        System.out.println("----- MAPA -----");
        for (int i = 0; i < filasN; i++) {
            for (int j = 0; j < columnasM; j++) {
                char contenido = celdas[i][j].getInicial();
                // Si la celda esta vacia, se ve un punto para que se vea la matriz
                if (contenido == ' ') {
                    System.out.print(". ");
                } else {
                    System.out.print(contenido + " ");
                }
            }
            System.out.println();
        }
        System.out.println("---------------");
    }
}

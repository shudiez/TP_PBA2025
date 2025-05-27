
public class Mapa {

    private int filasN;
    private int columnasM;
    private Celda[][] celdas;

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
    public void colocarPersonaje(Personaje perso, Posicion position) {
        Celda celda = celdas[position.getX()][position.getY()];
        celda.setPersonaje(perso);
        celda.setInicial(celda.getInicial());
        perso.setPosicion(position);
    }

    public void moverPersonaje(Personaje perso, String direccion) {
        // Saco al personaje de la celda actual y reinicio el contenido si hay un Objeto
        Posicion actual = perso.getPosicion();
        Celda celdaActual = celdas[actual.getX()][actual.getY()];

        celdaActual.setPersonaje(null);

        if (!celdaActual.getObjeto().getNombre().equals("")) {
            celdaActual.setInicial(celdaActual.getObjeto().getinicial());
        } else {
            celdaActual.setInicial(' ');
        }

        // Calculo nueva posicion
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


public class Mapa {

    private Celda[][] celdas;
    private int filasN;
    private int columnasM;

    //CONSTRUCTOR
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
    public void colocarPersonaje(Personaje p, Posicion pos) {
        Celda celda = celdas[pos.getX()][pos.getY()];
        celda.setPersonaje(p);
        celda.setContenido(p.getinicial()); // SIEMPRE poner el símbolo del personaje
        p.setPosicion(pos);
    }

    public void moverPersonaje(Personaje p, String direccion) {
        // 1. Sacar personaje de la celda actual y restaurar contenido si hay Objeto
        Posicion actual = p.getPosicion();
        Celda celdaActual = celdas[actual.getX()][actual.getY()];
        celdaActual.setPersonaje(null);

        if (celdaActual.getObjeto() != null) {
            celdaActual.setContenido(celdaActual.getObjeto().getinicial());
        } else {
            celdaActual.setContenido(' '); // Si ya no hay ítem, dejar vacío
        }

        // 2. Calcular nueva posición
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

        // 3. Mover personaje a la nueva celda
        Posicion nueva = new Posicion(x, y);
        colocarPersonaje(p, nueva);
    }

    public void mostrar() {
        System.out.println("----- MAPA -----");
        for (int i = 0; i < filasN; i++) {
            for (int j = 0; j < columnasM; j++) {
                char contenido = celdas[i][j].getContenido();
                // Si la celda está vacía, mostrá un punto para que se vea la grilla
                if (contenido == ' ') {
                    System.out.print(". ");
                } else {
                    System.out.print(contenido + " ");
                }
            }
            System.out.println(); // salto de línea al final de cada fila
        }
        System.out.println("---------------");
    }
}

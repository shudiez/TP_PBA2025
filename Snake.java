package tp1_pba;

//Jugador, hereda de Personaje
public class Snake extends Personaje {

    //Atributos 
    

    //constructor
    public Snake (Posicion posicion){
super("Snake",posicion)
    }
    

    //metodo


    @Override
    public void mover(string direccion) {
        switch(direccion){
               case: "arriba" -> posicion.posicionY--;
                case: "abajo" -> posicion.posicionY++;
                case: "izquierda" -> posicion. posicionX--;
                case: "derecha" -> posicion.posicionX++;
                  
        }
        system.out.println{"Snake se movio a la " + direccion};
        
    }
    
}

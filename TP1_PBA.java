package tp1_pba;

import java.util.Scanner;

public class TP1_PBA {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in); //inicializo el teclado para el usuario

        Juego juego = new Juego(); // Doy inicio a un nuevo juego

        char opcion;

        System.out.println("----------BIENVENIDO!----------");

        do {
            System.out.println("----------MENU PRINCIPAL----------");
            System.out.println("1- Iniciar mision");
            System.out.println("2- Guardar estado");
            System.out.println("3- Cargar estado");
            System.out.println("4- Salir");

            opcion = teclado.next().charAt(0); //lo uso para que tome la primera letra

            switch (opcion) {
                case 1:
                    juego.iniciarMision();

                    break;

                case 2:
                    juego.guardarEstado();

                    break;

                case 3:
                    juego.cargarEstado();

                    break;
                case 4:
                    juego.salirJuego();

                default:
                    System.out.println("La opción ingresada no es valida.");

            }
        }

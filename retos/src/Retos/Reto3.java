package Retos;

import java.util.Random;
import java.util.Scanner;

public class Reto3 {
    public static void main(String[] args) {
        //declaramos la variable
        String eleccion;
        //instanciamos la clase escaner con el nombre lectura
        Scanner lectura = new Scanner(System.in);
        //Creamos un nuevo objeto random
        Random lados = new Random();
        //nos genera numeros aleatorios entre 0 y 1, lo definimos antes para que el juego pueda ejecutarse
        int moneda = lados.nextInt(2);
        //iniciamos el juego
        System.out.println("Bienvenido al juego de Cara o Sello");
        System.out.print("Elige Cara o Sello: ");
        //capturamos la elección del jugador puede escribir cara o sello
        eleccion = lectura.next();
        //Evaluamos la elección del jugador y según esta se compara con el resultado de la máquina
        switch (eleccion.toLowerCase()) {
            case "cara":
                System.out.println("Elegiste Cara");
                if (moneda == 0) {
                    System.out.println("Ganaste, cayó Cara");
                } else {
                    System.out.println("Perdiste, cayó Sello");
                }
                break;
            case "sello":
                System.out.println("Elegiste Sello");
                if (moneda == 1) {
                    System.out.println("Ganaste, cayó Sello");
                } else {
                    System.out.println("Perdiste, cayó Cara");
                }
                break;
            default:
                System.out.println("Elección inválida");
                break;
        }
        lectura.close();
    }
}
package Retos;

import java.util.Random;
import java.util.Scanner;

public class Reto7 {
    public static void main(String[] args) {
    //declarar variables 
    int dinero=0, vApostado=0, numApuestas=0, maquina;
    String apuestas, jugador;

    //instanciamos la clase scanner
    Scanner leer=new Scanner(System.in);
    Random juego=new Random();
   
    System.out.println("ingrese la cantidad de dinero inicial");
        dinero=leer.nextInt();
    maquina=juego.nextInt(2);
    
    //crear el bucle con un do while
    do{
        System.out.println("ingrese la cantidad de dinero que desea apostar");
        vApostado=leer.nextInt();
        leer.nextLine();
        System.out.println("ahora elija cara o sello");
        jugador=leer.nextLine();

        switch (jugador.toLowerCase()) {
            case "cara":
                System.out.println("Elegiste Cara");
                if (maquina == 0) {
                    System.out.println("Ganaste, cayó Cara");
                    dinero=dinero+vApostado;
                } else {
                    System.out.println("Perdiste, cayó Sello");
                    dinero=dinero-vApostado;
                }
                break;
            case "sello":
                System.out.println("Elegiste Sello");
                if (maquina == 1) {
                    System.out.println("Ganaste, cayó Sello");
                    dinero=dinero+vApostado;
                } else {
                    System.out.println("Perdiste, cayó Cara");
                    dinero=dinero-vApostado;
                }
                break;
            default:
                System.out.println("Elección inválida");
                break;
        }

        System.out.println("¿Desea apostar nuevamente, escriba si o no");
        apuestas=leer.nextLine();

        numApuestas++;
    } while (apuestas.equalsIgnoreCase("si") && dinero > 0);

    if(dinero<=0){
        System.out.println("no tiene más dinero");
    }

    if(apuestas.equalsIgnoreCase("no") ){
        System.out.println("ya no hará más apuestas");
        System.out.println("su número de apuestas fue de " +numApuestas+ " y su saldo ahora es de "+dinero);
    }
    leer.close();
    }
}

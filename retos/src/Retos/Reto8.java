package Retos;

import java.util.Random;
import java.util.Scanner;

public class Reto8 {
    public static void main(String[] args) {
        //declaramos variables
        String eleccionJugador, numJuegos;
        int eleccionMaquina;
        //instanciamos la clase scanner
        Scanner leer=new Scanner(System.in);
        //instanciamos la clase random
        Random juego=new Random();
        
        eleccionMaquina=juego.nextInt(3);
        do{
        //capturamos la elección del usuario
        System.out.println("Elija una opción entre piedra, papel o tijera");
        eleccionJugador=leer.nextLine();
        switch(eleccionJugador.toLowerCase()){
            case "piedra":
                if(eleccionMaquina == 0) {
                    System.out.println("empate la máquina también eligió piedra");
                } else if (eleccionMaquina == 1){
                    System.out.println("perdiste la máquina eligió papel");
                } else {
                    System.out.println("ganaste la máquina eligió tijeras");
                }
            break;
            
            case "papel":
                if(eleccionMaquina == 0) {
                    System.out.println("ganaste la máquina eligió piedra");
                } else if (eleccionMaquina == 1){
                    System.out.println("empate la máquina también eligió papel");
                } else {
                    System.out.println("perdiste la máquina eligió tijeras");
                }
                break;
            
            case "tijera":
                if(eleccionMaquina == 0) {
                    System.out.println("perdiste la máquina eligió piedra");
                } else if (eleccionMaquina == 1){
                    System.out.println("ganaste la máquina eligió papel");
                } else {
                    System.out.println("empate la máquina también eligió tijera");
                }
            break;
            default:
                System.out.println("seleccione una opción válida");
            break;
               
        }
         
        System.out.println("¿desea jugar de nuevo?");
        numJuegos=leer.nextLine();

        } while(numJuegos.equalsIgnoreCase("si"));

        if(numJuegos.equalsIgnoreCase("no")){
            System.out.println("El juego ha terminado");
        }
        leer.close();
    }
    
}

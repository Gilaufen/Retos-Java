package reto5;

import java.util.Random;
import java.util.Scanner;

public class ppt implements Juego{
     //declaramos los atributos
        private String eleccionJugador;
        private String jugador;
        private int eleccionMaquina;

    //Métodos contructores
    
    public ppt(){

    }

    public ppt(String eleccionJugador, String jugador, int eleccionMaquina){
        this.eleccionJugador=eleccionJugador;
        this.jugador=jugador;
        this.eleccionMaquina=eleccionMaquina;
    }

    //instanciamos la clase scanner
        Scanner leer=new Scanner(System.in);

    public void iniciar(){
        System.out.println("ingrese el nombre del jugador");
        jugador = leer.next();
    }

    public void jugar(){
        //instanciamos la clase random
        Random juego=new Random();
        eleccionMaquina=juego.nextInt(3);

        // capturamos la elección del usuario
        System.out.println(jugador+" Elija una opción entre piedra, papel o tijera");
        eleccionJugador=leer.next();
    }

    public void finalizar(){
        switch(eleccionJugador.toLowerCase()){
            case "piedra":
                if(eleccionMaquina == 0) {
                    System.out.println(jugador+" empate la máquina también eligió piedra");
                } else if (eleccionMaquina == 1){
                    System.out.println(jugador+" perdiste la máquina eligió papel");
                } else {
                    System.out.println(jugador+" ganaste la máquina eligió tijeras");
                }
            break;
            
            case "papel":
                if(eleccionMaquina == 0) {
                    System.out.println(jugador+" ganaste la máquina eligió piedra");
                } else if (eleccionMaquina == 1){
                    System.out.println(jugador+" empate la máquina también eligió papel");
                } else {
                    System.out.println(jugador+" perdiste la máquina eligió tijeras");
                }
                break;
            
            case "tijera":
                if(eleccionMaquina == 0) {
                    System.out.println(jugador+" perdiste la máquina eligió piedra");
                } else if (eleccionMaquina == 1){
                    System.out.println(jugador+" ganaste la máquina eligió papel");
                } else {
                    System.out.println(jugador+" empate la máquina también eligió tijera");
                }
            break;
            default:
                System.out.println(jugador+" seleccione una opción válida");
            break;
 
        }
    }


}

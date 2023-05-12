package Retos;

import java.util.Scanner;
import java.util.Random;

public class Reto4 {
    public static void main(String[] args) {
        //declaramos las variables
        String eleccionMaquina, jugador;
        //instanciamos la clase scanner
        Scanner leer= new Scanner(System.in);
        //instanciamos la clase random
        Random juego= new Random();
        

        // Capturamos las opciones del jugador
        System.out.println("Por favor elija una opción entre piedra, papel y tijera");
        jugador= leer.nextLine();

        // Obtemos la elección de la máquina
        int maquina= juego.nextInt(3);
        if (maquina == 0){
             eleccionMaquina = "piedra";
        } else if (maquina == 1) {
             eleccionMaquina = "papel";
        } else {
             eleccionMaquina = "tijera";
        }
        
        //Elección de la máquina
        if(jugador.equals("piedra") || jugador.equals("papel") || jugador.equals("tijera") ){
        System.out.println("la elección de la máquina fue " + eleccionMaquina);
        
        switch(jugador.toLowerCase()){
            case "piedra":
                if(maquina == 0) {
                    System.out.println("empate");
                } else if (maquina == 1){
                    System.out.println("perdiste");
                } else {
                    System.out.println("ganaste");
                }
            break;
            
            case "papel":
                if(maquina == 0) {
                    System.out.println("ganaste");
                } else if (maquina == 1){
                    System.out.println("empate");
                } else {
                    System.out.println("perdiste");
                }
                break;
            
            case "tijera":
                if(maquina == 0) {
                    System.out.println("perdiste");
                } else if (maquina == 1){
                    System.out.println("ganaste");
                } else {
                    System.out.println("empate");
                }
            break;
            default:
                System.out.println("seleccione una opción válida");
            break;
               
        }
        leer.close();
    }}
}

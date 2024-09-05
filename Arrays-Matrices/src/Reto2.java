
import java.util.Scanner;

public class Reto2 {
    public static void main(String[] args) {
        int numJugadores,h=0, ganador;
        String ganadorJ;
        Scanner leer=new Scanner(System.in);

        System.out.println("¿Cuántos jugadores harán parte de esta competencia?");
        numJugadores=leer.nextInt();

        String[] jugadores=new String[numJugadores];
        int[] tiempo=new int[numJugadores];

        for(int i=0; i<numJugadores; i++){
            System.out.println("Ingrese el nombre del jugador");
            jugadores[i]=leer.next();
            leer.nextLine();
            System.out.println("Ingrese el tiempo de ese jugador");
            tiempo[i]=leer.nextInt(); 
        }
       
        for(int i=0;i<numJugadores;i++){
            System.out.println("Nombre jugador "+(i)+": "+jugadores[i]);
            System.out.println("Tiempo jugador "+(i)+": "+tiempo[i]);
        }

        for (int f = 0; f < numJugadores - 1; f++) {
            for (int j = 0; j < numJugadores - f - 1; j++) {
                if (tiempo[j] > tiempo[j + 1]) {
                    ganador = tiempo[j];
                    tiempo[j] = tiempo[j + 1];
                    tiempo[j + 1] = ganador;
                    
                    ganadorJ = jugadores[j];
                    jugadores[j] = jugadores[j + 1];
                    jugadores[j + 1] = ganadorJ;
                }
            }
        }
        
        System.out.println("El nombre del ganador es "+jugadores[h]+" y su tiempo fue de "+tiempo[h]);
    
        leer.close();

    }
}


import java.util.Scanner;

public class Reto5 {
    public static void main(String[] args) {
        String respuesta;
        int eleccionF1, eleccionF2, eleccionC1, eleccionC2;
        int[][] juego= {
            {1, 2, 3 },
            {2, 1, 3 },
            {4, 0, 4 }
        };
        Scanner leer=new Scanner(System.in);   

        do{
        System.out.println("Bienvenido al juego de pares, tendrá que encontrar los posiciones iguales");
        for(int i=0; i<3;i++){
            for(int j=0; j<3;j++){
                System.out.print("[?]");
            }
            System.out.println(" ");                      
        }
        System.out.println("Ingrese la primera posición, primero fila luego la columna");
        eleccionF1=leer.nextInt();
        eleccionC1=leer.nextInt();
        
        System.out.println("Ingrese la segunda posición, primero fila luego la columna");
        eleccionF2=leer.nextInt();
        eleccionC2=leer.nextInt();       

        if(juego[eleccionF1][eleccionC1]==juego[eleccionF2][eleccionC2]){
            System.out.println("adivinaste");
            for(int i=0; i<3;i++){
                for(int j=0; j<3;j++){
                    if ((eleccionF1==i && eleccionC1==j)){
                        System.out.print("["+juego[eleccionF1][eleccionC1]+"]");
                    } else if (eleccionF2==i && eleccionC2==j){
                        System.out.print("["+juego[eleccionF2][eleccionC2]+"]");
                    } else {
                        System.out.print("[?]");
                    }
                }
                System.out.println(" ");                      
            }
        } else {
            System.out.println("No adivinaste");
        }
        
        leer.nextLine();
        System.out.println("Desea volver a jugar?");
        respuesta=leer.nextLine();

    }while(respuesta.equalsIgnoreCase("si"));
    System.out.println("El juego ha finalizado");
    leer.close();
    }
}

import java.util.Scanner;

public class Reto3 {
    public static void main(String[] args) {
        int cantidad, vidas = 3, adivinadas = 0;
        char letra;
        boolean adivinada = false;
        Scanner leer = new Scanner(System.in);

        System.out.println("Por favor ingrese cuántas letras tiene la palabra:");
        cantidad = leer.nextInt();
        leer.nextLine(); 

        char[] letras = new char[cantidad];
        char[] letras2 = new char[cantidad];

        for (int i = 0; i < cantidad; i++) {
            System.out.println("Por favor ingrese la letra número " + (i + 1) + ":");
            letras[i] = leer.next().charAt(0);
        }
        while (vidas > 0 && adivinadas < cantidad) {
            System.out.println("Por favor ingrese una letra para adivinar, si ya la escribió no lo vuelva a hacer:");
            letra = leer.next().charAt(0); 
           

                for (int j =0; j < cantidad; j++) {
                    
                    if (letras[j] == letra) {
                        adivinada=true;
                        adivinadas++;
                        letras2[j]=letra;
                    }
                }

            if (adivinada==true) {
                System.out.println("Has adivinado una letra.");
                System.out.println("En total has adivinado: ");
            }  else {
                System.out.println("No adivinaste.");
                vidas--;
                System.out.println("Te quedan " + vidas + " vidas.");
            }

            for(int i=0; i<cantidad;i++){
                System.out.print(" "+letras2[i]);
            }
            System.out.println(" ");

            adivinada = false;
        }

        if (adivinadas == cantidad) {
            System.out.println("Has adivinado todas las letras.");
        } else {
            System.out.println("Te has quedado sin vidas. Perdiste.");
        }

        leer.close();
    }
}
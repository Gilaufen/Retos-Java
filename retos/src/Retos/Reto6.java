package Retos;

import java.util.Scanner;

public class Reto6 {
    public static void main(String[] args) {
        //declaramos las variables
        int np, suma=0, pre=0;
        //instanciar la clase scanner
        Scanner leer=new Scanner(System.in);

        //solicitamos y capturamos la cantidad de productos a comprar
        System.out.println("ingrese la cantidad de productos");
        np=leer.nextInt();

        for(int i=0; i<np;i++){
            System.out.println("Ingrese el precio del producto");
            pre=leer.nextInt();
            suma=suma+pre;

        }

        System.out.println("el total es " + suma);


        leer.close();
    }
    
    
}

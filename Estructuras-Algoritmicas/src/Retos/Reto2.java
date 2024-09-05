package Retos;


import java.util.Scanner;

public class Reto2 {
    public static void main(String[] args) {
        //declaramos variables
        String NEnfermera, NBebe, Npadre;
        float EBebe, PBebe, DosisV=0; 
        //Instanciamos la clase scanner
        Scanner Lectura=new Scanner(System.in);
        //solicitamos los datos
        System.out.println("Por favor, ingrese ");
        System.out.println("Nombre de la enfermera: ");
        NEnfermera=Lectura.nextLine();
        System.out.println("Nombre del bebé: ");
        NBebe=Lectura.nextLine();
        System.out.println("Nombre del padre del bebé: ");
        Npadre=Lectura.nextLine();
        System.out.println("Edad en meses del bebé: ");
        EBebe=Lectura.nextInt();
        System.out.println("Y el peso del bebé: ");
        PBebe=Lectura.nextInt();
        
        //realizamos la operación para encontrar la dosis correspondiente al bebé
        DosisV= ((PBebe + 10)/(EBebe*10)*8);

        //mostramos los resultados al usuario
        System.out.println("El nombre del padre es: " +Npadre);
        System.out.println("El nombre de la enfermera es: " +NEnfermera);
        System.out.println("El nombre del bebé es: " +NBebe);
        System.out.println("El peso y edad del bebé es: " +PBebe+" y "+EBebe+ ", respectivamente");
        System.out.println("La dosis a aplicar al bebé es: " +DosisV);

        Lectura.close();
    }
}

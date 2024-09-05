package reto4;

import java.util.Scanner;

public class Ejecucion {
    public static void main(String[] args) {
        String respuesta;
        String eleccion;
        Scanner leer=new Scanner(System.in);
        Triangulo tri=new Triangulo();
        Circulo cir=new Circulo();
        Cono con=new Cono();
        Cilindro cil=new Cilindro();

        do{
        System.out.println("Bienvenido al calculador de áreas, escribe el nombre de la que deseas:");
        System.out.println("1.Triángulo \n2.Círculo \n3.Cono \n4.Cilindro");
        eleccion=leer.nextLine();

        switch (eleccion.toLowerCase()) {
            case "triangulo":
                tri.registrarDatos();
                tri.calcularArea();
                break;
            case "circulo":
                cir.registrarDatos();
                cir.calcularArea();
                break;
            case "cono":
                con.registrarDatos();
                con.calcularArea();
                break;
            case "cilindro":
                cil.registrarDatos();
                cil.calcularArea();
                break;
            default:
                System.out.println("Ingrese una figura válida");
                break;
        }

        System.out.println("¿Desea calcular otra figura?");
            respuesta=leer.nextLine();
        }while(respuesta.equalsIgnoreCase("si"));

    }
}

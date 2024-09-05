package introduccion;

import java.util.Scanner;

public class Calculadora {

    double n, n1;
    // con parametros y retorno
    public Calculadora(){

    }

    public Calculadora(double n, double n1) {
        this.n = n;
        this.n1 = n1;
    }


    public int solicitarDatos(){
        int n1;
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese número 1");
        n1=leer.nextInt();
        return n1;
    }
    public int solicitarDatos2(){
        int n2;
        Scanner leer=new Scanner(System.in);
        System.out.println("ingrese el número 2");
        n2=leer.nextInt();
        return n2;
    }

    public int sumar(int num1, int num){
        int suma;
        suma=num1+num;
        System.out.println(suma);
        return suma;
    }

    public int restar(int num1, int num2){
        int resta;
        resta=num1-num2;
        System.out.println(resta);
        return resta;
    }

    public int multiplicar(int n1, int n2){
        int multi;
        multi=n1*n2;
        System.out.println(multi);
        return multi;
    }

    public double dividir(double n, double n1){
        double divi;
        divi=n/n1;
        System.out.println(divi);
        return divi;
    }

    public void dividir(){
        double divi;
        Scanner leer=new Scanner(System.in);
        System.out.println("ingrese el número 1");
        n=leer.nextDouble();
        System.out.println("Ingrese el número 2");
        n1=leer.nextDouble();
        divi=n/n1;
        System.out.println(divi);
    }
}

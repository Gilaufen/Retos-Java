package reto4;

import java.util.Scanner;

public class Triangulo extends Figura{
    private int base;
    private int altura;

    public Triangulo(){

    }

    public Triangulo(int base, int altura){
        super();
        this.base= base;
        this.base= altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void registrarDatos(){
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese la base del triangulo");
        base=leer.nextInt();
        System.out.println("Ingrese la altura del triangulo");
        altura=leer.nextInt();
    }

    public void calcularArea(){
        float area;
        area=(base*altura)/2;
        System.out.println("El área del triángulo es "+area);
    }

    


}

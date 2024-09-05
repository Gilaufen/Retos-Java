package reto4;

import java.util.Scanner;

public class Cono extends Figura{
    private int radio;
    private double pi=3.1416;
    private int altura;
    private double generatriz;

    public Cono() {
    }

    public Cono(int radio, double pi, int altura, Double generatriz) {
        super();
        this.radio = radio;
        this.pi = pi;
        this.altura = altura;
        this.generatriz = generatriz;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public double getPi() {
        return pi;
    }

    public void setPi(double pi) {
        this.pi = pi;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    public double getGeneratriz() {
        return generatriz;
    }

    public void setGeneratriz(Double generatriz) {
        this.generatriz = generatriz;
    }

    public void registrarDatos(){
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese el radio del cono");
        radio=leer.nextInt();
        System.out.println("Ingrese la altura del cono");
        altura=leer.nextInt();   
    }

    public void calcularArea(){
        Double area;
        generatriz=(altura*altura)+(radio*radio);
        generatriz= Math.sqrt(generatriz);
        area=pi*radio*(radio+generatriz);
        System.out.println("El área del cono es "+area);
    }
    
}

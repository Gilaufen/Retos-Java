package introduccion;

import java.util.Scanner;

public class Cuadrado extends Figura{
    private int lado;

    public Cuadrado(){

    }

    public Cuadrado(int lado) {
        super();
        this.lado = lado;
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    public void registrarDatos(){
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese un lado");
        lado=leer.nextInt();
    }

    public void calcularArea(){
        float area=lado*lado;
        System.out.println("el area del cuadrado es "+area);
    }

}

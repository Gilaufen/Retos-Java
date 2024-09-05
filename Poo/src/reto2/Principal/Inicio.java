package reto2.Principal;

import reto2.Salud.Persona;

public class Inicio {
    public static void main(String[] args) {
        //intanciamos la clase persona
        Persona persona1=new Persona();

        persona1.pedirDatos();
        persona1.mostrarDatos();
        double pesoActual=persona1.calcularIMC();
        if(pesoActual<20){
            System.out.println("El peso está por debajo de lo ideal");
        } else if (pesoActual>=20 && pesoActual <=25){
            System.out.println("El peso es ideal"); 
        } else{
            System.out.println("Tiene sobre peso");
        }
        persona1.mayorEdad();

    }
}

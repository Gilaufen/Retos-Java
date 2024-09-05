package reto1.Principal;

import reto2.Salud.Persona;

public class Inicio {
    public static void main(String[] args) {
        Persona persona1=new Persona();

        persona1.pedirDatos();
        persona1.mostrarDatos();
        persona1.calcularIMC();
        persona1.mayorEdad();
    }
}

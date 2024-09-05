package reto3.Principal;

import reto3.Salud.Empleado;

public class Inicio {
    public static void main(String[] args) {
        //intanciamos la clase empleado

         Empleado juan=new Empleado();

        double total;

        juan.pedirDatos();
        juan.pedirDatosE();

        System.out.println("Tipo de documento "+juan.getTipoDoc());
        System.out.println("Número de documento "+juan.getDocumento());
        System.out.println("Nombre "+juan.getNombre());
        System.out.println("Apellido "+juan.getApellido());
        juan.mostrarDatos();
        
        total=juan.calcularHonorarios();
        System.out.println("Honorarios: "+total);

    }
}

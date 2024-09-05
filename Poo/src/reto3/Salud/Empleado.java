package reto3.Salud;

import java.util.Scanner;

public class Empleado extends Persona{

    private String cargo;
    private int valorHora;
    private int horasTrabajadas;
    private String departamento;

    public Empleado(){
        
    }

    public Empleado(String tipoDoc, int documento, String nombre, String apellido, double peso, double estatura,
            int edad, String sexo, String cargo, int valorHora, int horasTrabajadas, String departamento) {
        super(tipoDoc, documento, nombre, apellido, peso, estatura, edad, sexo);
        this.cargo = cargo;
        this.valorHora = valorHora;
        this.horasTrabajadas = horasTrabajadas;
        this.departamento = departamento;
    }
    
    public void pedirDatosE(){
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese su cargo");
        cargo=leer.nextLine();
    }

    public double calcularHonorarios(){
        double valorTotal;
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese el valor por hora");
        valorHora=leer.nextInt();
        System.out.println("Ingrese las horas trabajadas");
        horasTrabajadas=leer.nextInt();

        valorTotal= valorHora*horasTrabajadas;

        return valorTotal= valorTotal-(valorTotal*(0.966/100));


    }

    public void mostrarDatos(){
        System.out.println("Cargo: "+cargo+"\nvalor por hora: "+valorHora+"\nhoras trabajadas: "+horasTrabajadas);
    }

}

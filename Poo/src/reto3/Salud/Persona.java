package reto3.Salud;

import java.util.Scanner;


public class Persona {
    private String tipoDoc;
    private int documento;
    private String nombre;
    private String apellido;
    private double peso;
    private double estatura;
    private int edad;
    private String sexo;

    public Persona(){
        
    }

    

    public Persona(String tipoDoc, int documento, String nombre, String apellido, double peso, double estatura,
            int edad, String sexo) {
        this.tipoDoc = tipoDoc;
        this.documento = documento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.peso = peso;
        this.estatura = estatura;
        this.edad = edad;
        this.sexo = sexo;
    }

    public String getTipoDoc() {
        return tipoDoc;
    }

    public void setTipoDoc(String tipoDoc) {
        this.tipoDoc = tipoDoc;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }




    public void pedirDatos() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tipo de documento");
        tipoDoc = leer.next();
        System.out.println("Ingrese su número de documento");
        documento = leer.nextInt();
        System.out.println("Ingrese su nombre");
        nombre = leer.next();
        System.out.println("Ingrese su apellido");
        apellido = leer.next();
        System.out.println("Ingrese su peso");
        peso = leer.nextDouble();
        System.out.println("Ingrese su estatura");
        estatura = leer.nextDouble();
        System.out.println("Ingrese su edad");
        edad = leer.nextInt();
        leer.nextLine();
        System.out.println("Ingrese su sexo");
        sexo = leer.next();
    }

    public void mostrarDatos() {
        System.out.println("Tipo de documento= " + tipoDoc);
        System.out.println("Número de documento= " + documento);
        System.out.println("Nombre= "+nombre);
        System.out.println("Apellido= " + apellido);
        System.out.println("Peso= " + peso);
        System.out.println("Estatura= " + estatura);
        System.out.println("Edad= " + edad);
        System.out.println("Sexo= " + sexo);
    }

    public double calcularIMC() {
        double pesoActual;
        return pesoActual = peso / (estatura * estatura);
    }

    public void mayorEdad(){
        if(edad>=18){
            System.out.println("Usted es mayor de edad");
        } else{
            System.out.println("Usted es menor de edad");
        }
    }

    
    
}

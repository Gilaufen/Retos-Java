package introduccion;

import java.util.Scanner;

public class Juego {
    // Atributos
    private int idJuego;
    private String nombre;
    private int nJugadores;
    private String nombreGanador;
    private int resultadoGanador1;
    private int resultadoGanador2;
    


    // método constructor

    public Juego(){

    }

    public Juego(int idJuego, String nombre, int nJugadores, String nombreGanador, int resultadoGanador1,
            int resultadoGanador2) {
        this.idJuego = idJuego;
        this.nombre = nombre;
        this.nJugadores = nJugadores;
        this.nombreGanador = nombreGanador;
        this.resultadoGanador1 = resultadoGanador1;
        this.resultadoGanador2 = resultadoGanador2;
    }
    
    //metodos accesores
    public int getIdJuego() {
        return idJuego;
    }



    public void setIdJuego(int idJuego) {
        this.idJuego = idJuego;
    }



    public String getNombre() {
        return nombre;
    }



    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



    public int getnJugadores() {
        return nJugadores;
    }



    public void setnJugadores(int nJugadores) {
        this.nJugadores = nJugadores;
    }



    public String getNombreGanador() {
        return nombreGanador;
    }



    public void setNombreGanador(String nombreGanador) {
        this.nombreGanador = nombreGanador;
    }



    public int getResultadoGanador1() {
        return resultadoGanador1;
    }



    public void setResultadoGanador1(int resultadoGanador1) {
        this.resultadoGanador1 = resultadoGanador1;
    }



    public int getResultadoGanador2() {
        return resultadoGanador2;
    }



    public void setResultadoGanador2(int resultadoGanador2) {
        this.resultadoGanador2 = resultadoGanador2;
    }

    // Métodos

    public void registrarJuego() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el nombre del juego");
        nombre = leer.nextLine();
    }

    // public void mostrarJuego() {
    //     System.out.println("El nombre del juego es= "+nombre);
    // }

    public void registrarJugadores(){
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el número de jugadores");
        nJugadores=leer.nextInt();
        
    }

    // public void mostrarJugadores(){
    //     System.out.println("En total hay "+nJugadores);
    //     System.out.println("Los nombres de los jugadores son: ");
    //     for(int i=0;i<nJugadores;i++){
    //         System.out.println(nombreJugadores[i]);
    //     }
    // }

    
    public void calcularEdad(int anio){
        int edad, anioActual;
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese el año actual");
        anioActual=leer.nextInt();

        edad=(anioActual-anio);

        System.out.println("su edad es:"+ edad);

    }

    


    public void calcularEdad(){
        int edad, anioActual, anioNacimiento;
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese el año de nacimiento");
        anioNacimiento=leer.nextInt();
        System.out.println("Ingrese el año actual");
        anioActual=leer.nextInt();

        edad=(anioActual-anioNacimiento);

        System.out.println("su edad es:"+ edad);
    }



}



//     public double sumar(double num1, double num2){
//         double sumar;
//         sumar=num1+num2;
//         return sumar;
//     } 
// }



package introduccion;

import java.util.Scanner;

public class deMesa extends Juego{

    private int numeroFichas;
    private int fichasJugador;

    public deMesa(){

    }

    public deMesa(int idJuego, String nombre, int nJugadores, String nombreGanador, int resultadoGanador1,
            int resultadoGanador2, int numeroFichas) {
        super(idJuego, nombre, nJugadores, nombreGanador, resultadoGanador1, resultadoGanador2);
        this.numeroFichas = numeroFichas;
    }

    public void registrarFichas(){
        Scanner leer=new Scanner(System.in);

        System.out.println("Ingrese el número de fichas");
        numeroFichas=leer.nextInt();

        System.out.println("Cuántas fichas hay por jugador");
        fichasJugador=leer.nextInt();
    }

    public void FichasSobrantes(){
        fichasJugador= (numeroFichas/fichasJugador)*setnJugadores();
    }
    
}

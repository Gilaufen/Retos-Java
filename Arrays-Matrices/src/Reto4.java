import java.util.Scanner;

public class Reto4 {
    public static void main(String[] args) {
        // declaramos la matriz y la inicializamos
        int i=0,j=0;
        String[][] productos = new String[16][2];
        int[][] codigoProductos=new int[16][2];

        // instanciamos la clase scanner
        Scanner leer = new Scanner(System.in);

        // solicitamos los productos y sus precios, también se va guardando el código del producto
        for (int fila = 0; fila < 16; fila++) {
            for (int columna = 0; columna < 1; columna++) {
                System.out.println("ingrese el nombre del producto= "+j);
                productos[fila][1] = leer.nextLine();
                System.out.println("ingrese el precio del producto= "+j);
                productos[fila][0] = leer.nextLine();
                codigoProductos[fila][0] = i;
                j++;
                }
                i++;
        }
        leer.nextLine();
        
        System.out.println("El catálogo de la máquina expendedora es");
        System.out.println("precio   /  producto  /  código ");

        for (int filas = 0; filas < 16; filas++) {
            for (int columnas = 0; columnas < 1; columnas++) {
             System.out.print(productos[filas][0]);
             System.out.print("           ");
             System.out.print(productos[filas][1]);
             System.out.print("           ");
             System.out.print(codigoProductos[filas][0]);
            }
            System.out.println(" ");
            i++;
        }
        leer.close();
    }
}

import java.util.Scanner;

public class Reto1 {
    public static void main(String[] args) {
        int cantidadNotas, suma=0, promedio=0;
        Scanner leer=new Scanner(System.in);

        System.out.println("por favor ingrese la cantidad de notas que ingresará");
        cantidadNotas=leer.nextInt();

        int[] num=new int[cantidadNotas];

        for(int i=0; i<cantidadNotas ;i++){
            System.out.println("ingrese la nota");
            num[i]=leer.nextInt();
            suma=suma+num[i];           
        }

        promedio=suma/cantidadNotas;
        
        if(promedio<3){
            System.out.println("reprobaste tu promedio fue menor a 3");
        } else if(promedio>=3 && promedio<4){
            System.out.println("pasaste raspando tu promedio estuvo entre 3 y 4");
        } else{
            System.out.println("pasaste con buenos resultados tu promedio es mayor a 4");
        }

        leer.close();
    
    
    }
}

package Retos;

import java.util.Scanner;
public class Reto5 {
    
    public static void main(String[] args) {
        //declaramos las variables
        String signo;
        int mes, dia;
        //instanciamos la clase scanner
        Scanner leer=new Scanner(System.in);
        
        //solicitamos al usuario que digite su mes y dia de nacimiento
        System.out.println("por favor ingrese su mes de nacimiento (1-12)");
        mes = leer.nextInt();
        System.out.println("por favor ingrese su día de nacimiento (1-31)");
        dia = leer.nextInt();
        

          // verificar el mes de nacimiento \n
          switch(mes) {
            case 1: // Enero
                if (dia <= 19) {
                    signo = "Capricornio";
                    System.out.println("Tu signo del zodiaco es: " + signo);
                    System.out.println("sus características son : \n 1. ambicioso \n 2. responsable \n 3. práctico \n 4. reservado \n 5. sarcástico \n 6. paciente");
                } else {
                    signo = "Acuario";
                    System.out.println("Tu signo del zodiaco es: " + signo);
                    System.out.println("sus características son : \n 1. innovador \n 2. independiente \n 3. humanitario \n 4. original \n 5. creativo \n 6. mente abierta");
                }
                break;
            case 2: // Febrero
                if (dia <= 18) {
                    signo = "Acuario";
                    System.out.println("Tu signo del zodiaco es: " + signo);
                    System.out.println("sus características son : \n 1. innovador \n 2. independiente \n 3. humanitario \n 4. original \n 5. creativo \n 6. mente abierta");
                } else {
                    signo = "Piscis";
                    System.out.println("Tu signo del zodiaco es: " + signo);
                    System.out.println("sus características son : \n 1. intuitivo \n 2. sensible \n 3. imaginativo \n 4. compasivo \n 5. creativo \n 6. soñador");
                }
                break;
            case 3: // Marzo
                if (dia <= 20) {
                    signo = "Piscis";
                    System.out.println("Tu signo del zodiaco es: " + signo);
                    System.out.println("sus características son : \n 1. intuitivo \n 2. sensible \n 3. imaginativo \n 4. compasivo \n 5. creativo \n 6. soñador");
                } else {
                    signo = "Aries";
                    System.out.println("Tu signo del zodiaco es: " + signo);
                    System.out.println("sus características son : \n 1. apasionado \n 2. valiente \n 3. enérgico \n 4. impulsivo \n 5. competitivo \n 6. lider");
                }
                break;
            case 4: // Abril
                if (dia <= 19) {
                    signo = "Aries";
                    System.out.println("Tu signo del zodiaco es: " + signo);
                    System.out.println("sus características son : \n 1. apasionado \n 2. valiente \n 3. enérgico \n 4. impulsivo \n 5. competitivo \n 6. lider");
                } else {
                    signo = "Tauro";
                    System.out.println("Tu signo del zodiaco es: " + signo);
                    System.out.println("sus características son : \n 1. estable \n 2. práctico \n 3. sensual \n 4. terco \n 5. leal \n 6. confiable");
                }
                break;
            case 5: // Mayo
                if (dia <= 20) {
                    signo = "Tauro";
                    System.out.println("Tu signo del zodiaco es: " + signo);
                    System.out.println("sus características son : \n 1. estable \n 2. práctico \n 3. sensual \n 4. terco \n 5. leal \n 6. confiable");
                } else {
                    signo = "Géminis";
                    System.out.println("Tu signo del zodiaco es: " + signo);
                    System.out.println("sus características son : \n 1. comunicativo \n 2. adaptable \n 3. curioso \n 4. ingenioso \n 5. sociable \n 6. dual");
                }
                break;
            case 6: // Junio
                if (dia <= 20) {
                    signo = "Géminis";
                    System.out.println("Tu signo del zodiaco es: " + signo);
                    System.out.println("sus características son : \n 1. comunicativo \n 2. adaptable \n 3. curioso \n 4. ingenioso \n 5. sociable \n 6. dual");
                } else {
                    signo = "Cáncer";
                    System.out.println("Tu signo del zodiaco es: " + signo);
                    System.out.println("sus características son : \n 1. sensible \n 2. protector \n 3. leal \n 4. emocional \n 5. hogañero \n 6. intuitivo");
                }
                break;
            case 7: // Julio
                if (dia <= 22) {
                    signo = "Cáncer";
                    System.out.println("Tu signo del zodiaco es: " + signo);
                    System.out.println("sus características son : \n 1. sensible \n 2. protector \n 3. leal \n 4. emocional \n 5. hogañero \n 6. intuitivo");
                } else {
                    signo = "Leo";
                    System.out.println("Tu signo del zodiaco es: " + signo);
                    System.out.println("sus características son : \n 1. fuerte \n 2. creativo \n 3. generoso \n 4. orgulloso \n 5. leal \n 6. apasionado");
                }
                break;
            case 8: // Agosto
                if (dia <= 22) {
                    signo = "Leo";
                    System.out.println("Tu signo del zodiaco es: " + signo);
                    System.out.println("sus características son : \n 1. fuerte \n 2. creativo \n 3. generoso \n 4. orgulloso \n 5. leal \n 6. apasionado");
                } else {
                    signo = "Virgo";
                    System.out.println("Tu signo del zodiaco es: " + signo);
                    System.out.println("sus características son : \n 1. perfeccionista \n 2. organizado \n 3. detallista \n 4. análitico \n 5. práctico \n 6. trabajador");
                }
                break;
            case 9: // Septiembre
                if (dia <= 22) {
                    signo = "Virgo";
                    System.out.println("Tu signo del zodiaco es: " + signo);
                    System.out.println("sus características son : \n 1. perfeccionista \n 2. organizado \n 3. detallista \n 4. análitico \n 5. práctico \n 6. trabajador");
                } else {
                    signo = "Libra";
                    System.out.println("Tu signo del zodiaco es: " + signo);
                    System.out.println("sus características son : \n 1. equilibrado \n 2. amable \n 3. social \n 4. justo \n 5. encantador \n 6. artístico");
                
                }
                break;
            case 10: // Octubre
                if (dia <= 22) {
                    signo = "Libra";
                    System.out.println("Tu signo del zodiaco es: " + signo);
                    System.out.println("sus características son : \n 1. equilibrado \n 2. amable \n 3. social \n 4. justo \n 5. encantador \n 6. artístico");
                } else {
                    signo = "Escorpio";
                    System.out.println("Tu signo del zodiaco es: " + signo);
                    System.out.println("sus características son : \n 1. intenso \n 2. apasionado \n 3. misterioso \n 4. perspicaz \n 5. astuto \n 6. magnético");
                }
                break;
            case 11: // Noviembre
                if (dia <= 21) {
                    signo = "Escorpio";
                    System.out.println("Tu signo del zodiaco es: " + signo);
                    System.out.println("sus características son : \n 1. intenso \n 2. apasionado \n 3. misterioso \n 4. perspicaz \n 5. astuto \n 6. magnético");
                } else {
                    signo = "Sagitario";
                    System.out.println("Tu signo del zodiaco es: " + signo);
                    System.out.println("sus características son : \n 1. aventurero \n 2. optimista \n 3. generoso \n 4. impulsivo \n 5. extrovertido \n 6. independiente");
                }
            case 12: // Diciembre
                if (dia <= 21) {
                    signo = "Sagitario";
                    System.out.println("Tu signo del zodiaco es: " + signo);
                    System.out.println("sus características son : \n 1. aventurero \n 2. optimista \n 3. generoso \n 4. impulsivo \n 5. extrovertido \n 6. independiente");
                } else {
                    signo = "Capricornio";
                    System.out.println("Tu signo del zodiaco es: " + signo);
                    System.out.println("sus características son : \n 1. ambicioso \n 2. responsable \n 3. práctico \n 4. reservado \n 5. sarcástico \n 6. paciente");
                }
                break;
            default:
                System.out.println("El mes ingresado no es válido.");
                break;
        }
        leer.close();
    }
}
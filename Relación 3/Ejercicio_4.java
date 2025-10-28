import java.util.Scanner;

public class Ejercicio_4 {
    static void main() {
        //Introducción
        int dia, mes, anio ;
        int diasDelMes = 0;
        boolean esBisiesto;
        Scanner sc = new Scanner(System.in);

        //Desarrollo
        System.out.println("Introduce el día");
        dia = sc.nextInt();
        System.out.println("Introduce el número del mes");
        mes = sc.nextInt();
        System.out.println("Introduce el año");
        anio = sc.nextInt();

        if ((anio % 4 ==0 && anio % 100 !=0) || (anio % 400 == 0)){
            esBisiesto = true;
        }else {
            esBisiesto = false;
        }
        switch (mes){
            case 1, 3, 5, 7, 8, 10, 12:
                diasDelMes = 31;
                break;
            case 4, 6, 9, 11:
                diasDelMes = 30;
                break;
            case 2:
                if (esBisiesto){
                    diasDelMes = 29;
                }else {
                    diasDelMes = 28;
                }
                break;
            default:
                System.out.println("Mes no válido");
        }

        //Desenlace
        if (dia >=1 && dia <=diasDelMes){
            System.out.println("La fecha de: " +dia +"/" +mes +"/" +anio + " es válida");
        } else{
            System.out.println("La fecha de: " +dia +"/" +mes +"/" +anio + " NO es válida");
        }
    }
}

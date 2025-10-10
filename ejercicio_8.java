import java.util.Scanner;

public class ejercicio_8 {
    static void main() {
        //Introducción
        int dia, mes, anio, suma, digi1, digi2, digi3, digi4, suerte;
        Scanner sc = new Scanner(System.in);

        //Desarrollo
        System.out.println("Introduce el día que naciste");
        dia = sc.nextInt();
        System.out.println("Introduce el número del mes que naciste");
        mes = sc.nextInt();
        System.out.println("Introduce el año que naciste");
        anio = sc.nextInt();
        suma = dia + mes + anio;
        digi4 = suma % 10;
        digi3 = (suma/10) % 10;
        digi2 = (suma/100) %10;
        digi1 = suma/1000;
        suerte = digi1 + digi2 + digi3 + digi4;

        //Desenlace
        System.out.println("Tu número de la suerte es: "+suerte);
    }
}

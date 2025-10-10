import java.util.Scanner;

public class ejercicio_7 {
    static void main() {
        //Introducción
        int hora1, hora2, min1, min2, seg1, seg2, segt1, segt2, difseg;
        int minutos,restossegundos, restosminutos, horas;
        Scanner sc = new Scanner(System.in);

        //Desarrollo
        System.out.println("Introduce las horas del primer instante de tiempo");
        hora1 = sc.nextInt();
        System.out.println("Introduce los minutos del primer instante de tiempo");
        min1 = sc.nextInt();
        System.out.println("Introduce los segundos del primer instante de tiempo");
        seg1 = sc.nextInt();
        System.out.println("Introduce las horas del segundo instante de tiempo");
        hora2 = sc.nextInt();
        System.out.println("Introduce los minutos del segundo instante de tiempo");
        min2 = sc.nextInt();
        System.out.println("Introduce los segundos del segundo instante de tiempo");
        seg2 = sc.nextInt();
        segt1 = hora1*3600 + min1*60 + seg1;
        segt2 = hora2*3600 + min2*60 + seg2;
        difseg = segt2 - segt1;
        restossegundos= difseg % 60;
        minutos = difseg / 60;
        restosminutos= minutos % 60;
        horas = minutos / 60;

        //Desenlace
        System.out.println("La diferencia de tiempo es: " +horas +" horas, " +restosminutos +" minutos y " +restossegundos +" segundos");
    }
}

import java.util.Scanner;
import java.util.function.DoublePredicate;

public class ejercicio_10 {
    static void main() {
        //Introducción
        double n1, n2, n3, n4, n5, n6;
        double p1, p2, p3, p4, p5, p6;
        double promedio = 0;
        Scanner sc = new Scanner(System.in);

        //Desarrollo
        System.out.println("Introduce la calificación sobre 100 obtenida en la primera materia");
        n1 = sc.nextDouble();
        System.out.println("¿Cual es su porcentaje respecto al total de la nota?");
        p1 = sc.nextDouble();
        System.out.println("Introduce la calificación sobre 100 obtenida en la segunda materia");
        n2 = sc.nextDouble();
        System.out.println("¿Cual es su porcentaje respecto al total de la nota?");
        p2 = sc.nextDouble();
        System.out.println("Introduce la calificación sobre 100 obtenida en la tercera materia");
        n3 = sc.nextDouble();
        System.out.println("¿Cual es su porcentaje respecto al total de la nota?");
        p3 = sc.nextDouble();
        System.out.println("Introduce la calificación sobre 100 obtenida en la cuarta materia");
        n4 = sc.nextDouble();
        System.out.println("¿Cual es su porcentaje respecto al total de la nota?");
        p4 = sc.nextDouble();
        System.out.println("Introduce la calificación sobre 100 obtenida en la quinta materia");
        n5 = sc.nextDouble();
        System.out.println("¿Cual es su porcentaje respecto al total de la nota?");
        p5 = sc.nextDouble();
        System.out.println("Introduce la calificación sobre 100 obtenida en la sexta materia");
        n6 = sc.nextDouble();
        System.out.println("¿Cual es su porcentaje respecto al total de la nota?");
        p6 = sc.nextDouble();

        //Desenlace
        if (p1 + p2 + p3 + p4 + p5 + p6 !=100){
            System.out.println("ERROR, la suma de los porcentajes no da como resultado el 100%");
        } else {
            promedio = n1 * (p1/100) + n2 * (p2/100) + n3 * (p3/100) + n4 * (p4/100) + n5* (p5/100) + n6 * (p6/100);
        }
        if (promedio <60){
            System.out.println("El usuario ha suspendido");
        }else {
            System.out.println("El promedio del usuario es: " +promedio);
        }
    }
}

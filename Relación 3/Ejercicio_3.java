import java.sql.SQLOutput;
import java.util.Scanner;

public class Ejercicio_3 {
    static void main() {
        int nota1, nota2, nota3, nota4, nota5, promedio;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la nota de la primera materia sobre 100");
        nota1 = sc.nextInt();
        if (nota1 > 100 || nota1 < 0){
            System.out.println("ERROR");
            System.exit(0);
        }
        System.out.println("Introduce la nota de la segunda materia sobre 100");
        nota2 = sc.nextInt();
        if (nota2 > 100 || nota2 < 0){
            System.out.println("ERROR");
            System.exit(0);
        }
        System.out.println("Introduce la nota de la tercera materia sobre 100");
        nota3 = sc.nextInt();
        if (nota3 > 100 || nota3 < 0){
            System.out.println("ERROR");
            System.exit(0);
        }
        System.out.println("Introduce la nota de la cuarta materia sobre 100");
        nota4 = sc.nextInt();
        if (nota4 > 100 || nota4 < 0){
            System.out.println("ERROR");
            System.exit(0);
        }
        System.out.println("Introduce la nota de la quinta materia sobre 100");
        nota5 = sc.nextInt();
        if (nota5 > 100 || nota5 < 0){
            System.out.println("ERROR");
            System.exit(0);
        }
        promedio = (nota1 + nota2 + nota3 + nota4 + nota5)/5;

        if (promedio >= 90 && promedio <= 100){
            System.out.println("Tu calificación es A con un promedio de: " +promedio +" puntos");
        } else if (promedio >= 80 && promedio <=89) {
            System.out.println("Tu calificación es B con un promedio de: " +promedio +" puntos");
        } else if (promedio >= 70 && promedio <=79) {
            System.out.println("Tu calificación es C con un promedio de: " +promedio +" puntos");
        } else if (promedio >=60 && promedio <=69) {
            System.out.println("Tu calificación es D con un promedio de: " +promedio +" puntos");
        } else {
            System.out.println("Tu calificación es F con un promedio de: " +promedio +" puntos");
        }
    }
}

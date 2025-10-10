import java.util.Scanner;

public class ejercicio_4 {
    static void main() {
        //Introducción
        String nombre;
        double practica, problemas, teorica, notafinal;
        double valorPractiva = 0.1;
        double valorProblemas = 0.5;
        double valorTeoria = 0.4;
        Scanner sc = new Scanner(System.in);

        //Desarrollo
        System.out.println("Introduce el nombre del alumno");
        nombre = sc.nextLine().trim();
        System.out.println("Introduce la nota de prácticas");
        practica = sc.nextDouble();
        System.out.println("Introduce la nota de problemas");
        problemas = sc.nextDouble();
        System.out.println("Introduce la nota de teoría");
        teorica = sc.nextDouble();
        notafinal = (practica* valorPractiva + problemas* valorProblemas + teorica* valorTeoria);

        //Desenlace
        System.out.println("Nota final de " +nombre +" es: " +notafinal);
    }
}

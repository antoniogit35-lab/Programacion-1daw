import java.util.Scanner;

public class ejercicio_2 {
    static void main() {
        //Introducción
        double horas, paga;
        double precioHoras=12;
        Scanner sc = new Scanner(System.in);

        //Desarrollo
        System.out.println("¿Cuantas horas ha trabajado el empleado esta semana?");
        horas = sc.nextDouble();
        paga = horas * precioHoras;
        //Desenlace
        System.out.println("El empleado ha ganado esta semana: " +paga +" €");
    }
}

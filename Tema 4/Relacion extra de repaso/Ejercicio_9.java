import java.util.Scanner;

public class Ejercicio_9 {
    static void main() {
        //Pide una nota (0–10) y usa if/else if/else para mostrar la calificación en letras (Sobresaliente, Notable, Bien, Suficiente, Suspenso).
        double nota;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la nota que has sacado entre 0-10:");
        nota = sc.nextDouble();

        if (nota <=10 && nota>=9 ){
            System.out.println("Has sacado un sobresaliente");
        } else if (nota < 9 && nota>=7 ){
            System.out.println("Has sacado un notable");
        } else if (nota < 7 && nota>=6 ){
            System.out.println("Has sacado un bien");
        } else if (nota < 7 && nota>=5 ){
            System.out.println("Has sacado un suficiente");
        } else if (nota < 5 && nota>=0 ){
            System.out.println("Has suspendido");
        }
    }
}

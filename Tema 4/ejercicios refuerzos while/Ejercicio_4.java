import java.util.Random;
import java.util.Scanner;

public class Ejercicio_4 {
    static void main() {
        int n =0, aleatorio;
        Scanner sc = new Scanner(System.in);
        Random generador = new Random();
        aleatorio = generador.nextInt(10)+1;

        while (n != aleatorio){
            System.out.println("Introduce un numero");
            n = sc.nextInt();
            if (n < aleatorio){
                System.out.println("El numero secreto es mayor");
            } else if (n > aleatorio) {
                System.out.println("El numero secreto es menor");
            } else {
                System.out.println("Enhorabuena");
            }
        }
    }
}

import java.util.Scanner;

public class ejercicio_8 {
    static void main() {
        //Introducción
        int n, i;
        int sumaDivisores = 0;
        Scanner sc = new Scanner(System.in);

        //Desarrollo y desenlace
        System.out.println("Introduce el número del que quieres saber si es un número perfecto");
        n = sc.nextInt();
            for (i = 1; i <= n / 2; i++) {
                if (n % i == 0) {
                    sumaDivisores += i;
                }
            }
        if (sumaDivisores == n) {
            System.out.println(n + " es número perfecto");
        } else {
            System.out.println(n +" no es número perfecto");
        }
    }
}

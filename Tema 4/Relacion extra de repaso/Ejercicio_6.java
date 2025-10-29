import java.util.Scanner;

public class Ejercicio_6 {
    static void main() {
        //Pide un número y determina si es primo usando un bucle.
        int n;
        boolean esPrimo = true;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número que quieras saber si es primo o no");
        n = sc.nextInt();

        for (int i=2; i<n; i++){
            if (n % i ==0) {
                esPrimo = false;
                break;
            }

            }
        if (esPrimo){
            System.out.println(n +" es primo");
        } else {
            System.out.println(n +" NO es primo");
        }
    }
}

import java.util.Scanner;

public class Ejercicio_8 {
    static void main() {
        //Pide un número y calcula su suma de dígitos usando un bucle while.
        int n, digito, suma = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el número cuyos dígitos quieres sumar");
        n = sc.nextInt();

        while (n>0){
            digito = n % 10;
            suma += digito;
            n = n/10;
        }
        System.out.println("La suma de los dígitos es: " +suma);
    }
}

import java.util.Scanner;

public class Ejercicio_10 {
    static void main() {
        //Pide un número N y muestra todos los divisores de N
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el número del que quieras saber sus divisores");
        n = sc.nextInt();

        for (int i=1; i<=n; i++){
            if (n % i ==0){
                System.out.println(i +" es divisor de " +n);
            }
        }
    }
}

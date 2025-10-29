import java.util.Scanner;

public class Ejercicio_4 {
    static void main() {
        //Calcula la multiplicación de todos los números del 1 al N (factorial), con N introducido por el usuario.
        int n;
        int factorial = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el número del que quieres averiguar su factorial");
        n = sc.nextInt();

        for (int i=1; i<=n; i++){
            factorial *= i;
        }
        System.out.println("El factorial de " +n +" es igual a: " +factorial);
        sc.close();
    }
}

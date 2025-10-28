import java.util.Scanner;

public class Ejercicio_7 {
    static void main() {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el número el cual quieres imprimir desde el 1 hasta ese número");
        n = sc.nextInt();

        for (int i=1; i<=n; i++){
            System.out.println("Números del 1 hasta " +n +" :");
            System.out.println(i);
        }
    }
}

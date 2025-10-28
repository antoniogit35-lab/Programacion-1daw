import java.util.Scanner;

public class ejercicio_8 {
    static void main() {
        double n;
        double promedio;
        double suma = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el valor de n");
        n =sc.nextInt();
        for (int i=0; i<=n; i++){
            suma +=i;
        }
        promedio = suma /n;
        System.out.println("El promedio es: " +promedio);
    }
}

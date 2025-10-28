import java.util.Scanner;

public class ejercicio_6 {
    static void main() {
        int x;
        int fact =1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el número del que quieres calcular el factorial");
        x = sc.nextInt();
        for (int i=1; i<=x; i++){
            fact = fact * i;
        }
        System.out.println("El factorial es: "+fact);
    }
}

import java.util.Scanner;

public class Ejercicio_3 {
    static void main() {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero");
        n = sc.nextInt();

        while (n>0){
            System.out.println(n);
            n--;
        }
    }
}

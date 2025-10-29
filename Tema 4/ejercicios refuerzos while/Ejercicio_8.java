import java.util.Scanner;

public class Ejercicio_8 {
    static void main() {
        int n;
        int i=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número");
        n = sc.nextInt();
        while (i <= 10){
                System.out.println(n +" * " +i +" es igual : " +i*n);
                i++;

        }
    }
}

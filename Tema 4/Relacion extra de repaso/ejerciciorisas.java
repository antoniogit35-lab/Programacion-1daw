import java.util.Scanner;

public class ejerciciorisas {
    static void main() {
        int n;
        int i = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el número del que quieres saber los impares hasta ese número");
        n = sc.nextInt();

        while (i++>=n){
            if (i%2 != 0){
                System.out.println(i);
            }
        }
    }
}

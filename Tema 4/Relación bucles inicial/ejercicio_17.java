import java.util.Scanner;

public class ejercicio_17 {
    static void main() {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el valor de la base de la pirámide");
        n= sc.nextInt();
        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                System.out.printf(String.valueOf(i));
            }
            System.out.println();
        }
    }
}

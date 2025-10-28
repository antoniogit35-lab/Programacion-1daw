import java.util.Scanner;

public class ejercicio_13 {
    static void main() {
        int n;
        int x=0;
        int y=1;
        int siguiente;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce cuántos números de la serie de Fibonacci quieres saber");
        n= sc.nextInt();
        for (int i=0; i<n;i++){
            siguiente=x + y;
            x=y;
            y = siguiente;
        }
        System.out.println(y);
    }
}

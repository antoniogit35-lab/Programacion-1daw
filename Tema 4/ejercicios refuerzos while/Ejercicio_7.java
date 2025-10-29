import java.util.Scanner;

public class Ejercicio_7 {
    static void main() {
        int n = 0;
        int contador = 0;
        Scanner sc = new Scanner(System.in);

        while (n >= 0){
            System.out.println("Introduce un número");
            n = sc.nextInt();
            if(n>=0)
                contador++;
        }
        System.out.println(contador);
    }
}

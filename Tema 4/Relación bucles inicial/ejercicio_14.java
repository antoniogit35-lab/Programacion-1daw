import java.util.Scanner;

public class ejercicio_14 {
    static void main() {
        int n, digito;
        int inverso=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número entero");
        n = sc.nextInt();
        do {
            digito=n%10;
            inverso =inverso * 10+digito;
            n /=10;
        }while (n!=0);
        System.out.println("El numero inverso es: "+inverso);
    }
}

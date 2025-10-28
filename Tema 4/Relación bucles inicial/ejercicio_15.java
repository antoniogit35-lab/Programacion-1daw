import java.util.Scanner;

public class ejercicio_15 {
    static void main() {
        //Introducción
        int n, original, digito;
        int inverso = 0;
        Scanner sc = new Scanner(System.in);

        //Desarrollo
        System.out.println("Introduce el número entero que quieres saber si es palíndromo");
        n = sc.nextInt();
        original = n;
        do {
            digito=n%10;
            inverso = inverso *10 + digito;
            n /=10;
        }while (n!=0);

        //Desenlace
        if (original == inverso){
            System.out.println("El número es palíndromo");
        } else {
            System.out.println("El número NO es palíndromo");
        }
    }
}

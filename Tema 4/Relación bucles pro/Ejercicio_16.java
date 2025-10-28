import java.util.Scanner;

public class Ejercicio_16 {
    static void main() {
        int num, digi;
        int suma=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el número del que quieres sumar sus dígitos");
        num= sc.nextInt();
        do {
            digi = num%10;
            suma += digi;
            num /= 10;
        }while (num>0);
        System.out.println("La suma de los dígitos es: "+suma);
    }
}

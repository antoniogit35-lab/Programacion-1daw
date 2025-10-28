import java.sql.SQLOutput;
import java.util.Scanner;

public class ejercicio_10 {
    static void main() {
       int num;
       int suma=0;
       int digi;
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

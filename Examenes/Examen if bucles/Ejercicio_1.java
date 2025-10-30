import java.util.Scanner;

public class Ejercicio_1 {
    static void main() {
        //Escribe un programa en Java que pida al usuario que ingrese un número entero positivo
        //y luego imprima todos los números pares desde 1 hasta el número ingresado utilizando
        //bucles. Además, el programa debe mostrar por pantalla la suma de todos los números
        //pares encontrados hasta el número ingresado

        int n;
        int suma = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número entero positivo");
        n = sc.nextInt();
        System.out.println("Números pares hasta " +n +" : ");

        for (int i=1; i<=n; i++){
            if (i%2 == 0){
                System.out.println(i);
                suma +=i;
            }
        }
        System.out.println("La suma de todos los pares hasta " +n +" es: " +suma);
        sc.close();
    }
}

import java.util.Scanner;

public class Ejercicio_3 {
    static void main() {
        //Escribe un programa en Java que pida al usuario que ingrese un número entero positivo
        //y determine si el número ingresado es un número perfecto. Un número perfecto es aquel
        //que es igual a la suma de sus divisores propios positivos (excluyendo el mismo
        //número). Por ejemplo, el número 6 es perfecto porque sus divisores propios son 1, 2 y
        //3, y su suma es 1 + 2 + 3 = 6.
        int n;
        int suma = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número entero positivo");
        n = sc.nextInt();

        for (int i=1; i<n; i++){
            if (n%i == 0){
                suma+=i;
            }
        }
        if (suma == n){
            System.out.println("El número " +n +" es un número perfecto");
        } else {
            System.out.println("El número " +n +" no es un número perfecto");
        }
        sc.close();
    }
}

import java.util.Scanner;

public class Ejercicio_6 {
    static void main() {
        //Introducción
        double valor, resultado, x5, x4, x3, x2;
        Scanner sc = new Scanner(System.in);

        //Desarrollo
        System.out.println("Introduce el valor que le quieres dar a X");
        valor = sc.nextDouble();
        x2 = valor * valor;
        x3 = x2 * valor;
        x4 = x3 * valor;
        x5 = x4 * valor;
        resultado = x5 + 7*x4 - 4*x3 + 2*x2 - valor + 10;

        //Desenlace
        System.out.println("El resultado del polinomio es: " +resultado);
    }
}

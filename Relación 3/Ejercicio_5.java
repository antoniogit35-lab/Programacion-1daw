import java.util.Scanner;

public class Ejercicio_5 {
    static void main() {
       //Introducción
       double lado1, lado2, lado3;
        Scanner sc = new Scanner(System.in);

       //Desarrollo
        System.out.println("Introduce la longitud del primer lado");
        lado1 = sc.nextDouble();
        System.out.println("Introduce la longitud del segundo lado");
        lado2 = sc.nextDouble();
        System.out.println("Introduce la longitud del tercer lado");
        lado3 = sc.nextDouble();

        //Desenlace
        if (lado1 == lado2 && lado3 ==lado2){
            System.out.println("El triángulo introducido es equilátero");
        } else if (lado1 == lado2 || lado1 == lado3|| lado2 == lado3) {
            System.out.println("El triángulo introducido es isósceles");
        } else if (lado1 !=lado2 && lado1 !=lado3) {
            System.out.println("El triángulo es escaleno");
        } else {
            System.out.println("No forman un triangulo");
        }
    }
}

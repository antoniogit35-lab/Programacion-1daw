import java.util.Scanner;

public class ejercicio_9 {
    static void main() {
        //Introducción
        Double n1, n2;
        double resultado = 0;
        String operador;
        Scanner sc = new Scanner(System.in);

        //Desarrollo
        System.out.println("Introduce la operación que quieres realizar, las opciones son: ");
        System.out.println("AVISO, el resultado dará -1.0 si elige una operación no disponible");
        System.out.println("suma - resta - multiplicacion - division - potencia - raiz - factorial");
        operador = sc.nextLine().toLowerCase().trim();

        //Desenlace
        switch (operador){
            case "suma":
                System.out.println("Introduce el primer número: ");
                n1 = sc.nextDouble();
                System.out.println("Introduce el segundo número: ");
                n2 = sc.nextDouble();
                resultado = n1 + n2;
                break;

            case "resta":
                System.out.println("Introduce el primer número: ");
                n1 = sc.nextDouble();
                System.out.println("Introduce el segundo número: ");
                n2 = sc.nextDouble();
                resultado = n1-n2;
                break;

            case "multiplicacion":
                System.out.println("Introduce el primer número: ");
                n1 = sc.nextDouble();
                System.out.println("Introduce el segundo número: ");
                n2 = sc.nextDouble();
                resultado = n1 * n2;
                break;

            case "division":
                System.out.println("Introduce el dividendo: ");
                n1 = sc.nextDouble();
                System.out.println("Introduce el divisor: ");
                n2 = sc.nextDouble();
                if (n2 == 0){
                    System.out.println("ERROR, la división entre 0 no es posible");
                } else {
                    resultado = n1 / n2;
                } break;

            case "potencia":
                System.out.println("Introduce la base de la potencia: ");
                n1 = sc.nextDouble();
                System.out.println("Introduce el exponente");
                n2 = sc.nextDouble();
                if (n2 < 0){
                    System.out.println("ERROR, no puede haber un exponente negativo");
                }else if (n2 == 0){
                    resultado = 1;
                } else {
                    for (int i = 0; i< n2; i++){
                        resultado *= n1;
                    }
                } break;

            case "raiz":
                System.out.println("Introduce el número del que quieres saber su raiz cuadrada");
                n1 = sc.nextDouble();
                if (n1 < 0){
                    System.out.println("ERROR, no se puede calcular la raíz cuadrada de un número negativo");
                } else {
                resultado = Math.sqrt(n1);
                } break;


            case "factorial":
                System.out.println("Introduce el número al que quieres calcular el factorial: ");
                n1 = sc.nextDouble();
                if (n1 < 1){
                    System.out.println("ERROR, no se puede calcular el factorial de un número negativo o 0");
                }else {
                    for (int i = 1; i<=n1; i++) {
                        resultado = resultado * i;
                    }
                } break;
            default:
                resultado = -1.0;
                break;
        }
        System.out.println("El resultado de tu operación es: " +resultado);
    }
}
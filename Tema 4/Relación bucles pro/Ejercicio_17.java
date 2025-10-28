import java.util.Random;
import java.util.Scanner;

public class Ejercicio_17 {
    static void main() {
        int supuesto, numeroOculto;
        Scanner sc = new Scanner(System.in);
        Random generador = new Random();
        numeroOculto = generador.nextInt(10)+1;

        do{
            System.out.println("Adivina el número secreto entre 1 y 10");
            supuesto= sc.nextInt();

            if (supuesto< numeroOculto){
                System.out.println("El numero oculto es mayor");
            } else if (supuesto > numeroOculto) {
                System.out.println("El número oculto es menor");
            }else {
                System.out.println("¡Enhorabuena, has adivinado el número secreto!");
            }
        }while (supuesto!= numeroOculto);
    }
}


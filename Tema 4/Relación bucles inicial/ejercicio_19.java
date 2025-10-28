import java.util.Random;
import java.util.Scanner;

public class ejercicio_19 {
    static void main() {
        int supuesto, numeroOculto;
        Scanner sc = new Scanner(System.in);
        Random generador = new Random();
        numeroOculto = generador.nextInt(100)+1;

        do{
            System.out.println("Introduce el número que supones que es:");
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

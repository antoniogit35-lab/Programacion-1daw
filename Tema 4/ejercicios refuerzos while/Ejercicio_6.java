import java.util.Scanner;

public class Ejercicio_6 {
    static void main() {
        int eleccion = 0;
        Scanner sc = new Scanner(System.in);

        while (eleccion !=3){
            System.out.println("--MENU--");
            System.out.println("1 - Saludar");
            System.out.println("2 - Mostrar fecha actual");
            System.out.println("3 - Salir");
            eleccion = sc.nextInt();

            switch (eleccion){
                case 1:
                    System.out.println("Holi");
                    break;
                case 2:
                    System.out.println("29 de Octubre de 2025");
                    break;
                case 3:
                    System.out.println("Adiosito");
                    break;
                default:
                    System.out.println("Número erroneo");
            }
        }
    }
}

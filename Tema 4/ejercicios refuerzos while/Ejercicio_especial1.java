import java.util.Scanner;

public class Ejercicio_especial1 {
    static void main() {
        //calculo de medias con while
        int eleccion = 0;
        int contador = 0;
        double suma = 0, nota;
        double media;
        Scanner sc = new Scanner(System.in);
        while (eleccion !=3){
            System.out.println("--MENU--");
            System.out.println("1- introduce notas sobre 100");
            System.out.println("2 - Calcular media");
            System.out.println("3 - Salir");
            eleccion = sc.nextInt();

            if (eleccion == 1){
                System.out.println("Introduce nota");
                nota = sc.nextDouble();
                suma+=nota;
                contador++;
            } else if (eleccion == 2) {
                media = suma / contador;
                System.out.println("La media es: " + media);
                System.out.println();
            } else if (eleccion == 3){
                System.out.println("Saliendo.....");
            } else {
                System.out.println("Eleccion erronea");
            }
        }
    }
}

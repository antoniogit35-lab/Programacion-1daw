import java.util.Scanner;

public class Ejercicio_4 {
    static void main() {
        double nota = 1;
        double suma = 0;
        double media;
        int contador = -1;
        Scanner sc = new Scanner(System.in);

        while (nota != 0){
            System.out.println("Introduce una nota(0 para terminar)");
            nota = sc.nextInt();
                suma += nota;
                contador++;

        }
        if (contador == 0){
            System.out.println("No se han ingresado notas válidas");
        } else {
            media = suma/(contador);
            System.out.println("La media de notas es: " +media);
        }
        sc.close();
    }
}

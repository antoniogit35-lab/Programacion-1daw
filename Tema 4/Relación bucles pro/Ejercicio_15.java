import java.util.Scanner;

public class Ejercicio_15 {
    static void main() {
        String numero;
        int numeroDigitos = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el número del que quieras saber cuantos dígitos contiene");
        numero = sc.nextLine().trim();

        for (int i = 0; i<numero.length(); i++){
            numeroDigitos ++;
        }
        System.out.println("La cantidad de dígitos es: " +numeroDigitos);
    }
}

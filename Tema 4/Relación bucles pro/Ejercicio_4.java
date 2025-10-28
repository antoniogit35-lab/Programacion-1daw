import java.util.Random;
import java.util.Scanner;

public class Ejercicio_4 {
    static void main() {
        int n;
        String cadena = "";
        char letra;
        Scanner sc = new Scanner(System.in);
        Random generador = new Random();
        System.out.println("Introduce la longitud de la cadena");
        n = sc.nextInt();

        for (int i = 0; i<n; i++){
            letra = (char)(generador.nextInt(26)+'a');
            cadena += letra;
        }
        System.out.println("Cadena aleatoria de " +n +" caracteres: " +cadena);
    }
}

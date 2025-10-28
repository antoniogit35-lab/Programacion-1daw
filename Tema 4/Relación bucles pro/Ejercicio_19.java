import java.util.Random;

public class Ejercicio_19 {
    static void main() {
        double media;
        int suma = 0;
        int numeros;
        Random generador = new Random();

        for (int i = 1; i <= 10; i++) {
            numeros = generador.nextInt(100) + 1;
            System.out.println("Número " + i + ": " + numeros);
            suma += numeros;
        }
        media = suma /10.0;
        System.out.println("La media es: " +media);
    }
}

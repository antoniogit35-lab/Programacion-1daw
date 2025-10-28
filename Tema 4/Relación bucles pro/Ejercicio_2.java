import java.util.Scanner;

public class Ejercicio_2 {
    static void main() {
        String cadena;
        char letra;
        int contador = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la cadena de texto");
        cadena = sc.nextLine().toLowerCase().trim();
        System.out.println("Introduce la letra que quieres buscar cuantas veces aparece en la cadena");
        letra = sc.nextLine().toLowerCase().trim().charAt(0);

            for (int i = 0; i<cadena.length(); i++){
                if (letra == cadena.charAt(i)){
                    contador++;

                }
            }
        System.out.println("La letra " +letra +" aparece un total de: " +contador +" veces");
    }
}

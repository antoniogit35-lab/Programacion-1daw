import java.util.Scanner;

public class Ejercicio_18 {
    static void main() {
            String cadena;
            int contador = 0;
            Scanner sc = new Scanner(System.in);
            System.out.println("Introduce la cadena de la cual quieres contar las consonantes");
            cadena = sc.nextLine().toLowerCase();

            for (int i=0; i<cadena.length(); i++){
                if (cadena.charAt(i) != 'a' && cadena.charAt(i) != 'e' && cadena.charAt(i) != 'i' && cadena.charAt(i) != 'o' && cadena.charAt(i) != 'u' && cadena.charAt(i) !=' '){
                    contador++;
                }
            }
            System.out.println("La cadena introducida tiene: " +contador +" consonantes");
            sc.close();
    }
}
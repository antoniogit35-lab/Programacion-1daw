import java.util.Scanner;

public class Ejercicio_11 {
    static void main() {
        String cadena;
        int contadorVocales = 0;
        int contadorConsonantes = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la cadena de la que quieres contar vocales y consonantes");
        cadena = sc.nextLine().toLowerCase().trim();

        for (int i=0; i<cadena.length(); i++){
            if (cadena.charAt(i) =='a' || cadena.charAt(i) =='e' || cadena.charAt(i) =='i' || cadena.charAt(i) =='o' || cadena.charAt(i) =='u'){
                contadorVocales++;
            } else if (cadena.charAt(i) !='a' && cadena.charAt(i) !='e' && cadena.charAt(i) !='i' && cadena.charAt(i) !='o' && cadena.charAt(i) !='u' && cadena.charAt(i) !=' ') {
                contadorConsonantes++;
            }
        }
        System.out.println("La cantidad de vocales en la cadena es: " +contadorVocales);
        System.out.println("La cantidad de consonantes en la cadena es: " +contadorConsonantes);
    }
}

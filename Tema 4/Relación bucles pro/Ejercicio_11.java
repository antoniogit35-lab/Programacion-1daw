import java.util.Scanner;

public class Ejercicio_11 {
    static void main() {
        String cadena;
        boolean palabra = false;
        int contadorPalabras = 0;
        char palab;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la cadena de la que quieras averiguar cuantas palabras tiene");
        cadena = sc.nextLine().trim();

        for (int i=0; i<cadena.length(); i++){
            palab = cadena.charAt(i);

            if (palab != ' '){
                if ((!palabra)){
                contadorPalabras++;
                palabra = true;
                }
            } else {
                palabra = false;
            }
        }
        System.out.println("La cantidad de palabras en la cadena es de: " +contadorPalabras +" palabras");
        sc.close();
    }
}


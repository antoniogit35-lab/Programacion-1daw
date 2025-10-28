import java.util.Scanner;

public class Ejercicio_14 {
    static void main() {
        String cadena;
        String cambio = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la cadena en la que quieres cambiar mayúsculas por minúsculas y viceversa");
        cadena = sc.nextLine();

        for (int i=0; i<cadena.length(); i++){
            if (Character.isLowerCase(cadena.charAt(i))){
                cambio += Character.toUpperCase(cadena.charAt(i));
            } else if (Character.isUpperCase(cadena.charAt(i))) {
                cambio += Character.toLowerCase(cadena.charAt(i));
            }else {
                cambio += cadena.charAt(i);
            }
        }
        System.out.println("La cadena modificada es: " +cambio);
    }
}

import java.util.Scanner;

public class Ejercicio_3 {
    static void main() {
        String cadena;
        String inverso="";
        Scanner sc= new Scanner(System.in);
        System.out.println("Introduce la cadena que quieres invertir");
        cadena =sc.nextLine();
        for (int i = cadena.length()-1; i>=0; i--){
            inverso += cadena.charAt(i);
        }
        System.out.println("El inverso es: "+inverso);
    }
}

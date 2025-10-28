import java.util.Scanner;

public class ejercicio_14alterno {
    static void main() {
        String inverso="";
        Scanner sc= new Scanner(System.in);
        System.out.println("Introduce el número que quieres invertir");
        String numero =sc.nextLine();
        for (int i = numero.length()-1; i>=0; i--){
            inverso += numero.charAt(i);
        }
        System.out.println("El inverso es: "+inverso);
    }
}

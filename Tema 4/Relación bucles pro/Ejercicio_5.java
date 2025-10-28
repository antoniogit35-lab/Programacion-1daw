import java.util.Scanner;

public class Ejercicio_5 {
    static void main() {
        String cadena;
        String inverso = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la cadena que quieres saber si es palíndroma");
        cadena = sc.nextLine().toLowerCase();

        for (int i =cadena.length()-1; i>=0; i--){
            inverso += cadena.charAt(i);
        }
        if (cadena.equals(inverso)){
            System.out.println("La cadena es palíndroma");
        } else {
            System.out.println("La cadena NO es palíndroma");
        }
    }
}

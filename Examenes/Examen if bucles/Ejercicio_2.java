import java.util.Scanner;

public class Ejercicio_2 {
    static void main() {
        //Escribe un programa en Java que pida al usuario que ingrese un número entero y
        //determine si es un palíndromo, es decir, si se lee igual de izquierda a derecha que de
        //derecha a izquierda.

        String n;
        String inverso = "";
        String rojo = "\u001B[31m";
        String normal = "\u001B[00m";
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número entero: ");
        n = sc.nextLine();

        for (int i=n.length()-1; i>=0; i--){
            inverso += n.charAt(i);
        }
        if (inverso.equals(n)){
            System.out.println("El número " +n +" es palíndromo");
        } else {
            System.out.println("El número " +n +rojo +" no " +normal  +"es palíndromo");
        }
        sc.close();
    }
}

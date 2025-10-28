import java.util.Scanner;

public class Ejercicio_9 {
    static void main() {
        String n;
        int sumaPares=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el número cuyos dígitos pares quieras sumar");
        n = sc.nextLine().trim();

        for (int i = 0; i<n.length(); i++){
            int variable = Integer.parseInt( String.valueOf(n.charAt(i)));
            if (variable % 2  == 0){
                sumaPares += variable;
            }
        }
        System.out.println("La suma de dígitos pares es: " +sumaPares);
        sc.close();
    }
}

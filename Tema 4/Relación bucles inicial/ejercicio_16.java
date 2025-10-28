import java.util.Scanner;

public class ejercicio_16 {
    static void main() {
        String n;
        int sumaImpares=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el número cuyos dígitos impares quieras sumar");
        n = sc.nextLine().trim();

        for (int i = 0; i<n.length(); i++){
            int variable = Integer.parseInt( String.valueOf(n.charAt(i)));
            if (variable % 2  != 0){
                sumaImpares += variable;
            }
        }
        System.out.println("La suma de dígitos impares es: " +sumaImpares);
    }
}

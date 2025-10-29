import java.util.Scanner;

public class Ejercicio_5 {
    static void main() {
        //Imprime la tabla de multiplicar de cualquier número introducido por el usuario.
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce de que numero quieres saber su tabla de multiplicar");
        n = sc.nextInt();

        for (int i=1; i<=(n*10); i++){
            if (i % n ==0){
                System.out.println(n +" * " +i/n +" es igual a: " +i);
            }
        }
    }
}

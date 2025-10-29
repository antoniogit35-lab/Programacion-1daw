import java.util.Scanner;

public class Ejercicio_5 {
    static void main() {
        String contrasena = "HOLA";
        String intento = "";
        Scanner sc = new Scanner(System.in);

        while (!intento.equals(contrasena)){
            System.out.println("Intrduce la contraseña");
            intento = sc.nextLine().trim();
            if (intento.equals(contrasena)){
                System.out.println("Contraseña valida");
            } else {
                System.out.println("Contraseña erronea");
                System.out.println("Prueba otra vez");
            }
        }
    }
}

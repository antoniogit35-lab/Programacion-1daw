import java.util.Scanner;

public class Ejercicio_1 {
    static void main() {
        String usuario, contrasena;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu nombre de usuario:");
        usuario = sc.nextLine().toLowerCase().trim();
        System.out.println("Introduce tu contraseña:");
        contrasena = sc.nextLine().toLowerCase().trim();

        if (usuario.equals("admin") && contrasena.equals("1234")){
            System.out.println("Bienvenido, Administrador de Nivel 1");
        } else if (usuario.equals("user") && contrasena.equals("abcd")) {
            System.out.println("Bienvenido Usuario de Nivel 2");
        } else if (usuario.equals("guest") && contrasena.equals("xyz")) {
            System.out.println("Bienvenido, Invitado de Nivel 3");
        } else {
            System.out.println("Acceso denegado");
        }
    }
}

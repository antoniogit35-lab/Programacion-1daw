import java.util.Random;

public class Ejercicio_13 {
    static void main() {
        int largo = 8;
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        String contrasena = "";
        int opciones;
        Random generador = new Random();

        for (int i=0 ; i< largo; i++){
            opciones = generador.nextInt(caracteres.length());
            contrasena += caracteres.charAt(opciones);
        }
        System.out.println("Tu contraseña aleatoria es: " +contrasena);
    }
}

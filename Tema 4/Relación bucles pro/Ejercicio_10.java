import java.util.Scanner;

public class Ejercicio_10 {
    static void main() {
        int eleccion;
        String cadena;
        int contadorCadenas = 0;
        String larga = "";
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Va a introducir cuantas cadenas quiera hasta que seleccione 2");
            System.out.println("1 - Introducir cadena");
            System.out.println("2 - Salir");
            System.out.println("Elige una opción");
            eleccion = sc.nextInt();

            if (eleccion == 1){
                System.out.println("Introduce la cadena: ");
                cadena = sc.nextLine();
                contadorCadenas++;

                if (cadena.length() > larga.length()){
                    larga = cadena;
                }
            } else if (eleccion == 2) {
                System.out.println("Saliendo del programa....");
                System.out.println("Hasta la próxima");
            } else {
                System.out.println("Opción inválida. Vuelve a intentarlo");
            }

        }while (eleccion != 2);

        System.out.println("El número total de cadenas es: " +contadorCadenas);
        System.out.println("La cadena más larga es: " +larga);
    }
}

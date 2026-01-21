import java.io.File;
import java.util.Scanner;

public class EliminarArchivos {
    public static void eliminar(String ruta){

        File archivo = new File(ruta);

        if (!archivo.exists()){
            System.out.println("El archivo elegido no existe");
            return;
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("¿Deseas eliminar el siguiente archivo: " +ruta +"?");
        System.out.println("INTRODUZCA [si/no]");
        String eleccion = sc.nextLine();

        if (eleccion.equalsIgnoreCase("si")){
            archivo.delete();
            System.out.println("El archivo se ha borrado correctamente");
        } else {
            System.out.println("La eliminación del archivo se ha cancelado");
        }
    }
}

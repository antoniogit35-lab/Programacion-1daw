import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SobreescribirCSV {
    public static void sobreescribirArchivo(String path){
        try (
                BufferedWriter bw = new BufferedWriter(new FileWriter(path));
                Scanner sc = new Scanner(System.in)
        ) {

            System.out.println("Introduce líneas nuevas (escribe 'fin' para terminar):");

            while (true) {
                String linea = sc.nextLine();

                if (linea.equalsIgnoreCase("fin")) {
                    break;
                }

                bw.write(linea);
                bw.newLine();
            }

            System.out.println("Archivo sobrescrito correctamente");

        } catch (IOException e) {
            System.out.println("Error al sobrescribir el archivo CSV");
        }
    }
}

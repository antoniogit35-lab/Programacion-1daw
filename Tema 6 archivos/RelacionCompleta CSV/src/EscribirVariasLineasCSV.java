import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class EscribirVariasLineasCSV {
    public static void escribirVariasLineas(String path){
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {

            java.util.Scanner sc = new java.util.Scanner(System.in);
            String linea;

            System.out.println("Introduce líneas (escribe 'fin' para terminar):");

            while (true) {
                linea = sc.nextLine();

                if (linea.equalsIgnoreCase("fin")) {
                    break;
                }

                bw.write(linea);
                bw.newLine();
            }

            System.out.println("Líneas añadidas correctamente");

        } catch (IOException e) {
            System.out.println("Error al agregar líneas al CSV");
        }
    }
}

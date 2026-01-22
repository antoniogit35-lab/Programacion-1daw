import java.io.*;
import java.util.Scanner;

public class EscribirCSV {
    public static void escribirUnaLinea(String path, String linea) {

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
            bw.write(linea);
            bw.newLine();
            System.out.println("Línea escrita correctamente");

        } catch (IOException e) {
            System.out.println("Error al escribir el archivo CSV");
        }
    }

}



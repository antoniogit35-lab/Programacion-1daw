import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class EscribirArchivo {
    public static void escribir(String path, String datos){
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
            bw.write(datos);
            bw.newLine();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

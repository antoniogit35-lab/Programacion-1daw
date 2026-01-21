import java.io.BufferedWriter;
import java.io.FileWriter;

public class SobreescribirArchivo {
    public static void sobreescribir(String ruta, String texto){

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(ruta))) {

            bw.write(texto);
            bw.newLine();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

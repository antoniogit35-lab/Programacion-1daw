import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class ConcatenarArchivos {
    public static void concatenar(String archivo1, String archivo2, String archivo_destino){
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivo_destino));
             BufferedReader br1 = new BufferedReader(new FileReader(archivo1));
             BufferedReader br2 = new BufferedReader(new FileReader(archivo2))) {

            String linea;

            while ((linea = br1.readLine()) !=null){
                bw.write(linea);
                bw.newLine();
            }
            while ((linea = br2.readLine()) !=null) {
                bw.write(linea);
                bw.newLine();
            }
            System.out.println("Se han concatenado los archivos correctamente");

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

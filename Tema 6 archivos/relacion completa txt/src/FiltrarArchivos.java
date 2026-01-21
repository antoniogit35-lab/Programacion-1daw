import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class FiltrarArchivos {
    public static void filtrar(String archivo_buscar, String archivo_salida, String palabra){

        try (BufferedReader br = new BufferedReader(new FileReader(archivo_buscar));
             BufferedWriter bw = new BufferedWriter(new FileWriter(archivo_salida))) {
            String linea;

            while ((linea = br.readLine()) !=null){
                if (linea.contains(palabra)){
                    bw.write(linea);
                    bw.newLine();
                }
            }

            System.out.println("La línea se ha guardado en el nuevo archivo");

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

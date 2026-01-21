import java.io.BufferedReader;
import java.io.FileReader;

public class ContarLineas {
    public static void numeroLineas(String ruta){
        int contador = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {
            while (br.readLine() != null){
                contador++;
            }
            System.out.println("El número de líneas del archivo es: " +contador);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

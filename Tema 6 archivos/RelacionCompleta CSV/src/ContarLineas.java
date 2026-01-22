import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ContarLineas {
    public static int numeroLineas(String path){

        int contador = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            while (br.readLine() != null){
                contador++;
            }
        } catch (IOException e) {
            System.out.println("Error al contar las líneas");
            throw new RuntimeException(e);
        }
        return contador;
    }
}

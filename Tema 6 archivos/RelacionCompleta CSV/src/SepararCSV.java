import java.io.BufferedReader;
import java.io.FileReader;

public class SepararCSV {
    public static void separarComponentes(String path){
        try(BufferedReader br = new BufferedReader(new FileReader(path))){

            String linea;
            while ((linea = br.readLine()) != null){

                String[] componentes = linea.split(",");
                System.out.println("Nombre: " +componentes[0]);
                System.out.println("Edad: " +componentes[1]);
                System.out.println("Ciudad: " +componentes[2]);
                System.out.println("-----------------");
            }
        } catch (Exception e) {
            System.out.println("Error en el archivo CSV");
            throw new RuntimeException(e);
        }
    }
}

import java.io.*;

public class CopiarArchivos {

    public static void copiar(String ruta_origen, String ruta_copia){

        try (BufferedReader br = new BufferedReader(new FileReader(ruta_origen));
             BufferedWriter bw = new BufferedWriter(new FileWriter(ruta_copia))) {

            String linea;
            while ((linea = br.readLine()) != null){
                bw.write(linea);
                bw.newLine();
            }
            System.out.println("Copia realizada con exito");

        } catch (Exception e) {
            System.out.println("Error al copiar");
            throw new RuntimeException(e);
        }
    }
}

import java.io.*;

public class CopiarCSV {
    public static void copiar(String ruta_origen, String ruta_copia){
        BufferedReader br = null;
        BufferedWriter bw = null;
        try {
            FileReader fr = new FileReader(ruta_origen);
            FileWriter fw = new FileWriter(ruta_copia);
            br = new BufferedReader(fr);
            bw = new BufferedWriter(fw);

            String linea;
            while ((linea = br.readLine()) != null){
                bw.write(linea);
                bw.newLine();
            }
            System.out.println("Copia realizada con exito");
        } catch (Exception e) {
            System.out.println("Error al copiar");
            throw new RuntimeException(e);
        } finally {
            try{
                if (br != null) br.close();
                if (bw != null) bw.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

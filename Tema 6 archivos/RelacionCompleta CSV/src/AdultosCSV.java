import java.io.*;

public class AdultosCSV {
    public static void adultosCSV(String ruta_origen, String ruta_copia){

        try (BufferedReader br = new BufferedReader(new FileReader(ruta_origen));
             BufferedWriter bw = new BufferedWriter(new FileWriter(ruta_copia))) {


            String linea;
            while ((linea = br.readLine()) != null) {
                String[] componentes = linea.split(",");
                try {
                    int edad = Integer.parseInt(componentes[1]);
                    if (edad >= 18) {
                        bw.write(linea);
                        bw.newLine();
                    }
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println("Archivo generado correctamente");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

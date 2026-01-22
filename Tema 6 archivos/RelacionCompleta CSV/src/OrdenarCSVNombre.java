import java.io.*;

public class OrdenarCSVNombre {
    public static void ordenarNombre(String ruta_origen, String ruta_destino){
        int totalLineas = ContarLineas.numeroLineas(ruta_origen);
        String[] lineas = new String[totalLineas];


        try (BufferedReader br = new BufferedReader(new FileReader(ruta_origen))) {
            String linea;
            int i = 0;

            while ((linea = br.readLine()) != null) {
                lineas[i] = linea;
                i++;
            }

        } catch (IOException e) {
            System.out.println("Error leyendo el archivo origen");
            return;
        }

        for (int i = 0; i < lineas.length - 1; i++) {
            for (int j = 0; j < lineas.length - 1 - i; j++) {

                String nombre1 = lineas[j].split(",")[0];
                String nombre2 = lineas[j + 1].split(",")[0];

                char letra1 = Character.toLowerCase(nombre1.charAt(0));
                char letra2 = Character.toLowerCase(nombre2.charAt(0));

                if (letra1 > letra2) {
                    // Intercambio con auxiliar
                    String aux = lineas[j];
                    lineas[j] = lineas[j + 1];
                    lineas[j + 1] = aux;
                }
            }
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(ruta_destino))) {

            for (int i = 0; i < lineas.length; i++) {
                bw.write(lineas[i]);
                bw.newLine();
            }

        } catch (IOException e) {
            System.out.println("Error escribiendo el archivo destino");
        }

        System.out.println("CSV ordenado correctamente");
    }

}

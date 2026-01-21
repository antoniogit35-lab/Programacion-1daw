import java.io.BufferedReader;
import java.io.FileReader;

public class ContarPalabras {
    public static void contar(String ruta, String palabra){

        int contador = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {
            String linea;

            while ((linea = br.readLine()) != null){
                String[] palabras = linea.split(" ");
                for (int i = 0; i < palabras.length; i++){
                    if (palabras[i].equals(palabra)){
                        contador++;
                    }
                }
            }
            System.out.println("La palabra '" +palabra +"' aparece " +contador +" veces en el archivo");

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

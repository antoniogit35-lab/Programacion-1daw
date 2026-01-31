import java.io.*;

public class AnalizarCSV {
    public void procesar(String ruta_origen, String ruta_destino){
        int ContMayores = 0;
        int ContMenoresIgual = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(ruta_origen));
             BufferedWriter bw = new BufferedWriter(new FileWriter(ruta_destino))) {

            String cabecera = br.readLine();
            bw.write(cabecera);
            bw.newLine();

            String linea;
            while ((linea = br.readLine()) !=null){
                String[] campos = linea.split(";");
                String nombre = campos[0];
                String localidad = campos[1];
                int edad = 0;

                try {
                    edad = Integer.parseInt(campos[2]);
                } catch (NumberFormatException e) {
                    System.out.println("Número inválido");
                }

                System.out.println("Nombre:" +nombre +",Localidad:" +localidad +",Edad:" +edad);

                if (edad>30){
                    ContMayores++;
                    bw.write(linea);
                    bw.newLine();
                }else ContMenoresIgual++;
            }

            System.out.println("Personas mayores de 30 años: " +ContMayores +
                    "\nPersonas de 30 años o menores: " +ContMenoresIgual);

        }catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}

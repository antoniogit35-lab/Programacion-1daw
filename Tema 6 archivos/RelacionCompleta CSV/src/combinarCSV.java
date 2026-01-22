import java.io.*;

public class combinarCSV {
    public static void combinar(String archivo1, String archivo2, String destino){

        int lineas1 = ContarLineas.numeroLineas(archivo1);
        int lineas2 = ContarLineas.numeroLineas(archivo2);

        String[] combinado = new String[lineas1 + lineas2];
        int index = 0; //se usa al igual que en la matrices, para saber por qué línea vamos

        //leo el primer archivo y guardo el primer archivo
        try (BufferedReader br = new BufferedReader(new FileReader(archivo1))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                combinado[index] = linea;
                index++;
            }
        } catch (IOException e) {
            System.out.println("Error al leer " + archivo1);
            return;
        }

        //leo el segundo archivo
        try (BufferedReader br = new BufferedReader(new FileReader(archivo2))) {
            String linea;
            while ((linea = br.readLine()) != null) {

                //se comprueba si hay líneas duplicadas
                boolean repetida = false;
                for (int i = 0; i < index; i++) {
                    if (combinado[i].equals(linea)) { //si encuentra que la línea en el array combinado
                        repetida = true;              //es igual a la que está leyendo rompemos el buclr
                        break;
                    }
                }
                //en casode  que no haya encontrado una repetición lo guardo
                if (!repetida) {
                    combinado[index] = linea;
                    index++;
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer " + archivo2);
            return;
        }

        //se escriben solo las líneas del archivo 1 entero y las que hayan pasado el filtro de repetidas
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(destino))) {
            for (int i = 0; i < index; i++) {
                bw.write(combinado[i]);
                bw.newLine();
            }
            System.out.println("El archivo se ha generado correctamente");

        } catch (IOException e) {
            System.out.println("Error al escribir el archivo combinado");
        }
    }
}

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ArchivoTXT {
    private boolean valorarEntero(String valor){
        try {
            Integer.parseInt(valor);
            return true;
        } catch (NumberFormatException e) {
            System.out.println("Línea no válida: " +valor);
            return false;
        }
    }
    private double media(int suma, int CantNum){
        if (CantNum == 0) return 0;
        else return (double) suma/CantNum;
    }

    public void play(String ruta){
        boolean hayInvalidas = false;
        int suma = 0;
        int CantNum = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {
            String linea;

            while ((linea = br.readLine()) !=null){
                if (valorarEntero(linea)){
                    int numero = Integer.parseInt(linea);
                    suma += numero;
                    CantNum++;
                }else hayInvalidas = true;
            }

            System.out.println("La suma de los números es: " +suma +
                    "\nLa media de los números es: " +media(suma, CantNum));

            if (hayInvalidas) System.out.println("Hay líneas no válidas");
            else System.out.println("Todas las líneas son válidas");

        } catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}

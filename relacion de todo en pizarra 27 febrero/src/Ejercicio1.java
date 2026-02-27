import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio1 {
    public static ArrayList<String> crearArray(){ //Creamos el método que te devuelva un Array list de String
        String nombre = ""; //inicializa la variable para que pueda entrar en el bucle
        Scanner sc = new Scanner(System.in);
        ArrayList<String> nombres = new ArrayList<>();
        while (nombre!="adios"){ //Va a estar en el bucle hasta que la eleccion del usuario sea adios
            System.out.println("Introduce el nombre que quieras agregar al array o introduce adios para salir");
            nombre = sc.nextLine();
            if (nombre.equals("adios")) break; //no es necesario usar{} al ser una sola linea de if
            nombres.add(nombre);
        }

        return nombres;
    }

}

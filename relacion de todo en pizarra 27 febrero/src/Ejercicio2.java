import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Ejercicio2 {
    public static ArrayList<String> duplicados(ArrayList<String> comprobacion){ //llamamos como parametro al array list que tiene duplicado
        HashSet<String> sinDuplicados = new HashSet<>(comprobacion); //creamos un set que no permite duplicados con los datos del array con duplicados
        ArrayList<String> pulido = new ArrayList<>(sinDuplicados); //lo devolvemos a arrayList ya que es lo que nos pide el ejercicios

        return pulido;
    }
}

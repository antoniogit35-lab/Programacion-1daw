import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio3 {
    public static ArrayList<Integer> ordenarArray(ArrayList<Integer> numeros){ //Introducimos como parametro un array de números sin ordenar
        Collections.sort(numeros); //Usamos la libreria de sort para ordenar el array

        return numeros; //devolvemos el array ordenado
    }
}

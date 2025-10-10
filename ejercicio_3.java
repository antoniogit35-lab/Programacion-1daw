import java.sql.SQLOutput;
import java.util.Scanner;

public class ejercicio_3 {
    static void main() {
        //introducción
        int ganados, empates, perdidos, puntostotales, puntosg;
        Scanner sc = new Scanner(System.in);

        //desarrollo
        System.out.println("¿Cuantos partidos han ganado?");
        ganados = sc.nextInt();
        System.out.println("¿Cuantos partidos han empatado?");
        empates = sc.nextInt();
        System.out.println("¿Cuantos partidos han perdido?");
        perdidos = sc.nextInt();
        puntosg = ganados * 3;
        puntostotales = puntosg + empates;

        //desenlace
        System.out.println("El equipo ha ganado: "+puntostotales +" puntos");
    }
}

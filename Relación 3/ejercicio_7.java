import java.util.Scanner;

public class ejercicio_7 {
    static void main() {
        //Introducción
        String  resultado, p1, p2;
        Scanner sc = new Scanner (System.in);

        //Desarrollo
        System.out.println("!Juguemos a: Piedra, papel, tijeras, lagarto, Spock¡");
        System.out.println("Jugador 1, elige: ");
        p1 = sc.nextLine().toLowerCase().trim();
        System.out.println("Jugador 2, elige: ");
        p2 = sc.nextLine().toLowerCase().trim();

        //Desenlace
        switch (p1){
            case "piedra":
                if (p2.equals("lagarto") || p2.equals("tijeras")){
                    System.out.println("!Gana el jugador 1¡");
                } else if (p2.equals("piedra")) {
                    System.out.println("¡Empate!");
                }else {
                    System.out.println("¡Gana el jugador 2!");
                } break;
            case "papel":
                if (p2.equals("piedra") || p2.equals("spock")){
                    System.out.println("!Gana el jugador 1¡");
                } else if (p2.equals("papel")) {
                    System.out.println("¡Empate!");
                } else {
                    System.out.println("¡Gana el jugador 2!");
                } break;
            case "tijeras":
                if (p2.equals("papel") || p2.equals("lagarto")){
                    System.out.println("¡Gana el jugador 1!");
                } else if (p2.equals("tijeras")) {
                    System.out.println("¡Empate!");
                }else {
                    System.out.println("¡Gana el jugador 2!");
                } break;
            case "lagarto":
                if (p2.equals("papel") || p2.equals("spock")){
                    System.out.println("¡Gana el jugador 1!");
                } else if (p2.equals("lagarto")) {
                    System.out.println("¡!Empate");
                }else {
                    System.out.println("¡Gana el jugador 2!");
                }break;
            case "spock":
                if (p2.equals("tijeras") || p2.equals("piedra")){
                    System.out.println("¡Gana el jugador 1!");
                } else if (p2.equals("spock")) {
                    System.out.println("¡Empate!");
                }else {
                    System.out.println("¡Gana el jugador 2!");
                } break;
            default:
                System.out.println("OPCIÓN NO VÁLIDA");
                break;
        }
    }
}

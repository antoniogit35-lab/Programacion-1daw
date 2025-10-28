import java.util.Scanner;

public class Ejercicio_12 {
    static void main() {
        int opcion;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("---Menú---");
            System.out.println("Elige una de las siguientes opciones");
            System.out.println("1 - Contar dígitos pares de un número");
            System.out.println("2 - Contar dígitos impares de un número");
            System.out.println("3 - Contar carácteres de una cadena");
            System.out.println("4 - Invertir una cadena");
            System.out.println("5 - Comprobar si una cadena es palíndroma");
            System.out.println("6 - Salir");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    String n;
                    int sumaPares = 0;
                    System.out.println("Introduce el número del que quieres contar los pares");
                    n = sc.nextLine();
                    for (int i = 0; i < n.length(); i++) {
                        int variable = Integer.parseInt(String.valueOf(n.charAt(i)));
                        if (variable % 2 == 0) {
                            sumaPares += variable;
                            System.out.println("La suma de número pares es: " +sumaPares);
                        }
                    }
                    break;

                case 2:
                    int sumaImpares = 0;
                    System.out.println("Introduce el número del que quieres contar los impares");
                    n = sc.nextLine();
                    for (int i = 0; i < n.length(); i++) {
                        int variable = Integer.parseInt(String.valueOf(n.charAt(i)));
                        if (variable % 2 != 0) {
                            sumaImpares += variable;
                            System.out.println("La suma de número impares es: " + sumaImpares);
                        }
                    } break;

                case 3:
                    int contador = 0;
                    String cadena;
                    System.out.println("Introduce la cadena de la cual quieres contar su caracteres");
                    cadena = sc.nextLine().trim();

                    for (int i=0; i<cadena.length(); i++){
                        contador++;
                    }
                    System.out.println("La cadena de texto tiene: " +contador +" caracteres");
                    break;
                case 4:
                    String inverso = "";
                    System.out.println("Introduce la cadena que quieres invertir");
                    cadena =sc.nextLine();
                    for (int i = cadena.length()-1; i>=0; i--){
                        inverso += cadena.charAt(i);
                    }
                    System.out.println("El inverso es: "+inverso);
                    break;

                case 5:
                    String inversoP = "";
                    System.out.println("Introduce la cadena que quieres saber si es palíndroma");
                    cadena = sc.nextLine().toLowerCase();

                    for (int i =cadena.length()-1; i>=0; i--){
                        inversoP += cadena.charAt(i);
                    }
                    if (cadena.equals(inversoP)){
                        System.out.println("La cadena es palíndroma");
                    } else {
                        System.out.println("La cadena NO es palíndroma");
                    } break;

                case 6:
                    System.out.println("Saliendo del programa....");
                    System.out.println("Hasta la próxima");
                    break;

                default:
                    System.out.println("ERROR, opción no permitida");

            }
            System.out.println();
        }while (opcion != 6) ;
    }
}
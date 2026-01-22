import java.util.Scanner;

public class Ejecutadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 15;

        while (opcion !=0){

            System.out.println("Bienvenido al gestor de ejercicios de Ficheros CSV");
            System.out.println("---------------------------------------------------");
            System.out.println("Elige que Ejercicio quieres realizar:");
            System.out.println("1--> Crear y escribir una línea");
            System.out.println("2-->Leer un CSV existente");
            System.out.println("3-->Agregar varias líneas");
            System.out.println("4-->Sobreescribir CSV existente");
            System.out.println("5-->Contar líneas de un CSV");
            System.out.println("6-->Separar cada línea de un CSV");
            System.out.println("7-->Copiar un CSV");
            System.out.println("8-->Genera un CSV solo con los adultos");
            System.out.println("9-->Ordenar las líneas alfabéticamente");
            System.out.println("10-->Combinar dos CSV");
            System.out.println("Elija del 1 al 10 o 0 para salir del programa");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion){
                case 0 :
                    System.out.println("Saliendo del programa....");
                    break;
                case 1 :
                    System.out.print("Introduce un nombre: ");
                    String nombre = sc.nextLine();

                    System.out.print("Introduce la edad: ");
                    String edad = sc.nextLine();

                    System.out.print("Introduce la ciudad: ");
                    String ciudad = sc.nextLine();

                    String linea = nombre + "," + edad + "," + ciudad;

                    EscribirCSV.escribirUnaLinea("datos.csv", linea);
                    break;
                case 2:
                    LeerCSV.leer("datos.csv"); //--> Ejercicio 2
                    break;
                case 3 :
                    EscribirVariasLineasCSV.escribirVariasLineas("datos.csv"); //--> Ejercicio 3
                    break;
                case 4 :
                    SobreescribirCSV.sobreescribirArchivo("datos.csv"); //--> Ejercicio 4
                    break;
                case 5 :
                    int total = ContarLineas.numeroLineas("datos.csv"); //--> Ejercicio 5
                    System.out.println("El número de líneas es: " +total);
                    break;
                case 6 :
                    SepararCSV.separarComponentes("datos.csv"); //--> Ejercicio 6
                    break;
                case 7 :
                    CopiarCSV.copiar("datos.csv", "copia_datos.csv"); //--> Ejercicio 7
                    break;
                case 8 :
                    AdultosCSV.adultosCSV("datos.csv", "adultos.csv"); //--> Ejercicio 8
                    break;
                case 9 :
                    OrdenarCSVNombre.ordenarNombre("datos.csv", "ordenado.csv");
                    break;
                case 10 :
                    combinarCSV.combinar("datos.csv","adultos.csv","combinado.csv");
                    break;
                default:
                    System.out.println("Elección incorrecta");
                    System.out.println("///////////////////");

                    break;
            }
        }
    }
}
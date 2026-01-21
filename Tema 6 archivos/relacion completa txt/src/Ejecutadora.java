import java.util.Scanner;

public class Ejecutadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 15;

        while (opcion !=0){
            System.out.println("Bienvenido al gestor de ejercicios de Ficheros TXT");
            System.out.println("---------------------------------------------------");
            System.out.println("Elige que Ejercicio quieres realizar:");
            System.out.println("1--> Crear y escribir un archivo");
            System.out.println("2-->Leer un archivo existente");
            System.out.println("3-->Copiar contenido a otro archivo");
            System.out.println("4-->Agregar datos a un archivo existente");
            System.out.println("5-->Contar líneas de un archivo");
            System.out.println("6-->Sobreescribir un archivo");
            System.out.println("7-->Concatenar contenidos de dos archivos");
            System.out.println("8-->Buscar una palabra en un archivo");
            System.out.println("9-->Filtrar y guardar líneas con una palabra específica");
            System.out.println("10-->Eliminar un archivo");
            System.out.println("Elija del 1 al 10 o 0 para salir del programa");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion){
                case 0 :
                    System.out.println("Saliendo del programa....");
                    break;
                case 1 :
                    System.out.println("Ingresa el texto");
                    String datos = sc.nextLine();

                    EscribirArchivo.escribir("archivo1.txt", datos);
                    break;
                case 2:
                    LeerArchivo.leer("archivo1.txt");
                    break;
                case 3 :
                    CopiarArchivos.copiar("archivo1.txt", "archivo2.txt");
                    break;
                case 4 :
                    System.out.println("Ingresa el texto");
                    String texto = sc.nextLine();

                    EscribirArchivoAppend.escribir("archivo1.txt", texto);
                    break;
                case 5 :
                    ContarLineas.numeroLineas("archivo1.txt");
                    break;
                case 6 :
                    System.out.println("Introduce el texto que quieres sobreescribir");
                    String sobreescribir = sc.nextLine();

                    SobreescribirArchivo.sobreescribir("archivo1.txt", sobreescribir);
                    break;
                case 7 :
                    ConcatenarArchivos.concatenar("archivo1.txt","archivo2.txt","archivo3.txt");
                    break;
                case 8 :
                    System.out.println("Introduce la palabra que quieres buscar");
                    String busqueda = sc.nextLine();

                    ContarPalabras.contar("archivo3.txt", busqueda);
                    break;
                case 9 :
                    System.out.println("Introduce la palabra que quieres buscar en el archivo");
                    String palabra = sc.nextLine();

                    FiltrarArchivos.filtrar("archivo1.txt", "filtrado.txt", palabra);
                    break;
                case 10 :
                    EliminarArchivos.eliminar("archivo2.txt");
                    break;
                default:
                    System.out.println("Elección incorrecta");
                    break;
            }
        }

    }
}

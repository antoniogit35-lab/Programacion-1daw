public class Main {

    public static void main(String[] args) {

        SistemaEstudiantes sistema = new SistemaEstudiantes();

        sistema.cargarDesdeCSV("estudiantes.csv");

        System.out.println("Lista de estudiantes:");
        sistema.mostrarEstudiantes();

        System.out.println("\nCiudades únicas:");
        sistema.generarCiudades();
        sistema.mostrarCiudades();

        System.out.println("\nEstudiantes por ciudad:");
        sistema.agruparPorCiudad();
        sistema.mostrarAgrupados();

        System.out.println("\nSistema de atención:");
        sistema.generarCola();
        sistema.atenderEstudiantes();
    }
}
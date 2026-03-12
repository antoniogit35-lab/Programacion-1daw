import java.util.*;
import java.io.*;

public class SistemaEstudiantes {

    private List<Estudiante> estudiantes;
    private Set<String> ciudades;
    private Map<String, List<Estudiante>> estudiantesPorCiudad;
    private Queue<Estudiante> colaAtencion;

    public SistemaEstudiantes() {
        estudiantes = new ArrayList<>();
        ciudades = new HashSet<>();
        estudiantesPorCiudad = new HashMap<>();
        colaAtencion = new LinkedList<>();
    }

    public void cargarDesdeCSV(String archivo) {
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;

            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");

                String nombre = datos[0];
                int edad = Integer.parseInt(datos[1]);
                String ciudad = datos[2];
                double nota = Double.parseDouble(datos[3]);

                Estudiante e = new Estudiante(nombre, edad, ciudad, nota);
                estudiantes.add(e);
            }

        } catch (IOException e) {
            System.out.println("Error leyendo el archivo");
        }
    }

    public void mostrarEstudiantes() {
        for (Estudiante e : estudiantes) {
            System.out.println(e);
        }
    }

    public void generarCiudades() {
        for (Estudiante e : estudiantes) {
            ciudades.add(e.getCiudad());
        }
    }

    public void mostrarCiudades() {
        for (String ciudad : ciudades) {
            System.out.println(ciudad);
        }
    }

    public void agruparPorCiudad() {
        for (Estudiante e : estudiantes) {
            estudiantesPorCiudad.putIfAbsent(e.getCiudad(), new ArrayList<>());
            estudiantesPorCiudad.get(e.getCiudad()).add(e);
        }
    }

    public void mostrarAgrupados() {
        for (Map.Entry<String, List<Estudiante>> entry : estudiantesPorCiudad.entrySet()) {
            System.out.println("Ciudad: " + entry.getKey());
            for (Estudiante e : entry.getValue()) {
                System.out.println("   " + e);
            }
        }
    }

    public void generarCola() {

        colaAtencion.addAll(estudiantes);
    }

    public void atenderEstudiantes() {

        while (!colaAtencion.isEmpty()) {

            Estudiante atendido = colaAtencion.poll();

            System.out.println("Atendiendo a: " + atendido);
        }
    }
}

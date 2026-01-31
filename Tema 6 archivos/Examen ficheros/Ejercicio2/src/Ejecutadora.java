public class Ejecutadora {
    public static void main(String[] args) {
        AnalizarCSV csv = new AnalizarCSV();
        csv.procesar("personas.csv","personas_mayores_30.xlsx");
    }
}

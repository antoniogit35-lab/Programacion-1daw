public class Empleado {
    private String nombre;
    private String apellidos;
    private double sueldoBase;
    private double retenciones;
    private String categoria;
    private static int numEmpleados;
    private static double prima;

    public void setCategoria(String categoria) {this.categoria = categoria;}

    public static void setNumEmpleados(int numEmpleados) {Empleado.numEmpleados = numEmpleados;}

    public static int getNumEmpleados() {return numEmpleados;}

    public static double getPrima() {return prima;}

    public static void setPrima(double prima) {Empleado.prima = prima;}

    public Empleado(String nombre, String apellidos, double sueldoBase, double retenciones, String categoria) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.sueldoBase = sueldoBase;
        this.retenciones = retenciones;
        this.categoria = categoria.toUpperCase();
        numEmpleados++;
    }

    public Empleado(String nombre) {
        this(nombre, "", 1500, 5, "A");
    }

    public double calcularSueldo() {

        double sueldo = sueldoBase;

        // Incremento por categoría
        switch (categoria) {
            case "A":
                sueldo += 100;
                break;
            case "B":
                sueldo += 200;
                break;
            case "C":
                sueldo += 300;
                break;
            case "D":
                sueldo += 500;
                break;
            default:
                System.out.println("Categoría no válida");
        }

        sueldo += sueldoBase * (prima / 100);

        sueldo -= sueldo * (retenciones / 100);

        return sueldo;
    }

    @Override
    public String toString() {
        return "\nEl empleado --> " +nombre +" " +apellidos
        +" \nSu sueldo base es de: " +sueldoBase
        +" \nSus retenciones son de: " +retenciones
        +" \nY su categoría: " +categoria.toUpperCase()
        +" \ncobra: " +calcularSueldo() +"€";
    }
}

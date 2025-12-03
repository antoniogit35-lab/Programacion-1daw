import java.sql.SQLOutput;
import java.util.Scanner;

public class Perro extends Animal {
    private String raza;
    private boolean entrenado;

    //Constructores
    public Perro() {
        this.raza = "";
        this.entrenado = true;
    }

    public Perro(String nombre, String especie, int edad, String raza, boolean entrenado) {
        super(nombre, especie, edad);
        this.raza = raza;
        this.entrenado = entrenado;
    }

    //Métodos sobreescritos

    @Override
    public void hacerSonido() {
        System.out.println("El perro ladra: ¡Guau, guau!");
    }

    @Override
    public void alimentarse() {
        System.out.println("El perro está comiendo pienso");
    }

    @Override
    public void mostrarDetalles() {
        if (entrenado){
            System.out.println("El nombre del perro es: " +nombre
                    + ", \n-Su especie es: " +especie
                    + ", \n-Su edad es: " +edad +" años"
                    + ", \n-Su raza es: " +raza
                    + ", \n-Y SI está entrenado");
        }else {
            System.out.println("El nombre del perro es: " +nombre
                    + ", \n-Su especie es: " +especie
                    + ", \n-Su edad es: " +edad +" años"
                    + ", \n-Su raza es: " +raza
                    + ", \n-Y NO está entrenado");
        }
    }

    //Métodos propios

    public void moverCola(int veces){
        for (int i = 1; i<veces; i++){
            System.out.println("El perro mueve la cola (" +i +")");
        }
    }

    public static Perro crearPerroPorConsola(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el nombre del perro");
        String nombre = sc.nextLine();
        System.out.println("Introduce la especie del perro");
        String especie = sc.nextLine();
        System.out.println("Introduce la edad del perro en años");
        int edad = sc.nextInt();
        sc.nextLine();
        System.out.println("Introduce la raza del perro");
        String raza = sc.nextLine();
        System.out.println("Indica si el perro está entrenado o no[true en el caso de que SI esté entrenado/ false si NO lo está]");
        boolean entrenado = sc.nextBoolean();

        return new Perro(nombre, especie, edad, raza, entrenado);
    }
}

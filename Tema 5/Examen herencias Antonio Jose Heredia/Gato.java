import java.util.Scanner;

public class Gato extends Animal {
    private boolean tieneCola;
    private int vidasRestantes;

    //Constructores

    public Gato() {
        this.tieneCola = true;
        this.vidasRestantes = 7;
    }

    public Gato(String nombre, String especie, int edad, boolean tieneCola, int vidasRestantes) {
        super(nombre, especie, edad);
        this.tieneCola = tieneCola;
        this.vidasRestantes = vidasRestantes;
    }

    //Métodos sobreescritos

    @Override
    public void hacerSonido() {
        System.out.println("miau miau");
    }

    @Override
    public void alimentarse() {
        System.out.println("El gato come pescado");
    }

    @Override
    public void mostrarDetalles() {
        if (tieneCola){
            System.out.println("El nombre del gato es: " +nombre
                    + ", \n-Su especie es: " +especie
                    + ", \n-Su edad es: " +edad +" años"
                    + ", \n-Le quedan: " +vidasRestantes +" vidas"
                    + ", \n-Y SI tiene cola");
        }else {
            System.out.println("El nombre del gato es: " +nombre
                    + ", \n-Su especie es: " +especie
                    + ", \n-Su edad es: " +edad +" años"
                    + ", \n-Su raza es: " +vidasRestantes +" vidas"
                    + ", \n-Y NO tiene cola");
        }
    }

    //Métodos propios

    public void saltar(int veces){
        for (int i = 1; i<veces; i++){
            System.out.println("El gato salta (" +i +")");
        }
    }

    public static Gato crearGatoPorConsola(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el nombre del gato");
        String nombre = sc.nextLine();
        System.out.println("Introduce la especie del gato");
        String especie = sc.nextLine();
        System.out.println("Introduce la edad del gato en años");
        int edad = sc.nextInt();
        sc.nextLine();
        System.out.println("Indica si el gato tiene cola o no[true en el caso de que SI tenga cola/ false si NO tiene]");
        boolean cola = sc.nextBoolean();
        System.out.println("Introduce cuantas vidas le quedan al gato");
        int vidas = sc.nextInt();
        sc.nextLine();

        return new Gato(nombre, especie, edad, cola, vidas);
    }
}

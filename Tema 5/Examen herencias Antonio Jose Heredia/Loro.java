public class Loro extends Animal {
    private String colorPlumas;
    private  boolean habla;

    //Constructor

    public Loro(String nombre, String especie, int edad, String colorPlumas, boolean habla) {
        super(nombre, especie, edad);
        this.colorPlumas = colorPlumas;
        this.habla = habla;
    }

    //Métodos sobreescritos


    @Override
    public void hacerSonido() {
        System.out.println("¡Hola, hola!");
    }

    @Override
    public void alimentarse() {
        System.out.println("Come semillas y frutas");
    }

    @Override
    public void mostrarDetalles() {
        if (habla){
            System.out.println("El nombre del loro es: " +nombre
                    + ", \n-Su especie es: " +especie
                    + ", \n-Su edad es: " +edad +" años"
                    + ", \n-Sus plumas son de color: " +colorPlumas
                    + ", \n-Y SI habla");
        }else {
            System.out.println("El nombre del loro es: " +nombre
                    + ", \n-Su especie es: " +especie
                    + ", \n-Su edad es: " +edad +" años"
                    + ", \n-Su raza es: " +colorPlumas
                    + ", \n-Y NO habla");
        }
    }
}

public abstract class Animal {
    protected String nombre;
    protected String especie;
    protected int edad;

    //Constructores

    public Animal(){
        this.nombre = "";
        this.especie = "";
        this.edad = 0;
    }

    public Animal(String nombre, String especie, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    }

    //Métodos abstractos
    public abstract void hacerSonido();

    public abstract void alimentarse();

    //Métodos concretos

    public void mostrarDetalles(){
        System.out.println("El nombre del animal es: " +nombre
                + ", \n-Su especie es: " +especie
                + ", \n-Y su edad es: " +edad +" años");
    }

    public void esMayor(Animal a2){
        if (this.edad> a2.edad){
            System.out.println(this.nombre +" es mayor");
        } else if (this.edad == a2.edad) {
            System.out.println("Ambos tienen la misma edad");
        } else {
            System.out.println(a2.nombre +" es mayor");
        }
    }
}

public class Television extends Electrodomesticos {
    private int resolucion;
    private boolean netflix;
    public static int resolucionDef;
    public static boolean netflixDef = false;

    public Television(double precio, colores color, String consumo, double peso, int resolucion, boolean netflix) {
        super(precio, color, consumo, peso);
        this.resolucion = resolucion;
        this.netflix = netflix;
    }

    public int getResolucion() {return resolucion;}

    public boolean isNetflix() {return netflix;}

    @Override
    public String toString() {
        return "El precio base es: " + getPreciobase() +"€"
                +", \nel consumo es: " +getConsumo()
                +", \nsu peso es de: " +getPeso() +" kg"
                +", \nsu resolución es: " +getResolucion() +" pulgadas"
                +", \n¿Tiene netflix?: " +isNetflix();
    }


    @Override
    public double precioFinal() {
        double precio = super.precioFinal();

        if (resolucion>20){
            precio += preciobase * 0.3;
        }
        if (netflix){
            precio += 60;
        }
        return precio;
    }
}

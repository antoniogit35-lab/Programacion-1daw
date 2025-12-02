public class Lavadora extends Electrodomesticos {
    private double carga;
    public static double cargaDefecto = 5;


    public Lavadora(double precio, colores color, String consumo, double peso, double carga) {
        super(precio, color, consumo, peso);
        this.carga = carga;
    }

    public double getCarga() {return carga;}

    @Override
    public String toString() {
        return "El precio base de la lavadora es: " + preciobase
                +"€, \nSu consumo es: " +consumo
                +"\nEl peso: " +peso
                +"\nY su carga: " +carga;
    }

    @Override
    public double precioFinal() {
        double precio = super.precioFinal();

        if (carga > 6){
            precio += 50;
        }
        return precio;
    }
}

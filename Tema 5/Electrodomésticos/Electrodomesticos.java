public class Electrodomesticos {
    protected double preciobase;
    protected colores color;
    protected String consumo;
    protected double peso;

    public Electrodomesticos() {
        this.preciobase = 100;
        this.color = colores.BLANCO;
        this.consumo = "A";
        this.peso = 10;
    }

    public Electrodomesticos(double preciobase, colores color, String consumo, double peso) {
        this.preciobase = preciobase;
        this.color = color;
        this.peso = peso;
        comprobarConsumo(consumo);
    }

    public double getPreciobase() {return preciobase;}

    public void setPreciobase(double preciobase) {this.preciobase = preciobase;}

    public colores getColor() {return color;}

    public void setColor(colores color) {this.color = color;}

    public double getPeso() {return peso;}

    public void setPeso(double peso) {this.peso = peso;}

    public String getConsumo() {return consumo;}

    public void setConsumo(String consumo) {this.consumo = consumo;}

    private void comprobarConsumo(String letra) {
        letra = letra.toUpperCase();

        if (letra.equals("A+") || letra.equals("A") || letra.equals("B") || letra.equals("C") ||
                letra.equals("D") || letra.equals("E") || letra.equals("F")) {

            this.consumo = letra;

        } else {
            this.consumo = "A";
        }
    }

    @Override
    public String toString() {
        return "\nPrecio base: " + preciobase + " €,"
                +"\nConsumo: " + consumo
                +", \nPeso: " + peso + " kg";
    }

    public double precioFinal(){
        double precioFinal = preciobase;

        switch (consumo) {
            case "A+": precioFinal += 120; break;
            case "A": precioFinal += 100; break;
            case "B": precioFinal += 80; break;
            case "C": precioFinal += 60; break;
            case "D": precioFinal += 50; break;
            case "E": precioFinal += 30; break;
            case "F": precioFinal += 10; break;
        }

        if (peso <=19){
            precioFinal +=10;
        } else if (peso <=49) {
            precioFinal +=30;
        } else if (peso <=79) {
            precioFinal +=50;
        }else {
            precioFinal += 100;
        }
        return precioFinal;

    }

}

public class tienda {
    private String nombre;
    private double precio;
    private int iva;
    private int descuento;
    private double descuentoAplicado=0;
    private static int numProductos = 0;
    private static double descuentoGlobal = 0;


    public tienda(String nombre, double precio, int iva, int descuento){
        this.nombre = nombre;
        this.precio = precio;
        this.iva = iva;
        this.descuento = descuento;
        numProductos++;
    }

    public String getNombre(){return this.nombre;}

    public void setNombre(String nuevoNombre){this.nombre = nuevoNombre;}

    public double getPrecio(){return this.precio;}

    public void setPrecio(int nuevoPrecio){this.precio = nuevoPrecio;}

    public int getIva(){return this.iva;}

    public void setIva(int nuevoIva){this.iva = nuevoIva;}

    public int getDescuento(){return this.descuento;}

    public void setDescuento(int nuevoDescuento){this.descuento = nuevoDescuento;}

    public static int getNumProductos() {return numProductos;}

    public static void setDescuentoGlobal(double descuentoGlobal) {tienda.descuentoGlobal = descuentoGlobal;}

    public tienda(String producto){
        this(producto,10,21,0);
    }

    public double calcularPrecio(){
        if (this.descuento>descuentoGlobal){
            descuentoAplicado = descuento;
        }else {
            descuentoAplicado = descuentoGlobal;
        }
        double precioDescontado = precio - (precio * (descuentoAplicado/100.0));

        double precioFinal = precioDescontado + (precioDescontado * ((double) iva /100.0));

        return precioFinal;
    }

    @Override
    public String toString() {
        return "\n-->Producto " +nombre
                +" \nSu precio base es: " +precio
                +"€" +"\nIVA: " +iva +"%" +"\nY su descuento es: " +descuento
                + "€" +"\nSu precio final es: " +calcularPrecio() +" €";
    }
}

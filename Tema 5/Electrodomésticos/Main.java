public class Main {
    public static void main(String[] args) {

        // ---- LAVADORA AEG ----
        Lavadora lavadoraAEG = new Lavadora(400, colores.PLATEADO, "A", 30, 7);

        System.out.println("LAVADORA AEG:");
        System.out.println(lavadoraAEG);
        System.out.println("Precio final: " + lavadoraAEG.precioFinal() + " €\n");


        // ---- TV SAMSUNG (por defecto) ----
        Television tvSamsung = new Television(100, colores.BLANCO, "A", 10,
                Television.resolucionDef, Television.netflixDef);

        System.out.println("TV SAMSUNG (por defecto):");
        System.out.println(tvSamsung);
        System.out.println("Precio final: " + tvSamsung.precioFinal() + " €\n");


        // ---- TV SAMSUNG modificada ----
        Television tvSamsung2 = new Television(190, colores.NEGRO, "A+", 10, 24, true);

        System.out.println("TV SAMSUNG (modificada):");
        System.out.println(tvSamsung2);
        System.out.println("Precio final: " + tvSamsung2.precioFinal() + " €");
    }
}

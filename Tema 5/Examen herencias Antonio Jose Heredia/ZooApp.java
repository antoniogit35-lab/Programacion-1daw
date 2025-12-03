public class ZooApp {
    public static void main() {

        //Crear perro y gato por consola y loro con parámetros
        Perro p1 = Perro.crearPerroPorConsola();
        Gato g1 = Gato.crearGatoPorConsola();
        Loro l1 = new Loro("Luis","Loro",7,"Rojas",true);

        //Mostrar detalles de todos los animales
        p1.mostrarDetalles();
        System.out.println("\n");
        g1.mostrarDetalles();
        System.out.println("\n");
        l1.mostrarDetalles();
        System.out.println("\n");

        //Comparar edades
        p1.esMayor(g1);
        g1.esMayor(l1);
        l1.esMayor(p1);
        System.out.println("\n");


        //Acciones del perro
        p1.hacerSonido();
        p1.alimentarse();
        p1.moverCola(3);
        System.out.println("\n");


        //Acciones del gato
        g1.hacerSonido();
        g1.alimentarse();
        g1.saltar(3);
        System.out.println("\n");


        //Acciones del loro
        l1.hacerSonido();
        l1.alimentarse();

    }
}


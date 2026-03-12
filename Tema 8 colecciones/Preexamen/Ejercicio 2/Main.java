import java.util.Map;
import java.util.HashMap;

void main() {
    Scanner sc = new Scanner(System.in);

    Producto p1 = new Producto("1", 1.99, "Boli", 10, true);
    Producto p2 = new Producto("2", 2.99, "Lapiz", 10, true);
    Producto p3 = new Producto("3", 6.99, "Libreta", 10, true);
    Producto p4 = new Producto("4", 3.99, "Goma", 10, true);
    Producto p5 = new Producto("5", 0.99, "Tipex", 10, true);


    Tienda productosAntonio = new Tienda(new HashMap<>());

    productosAntonio.anadirProducto(p1);
    productosAntonio.anadirProducto(p2);
    productosAntonio.anadirProducto(p3);
    productosAntonio.anadirProducto(p4);
    productosAntonio.anadirProducto(p5);

    int opcion;

    do {
        System.out.println("---------------------------");
        System.out.println("Bienvenido a Productos Antonio");
        System.out.println("------------------------------");
        System.out.println("Elige la característica que quieres usar");
        System.out.println("1. Registrar un nuevo producto");
        System.out.println("2. Modificar stock de un producto");
        System.out.println("3. Listar los productos disponibles");
        System.out.println("4. Listar los productos sin stock");
        System.out.println("5. Eliminar un producto introduciendo su código");
        System.out.println("6. Salir del programa");
        System.out.println("Elige una opción");
        opcion = sc.nextInt();
        sc.nextLine();

        switch (opcion){
            case 1 :
                System.out.println("Introduce el código del producto(No puede ser duplicado)");
                String codigo = sc.nextLine();
                System.out.println("Introduce el precio del producto");
                double precio = sc.nextDouble();
                sc.nextLine();
                System.out.println("Introduce el nombre del producto");
                String nombre = sc.nextLine();
                System.out.println("Introduce el stock del producto");
                int stock = sc.nextInt();
                sc.nextLine();

                productosAntonio.altaDeProducto(codigo, nombre, precio, stock);
                break;
            case 2 :

                System.out.println("Introduce el código del producto que quieres buscar");
                codigo = sc.nextLine();
                System.out.println("Introduce cuanto ha cambiado el stock");
                stock = sc.nextInt();
                sc.nextLine();
                productosAntonio.modificarStock(codigo, stock);
                break;
            case 3 :
                productosAntonio.listarProductosOrdenados();
                break;
            case 4 :
                productosAntonio.listadoSinStock();
                break;
            case 5 :
                System.out.println("Introduce el código del producto que quieres borrar");
                codigo = sc.nextLine();
                productosAntonio.borrarProducto(codigo);
                break;
            case 6 :
                System.out.println("Saliendo del programa......");
                break;
            default:
                System.out.println("Opción no válidad");
        }
    } while (opcion != 6);

    sc.close();
}

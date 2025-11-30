//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    tienda.setDescuentoGlobal(10);

    tienda t1 = new tienda("Impresora HP", 100,21,5);
    tienda t2 = new tienda("Ratón logitech", 12,21,10);
    tienda t3 = new tienda("Libro java",20,21,15);
    System.out.println("Llega el black friday, aplicamos un 10% a todos nuestros productos");

    System.out.println(t1);
    System.out.println(t2);
    System.out.println(t3);

    System.out.println("\nNúmero total de productos: " +tienda.getNumProductos());
}

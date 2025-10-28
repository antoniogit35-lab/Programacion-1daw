import java.util.Scanner;

public class Ejercicio_2 {
    static void main() {
        double precio, descontado =0;
        String  cliente;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el precio del producto:");
        precio = sc.nextDouble();
        sc.nextLine();
        System.out.println("¿Que tipo de cliente hace la compra?[regular/premium/VIP]");
        cliente = sc.nextLine().toLowerCase().trim();
        if (cliente.equals("regular")){
            descontado = precio *0.95;
        } else if (cliente.equals("premium")) {
            descontado = precio * 0.9;
        } else if (cliente.equals("vip") && precio <=500) {
            descontado = precio * 0.8;
        } else if (cliente.equals("vip") && precio >500) {
            descontado = precio * 0.75;
        } else{
            System.out.println("Alguno de los datos introducidos es erróneo");
        }
        System.out.println("El precio final es: " +descontado +"€");
    }
}

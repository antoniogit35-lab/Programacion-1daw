import java.util.Scanner;

public class ejercicio_6 {
    static void main() {
        //Introducción
        double ingresos;
        double impuestos=0;
        int dependientes;
        Scanner sc = new Scanner(System.in);

        //Desarrollo
        System.out.println("¿Cuantos son sus ingresos anuales?");
        ingresos = sc.nextDouble();
        System.out.println("¿Cuantas personas dependientes tiene?");
        dependientes = sc.nextInt();
        if (ingresos < 0 || dependientes < 0){
            System.out.println("DATOS NO VÁLIDOS");
        }else {
            if (dependientes <= 3){
                if (ingresos >=0 && ingresos < 20000){
                    impuestos = ingresos * 0.05;
                } else if (ingresos >= 20000 && ingresos < 40000) {
                    impuestos = ingresos * 0.1;
                } else if (ingresos >= 40000 && ingresos < 80000) {
                    impuestos = ingresos * 0.2;
                } else if (ingresos >= 80000) {
                    impuestos = ingresos * 0.3;
                }
            } else {
                if (ingresos >=0 && ingresos < 20000){
                    impuestos = 0;
                } else if (ingresos >= 20000 && ingresos < 40000) {
                    impuestos = ingresos * 0.5;
                } else if (ingresos >= 40000 && ingresos < 80000) {
                    impuestos = ingresos * 0.15;
                } else if (ingresos >= 80000) {
                    impuestos = ingresos * 0.25;
                }
            }
            //Desenlace
            System.out.printf("Los impuestos a pagar con los datos proporcionados son: %.2f€", impuestos);
        }
    }
}

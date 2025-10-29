public class Ejercicio_2 {
    static void main() {
        //Calcula la suma de todos los números impares entre 1 y 200.
        int suma = 0;
        for (int i=0; i<=200; i++){
            if (i % 2 !=0){
                suma +=i;
            }
        }
        System.out.println("La suma de los números impares desde el 1 al 200 es: " +suma);
    }
}

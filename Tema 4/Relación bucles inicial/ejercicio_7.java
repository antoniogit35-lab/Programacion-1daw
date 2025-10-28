public class ejercicio_7 {
    static void main() {
        int sumapares=0;
        int sumaimpares=0;
        for (int i=1; i<=100; i+=2){
            sumaimpares +=i;
        }
        for (int i=2; i<=100; i+=2){
            sumapares +=i;
        }
        System.out.println("La suma de números pares es: "+sumapares);
        System.out.println("La suma de números impares es: "+sumaimpares);
    }
}

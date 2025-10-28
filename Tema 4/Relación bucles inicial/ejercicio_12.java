public class ejercicio_12 {
    static void main() {
        for (int n = 1; n <= 1000; n++) {
            int sumaDivisores = 0;
            for (int i = 1; i <= n / 2; i++) {
                if (n % i == 0) {
                    sumaDivisores += i;
                }
            }
            if (sumaDivisores == n) {
                System.out.println(n + " es numero perfecto");
            }
        }
    }
}
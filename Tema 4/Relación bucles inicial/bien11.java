public class bien11 {
    static void main() {

        for (int n = 2; n<=100; n++){
            boolean esPrimo=true;

            for(int i=2; i<n; i++){
                if(n%i==0)
                    esPrimo=false;
            }

            if (esPrimo){
                System.out.println(n +" es primo");
            }
        }
    }
}

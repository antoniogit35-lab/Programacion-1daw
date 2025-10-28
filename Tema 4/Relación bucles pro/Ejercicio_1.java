void main() {
    String cadena;
    int contador = 0;
    Scanner sc = new Scanner(System.in);

    System.out.println("Introduce la cadena de texto que quieras saber cuantos caracteres tiene");
    cadena = sc.nextLine().trim();

    for (int i=0; i<cadena.length(); i++){
        contador++;
    }
    System.out.println("La cadena de texto tiene: " +contador +" caracteres");
}

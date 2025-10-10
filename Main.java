//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //introduccion
    int radio;
    double resultadoarea, resultadoperimetro;
    double pi = 3.14159265;
    Scanner circunferencia= new Scanner(System.in);

    //desarrollo
    System.out.println("Introduce el radio de la circunferencia");
    radio= circunferencia.nextInt();
    resultadoarea= pi * (radio^2);
    resultadoperimetro= 2 * pi * radio;

    //desenlace
    System.out.println("El area es: " +resultadoarea);
    System.out.println("El perímetro es: " +resultadoperimetro);

}

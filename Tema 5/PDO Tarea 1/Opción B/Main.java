void main(String[] args) {

    Empleado e1 = new Empleado("Pedro", "Perez",1300, 2, "b");
    Empleado e2 = new Empleado("Carmen", "Lorenzo",1250,6,"d");
    Empleado e3  = new Empleado("Ana");

    Empleado.setPrima(10);
    e1.setCategoria("c");

    System.out.println(e1);
    System.out.println(e2);
    System.out.println(e3);

    System.out.println("\nEl número de empleados es: " +Empleado.getNumEmpleados());

}

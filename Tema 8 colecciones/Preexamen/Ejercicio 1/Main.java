void main(String[] args) {
    String nombre;
    String dni;
    int edad;
    String fecha;
    Scanner sc = new Scanner(System.in);

    Socio s1 = new Socio("Antonio", "77", 27, "22/02/2026", true);
    Socio s2 = new Socio("Sergio", "78", 27, "22/02/2026", true);
    Socio s3 = new Socio("Cristina", "79", 27, "22/02/2026", true);
    Socio s4 = new Socio("Rafa", "80", 27, "22/02/2026", true);
    Socio s5 = new Socio("Oliver", "81", 27, "22/02/2026", true);

    Gimnasio antonioGym = new Gimnasio(new ArrayList<>(Arrays.asList(s1,s2,s3,s4,s5)));

    int opcion;

    do {
        System.out.println("---------------------------");
        System.out.println("Bienvenido al AntonioGym");
        System.out.println("------------------------------");
        System.out.println("Elige la característica que quieres usar");
        System.out.println("1. Dar de alta a un nuevo socio");
        System.out.println("2. Dar de baja a un socio");
        System.out.println("3. Mostrar listado de socios activos ordenados por nombre");
        System.out.println("4. Mostrar listado de socios inactivos odenados por DNI");
        System.out.println("5. Borrar un socio introduciendo DNI");
        System.out.println("6. Salir del programa");
        System.out.println("Elige una opción");
        opcion = sc.nextInt();
        sc.nextLine();

        switch (opcion){
            case 1 :
                System.out.println("Dar de alta a nuevo socio");
                System.out.println("Introduce el nombre del socio");
                nombre = sc.nextLine();
                System.out.println("Introduce el DNI del socio");
                dni = sc.nextLine();
                System.out.println("Introduce la edad del socio");
                edad = sc.nextInt();
                sc.nextLine();
                System.out.println("Introduce la fecha de inscripción");
                fecha = sc.nextLine();

                antonioGym.altaSocio(nombre,dni, edad, fecha);
                break;
            case 2 :
                System.out.println("Introduce el DNI del usuario que quieres dar de baja");
                dni = sc.nextLine();
                antonioGym.bajaDeSocio(dni);
                break;
            case 3 :
                antonioGym.listarSociosActivosOrdenados();
                break;
            case 4 :
                antonioGym.listarSociosInactivosOrdenados();
                break;
            case 5 :
                System.out.println("Introduce el DNI del usuario que quieras borrar");
                dni = sc.nextLine();
                antonioGym.borrarSocio(dni);
                break;
            case 6 :
                System.out.println("Saliendo del programa......");
                break;
            default:
                System.out.println("Opción no válidad");
        }
    } while (opcion != 6);

    sc.close();
}

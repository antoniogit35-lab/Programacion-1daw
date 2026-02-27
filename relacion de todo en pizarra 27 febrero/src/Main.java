void main() {
//    ArrayList<String> nombres = Ejercicio1.crearArray(); // creamos el array list llamando al método de la clase Ejercicio 1
//    for (String nombrecitos : nombres){ //itera toda la lista de nombres guardando cada nombre en nombrecitos
//        System.out.println(nombrecitos); //Aquí lo muestra
//    }
//    ArrayList<String> sinDuplicados = Ejercicio2.duplicados(nombres);
//    System.out.println(sinDuplicados);
//
//    ArrayList<Integer> numeros = new ArrayList<>(Arrays.asList(4,5,7,3)); // creamos el array con esos números
//    ArrayList<Integer> ordenar = Ejercicio3.ordenarArray(numeros); //Guardamos el resultado del metodo en un array
//    System.out.println("Aqué tienes tus numeros ordenados: " +ordenar); //mostramos el resultado

    Libro l1 = new Libro("Quijote", "Cervantes", 1605);
    Libro l2 = new Libro("Arbol de la cienca", "Baroja", 1911);
    Libro l3 = new Libro("Hamlet", "Shakespeare", 1603);
    Libro l4 = new Libro("Kamasutra", "Indio", 530); //Creamos los 4 libros iniciales de nuestra biblioteca


    Biblioteca b1 = new Biblioteca(new ArrayList<>(Arrays.asList(l1,l2,l3,l4))); //Introducimos los libros en nuestra biblioteca
    System.out.println(b1);

    Libro l5 = new Libro("Viaje al centro de la tierra", "Verne", 1864);
    b1.agregarLibros(l5); //agregamos el nuevo libro con el metodo de agregar libros

    Libro l6 = b1.buscarAutor("Cervantes");
    System.out.println(l6); // usamos el metodo de buscar autor

    b1.listarLibros(1800); //en este caso no es necesario hacer Libro l7 = b1.listarLibros(1800) porque el método es public void
}

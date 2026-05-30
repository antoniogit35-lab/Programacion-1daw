import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.io.*;
import java.util.ArrayList;

public class MenuGestionLibros extends JFrame {
    private ArrayList<Libro> listaLibros;
    private final String ARCHIVO = "./libros.csv";

    public MenuGestionLibros(){
        listaLibros = new ArrayList<>();
        cargarLibrosCSV();

        setTitle("Gestión de Libros");
        setSize(500,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JMenuBar barraMenu = new JMenuBar();
        JMenu menu = new JMenu("Opciones");

        JMenuItem anadirLibro = new JMenuItem("Añadir Libro");
        JMenuItem mostrarLibros = new JMenuItem("Mostrar Libros");

        menu.add(anadirLibro);
        menu.add(mostrarLibros);
        barraMenu.add(menu);
        setJMenuBar(barraMenu);

        JLabel textoCentral = new JLabel("Sistema de gestión de Libros", SwingConstants.CENTER);
        textoCentral.setFont(new Font("Arial", Font.BOLD, 16));
        add(textoCentral, BorderLayout.CENTER);

        anadirLibro.addActionListener(e -> aniadirLibro());
        mostrarLibros.addActionListener(e -> mostrarLibros());
    }

    private void aniadirLibro(){

        JFrame ventanaAnadirLibro = new JFrame("Añadir libro");
        ventanaAnadirLibro.setSize(300,250);
        ventanaAnadirLibro.setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridLayout(4,2,10,10));
        panel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));

        JLabel lblTitulo = new JLabel("Título:");
        JTextField textoTitulo = new JTextField();

        JLabel lblAutor = new JLabel("Autor:");
        JTextField textoAutor = new JTextField();

        JLabel lblAnio = new JLabel("Año:");
        JTextField textoAnio = new JTextField();

        JButton botonGuardar = new JButton("Guardar Libro");

        panel.add(lblTitulo);
        panel.add(textoTitulo);
        panel.add(lblAutor);
        panel.add(textoAutor);
        panel.add(lblAnio);
        panel.add(textoAnio);
        panel.add(new JLabel());
        panel.add(botonGuardar);

        ventanaAnadirLibro.add(panel);
        ventanaAnadirLibro.setVisible(true);

        botonGuardar.addActionListener(e ->{
            String titulo = textoTitulo.getText().trim();
            String autor = textoAutor.getText().trim();
            String anioTexto = textoAnio.getText().trim();

            if (titulo.isEmpty() || autor.isEmpty() || anioTexto.isEmpty()){
                JOptionPane.showMessageDialog(ventanaAnadirLibro, "No se pueden introducir campos vacíos");
                return;
            }
            try {
                int anio = Integer.parseInt(anioTexto);
                Libro libro = new Libro(titulo, autor, anio);
                listaLibros.add(libro);
                guardarLibrosCSV();

                JOptionPane.showMessageDialog(ventanaAnadirLibro, "El libro ha sido añadido correctamente");
                ventanaAnadirLibro.dispose();

            }catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(ventanaAnadirLibro,"El año introducido debe ser un número");
            }
        });
    }

    private void mostrarLibros(){
        JFrame ventanaListaLibros = new JFrame("Lista de libros");
        ventanaListaLibros.setSize(500,300);
        ventanaListaLibros.setLocationRelativeTo(null);
        ventanaListaLibros.setLayout(new BorderLayout());

        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Título");
        modelo.addColumn("Autor");
        modelo.addColumn("Año");

        for (Libro libro : listaLibros){
            modelo.addRow(new Object[]{
                    libro.getTitulo(),
                    libro.getAutor(),
                    libro.getAnio()
            });
        }

        JTable tabla = new JTable(modelo);
        tabla.setRowHeight(24);
        tabla.setFont(new Font("Arial", Font.PLAIN,14));
        tabla.getTableHeader().setFont(new Font("Arial", Font.BOLD, 16));

        JScrollPane scrollPane = new JScrollPane(tabla);
        JButton botonEliminar = new JButton("Eliminar Libro seleccionado");

        botonEliminar.addActionListener(e ->{
            int filaSeleccionada = tabla.getSelectedRow();

            if (filaSeleccionada == -1){
                JOptionPane.showMessageDialog(ventanaListaLibros, "Debes seleccionar que libro deseas borrar");
                return;
            }

            listaLibros.remove(filaSeleccionada);
            modelo.removeRow(filaSeleccionada);
            guardarLibrosCSV();

            JOptionPane.showMessageDialog(ventanaListaLibros, "El libro ha sido eliminado correctamente");
        });

        ventanaListaLibros.add(scrollPane, BorderLayout.CENTER);
        ventanaListaLibros.add(botonEliminar, BorderLayout.SOUTH);

        ventanaListaLibros.setVisible(true);
    }

    private void cargarLibrosCSV(){
        File archivo = new File(ARCHIVO);

        if (!archivo.exists()){
            return;
        }

        try(BufferedReader br = new BufferedReader(new FileReader(ARCHIVO))) {
            String linea;

            while ((linea = br.readLine()) != null){
                String[] partes = linea.split(";");

                if (partes.length == 3){
                    String titulo = partes[0];
                    String autor = partes[1];
                    int anio = Integer.parseInt(partes[2]);

                    Libro libro = new Libro(titulo, autor, anio);
                    listaLibros.add(libro);
                }
            }
        }catch (IOException e){
            JOptionPane.showMessageDialog(this, "Error al cargar el CSV");
        }
    }

    private void guardarLibrosCSV(){

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(ARCHIVO))) {

            for (Libro libro : listaLibros){
                bw.write(libro.getTitulo() + ";" + libro.getAutor() + ";" + libro.getAnio());
                bw.newLine();
            }

        }catch (IOException e){
            JOptionPane.showMessageDialog(this, "Error al guardar en el CSV");
        }
    }
}

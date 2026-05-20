import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.ArrayList;

public class ListaDeEstudiantes extends JFrame {

    private ArrayList<Estudiante> listaEstudiantes;
    private DefaultTableModel modeloTabla;
    private JTable tabla;

    private JTextField txtNombre;
    private JTextField txtEdad;
    private JTextField txtCurso;
    private JButton btnAgregar;

    public ListaDeEstudiantes() {
        listaEstudiantes = new ArrayList<>();

        setTitle("Lista de Estudiantes");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(10, 10));

        modeloTabla = new DefaultTableModel();
        modeloTabla.addColumn("Nombre");
        modeloTabla.addColumn("Edad");
        modeloTabla.addColumn("Curso");

        tabla = new JTable(modeloTabla);
        tabla.setRowHeight(25);
        tabla.setFont(new Font("Arial", Font.PLAIN, 14));
        tabla.getTableHeader().setFont(new Font("Arial", Font.BOLD, 14));

        JScrollPane scrollPane = new JScrollPane(tabla);
        add(scrollPane, BorderLayout.CENTER);

        JPanel panelFormulario = new JPanel(new GridLayout(4, 2, 10, 10));
        panelFormulario.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        panelFormulario.add(new JLabel("Nombre:"));
        txtNombre = new JTextField();
        panelFormulario.add(txtNombre);

        panelFormulario.add(new JLabel("Edad:"));
        txtEdad = new JTextField();
        panelFormulario.add(txtEdad);

        panelFormulario.add(new JLabel("Curso:"));
        txtCurso = new JTextField();
        panelFormulario.add(txtCurso);

        btnAgregar = new JButton("Agregar estudiante");
        panelFormulario.add(new JLabel());
        panelFormulario.add(btnAgregar);

        add(panelFormulario, BorderLayout.SOUTH);

        cargarEstudiantesIniciales();

        btnAgregar.addActionListener(e -> agregarEstudiante());
    }

    private void cargarEstudiantesIniciales() {
        listaEstudiantes.add(new Estudiante("Antonio", 27, "DAW"));
        listaEstudiantes.add(new Estudiante("Sergio", 25, "DAW"));
        listaEstudiantes.add(new Estudiante("Cristina", 30, "DAW"));

        for (Estudiante estudiante : listaEstudiantes) {
            modeloTabla.addRow(new Object[]{
                    estudiante.getNombre(),
                    estudiante.getEdad(),
                    estudiante.getCurso()
            });
        }
    }

    private void agregarEstudiante() {
        String nombre = txtNombre.getText();
        String edadTexto = txtEdad.getText();
        String curso = txtCurso.getText();

        if (nombre.isEmpty() || edadTexto.isEmpty() || curso.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Completa todos los campos");
            return;
        }

        try {
            int edad = Integer.parseInt(edadTexto);

            Estudiante nuevo = new Estudiante(nombre, edad, curso);
            listaEstudiantes.add(nuevo);

            modeloTabla.addRow(new Object[]{
                    nuevo.getNombre(),
                    nuevo.getEdad(),
                    nuevo.getCurso()
            });

            txtNombre.setText("");
            txtEdad.setText("");
            txtCurso.setText("");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "La edad debe ser un número");
        }
    }
}

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegistroEstudiante extends JFrame {

    private JTextField txtNombre;
    private JTextField txtEdad;
    private JTextField txtCurso;
    private JButton btnGuardar;

    public RegistroEstudiante() {
        setTitle("Registro de Estudiante");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        setLayout(new BorderLayout(10, 10));

        JLabel lblTitulo = new JLabel("Formulario de Registro", SwingConstants.CENTER);
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 18));
        add(lblTitulo, BorderLayout.NORTH);

        JPanel panelFormulario = new JPanel(new GridLayout(3, 2, 10, 10));
        panelFormulario.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));

        panelFormulario.add(new JLabel("Nombre:"));
        txtNombre = new JTextField();
        panelFormulario.add(txtNombre);

        panelFormulario.add(new JLabel("Edad:"));
        txtEdad = new JTextField();
        panelFormulario.add(txtEdad);

        panelFormulario.add(new JLabel("Curso:"));
        txtCurso = new JTextField();
        panelFormulario.add(txtCurso);

        add(panelFormulario, BorderLayout.CENTER);

        JPanel panelBoton = new JPanel();
        btnGuardar = new JButton("Guardar");
        panelBoton.add(btnGuardar);
        add(panelBoton, BorderLayout.SOUTH);

        btnGuardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombre = txtNombre.getText();
                String edad = txtEdad.getText();
                String curso = txtCurso.getText();

                String mensaje = "Datos del estudiante:\n"
                        + "Nombre: " + nombre + "\n"
                        + "Edad: " + edad + "\n"
                        + "Curso: " + curso;

                JOptionPane.showMessageDialog(
                        null,
                        mensaje,
                        "Información guardada",
                        JOptionPane.INFORMATION_MESSAGE
                );
            }
        });
    }
}

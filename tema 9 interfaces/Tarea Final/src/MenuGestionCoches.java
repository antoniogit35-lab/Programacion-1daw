import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.ArrayList;

public class MenuGestionCoches extends JFrame {
    private ArrayList<Coche> listaCoches;

    public MenuGestionCoches(){
        listaCoches = new ArrayList<>();

        setTitle("Gestion de coches");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        JMenuBar barraMenu = new JMenuBar();
        JMenu menu = new JMenu("Opciones");

        JMenuItem agregarItem = new JMenuItem("Añadir coche");
        JMenuItem mostrarItem = new JMenuItem("Mostrar coches");

        menu.add(agregarItem);
        menu.add(mostrarItem);
        barraMenu.add(menu);
        setJMenuBar(barraMenu);

        JLabel etiqueta = new JLabel("Sistema de gestión de coches", SwingConstants.CENTER);
        etiqueta.setFont(new Font("ARIAL", Font.BOLD, 20));
        add(etiqueta, BorderLayout.CENTER);

        agregarItem.addActionListener(e -> abrirFormularioCoche);
        mostrarItem.addActionListener(e -> mostrarTablaCoche);
    }

    private void abrirFormularioCoche(){
        JFrame ventanaFormulario = new JFrame("Añadir Coche");
        ventanaFormulario.setSize(350, 250);
        ventanaFormulario.setLocationRelativeTo(this);

        JPanel panel = new JPanel(new GridLayout(4,2,10,10));
        panel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));

        JLabel lblMarca = new JLabel("Marca");
        JTextField txtMarca = new JTextField();

        JLabel lblAnio = new JLabel("Año");
        JTextField txtAnio = new JTextField();

        JLabel lblColor = new JLabel("Color");
        JTextField txtColor = new JTextField();

        JButton btnGuardar = new JButton("Guardar");

        panel.add(lblMarca);
        panel.add(txtMarca);
        panel.add(lblAnio);
        panel.add(txtAnio);
        panel.add(lblColor);
        panel.add(txtColor);
        panel.add(new JLabel());
        panel.add(btnGuardar);

        ventanaFormulario.add(panel);
        ventanaFormulario.setVisible(true);

        btnGuardar.addActionListener(e -> {
            String marca = txtMarca.getText().trim();
            String anioTexto = txtAnio.getText().trim();
            String color = txtColor.getText().trim();

            if (marca.isEmpty() || anioTexto.isEmpty() || color.isEmpty()){
                JOptionPane.showMessageDialog(ventanaFormulario, "No puede haber campos vacíos");
                return;
            }

            try {
                int anio = Integer.parseInt(anioTexto);

                Coche coche = new Coche(marca, anio, color);
                listaCoches.add(coche);

                JOptionPane.showMessageDialog(ventanaFormulario, "Coche añadido correctamente");
                ventanaFormulario.dispose();
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(ventanaFormulario, "El año debe ser un número");
            }
        });
    }

    private void mostrarTablaCoches(){
        JFrame ventanaTabla = new JFrame("Lista de coches");
        ventanaTabla.setSize(500,300);
        ventanaTabla.setLocationRelativeTo(this);

        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Marca");
        modelo.addColumn("Año");
        modelo.addColumn("Color");

        for (Coche coche : listaCoches){
            modelo.addRow(new Object[]{
                    coche.getMarca(),
                    coche.getAnio(),
                    coche.getColor()
            });
        }

        JTable tabla = new JTable(modelo);
        tabla.setRowHeight(24);
        tabla.setFont(new Font("Arial", Font.PLAIN, 14));
        tabla.getTableHeader().setFont(new Font("Arial", Font.BOLD, 14));

        JScrollPane scrollPane = new JScrollPane(tabla);
        ventanaTabla.add(scrollPane);

        ventanaTabla.setVisible(true);
    }
}

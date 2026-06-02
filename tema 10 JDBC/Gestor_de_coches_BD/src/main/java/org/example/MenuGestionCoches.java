package org.example;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.sql.*;
import java.util.ArrayList;

public class MenuGestionCoches extends JFrame {

    private ArrayList<Coche> listaCoches;

    public MenuGestionCoches(){
        listaCoches = new ArrayList<>();

        setTitle("Gestión de coches");
        setSize(500,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JMenuBar barraMenu = new JMenuBar();
        JMenu menu = new JMenu("Opciones");

        JMenuItem agregarItem = new JMenuItem("Añadir coche");
        JMenuItem mostrarItem = new JMenuItem("Mostrar coche");

        menu.add(agregarItem);
        menu.add(mostrarItem);
        barraMenu.add(menu);
        setJMenuBar(barraMenu);

        JLabel textoCentral = new JLabel("Sistema de gestión de coches", SwingConstants.CENTER);
        textoCentral.setFont(new Font("Arial", Font.BOLD,20));
        add(textoCentral,BorderLayout.CENTER);

        agregarItem.addActionListener(e -> abrirAnadirCoche());
        mostrarItem.addActionListener(e -> mostrarCoches());
    }

    private void abrirAnadirCoche(){
        JFrame ventanaAnadirCoche = new JFrame("Añadir coche");
        ventanaAnadirCoche.setSize(300,250);
        ventanaAnadirCoche.setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridLayout(4,2,10,10));
        panel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));

        JLabel lblMarca = new JLabel("Marca:");
        JTextField textoMarca = new JTextField();

        JLabel lblAnio = new JLabel("Año:");
        JTextField textoAnio = new JTextField();

        JLabel lblColor = new JLabel("Color: ");
        JTextField textoColor = new JTextField();

        JButton botonGuardar = new JButton("Guardar coche");

        panel.add(lblMarca);
        panel.add(textoMarca);
        panel.add(lblAnio);
        panel.add(textoAnio);
        panel.add(lblColor);
        panel.add(textoColor);
        panel.add(new JLabel());
        panel.add(botonGuardar);

        ventanaAnadirCoche.add(panel);
        ventanaAnadirCoche.setVisible(true);

        botonGuardar.addActionListener(e -> {
            String marca = textoMarca.getText().trim();
            String anioTexto = textoAnio.getText().trim();
            String color = textoColor.getText().trim();

            if (marca.isEmpty() || anioTexto.isEmpty() || color.isEmpty()) {
                JOptionPane.showMessageDialog(ventanaAnadirCoche, "No puedes introducir campos vacíos");
                return;
            }

            try {
                int anio = Integer.parseInt(anioTexto);

                String sql = "INSERT INTO coches (marca, anio, color) VALUES (?, ?, ?)";

                try (Connection con = ConexionBD.conexion();
                     PreparedStatement ps = con.prepareStatement(sql)) {

                    ps.setString(1, marca);
                    ps.setInt(2, anio);
                    ps.setString(3, color);

                    ps.executeUpdate();

                    JOptionPane.showMessageDialog(ventanaAnadirCoche, "El coche ha sido añadido correctamente");
                    ventanaAnadirCoche.dispose();

                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(ventanaAnadirCoche, "Error al guardar en la base de datos");
                    ex.printStackTrace();
                }

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(ventanaAnadirCoche, "El año introducido debe ser un número");
            }
        });
    }

    private void mostrarCoches(){
        JFrame ventanaListaCoches = new JFrame("Lista de coches");
        ventanaListaCoches.setSize(600,300);
        ventanaListaCoches.setLocationRelativeTo(null);
        ventanaListaCoches.setLayout(new BorderLayout());

        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID");
        modelo.addColumn("Marca");
        modelo.addColumn("Año");
        modelo.addColumn("Color");

        cargarCochesBD();

        for (Coche coche : listaCoches){
            modelo.addRow(new Object[]{
                    coche.getId(),
                    coche.getMarca(),
                    coche.getAnio(),
                    coche.getColor()
            });
        }

        JTable tabla = new JTable(modelo);
        tabla.setRowHeight(24);
        tabla.setFont(new Font("Arial", Font.PLAIN,14));
        tabla.getTableHeader().setFont(new Font("Arial", Font.BOLD, 14));

        JScrollPane scrollPane = new JScrollPane(tabla);

        JButton botonEliminar = new JButton("Eliminar coche");
        JButton botonActualizar = new JButton("Actualizar coche");

        botonEliminar.addActionListener(e ->{
            int filaSeleccionada = tabla.getSelectedRow();

            if (filaSeleccionada == -1){
                JOptionPane.showMessageDialog(ventanaListaCoches, "Selecciona un coche para eliminar");
                return;
            }

            int id = (int) modelo.getValueAt(filaSeleccionada, 0);

            String sql = "DELETE FROM coches WHERE id = ?";

            try (Connection con = ConexionBD.conexion();
                 PreparedStatement ps = con.prepareStatement(sql)) {

                ps.setInt(1, id);
                ps.executeUpdate();

                modelo.removeRow(filaSeleccionada);
                JOptionPane.showMessageDialog(ventanaListaCoches, "Coche eliminado correctamente");

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(ventanaListaCoches, "Error al eliminar el coche");
                ex.printStackTrace();
            }
        });

        botonActualizar.addActionListener(e -> {
            int filaSeleccionada = tabla.getSelectedRow();

            if (filaSeleccionada == -1){
                JOptionPane.showMessageDialog(ventanaListaCoches, "Selecciona un coche para actualizar");
                return;
            }

            int id = (int) modelo.getValueAt(filaSeleccionada, 0);
            String marcaActual = (String) modelo.getValueAt(filaSeleccionada, 1);
            int anioActual = (int) modelo.getValueAt(filaSeleccionada, 2);
            String colorActual = (String) modelo.getValueAt(filaSeleccionada, 3);

            JTextField textoMarca = new JTextField(marcaActual);
            JTextField textoAnio = new JTextField(String.valueOf(anioActual));
            JTextField textoColor = new JTextField(colorActual);

            JPanel panel = new JPanel(new GridLayout(3, 2, 10, 10));
            panel.add(new JLabel("Marca:"));
            panel.add(textoMarca);
            panel.add(new JLabel("Año:"));
            panel.add(textoAnio);
            panel.add(new JLabel("Color:"));
            panel.add(textoColor);

            int resultado = JOptionPane.showConfirmDialog(
                    ventanaListaCoches,
                    panel,
                    "Actualizar coche",
                    JOptionPane.OK_CANCEL_OPTION
            );

            if (resultado == JOptionPane.OK_OPTION) {
                String nuevaMarca = textoMarca.getText().trim();
                String nuevoAnioTexto = textoAnio.getText().trim();
                String nuevoColor = textoColor.getText().trim();

                if (nuevaMarca.isEmpty() || nuevoAnioTexto.isEmpty() || nuevoColor.isEmpty()) {
                    JOptionPane.showMessageDialog(ventanaListaCoches, "No puede haber campos vacíos");
                    return;
                }

                try {
                    int nuevoAnio = Integer.parseInt(nuevoAnioTexto);

                    String sql = "UPDATE coches SET marca = ?, anio = ?, color = ? WHERE id = ?";

                    try (Connection con = ConexionBD.conexion();
                         PreparedStatement ps = con.prepareStatement(sql)) {

                        ps.setString(1, nuevaMarca);
                        ps.setInt(2, nuevoAnio);
                        ps.setString(3, nuevoColor);
                        ps.setInt(4, id);

                        ps.executeUpdate();

                        modelo.setValueAt(nuevaMarca, filaSeleccionada, 1);
                        modelo.setValueAt(nuevoAnio, filaSeleccionada, 2);
                        modelo.setValueAt(nuevoColor, filaSeleccionada, 3);

                        JOptionPane.showMessageDialog(ventanaListaCoches, "Coche actualizado correctamente");

                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(ventanaListaCoches, "Error al actualizar el coche");
                        ex.printStackTrace();
                    }

                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(ventanaListaCoches, "El año debe ser un número");
                }
            }
        });

        JPanel panelBotones = new JPanel();
        panelBotones.add(botonEliminar);
        panelBotones.add(botonActualizar);

        ventanaListaCoches.add(scrollPane, BorderLayout.CENTER);
        ventanaListaCoches.add(panelBotones, BorderLayout.SOUTH);

        ventanaListaCoches.setVisible(true);
    }

    private void cargarCochesBD(){
        listaCoches.clear();

        String sql = "SELECT id, marca, anio, color FROM coches";

        try (Connection con = ConexionBD.conexion();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                int id = rs.getInt("id");
                String marca = rs.getString("marca");
                int anio = rs.getInt("anio");
                String color = rs.getString("color");

                listaCoches.add(new Coche(id, marca, anio, color));
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error al cargar los coches de la base de datos");
            e.printStackTrace();
        }
    }
}
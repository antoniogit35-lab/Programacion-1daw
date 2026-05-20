import javax.swing.*;
import java.awt.*;

public class main {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            UIManager.put("Button.font", new Font("Arial", Font.PLAIN, 14));
            UIManager.put("Label.font", new Font("Arial", Font.PLAIN, 14));
            UIManager.put("TextField.font", new Font("Arial", Font.PLAIN, 14));
        } catch (Exception e) {
            e.printStackTrace();
        }

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new RegistroEstudiante().setVisible(true);
            }
        });
    }
}

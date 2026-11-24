
package VeterinariaG8;

import Vista.VistaVet;
import javax.swing.SwingUtilities;

public class Main {

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {

            VistaVet vista = new VistaVet();

            vista.setLocationRelativeTo(null);

            vista.setVisible(true);

        });
    }
}

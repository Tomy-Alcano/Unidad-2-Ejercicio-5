import javax.swing.*;
import java.awt.*;

public class main {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {

            JFrame ventana = new JFrame("Boton que responde");
            ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            ventana.setSize(400,300);
            ventana.setLocationRelativeTo(null);

            JPanel panelPrincipal = new JPanel();

            JLabel mensaje = new JLabel("Presiona el botón para comenzar");

            JButton botSaludar = new JButton("Saludar");

            panelPrincipal.add(mensaje);
            panelPrincipal.add(botSaludar);

            //CLASE ANÓNIMA
        /*    botSaludar.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        mensaje.setText(
                            "¡Hola! Bienvenido a Swing.");
                    }
                });

         */
            //LAMBDA
            botSaludar.addActionListener(e -> {
                mensaje.setText("Hola, bienvenido a Swing!");
            });

            ventana.add(panelPrincipal);
            ventana.setVisible(true);


        });
    }

}
/* La version Lambda me resulta mejor ya que
utiliza menos código y no hace falta usar una clase
 */
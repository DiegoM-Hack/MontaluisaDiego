import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MostrarProductos extends JFrame {
    private JPanel principal;
    private JLabel codigo;
    private JLabel nombre;
    private JLabel detalle;
    private JLabel stock;
    private JButton regresarMenuButton;

    public MostrarProductos() {
        setTitle("Mostrar Productos");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(principal);
        setLocationRelativeTo(null);
        setVisible(true);
        regresarMenuButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MenuOpciones menu = new MenuOpciones();
                dispose();

            }
        });
    }
}

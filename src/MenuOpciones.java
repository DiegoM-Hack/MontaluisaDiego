import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuOpciones extends JFrame {
    private JPanel principal;
    private JButton registroButton;
    private JButton ventasButton;
    private JButton verProductoButton;

    public MenuOpciones() {

        setTitle("Menu Opciones");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(principal);
        setLocationRelativeTo(null);
        setVisible(true);

        registroButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Productos productos = new Productos();
                dispose();
            }
        });
        ventasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Factura factura = new Factura();
                dispose();

            }
        });
        verProductoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MostrarProductos productos = new MostrarProductos();
                dispose();

            }
        });
    }
}

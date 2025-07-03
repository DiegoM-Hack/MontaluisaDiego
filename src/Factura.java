import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Factura extends JFrame {
    private JPanel principal;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JButton calcularButton;
    private JButton regresarMenuButton;

    public Factura() {
        setTitle("Productos");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(principal);
        setLocationRelativeTo(null);
        setVisible(true);

        calcularButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        regresarMenuButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MenuOpciones menu = new MenuOpciones();
                dispose();

            }
        });
    }
}

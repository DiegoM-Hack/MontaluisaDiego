import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Productos extends JFrame {
    private JPanel princiapl;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JButton guardarButton;
    private JButton limpiarButton;
    private JButton regresarAlMenuButton;

    public Productos() {
        setTitle("Productos");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(princiapl);
        setLocationRelativeTo(null);
        setVisible(true);
        guardarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                guardar();
            }
        });
        limpiarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                limpiar();
            }
        });
        regresarAlMenuButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MenuOpciones menu = new MenuOpciones();
                dispose();
            }
        });
    }
    private void limpiar() {
        textField1.setText("");
        textField2.setText("");
        textField3.setText("");
        textField4.setText("");
        textField5.setText("");
    }


    private void guardar(){
        String codigo = textField1.getText();
        String nombre = textField2.getText();
        String detalle = textField3.getText();
        int stock = Integer.parseInt(textField1.getText());
        int precio = Integer.parseInt(textField2.getText());
        try{
            if(textField1.getText().isEmpty() || textField2.getText().isEmpty() || textField3.getText().isEmpty() || textField4.getText().isEmpty() || textField5.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "Ingrese todos los campos");
                return;
            }
            if(textField5.getText().length() > 3 || textField2.getText().length() > 4){
                JOptionPane.showMessageDialog(null, "El stock no puede tener mayor a 3 cifras y el precio unitario mayor a 4 cifras");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        new MostrarProductos();


        new Factura(codigo, nombre, precio);
    }
}

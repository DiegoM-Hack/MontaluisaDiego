import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Factura extends JFrame {
    private JPanel principal;
    private JTextField codigo;
    private JTextField cantidad;
    private JButton calcularButton;
    private JButton regresarMenuButton;
    private JLabel subtotal;
    private JLabel iva;
    private JLabel total;
    private JLabel nombre;
    private JLabel precio;


    public Factura(String codigo, String nombre, int precio) {
        this.nombre.setText(nombre);
        this.precio.setText(precio + "");
    }

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
                calcular();

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

    private void calcular() {
        if(this.codigo.getText().equals(codigo) ){

        }

        try{
            int precio1 = Integer.parseInt(precio.getText());
            int cantidad1 = Integer.parseInt(cantidad.getText());
            if(codigo.getText().isEmpty() || precio.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "El codigo o el precio no pueden estar vacio.", "Campos vacios", JOptionPane.WARNING_MESSAGE);
            }
            int total1 = precio1 * cantidad1;
            subtotal.setText(total1 +"");
            double total2 = (total1 *0.15) + total1;
            total.setText(total2 + "");
        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Ingresa un numero valido");

        }
    }
}

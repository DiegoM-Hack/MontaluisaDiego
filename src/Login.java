import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.classfile.instruction.InvokeInstruction;

public class Login extends JFrame {
    private JPanel principal;
    private JTextField usuario;
    private JPasswordField clave;
    private JButton accesoButton;
    private JButton limpiarButton;

    public Login() {
        setTitle("Login");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(principal);
        setLocationRelativeTo(null);
        setVisible(true);

        accesoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                verificarAcceso();
            }
        });
        limpiarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                limpiar();
            }
        });
    }

    private void verificarAcceso() {
        try {
            String u = usuario.getText().strip();
            char[] pass = clave.getPassword();
            if (u.isEmpty() || pass.length == 0) {
                JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos.", "Campos vacíos", JOptionPane.WARNING_MESSAGE);
                return;
            }
            if (u.equals("Montaluisa") && String.valueOf(pass).equals("esfot123")) {
                MenuOpciones cliente = new MenuOpciones();
                dispose();
                accesoButton.addActionListener(e -> verificarAcceso());

            }else{
                JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrecta", "Error", JOptionPane.ERROR_MESSAGE);
            }

        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo verificar el acceso");
        }
    }

    private void limpiar() {
        usuario.setText("");
        clave.setText("");
    }


    public static void main(String[] args) {

        SwingUtilities.invokeLater(Login::new);

    }

}

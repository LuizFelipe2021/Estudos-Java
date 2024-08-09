import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;

public class Sistema extends JDialog {
    private  JPanel  Sistema;
    private JTextField txtLogin;
    private JTextField txtSenha;
    private JLabel lblLogin;
    private JLabel lblSenha;

    public Sistema (){

        setTitle("Sistema de Login");
        setSize(300,150);

        setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        Sistema = new JPanel();

        Sistema.setLayout((new GridLayout(3,2)));

        lblLogin = new JLabel("Login");
        txtLogin = new JTextField(15);
        lblSenha = new JLabel("Senha");
        txtSenha = new JTextField(15);

        JButton btnLogin = new JButton("Login");
        btnLogin.addActionListener(e -> realizarLogin());

        Sistema.add(lblLogin);
        Sistema.add(txtLogin);
        Sistema.add(lblSenha);
        Sistema.add(btnLogin);

        add(Sistema);
    }

        private void realizarLogin(){

        String Login = txtLogin.getText();
        String Senha = txtSenha.getText();

            Scanner scanner = new Scanner(System.in);

            System.out.print("Username: ");
            String username = txtLogin.toString();

            System.out.print("Password: ");
            String password = txtSenha.toString();

            if (verifyCredentials(username, password)) {
                System.out.println("Login successful!");
            } else {
                System.out.println("Invalid username or password. Please try again.");
            }
        }

    public static boolean verifyCredentials(String username, String password) {

        return "admin".equals(username) && "password".equals(password);
    }
}


    public void main(String[] args) {


        SwingUtilities SwingUtilies = null;
        SwingUtilies.invokeLater(() -> {
    Sistema sistema = new Sistema();
    sistema.setVisible(true);

    });
}


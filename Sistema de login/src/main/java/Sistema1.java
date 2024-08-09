import javax.swing.*;
import java.awt.event.*;
import java.util.Scanner;

public class Sistema1 extends JDialog {
    private JPanel contentPane;
    private JTextField txtLogin;
    private JTextPane txtSenha;
    private JButton btnLogin;
    private JButton buttonOK;
    private JButton buttonCancel;

    public Sistema1() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);


        // call onCancel() when cross is clicked
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                onCancel();
            }
        });

        // call onCancel() on ESCAPE
        contentPane.registerKeyboardAction(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        }, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Login = txtLogin.getText();
                String Senha = txtSenha.getText();

                Scanner scanner = new Scanner(System.in);

                System.out.print("Username: ");
                String username = Login.toString();

                System.out.print("Password: ");
                String password = Senha.toString();
                if (verifyCredentials(username, password)) {
                    System.out.println("Entrou com sucesso!");
                }     else {

                    System.out.println("Senha incorreta! tente novamente");
                }

            }
            public static boolean verifyCredentials(String username, String password) {

                return "admin".equals(username) && "password".equals(password);
            }

        });
    }

    private void onOK() {
        // add your code here
        dispose();
    }

    private void onCancel() {
        // add your code here if necessaryd4
        dispose();
    }

    public static void main(String[] args) {
        Sistema1 dialog = new Sistema1();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}

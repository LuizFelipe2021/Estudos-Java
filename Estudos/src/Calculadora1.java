import javax.swing.*;
import java.awt.event.*;
import java.util.Scanner;

public class Calculadora1 extends JDialog {
    private JPanel contentPane;
    private JButton btnSoma;
    private JLabel lblSoma;
    private JTextField txtN1;
    private JTextField txtN2;
    private JLabel lblResult;
    private JButton buttonCancel;

    public Calculadora1() {
        setContentPane(contentPane);
        setModal(true);




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
        btnSoma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int n1 = Integer.parseInt(txtN1.getText());
                int n2 = Integer.parseInt(txtN2.getText());
                Scanner valor = new Scanner(System.in);
                int r = n1 + n2;
                btnSoma.setText(Integer.toString(r)); }
            });
        }

        private void onOK () {
            // add your code here
            dispose();
        }

        private void onCancel () {
            // add your code here if necessary
            dispose();
        }

        public static void main (String[]args){
            Calculadora1 dialog = new Calculadora1();
            dialog.pack();
            dialog.setVisible(true);
            System.exit(0);
        }
    }

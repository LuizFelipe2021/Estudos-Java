import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import javax.swing.JButton;
import javax.swing.JLabel;
public class Relogio {
    private JButton btnHora = new JButton("mostra a hora");
    private JLabel lblHora = new JLabel();
/**/
    public Relogio() {
        btnHora.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Date relogio = new Date();
                Locale idioma = new Locale("Portugues");

             lblHora.setText(relogio.toString());
              idioma.getDisplayLanguage();
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Relogio");
        Relogio rel = new Relogio();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(rel.btnHora);
        frame.getContentPane().add(rel.lblHora);
        frame.setLayout(new FlowLayout());
        frame.setSize(300,100);
        frame.setVisible(true);


        int idade2 = (int)3;

        Integer idade = new Integer(3);
    }
}

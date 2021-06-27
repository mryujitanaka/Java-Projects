package olamundoswing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OlaMundoSwing {
    private JPanel panelPrincipal;
    private JButton btnClique;
    private JLabel lblMensagem;

    public OlaMundoSwing() {
        btnClique.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblMensagem.setText("Ola, Mundo!");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Ola Mundo Swing");
        frame.setContentPane(new OlaMundoSwing().panelPrincipal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
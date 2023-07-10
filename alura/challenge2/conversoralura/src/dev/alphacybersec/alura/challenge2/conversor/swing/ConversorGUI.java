package dev.alphacybersec.alura.challenge2.conversor.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class ConversorGUI extends JFrame {


    private JButton conversorMonedasButton;
    private JPanel mainPanel;


    public ConversorGUI() {

        setTitle("Conversor Alura");
        setSize(500,350);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(new Color(0xF3F5FC)); //Azul Alura
        setContentPane(mainPanel);

    conversorMonedasButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            dispose(); //Cierra el frame

            ConversorMonedasGUI nextMenu = new ConversorMonedasGUI();
            nextMenu.setVisible(true);

        }


    });

        ImageIcon favicon = new ImageIcon(Objects.requireNonNull(getClass().getResource("/dev/alphacybersec/alura/challenge2/conversor/images/favicon-32x32.png")));
        setIconImage(favicon.getImage());

}


    public static void main(String[] args) {
        ConversorGUI cg  = new ConversorGUI();






    }

}

package dev.alphacybersec.alura.challenge2.conversor.swing;

import dev.alphacybersec.alura.challenge2.conversor.entity.Moneda;
import dev.alphacybersec.alura.challenge2.conversor.entity.Monedas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class ConversorMonedasGUI extends JFrame {


    private JPanel panelMonedas;
    private JButton euroButton;
    private JButton libraEsterlinaButton;
    private JButton yenButton;
    private JButton wonButton;
    private JButton SALIRButton;
    private JButton REGRESARButton;


    public ConversorMonedasGUI() {

        setContentPane(panelMonedas);
        setTitle("Conversor de Monedas");
        setSize(900, 500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(new Color(0xF3F5FC)); //Azul Alura

        ImageIcon favicon = new ImageIcon(Objects.requireNonNull(getClass().getResource("/dev/alphacybersec/alura/challenge2/conversor/images/favicon-32x32.png")));
        setIconImage(favicon.getImage());

        euroButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String[] options = {"EURO > DÓLAR", "DÓLAR > EURO"};

                int choice = JOptionPane.showOptionDialog(
                        euroButton,
                        "Escoge el Tipo de Conversión:",
                        "Opciones de Conversión",
                        JOptionPane.DEFAULT_OPTION,
                        JOptionPane.PLAIN_MESSAGE,
                        null,
                        options,
                        options[0]);

                result(choice,euroButton);
            }
        });


        libraEsterlinaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String[] options = {"LIBRA ESTERLINA > DÓLAR", "DÓLAR > LIBRA ESTERLINA"};

                int choice = JOptionPane.showOptionDialog(
                        libraEsterlinaButton,
                        "Escoge el Tipo de Conversión:",
                        "Opciones de Conversión",
                        JOptionPane.DEFAULT_OPTION,
                        JOptionPane.PLAIN_MESSAGE,
                        null,
                        options,
                        options[0]);

                result(choice,libraEsterlinaButton);
            }
        });


        yenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String[] options = {"YEN JAPONÉS > DÓLAR", "DÓLAR > YEN JAPONÉS"};

                int choice = JOptionPane.showOptionDialog(
                        yenButton,
                        "Escoge el Tipo de Conversión:",
                        "Opciones de Conversión",
                        JOptionPane.DEFAULT_OPTION,
                        JOptionPane.PLAIN_MESSAGE,
                        null,
                        options,
                        options[0]);

                result(choice,yenButton);
            }
        });


        wonButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String[] options = {"WON SUL-COREANO > DÓLAR", "DÓLAR > WON SUL-COREANO"};

                int choice = JOptionPane.showOptionDialog(
                        wonButton,
                        "Escoge el Tipo de Conversión:",
                        "Opciones de Conversión",
                        JOptionPane.DEFAULT_OPTION,
                        JOptionPane.PLAIN_MESSAGE,
                        null,
                        options,
                        options[0]);

                result(choice,wonButton);
            }
        });
        SALIRButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.exit(0);
            }
        });
        REGRESARButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                dispose();

                ConversorGUI mainMenu = new ConversorGUI();
                mainMenu.setVisible(true);

            }
        });
    }


    private Monedas getMoneda(JButton monedaButton){

        Monedas moneda = null;

        if(monedaButton == euroButton){
            moneda = Monedas.values()[0];
        }else if(monedaButton == libraEsterlinaButton){
            moneda = Monedas.values()[1];
        }else if(monedaButton == yenButton){
            moneda = Monedas.values()[2];
        }else if(monedaButton == wonButton){
            moneda = Monedas.values()[3];
        }

        return moneda;
    }

    public void result (int choice , JButton monedaButton){

        Monedas tipoMoneda = getMoneda(monedaButton);
        Moneda monedaConversion = new Moneda();
        String cantidadStr ="";

        if(choice == 0){
            cantidadStr = JOptionPane.showInputDialog(
                    euroButton,
                    "Ingrese la cantidad en " + tipoMoneda.getMONEDAPLURAL() + ": ",
                    tipoMoneda.getMONEDASIMBOLO() + " " + tipoMoneda.getMONEDA() + " > $ Dólar " ,
                    JOptionPane.PLAIN_MESSAGE);
        }else{
            cantidadStr = JOptionPane.showInputDialog(
                    euroButton,
                    "Ingrese la cantidad en Dólares: ",
                    "$ Dólar > " + tipoMoneda.getMONEDASIMBOLO() + "-" + tipoMoneda.getMONEDA(),
                    JOptionPane.PLAIN_MESSAGE);

        }


            double conversion = 0;


            try {

                double cantidad = Double.parseDouble(cantidadStr);

                if (cantidadStr.isEmpty()) {
                    JOptionPane.showMessageDialog(
                            euroButton,
                            "No puede estar vacío.",
                            "Cantidad No Ingresada",
                            JOptionPane.ERROR_MESSAGE);

                } else if (cantidad <= 0) {
                    JOptionPane.showMessageDialog(
                            euroButton,
                            "La cantidad no puede ser cero o menor a cero",
                            "Cantidad Incorrecta",
                            JOptionPane.ERROR_MESSAGE);

                }else {

                    if(choice==0){
                        conversion = cantidad * tipoMoneda.getVALORMONEDAUSD();

                    }else {
                        conversion = cantidad * tipoMoneda.getVALORUSDMONEDA();
                    }

                }

                if(conversion != 0){
                    monedaConversion.setNombreMoneda(tipoMoneda.getMONEDA());
                    monedaConversion.setCantidadConvertir(cantidad);
                    monedaConversion.setConversion(conversion);
                    monedaConversion.setTipoConversion(choice+1);

                    JOptionPane.showMessageDialog(
                            euroButton,
                            monedaConversion.toString(),
                            "Resultado",
                            JOptionPane.INFORMATION_MESSAGE);
                }


            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(
                        euroButton,
                        "Por favor, ingrese una cantidad numérica.",
                        "Datos Incorrectos",
                        JOptionPane.ERROR_MESSAGE);
            }

    }

}

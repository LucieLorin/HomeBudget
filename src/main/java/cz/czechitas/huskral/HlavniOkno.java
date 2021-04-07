package cz.czechitas.huskral;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import net.miginfocom.swing.*;

public class HlavniOkno extends JFrame {

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner non-commercial license
    JLabel label1Uvod;
    JLabel labRPay;
    JTextField textRPay;
    JLabel labLPay;
    JTextField textLPay;
    JLabel labRegExp;
    JTextField textRegular;
    JLabel labFood;
    JTextField textFood;
    JLabel labTwisto;
    JTextField textTwisto;
    JLabel labOthers;
    JTextField textOthers;
    JButton butResult;
    JTextField textResult;
    JLabel labRMoneyLeft;
    JTextField textRMoneyLeft;
    JLabel labLMoneyLeft;
    JTextField textLMoneyLeft;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
    JPanel contentPane;
    MigLayout migLayoutManager;

    public HlavniOkno() {
        initComponents();
    }

    private void button1GiveMeResult(ActionEvent e) {
        // příjmy a výdaje
        double income = Double.parseDouble(textRPay.getText()) + Double.parseDouble(textLPay.getText());
        double expenses = Double.parseDouble(textRegular.getText()) + Double.parseDouble(textTwisto.getText())
                + Double.parseDouble(textOthers.getText()) + Double.parseDouble(textFood.getText());

        // Kolik poslat na Fio na osobu
        double result = expenses / 2;
        textResult.setText(Double.toString(result) + " Kč");

        //Romanovy zbylé peníze
        double RMoneyLeft = Double.parseDouble(textRPay.getText()) - result;
        textRMoneyLeft.setText(Double.toString(RMoneyLeft) + " Kč");

        //Lucčiny zbylé peníze
        double LMoneyLeft = Double.parseDouble(textLPay.getText()) - result;
        textLMoneyLeft.setText(Double.toString(LMoneyLeft) + " Kč");
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner non-commercial license
        label1Uvod = new JLabel();
        labRPay = new JLabel();
        textRPay = new JTextField();
        labLPay = new JLabel();
        textLPay = new JTextField();
        labRegExp = new JLabel();
        textRegular = new JTextField();
        labFood = new JLabel();
        textFood = new JTextField();
        labTwisto = new JLabel();
        textTwisto = new JTextField();
        labOthers = new JLabel();
        textOthers = new JTextField();
        butResult = new JButton();
        textResult = new JTextField();
        labRMoneyLeft = new JLabel();
        textRMoneyLeft = new JTextField();
        labLMoneyLeft = new JLabel();
        textLMoneyLeft = new JTextField();

        //======== this ========
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("moneyH");
        setBackground(new Color(153, 204, 255));
        setMinimumSize(new Dimension(30, 49));
        Container contentPane = getContentPane();
        contentPane.setLayout(new MigLayout(
            "insets rel,hidemode 3",
            // columns
            "[fill]" +
            "[grow,fill]",
            // rows
            "[grow,fill]" +
            "[grow]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[grow]" +
            "[grow]" +
            "[]" +
            "[]"));
        this.contentPane = (JPanel) this.getContentPane();
        this.contentPane.setBackground(this.getBackground());
        LayoutManager layout = this.contentPane.getLayout();
        if (layout instanceof MigLayout) {
            this.migLayoutManager = (MigLayout) layout;
        }

        //---- label1Uvod ----
        label1Uvod.setText("Kolik poslat na Fio?");
        label1Uvod.setForeground(new Color(0, 0, 153));
        label1Uvod.setFont(new Font("Segoe UI", Font.PLAIN, 22));
        label1Uvod.setHorizontalAlignment(SwingConstants.CENTER);
        label1Uvod.setBackground(new Color(204, 204, 255));
        contentPane.add(label1Uvod, "cell 0 0 2 1");

        //---- labRPay ----
        labRPay.setText("Romanova v\u00fdplata");
        labRPay.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        contentPane.add(labRPay, "cell 0 1");

        //---- textRPay ----
        textRPay.setColumns(25);
        textRPay.setText("0");
        contentPane.add(textRPay, "cell 1 1");

        //---- labLPay ----
        labLPay.setText("Luc\u010dina v\u00fdplata");
        labLPay.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        contentPane.add(labLPay, "cell 0 2");

        //---- textLPay ----
        textLPay.setText("0");
        contentPane.add(textLPay, "cell 1 2");

        //---- labRegExp ----
        labRegExp.setText("Pravideln\u00e9 platby");
        labRegExp.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        contentPane.add(labRegExp, "cell 0 3");

        //---- textRegular ----
        textRegular.setText("24516");
        contentPane.add(textRegular, "cell 1 3");

        //---- labFood ----
        labFood.setText("J\u00eddlo");
        labFood.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        contentPane.add(labFood, "cell 0 4");

        //---- textFood ----
        textFood.setText("6000");
        contentPane.add(textFood, "cell 1 4");

        //---- labTwisto ----
        labTwisto.setText("Twisto");
        labTwisto.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        contentPane.add(labTwisto, "cell 0 5");

        //---- textTwisto ----
        textTwisto.setText("0");
        contentPane.add(textTwisto, "cell 1 5");

        //---- labOthers ----
        labOthers.setText("Ostatn\u00ed v\u00fddaje");
        labOthers.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        contentPane.add(labOthers, "cell 0 6");

        //---- textOthers ----
        textOthers.setText("0");
        contentPane.add(textOthers, "cell 1 6");

        //---- butResult ----
        butResult.setText("V\u00fdpo\u010det");
        butResult.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        butResult.setForeground(Color.blue);
        butResult.setBackground(new Color(153, 204, 255));
        butResult.addActionListener(e -> button1GiveMeResult(e));
        contentPane.add(butResult, "cell 0 7 2 1");

        //---- textResult ----
        textResult.setHorizontalAlignment(SwingConstants.CENTER);
        textResult.setFont(new Font("Segoe UI", Font.PLAIN, 28));
        textResult.setForeground(Color.black);
        textResult.setColumns(10);
        contentPane.add(textResult, "cell 0 8 2 1");

        //---- labRMoneyLeft ----
        labRMoneyLeft.setText("Romanovi zbude");
        labRMoneyLeft.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        contentPane.add(labRMoneyLeft, "cell 0 9");

        //---- textRMoneyLeft ----
        textRMoneyLeft.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        contentPane.add(textRMoneyLeft, "cell 1 9");

        //---- labLMoneyLeft ----
        labLMoneyLeft.setText("Lucce zbude");
        labLMoneyLeft.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        contentPane.add(labLMoneyLeft, "cell 0 10");

        //---- textLMoneyLeft ----
        textLMoneyLeft.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        contentPane.add(textLMoneyLeft, "cell 1 10");
        pack();
        setLocationRelativeTo(null);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }
}

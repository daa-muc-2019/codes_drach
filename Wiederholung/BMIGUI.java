import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BMIGUI extends JFrame implements ActionListener {

    private JTextField groesseTField;
    private JTextField gewichtTField;
    private JTextField bmiTField;
    private JButton calculateButton;

    public BMIGUI(){
        Container contentPane = this.getContentPane();
        contentPane.setLayout(new GridLayout(4,2));

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Font font1 = new Font("SansSerif", Font.BOLD, 40);
        this.setTitle("BMI Rechner");
        this.setSize(700,400);

        this.groesseTField = new JTextField(10);
        this.groesseTField.setFont(font1);
        JLabel groesseLabel = new JLabel("Groesse: ");
        JPanel groessePanel = new JPanel();
        groessePanel.add(groesseLabel);
        groessePanel.add(this.groesseTField);

        this.gewichtTField = new JTextField(10);
        this.gewichtTField.setFont(font1);
        JLabel gewichtLabel = new JLabel("Gewicht: ");
        JPanel gewichtPanel = new JPanel();
        gewichtPanel.add(gewichtLabel);
        gewichtPanel.add(this.gewichtTField);

        this.bmiTField = new JTextField(10);
        this.bmiTField.setEditable(false);
        this.bmiTField.setFont(font1);
        JLabel bmiLabel = new JLabel("BMI: ");
        JPanel bmiPanel = new JPanel();
        bmiPanel.add(bmiLabel);
        bmiPanel.add(this.bmiTField);

        this.calculateButton = new JButton("Calculate");
        this.calculateButton.addActionListener(this);
        this.calculateButton.setFont(font1);
        JPanel calculatePanel = new JPanel();
        calculatePanel.add(this.calculateButton);

        contentPane.add(gewichtPanel);
        contentPane.add(groessePanel);
        contentPane.add(bmiPanel);
        contentPane.add(calculatePanel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==this.calculateButton){
            double gewicht = Double.parseDouble(this.gewichtTField.getText());
            double groesse = Double.parseDouble(this.groesseTField.getText());
            double bmi = gewicht/Math.pow(groesse,2);
            this.bmiTField.setText(Double.toString(Math.round(bmi*10)/10));
        }
    }
}

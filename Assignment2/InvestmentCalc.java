import javax.swing.*;
import java.awt.*;

public class InvestmentCalc extends JFrame {
    JTextField tfPrincipal = new JTextField(10);
    JTextField tfRate = new JTextField(10);
    JTextField tfYears = new JTextField(10);
    JLabel lblResult = new JLabel("Result: ");

    InvestmentCalc() {
        setTitle("Investment Calculator");
        setLayout(new GridLayout(5, 2, 5, 5));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(new JLabel("Principal (INR):"));
        add(tfPrincipal);
        add(new JLabel("Rate (% p.a.):"));
        add(tfRate);
        add(new JLabel("Years:"));
        add(tfYears);
        JButton btn = new JButton("Calculate");
        btn.addActionListener(e -> {
            double p = Double.parseDouble(tfPrincipal.getText());
            double r = Double.parseDouble(tfRate.getText()) / 100;
            int n = Integer.parseInt(tfYears.getText());
            double amount = p * Math.pow(1 + r, n);
            lblResult.setText(String.format("Maturity: INR %.2f", amount));
        });
        add(btn);
        add(lblResult);
        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        new InvestmentCalc();
    }
}

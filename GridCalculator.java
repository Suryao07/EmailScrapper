import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class BuildCalculator implements ActionListener {
    JFrame actualWindow;
    JPanel resultPanel, buttonPanel, infoPanel;
    JTextField resultTxt;
    JButton btn_digits[] = new JButton[10];
    JButton btn_plus, btn_minus, btn_mul, btn_div, btn_equal, btn_dot, btn_clear;
    JLabel expression, appTitle, siteTitle;
    double operand_1 = 0, operand_2 = 0;
    String operator = "=";

    BuildCalculator() {
        Font txtFont = new Font("SansSerif", Font.BOLD, 20);
        Font titleFont = new Font("SansSerif", Font.BOLD, 30);
        Font expressionFont = new Font("SansSerif", Font.BOLD, 15);

        actualWindow = new JFrame("Calculator");
        resultPanel = new JPanel();
        buttonPanel = new JPanel();
        infoPanel = new JPanel();

        actualWindow.setLayout(new GridLayout(3, 1));
        buttonPanel.setLayout(new GridLayout(4, 4));
        infoPanel.setLayout(new GridLayout(2, 1));
        actualWindow.setResizable(false);
        actualWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        appTitle = new JLabel("My Calculator", SwingConstants.CENTER);
        appTitle.setFont(titleFont);

        expression = new JLabel("Expression shown here", SwingConstants.CENTER);
        expression.setFont(expressionFont);

        siteTitle = new JLabel("www.btechsmartclass.com", SwingConstants.CENTER);
        siteTitle.setFont(expressionFont);
        siteTitle.setForeground(Color.BLUE);

        resultTxt = new JTextField(15);
        resultTxt.setBorder(null);
        resultTxt.setFont(txtFont);
        resultTxt.setHorizontalAlignment(SwingConstants.RIGHT);
        resultTxt.setEditable(false);

        for (int i = 0; i < 10; i++) {
            btn_digits[i] = new JButton(String.valueOf(i));
            btn_digits[i].addActionListener(this);
        }

        btn_plus = new JButton("+"); btn_plus.addActionListener(this);
        btn_minus = new JButton("-"); btn_minus.addActionListener(this);
        btn_mul = new JButton("*"); btn_mul.addActionListener(this);
        btn_div = new JButton("/"); btn_div.addActionListener(this);
        btn_dot = new JButton("."); btn_dot.addActionListener(this);
        btn_equal = new JButton("="); btn_equal.addActionListener(this);
        btn_clear = new JButton("Clear"); btn_clear.addActionListener(this);

        resultPanel.setLayout(new BorderLayout(5,5));
        resultPanel.add(appTitle, BorderLayout.NORTH);
        resultPanel.add(resultTxt, BorderLayout.CENTER);
        resultPanel.add(expression, BorderLayout.SOUTH);

        for (int i = 1; i <= 9; i++) buttonPanel.add(btn_digits[i]);
        buttonPanel.add(btn_digits[0]);
        buttonPanel.add(btn_dot);
        buttonPanel.add(btn_clear);
        buttonPanel.add(btn_plus);
        buttonPanel.add(btn_minus);
        buttonPanel.add(btn_mul);
        buttonPanel.add(btn_div);
        buttonPanel.add(btn_equal);

        infoPanel.add(siteTitle);

        actualWindow.add(resultPanel);
        actualWindow.add(buttonPanel);
        actualWindow.add(infoPanel);
        actualWindow.setSize(300, 500);
        actualWindow.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();

        if (cmd.matches("\\d") || cmd.equals(".")) {
            resultTxt.setText(resultTxt.getText() + cmd);
            return;
        }

        if (cmd.equals("Clear")) {
            resultTxt.setText("");
            expression.setText("Expression shown here");
            operator = "=";
            operand_1 = operand_2 = 0;
            return;
        }

        if (!cmd.equals("=")) {
            if (!resultTxt.getText().isEmpty()) {
                try {
                    operand_1 = Double.parseDouble(resultTxt.getText());
                } catch (NumberFormatException ex) {
                    operand_1 = 0;
                }
            }
            operator = cmd;
            expression.setText(operand_1 + " " + operator);
            resultTxt.setText("");
            return;
        }

        if (cmd.equals("=")) {
            if (resultTxt.getText().isEmpty()) return;
            try {
                operand_2 = Double.parseDouble(resultTxt.getText());
            } catch (NumberFormatException ex) {
                operand_2 = 0;
            }
            expression.setText(expression.getText() + " " + operand_2);
            double result = 0;
            try {
                switch (operator) {
                    case "+":
                        result = operand_1 + operand_2;
                        break;
                    case "-":
                        result = operand_1 - operand_2;
                        break;
                    case "*":
                        result = operand_1 * operand_2;
                        break;
                    case "/":
                        if (operand_2 == 0) throw new ArithmeticException();
                        result = operand_1 / operand_2;
                        break;
                    default:
                        result = operand_2;
                }
                if (result == (long) result) resultTxt.setText(String.valueOf((long) result));
                else resultTxt.setText(String.valueOf(result));
            } catch (ArithmeticException ae) {
                JOptionPane.showMessageDialog(actualWindow, "Divisor can not be ZERO");
                resultTxt.setText("");
            }
            operator = "=";
        }
    }
}

public class GridCalculator {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new BuildCalculator());
    }
}

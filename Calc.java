import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Calc extends JFrame implements ActionListener {
    JTextField t;
    double n1, n2;
    char op;
    Calc() {
        t = new JTextField();
        t.setEditable(false);
        add(t, BorderLayout.NORTH);
        JPanel p = new JPanel(new GridLayout(4, 4));
        String[] b = {"7","8","9","+","4","5","6","-",
                      "1","2","3","*","C","0","=","/"};
        for (String x : b) {
            JButton bt = new JButton(x);
            bt.addActionListener(this);
            p.add(bt);
        }
        add(p);
        setTitle("Calculator");
        setSize(300,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
        String s = e.getActionCommand();
        if (s.matches("[0-9]"))
            t.setText(t.getText() + s);

        else if (s.matches("[+\\-*/]")) {
            n1 = Double.parseDouble(t.getText());
            op = s.charAt(0);
            t.setText("");
        }
        else if (s.equals("=")) {
            n2 = Double.parseDouble(t.getText());
            switch(op) {
                case '+': n1 += n2; break;
                case '-': n1 -= n2; break;
                case '*': n1 *= n2; break;
                case '/': n1 /= n2;
            }
            t.setText("" + n1);
        }
        else
            t.setText("");
    }
    public static void main(String[] args) {
        new Calc();
    }
}
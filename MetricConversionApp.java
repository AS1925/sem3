import javax.swing.*;
import java.awt.*;

public class MetricConversionApp extends JFrame {
    JTextField cm = new JTextField(10);
    JTextField inch = new JTextField(10);

    MetricConversionApp() {
        setLayout(new FlowLayout());

        JButton b = new JButton("Convert");

        b.addActionListener(e -> {
            double x = Double.parseDouble(cm.getText());
            inch.setText("" + x / 2.54);
        });

        add(new JLabel("Centimeters:"));
        add(cm);
        add(new JLabel("Inches:"));
        add(inch);
        add(b);

        setTitle("Metric Conversion");
        setSize(300, 150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MetricConversionApp();
    }
}
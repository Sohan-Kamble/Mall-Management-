package shopping;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CustomerBilling extends JFrame {
    private JLabel productNameLabel, quantityLabel, priceLabel, totalLabel;
    private JTextField productNameField, quantityField, priceField, totalField;
    private JButton calculateButton, clearButton;

    public CustomerBilling() {
        super("Customer Billing");

        // Initialize components
        productNameLabel = new JLabel("Product Name:");
        productNameField = new JTextField(20);
        quantityLabel = new JLabel("Quantity:");
        quantityField = new JTextField(10);
        priceLabel = new JLabel("Price:");
        priceField = new JTextField(10);
        totalLabel = new JLabel("Total:");
        totalField = new JTextField(10);
        calculateButton = new JButton("Calculate");
        clearButton = new JButton("Clear");

        // Set layout
        JPanel panel = new JPanel(new GridLayout(4, 2, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        panel.add(productNameLabel);
        panel.add(productNameField);
        panel.add(quantityLabel);
        panel.add(quantityField);
        panel.add(priceLabel);
        panel.add(priceField);
        panel.add(totalLabel);
        panel.add(totalField);
        panel.add(calculateButton);
        panel.add(clearButton);
        add(panel);

        // Set default button
        getRootPane().setDefaultButton(calculateButton);

        // Add action listeners
        calculateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int quantity = Integer.parseInt(quantityField.getText());
                    double price = Double.parseDouble(priceField.getText());

                    double total = quantity * price;

                    totalField.setText(String.format("%.2f", total));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(CustomerBilling.this, "Please enter valid input.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        clearButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                productNameField.setText("");
                quantityField.setText("");
                priceField.setText("");
                totalField.setText("");
            }
        });

        // Set frame properties
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(400, 200);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new CustomerBilling();
    }
}

package shopping;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.text.SimpleDateFormat;

public class Add extends JFrame {

    private JLabel nameLabel, priceLabel, descriptionLabel, quantityLabel;
    private JTextField nameField, priceField, quantityField;
    private JTextArea descriptionArea;
    private JButton addButton, cancelButton;

    public Add() {
        super("Add Product");

        // Initialize components
        nameLabel = new JLabel("Name:");
        nameField = new JTextField();
        priceLabel = new JLabel("Price:");
        priceField = new JTextField();
        descriptionLabel = new JLabel("Description:");
        descriptionArea = new JTextArea(5, 20);
        quantityLabel = new JLabel("Quantity:");
        quantityField = new JTextField();
        addButton = new JButton("Add");
        cancelButton = new JButton("Cancel");

        // Set layout
        setLayout(new BorderLayout());

        // Create a JPanel for the content and set its background
        JPanel contentPanel = new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                super.paintComponent(g);
                ImageIcon image = new ImageIcon("mall-management-system-main/mall-management-system-main/ShopingMall/src/shopping/Images/first-winner.png");
                Image i2 = image.getImage().getScaledInstance(400, 400, Image.SCALE_DEFAULT);
                ImageIcon i3 = new ImageIcon(i2);
                g.drawImage(i3.getImage(), 0, 0, null);
            }
        };
        contentPanel.setLayout(new BorderLayout());

        // Create panels to hold the components
        JPanel formPanel = new JPanel(new GridLayout(4, 2));
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));

        // Add components to the form panel
        formPanel.add(nameLabel);
        formPanel.add(nameField);
        formPanel.add(priceLabel);
        formPanel.add(priceField);
        formPanel.add(descriptionLabel);
        formPanel.add(new JScrollPane(descriptionArea));
        formPanel.add(quantityLabel);
        formPanel.add(quantityField);

        // Add components to the button panel
        buttonPanel.add(addButton);
        buttonPanel.add(cancelButton);

        // Add the panels to the content panel
        contentPanel.add(formPanel, BorderLayout.CENTER);
        contentPanel.add(buttonPanel, BorderLayout.SOUTH);

        // Add the content panel to the JFrame
        add(contentPanel);

        // Set default button
        getRootPane().setDefaultButton(addButton);

        // Add action listeners
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                double price = Double.parseDouble(priceField.getText());
                String description = descriptionArea.getText();
                int quantity = Integer.parseInt(quantityField.getText());

                // Add product to database or perform any other action

                JOptionPane.showMessageDialog(Add.this, "Product added successfully.");
                dispose();
            }
        });

        cancelButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });

        // Set frame properties
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Add();
    }
}

package shopping;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Update1 extends JFrame {
    
    private JLabel nameLabel, manufacturerLabel, productLabel, descriptionLabel, quantityLabel;
    private JTextField nameField, manufacturerField, quantityField;
    private JTextArea descriptionArea;
    private JComboBox<String> productComboBox;
    private JButton updateButton, cancelButton;
    
    public Update1() {
        super("Update Product");
        
        // Initialize components
        nameLabel = new JLabel("Name:");
        nameField = new JTextField();
        manufacturerLabel = new JLabel("Manufacturer:");
        manufacturerField = new JTextField();
        productLabel = new JLabel("Product:");
        productComboBox = new JComboBox<String>();
        descriptionLabel = new JLabel("Description:");
        descriptionArea = new JTextArea(5, 20);
        quantityLabel = new JLabel("Quantity:");
        quantityField = new JTextField();
        updateButton = new JButton("Update");
        cancelButton = new JButton("Cancel");
        
        // Set layout
        setLayout(new GridLayout(6, 2));
        
        // Add components to frame
        add(productLabel);
        add(productComboBox);
        add(nameLabel);
        add(nameField);
        add(manufacturerLabel);
        add(manufacturerField);
        add(descriptionLabel);
        add(new JScrollPane(descriptionArea));
        add(quantityLabel);
        add(quantityField);
        add(updateButton);
        add(cancelButton);
        
        // Set default button
        getRootPane().setDefaultButton(updateButton);
        
        // Add action listeners
        updateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String selectedProduct = (String) productComboBox.getSelectedItem();
                String name = nameField.getText();
                String manufacturer = manufacturerField.getText();
                String description = descriptionArea.getText();
                int quantity = Integer.parseInt(quantityField.getText());
                
                // Update product in database or perform any other action
                
                JOptionPane.showMessageDialog(Update1.this, "Product updated successfully.");
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
        setSize(400, 350);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new Update1();
    }
}

package shopping;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class DeleteProduct extends JFrame {
    
    private JLabel nameLabel, manufacturerLabel, selectLabel, descriptionLabel, quantityLabel;
    private JTextField nameField, manufacturerField, quantityField;
    private JTextArea descriptionArea;
    private JComboBox<String> selectComboBox;
    private JButton deleteButton, cancelButton;
    
    public DeleteProduct() {
        super("Delete Product");
        
        // Initialize components
        nameLabel = new JLabel("Product Name:");
        nameField = new JTextField();
        manufacturerLabel = new JLabel("Manufacturer:");
        manufacturerField = new JTextField();
        selectLabel = new JLabel("Select Product:");
        selectComboBox = new JComboBox<String>();
        descriptionLabel = new JLabel("Product Description:");
        descriptionArea = new JTextArea(5, 20);
        quantityLabel = new JLabel("Quantity:");
        quantityField = new JTextField();
        deleteButton = new JButton("Delete");
        cancelButton = new JButton("Cancel");
        
        // Set layout
        setLayout(new GridLayout(6, 2));
        
        // Add components to frame
        add(nameLabel);
        add(nameField);
        add(manufacturerLabel);
        add(manufacturerField);
        add(selectLabel);
        add(selectComboBox);
        add(descriptionLabel);
        add(new JScrollPane(descriptionArea));
        add(quantityLabel);
        add(quantityField);
        add(deleteButton);
        add(cancelButton);
        
        // Set default button
        getRootPane().setDefaultButton(deleteButton);
        
        // Add action listeners
        deleteButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String manufacturer = manufacturerField.getText();
                String selectedProduct = selectComboBox.getSelectedItem().toString();
                String description = descriptionArea.getText();
                int quantity = Integer.parseInt(quantityField.getText());
                
                // Delete product from database or perform any other action
                
                JOptionPane.showMessageDialog(DeleteProduct.this, "Product deleted successfully.");
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
        new DeleteProduct();
    }
}

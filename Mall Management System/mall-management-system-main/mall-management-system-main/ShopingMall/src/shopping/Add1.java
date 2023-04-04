package shopping;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.text.SimpleDateFormat;

public class Add1 extends JFrame {
    
    private JLabel nameLabel, priceLabel, descriptionLabel, quantityLabel;
    private JTextField nameField, priceField, quantityField;
    private JTextArea descriptionArea;
    private JButton addButton, cancelButton;

    
    
    public Add1() {

        super("Add Product");
    
        
        // Initialize components
        nameLabel = new JLabel("Name:");
        //nameLabel.getFont("SimpleDateFormat");
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
        
        
        
        // Add components to frame
        add(nameLabel);
        add(nameField);
        add(priceLabel);
        add(priceField);
        add(descriptionLabel);
        add(new JScrollPane(descriptionArea));
        add(quantityLabel);
        add(quantityField);
        add(addButton);
        add(cancelButton);

        ImageIcon image = new ImageIcon("mall-management-system-main/mall-management-system-main/ShopingMall/src/shopping/Images/img2.jpg");
        Image i2 = image.getImage().getScaledInstance(400, 400, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel background = new JLabel(i3);
        background.setBounds(0, 0, i3.getIconWidth(), i3.getIconHeight());
        setContentPane(background);
        
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
                
                JOptionPane.showMessageDialog(Add1.this, "Product added successfully.");
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
        new Add1();
    }
}

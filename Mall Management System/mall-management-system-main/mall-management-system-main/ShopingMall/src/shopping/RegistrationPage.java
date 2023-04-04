package shopping;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RegistrationPage extends JFrame implements ActionListener {
    JLabel title, nameLabel, emailLabel, passwordLabel, confirmPasswordLabel;
    JTextField nameText, emailText;
    JPasswordField passwordText, confirmPasswordText;
    JButton registerButton, resetButton;

    RegistrationPage() {
        setTitle("Bus Booking System - Registration");
        setSize(600, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        title = new JLabel("Registration Form");
        title.setFont(new Font("Arial", Font.BOLD, 24));
        title.setBounds(200, 20, 250, 30);

        nameLabel = new JLabel("Name:");
        nameLabel.setFont(new Font("Arial", Font.PLAIN, 18));
        nameLabel.setBounds(100, 80, 150, 25);

        nameText = new JTextField();
        nameText.setBounds(250, 80, 200, 25);

        emailLabel = new JLabel("Email:");
        emailLabel.setFont(new Font("Arial", Font.PLAIN, 18));
        emailLabel.setBounds(100, 120, 150, 25);

        emailText = new JTextField();
        emailText.setBounds(250, 120, 200, 25);

        passwordLabel = new JLabel("Password:");
        passwordLabel.setFont(new Font("Arial", Font.PLAIN, 18));
        passwordLabel.setBounds(100, 160, 150, 25);

        passwordText = new JPasswordField();
        passwordText.setBounds(250, 160, 200, 25);

        confirmPasswordLabel = new JLabel("Confirm Password:");
        confirmPasswordLabel.setFont(new Font("Arial", Font.PLAIN, 18));
        confirmPasswordLabel.setBounds(100, 200, 200, 25);

        confirmPasswordText = new JPasswordField();
        confirmPasswordText.setBounds(250, 200, 200, 25);

        registerButton = new JButton("Register");
        registerButton.setBounds(150, 250, 100, 30);
        registerButton.addActionListener(this);

        resetButton = new JButton("Reset");
        resetButton.setBounds(300, 250, 100, 30);
        resetButton.addActionListener(this);

        add(title);
        add(nameLabel);
        add(nameText);
        add(emailLabel);
        add(emailText);
        add(passwordLabel);
        add(passwordText);
        add(confirmPasswordLabel);
        add(confirmPasswordText);
        add(registerButton);
        add(resetButton);

        setLayout(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == registerButton) {
            String name = nameText.getText();
            String email = emailText.getText();
            String password = String.valueOf(passwordText.getPassword());
            String confirmPassword = String.valueOf(confirmPasswordText.getPassword());

            if (name.isEmpty() || email.isEmpty() || password.isEmpty() || confirmPassword.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please fill all the fields!");
            } else if (!password.equals(confirmPassword)) {
                JOptionPane.showMessageDialog(this, "Passwords do not match!");
            } else {
                // Code to register the user in the database
                JOptionPane.showMessageDialog(this, "Registration successful!");
                dispose();
            }
        } else if (e.getSource() == resetButton) {
            nameText.setText("");
            emailText.setText("");
            passwordText.setText("");
            confirmPasswordText.setText("");
        }
    }

    public static void main(String[] args) {
        new RegistrationPage();
    }
}


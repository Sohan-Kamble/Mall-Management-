package shopping;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login1 extends JFrame {
    private JLabel userLabel, passwordLabel, messageLabel;
    private JTextField userField;
    private JPasswordField passwordField;
    private JButton loginButton;

    public Login1() {
        setTitle("Login");
        setSize(300, 200);
        setLayout(new GridLayout(4, 2));

        userLabel = new JLabel("Username:");
        userField = new JTextField(10);
        passwordLabel = new JLabel("Password:");
        passwordField = new JPasswordField(10);
        loginButton = new JButton("Login");

        messageLabel = new JLabel("");
        messageLabel.setForeground(Color.red);

        add(userLabel);
        add(userField);
        add(passwordLabel);
        add(passwordField);
        add(new JLabel(""));
        add(loginButton);
        add(messageLabel);

        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String username = userField.getText();
                String password = new String(passwordField.getPassword());

                if (username.equals("admin") && password.equals("password")) {
                    messageLabel.setText("Login successful!");
                    messageLabel.setForeground(Color.green);
                } else {
                    messageLabel.setText("Invalid username or password.");
                    messageLabel.setForeground(Color.red);
                }
            }
        });
    }

    public static void main(String[] args) {
        Login1 loginGUI = new Login1();
        loginGUI.setVisible(true);
        loginGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

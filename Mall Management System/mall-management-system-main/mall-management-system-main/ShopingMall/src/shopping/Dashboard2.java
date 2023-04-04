package shopping;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Dashboard2 extends JFrame {

        public static void main(String[] args) {
                new Dashboard2();
        }

    public Dashboard2() {
        super("MALL MANAGEMENT SYSTEM" + "          ");

        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);

        // Create a JLabel for the background image
        // ImageIcon imageIcon = new ImageIcon("mall-management-system-main/mall-management-system-main/ShopingMall/src/shopping/Images/img4.jpg");
        // JLabel imageLabel = new JLabel(imageIcon);
        // add(imageLabel, BorderLayout.CENTER);


        JPanel imagePanel = new JPanel(new BorderLayout());
        ImageIcon image = new ImageIcon("mall-management-system-main/mall-management-system-main/ShopingMall/src/shopping/Images/img1.jpg");
        Image i2 = image.getImage().getScaledInstance(800,500,Image.SCALE_DEFAULT);
        ImageIcon i3 =  new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(350,1,450,350);
        add(l3);

        // Create a JMenuBar for menus
        JMenuBar menuBar = new JMenuBar();

        // Create a JMenu for shopping categories
        JMenu categoriesMenu = new JMenu("Action");
        //JMenuItem addProductMenuItem = new JMenuItem("Add Product");
        // categoriesMenu.add(addProductMenuItem);
        menuBar.add(categoriesMenu);

        // Add action listener for Add Product menu item
        JMenuItem FlightDetailshello2 = new JMenuItem("Add Product");
        categoriesMenu.add(FlightDetailshello2);

        FlightDetailshello2.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent ae) {
                        try {
                                new Add1().setVisible(true);
                                
                        } catch (Exception e) {
                        }
                }
                
        });

        // JButton closeButton = new JButton("X");
        // closeButton.setForeground(Color.WHITE);
        // closeButton.setBackground(Color.RED);
        // closeButton.setFont(new Font("Tahoma", Font.BOLD, 14));
        // closeButton.setFocusPainted(false);
        // closeButton.addActionListener(new ActionListener() {
        //     public void actionPerformed(ActionEvent ae) {
        //         dispose();
        //     }
        // });

        JMenuItem FlightDetailshello3 = new JMenuItem("Delete Product");
        categoriesMenu.add(FlightDetailshello3);

        FlightDetailshello3.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent ae) {
                        try {
                                new DeleteProduct().setVisible(true);
                        } catch (Exception e) {
                        }
                }
        });

        JMenuItem FlightDetailshello4 = new JMenuItem("Update Product");
        categoriesMenu.add(FlightDetailshello4);

        FlightDetailshello4.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent ae) {
                        try {
                                new Update1().setVisible(true);
                        } catch (Exception e) {
                        }
                }
        });

        JMenuItem FlightDetailshello5 = new JMenuItem("Customer Billing");
        categoriesMenu.add(FlightDetailshello5);

        FlightDetailshello5.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent ae) {
                        try {
                                new CustomerBilling().setVisible(true);
                        } catch (Exception e) {
                        }
                }
        });

        // Create a JMenu for user account
        JMenu accountMenu = new JMenu("Account");
        accountMenu.add(new JMenuItem("Login"));
        accountMenu.add(new JMenuItem("Register"));
        menuBar.add(accountMenu);

        JMenuItem FlightDetailshello568 = new JMenuItem("Login");
        accountMenu.add(FlightDetailshello568);

        FlightDetailshello568.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent ae) {
                        try {
                                new Login1().setVisible(true);
                        } catch (Exception e) {
                        }
                }
        });

        JMenuItem FlightDetailshello58 = new JMenuItem("Register");
        accountMenu.add(FlightDetailshello58);

        FlightDetailshello58.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent ae) {
                        try {
                                new RegistrationPage().setVisible(true);
                        } catch (Exception e) {
                        }
                }
        });

        // Add the JMenuBar to the JFrame
        setJMenuBar(menuBar);

        // Show the JFrame
        setVisible(true);
    }
}

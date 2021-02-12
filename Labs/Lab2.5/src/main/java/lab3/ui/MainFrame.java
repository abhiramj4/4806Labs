package lab3.ui;

import lab3.service.AddressBook;
import lab3.service.BuddyInfo;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class MainFrame extends JFrame {
    private ActionListener actionListener;
    private JButton addBuddy;
    private JTextField buddyNameText;
    private JTextField buddyPhoneText;
    private JTextField buddyAddressText;
    private JTable buddies;

    public void init() {
        JPanel panel = new JPanel();

        JLabel nameLbl = new JLabel("Name");
        nameLbl.setBounds(10, 20, 80, 25);
        buddyNameText = new JTextField(40);
        buddyNameText.setBounds(100, 20, 165, 25);

        JLabel addressLbl = new JLabel("Address");
        addressLbl.setBounds(10, 50, 80, 25);
        buddyAddressText = new JTextField(40);
        buddyAddressText.setBounds(100, 50, 165, 25);

        JLabel phoneLbl = new JLabel("Phone #");
        phoneLbl.setBounds(10, 80, 80, 25);
        buddyPhoneText = new JTextField(10);
        buddyPhoneText.setBounds(100, 80, 165, 25);

        addBuddy = new JButton("Add Buddy");
        addBuddy.setBounds(90, 150, 100, 30);
        add(nameLbl);
        add(buddyNameText);
        add(phoneLbl);
        add(buddyPhoneText);
        add(addressLbl);
        add(buddyAddressText);
        add(addBuddy, BorderLayout.CENTER);

        DefaultTableModel tableModel = new DefaultTableModel();
        tableModel.addColumn("Name");
        tableModel.addColumn("Address");
        tableModel.addColumn("Phone #");
        buddies = new JTable(tableModel);

        JScrollPane scrollPane = new JScrollPane(buddies);
        panel.add(scrollPane);
        panel.setBorder(BorderFactory.createEmptyBorder(30,30, 10, 30));
        panel.setBounds(10, 600, 290, 70);
        this.setMinimumSize(new Dimension(1200,400));

        addBuddy.addActionListener(actionListener);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(panel, BorderLayout.CENTER);
        setTitle("Address Book");
        pack();
        setVisible(true);
        //setSize(600, 1000);
    }

    public String getFullName() {
        return buddyNameText.getText();
    }


    public String getPhone() {
        return buddyPhoneText.getText();
    }

    public String getAddress() {
        return buddyAddressText.getText();
    }

    public void clearForm() {
        buddyNameText.setText("");
        buddyPhoneText.setText("");
        buddyAddressText.setText("");
    }

    public void setActionListener(ActionListener actionListener) {
        this.actionListener = actionListener;
    }

    public void display(AddressBook addressBook) {
        DefaultTableModel tableModel = (DefaultTableModel) buddies.getModel();
        tableModel.setRowCount(0);

        for(BuddyInfo b: addressBook.getAddresses()) {
            tableModel.addRow(new Object[]{b.getName(), b.getAddress(), b.getNumber()});
        }
    }
}

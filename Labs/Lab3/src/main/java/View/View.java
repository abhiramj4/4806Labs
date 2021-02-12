package View;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Model.BuddyInfo;
import Model.AddressBook;

public class View {
    private JButton buddySubmitButton;
    private JPanel panel1;
    private JTextField buddyNameField;
    private JTextField buddyAddressField;
    private JTextField buddyNumberField;
    private JLabel buddyNameLabel;
    private JLabel buddyAddressLabel;
    private JLabel buddyNumberLabel;
    private JTable buddyTable;
    private JButton buddyViewButton;

    public View() {

    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }

    public JTextField getBuddyNameField(){
        return  buddyNameField;
    }

    public JTextField getBuddyAddressField(){
        return  buddyAddressField;
    }

    public JTextField getBuddyNumberField(){
        return  buddyNumberField;
    }

    public JButton getBuddySubmitButton(){
        return buddySubmitButton;
    }

    public JButton getBuddyViewButton(){
        return buddyViewButton;
    }

    public JTable getBuddyTable(){
        return buddyTable;
    }
}

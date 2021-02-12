package lab3.service;

import lab3.Launcher;
import lab3.ui.MainFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Controller implements ActionListener {
    private MainFrame view;
    private AddressBook addressBook;

    public static void main(String[] args) {
        Launcher launcher = new Launcher();
        launcher.launch();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        BuddyInfo buddyInfo;
        try {
            buddyInfo = new BuddyInfo(view.getFullName(), view.getAddress(), view.getPhone());
            addressBook.addBuddy(buddyInfo);
            view.clearForm();
            view.display(addressBook);
        } catch (Exception ex) {
            System.out.println("Error");
        }
    }

    public void setView(MainFrame view) {
        this.view = view;
    }

    public void setAddressBook(AddressBook addressBook) {
        this.addressBook = addressBook;
    }
}

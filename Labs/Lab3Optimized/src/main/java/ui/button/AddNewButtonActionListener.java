package ui.button;

import models.BuddyInfo;

import java.awt.event.ActionEvent;


public class AddNewButtonActionListener extends ListTableActionListener {
    public void actionPerformed(ActionEvent e) {
        BuddyInfo defaultBuddy = new BuddyInfo("Abhi", "1234 Street", "2049308074");
        addressBook.addBuddy(defaultBuddy);
        table.revalidate();
    }
}
package ui.button;

import models.BuddyInfo;

import java.awt.event.ActionEvent;


public class DeleteButtonActionListener extends ListTableActionListener {

    public void actionPerformed(ActionEvent e) {
        int selectedRow = table.getSelectedRow();

        if (selectedRow == -1) {
            // if there is no selected row, don't do anything
            return;
        }

        if (table.isEditing()) {
            // if we are editing the table, don't do anything
            return;
        }

        BuddyInfo buddyToDelete = new BuddyInfo((table.getValueAt(selectedRow,0).toString()),
                table.getValueAt(selectedRow,1).toString(),
                table.getValueAt(selectedRow,2).toString());

        addressBook.removeBuddy(buddyToDelete);
        table.revalidate();
    }
}
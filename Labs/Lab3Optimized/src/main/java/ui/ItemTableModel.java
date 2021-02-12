package ui;

import models.AddressBook;
import models.BuddyInfo;

import java.util.List;
import javax.swing.table.AbstractTableModel;


public class ItemTableModel extends AbstractTableModel {
    AddressBook addressBook;

    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return true;
    }

    public void setaddressBook(AddressBook addressBook){
        this.addressBook = addressBook;
    }

    public int getColumnCount() {
        return 3;
    }

    public String getColumnName(int column) {
        if (column == 0){
            return "Name";
        } else if (column == 1){
            return "Address";
        } else if (column == 2){
            return "Number";
        } else {
            return "error";
        }
    }

    public int getRowCount() {
        return addressBook.size();
    }

    public void setValueAt(BuddyInfo buddy, int rowIndex, int columnIndex) {
        addressBook.getAddressBook().add(rowIndex, buddy);
    }

    public Object getValueAt(int rowIndex, int columnIndex) {

        if (columnIndex == 0){
            return addressBook.getAddressBook().get(rowIndex).getName();
        } else if (columnIndex == 1){
            return addressBook.getAddressBook().get(rowIndex).getAddress();
        } else if (columnIndex == 2){
            return addressBook.getAddressBook().get(rowIndex).getNumber();
        } else {
            return "error";
        }


    }
}
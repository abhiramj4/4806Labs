package models;

import java.util.ArrayList;
import java.util.List;

public class AddressBook {

    private List<BuddyInfo> addressBook;

    public AddressBook() {

        this.addressBook = new ArrayList<BuddyInfo>();
    }

    public AddressBook(BuddyInfo buddy){
        this.addressBook = new ArrayList<BuddyInfo>();
        this.addressBook.add(buddy);

    }

    /**
     * Add a buddy to the addressbook
     * @param buddy to add
     */
    public void addBuddy(BuddyInfo buddy) {

        if(buddy != null) {
            addressBook.add(buddy);
        }
    }

    public int size() {
        return this.addressBook.size();
    }

    public void clear() {
        this.addressBook.clear();
    }

    public List<BuddyInfo> getAddressBook(){

        return this.addressBook;
    }

    public void setAddressBook(List<BuddyInfo> addressBook){
        this.addressBook = addressBook;
    }


    /**
     * Remove buddy from addresses
     */
    public void removeBuddy() {
        addressBook.remove(addressBook.size()-1);
    }

    public BuddyInfo removeBuddy(int index) {
        if (index >= 0 && index < this.addressBook.size()) {
            return this.addressBook.remove(index);
        } else {
            return null;
        }
    }

    public void removeBuddy(BuddyInfo buddy) {

        addressBook.remove(buddy);
    }

    public String toString(){
        String returnString = "";

        for(int i = 0; i < this.getAddressBook().size(); i++){

            returnString += this.getAddressBook().get(i).toString();
        }


        return returnString;
    }

}

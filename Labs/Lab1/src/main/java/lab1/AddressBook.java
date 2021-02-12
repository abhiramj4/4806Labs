package lab1;

import java.util.ArrayList;

public class AddressBook {

    private ArrayList<BuddyInfo> addresses;

    public AddressBook() {
        this.addresses = new ArrayList<BuddyInfo>();
    }

    /**
     * Add a buddy to the addressbook
     * @param buddy to add
     */
    public void addBuddy(BuddyInfo buddy) {

        if(buddy != null) {
            addresses.add(buddy);
        }
    }

    public int size() {
        return this.addresses.size();
    }

    public void clear() {
        this.addresses.clear();
    }

    public ArrayList<BuddyInfo> getAddresses(){

        return this.addresses;
    }


    /**
     * Remove buddy from addresses
     */
    public void removeBuddy() {
        addresses.remove(addresses.size()-1);
    }

    public BuddyInfo removeBuddy(int index) {
        if (index >= 0 && index < this.addresses.size()) {
            return this.addresses.remove(index);
        } else {
            return null;
        }
    }

    public void removeBuddy(BuddyInfo buddy) {

        addresses.remove(buddy);
    }

    public String toString(){
        String returnString = "";

        for(int i = 0; i < this.getAddresses().size(); i++){

            returnString += this.getAddresses().get(i).toString();
        }


        return returnString;
    }

}

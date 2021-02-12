package models;

public class BuddyInfo {

    private  String name;
    private  String address;
    private  String number; //student number

    public BuddyInfo(){}

    /**
     * Create a buddy based on nam
     * @param firstName name
     * @param address address of buddy
     * @param number student number
     */
    public BuddyInfo(String firstName, String address, String number) {

        setName(firstName);
        setAddress(address);
        setNumber(number);

    }

    /**
     * Create a buddy based on another buddy
     * @param buddy existing buddy
     */
    public BuddyInfo(BuddyInfo buddy) {

        setName(buddy.getName());
        setAddress(buddy.getAddress());
        setNumber(buddy.getNumber());

    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getAddress() {
        return address;
    }


    public void setAddress(String address) {
        this.address = address;
    }


    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    /**
     * String version of this
     * @return string of buddy
     */
    public String toString(){

        String returnString = this.getName() + ", " + this.getAddress() + ", " + this.getNumber() + ". \n";

        return returnString;
    }

}

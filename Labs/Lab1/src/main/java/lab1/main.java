package lab1;

public class main {

    public static void main(String[] args){

        AddressBook book = new AddressBook();

        BuddyInfo abhi = new BuddyInfo("Abhi","174 Clarence St", "101055288");

        BuddyInfo julia = new BuddyInfo("Julia","7362 Salisbury", "101055768");

        BuddyInfo sam = new BuddyInfo("Sam","2229 Montgomery", "101055198");

        book.addBuddy(abhi);
        book.addBuddy(julia);
        book.addBuddy(sam);

        System.out.println("The buddies are: \n" + book.toString());

    }
}

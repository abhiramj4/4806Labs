package lab1;

import lab1.AddressBook;
import lab1.BuddyInfo;
import org.junit.Test;

import static org.junit.Assert.*;

public class AddressBookTest {


    @Test
    public void createAddressBook(){
        AddressBook testBook = new AddressBook();

        assertEquals(testBook.size(), 0);

    }

    @Test
    public void fillAddressBook(){
        AddressBook testBook = new AddressBook();

        BuddyInfo testBuddy = new BuddyInfo("Abhi","174 Clarence St", "101055288");

        testBook.addBuddy(testBuddy);

        assertEquals(testBook.size(), 1);
        assertEquals(testBook.getAddresses().get(0), testBuddy);

    }

    @Test
    public void emptyAddressBook(){
        AddressBook testBook = new AddressBook();

        BuddyInfo testBuddy = new BuddyInfo("Abhi","174 Clarence St", "101055288");

        testBook.addBuddy(testBuddy);

        testBook.removeBuddy(testBuddy);

        assertEquals(testBook.size(), 0);

    }
}
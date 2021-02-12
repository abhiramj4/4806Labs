package lab1;

import lab1.AddressBook;
import lab1.BuddyInfo;
import org.junit.Test;

import static org.junit.Assert.*;

public class BuddyInfoTest {

    @Test
    public void createBuddyInfo(){
        BuddyInfo testBuddy = new BuddyInfo("Abhi","174 Clarence St", "101055288");

        assertNotNull(testBuddy);

    }

    @Test
    public void getBuddyInfoinfo(){
        BuddyInfo testBuddy = new BuddyInfo("Abhi","174 Clarence St", "101055288");

        assertEquals(testBuddy.getName(),"Abhi");
        assertEquals(testBuddy.getAddress(), "174 Clarence St");
        assertEquals(testBuddy.getNumber(), "101055288");

    }

    @Test
    public void setBuddyInfoinfo(){
        BuddyInfo testBuddy = new BuddyInfo("Abhi","174 Clarence St", "101055288");

        testBuddy.setName("Julia");
        testBuddy.setAddress("222 Lee St");
        testBuddy.setNumber("101055289");

        assertEquals(testBuddy.getName(),"Julia");
        assertEquals(testBuddy.getAddress(), "222 Lee St");
        assertEquals(testBuddy.getNumber(), "101055289");

    }
}
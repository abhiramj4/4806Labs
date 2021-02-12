package lab2;

import javax.persistence.*;
import java.util.List;

public class AddressbookTest {

    public void performJPA(){

        AddressBook addressBook = new AddressBook();
        addressBook.setId(3);

        BuddyInfo buddy = new BuddyInfo();
        buddy.setName("Abhi");
        buddy.setId(1);
        buddy.setNumber("101055288");
        buddy.setAddress("174 Clarence");

        BuddyInfo buddy1 = new BuddyInfo();
        buddy1.setName("Julia");
        buddy1.setId(2);
        buddy1.setNumber("1201055288");
        buddy1.setAddress("174 House");

        addressBook.addBuddy(buddy);
        addressBook.addBuddy(buddy1);

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("addressbook-test");

        EntityManager em = emf.createEntityManager();

        //new transaction
        EntityTransaction tx = em.getTransaction();

        tx.begin();

        em.persist(addressBook);


        tx.commit();

        Query q = em.createQuery("SELECT b FROM BuddyInfo b");
        Query q1 = em.createQuery("SELECT a FROM AddressBook a");

        @SuppressWarnings("unchecked")
        List<BuddyInfo> results = q.getResultList();

        System.out.println("List of buddies\n:");

        for (BuddyInfo b: results){
            System.out.println("Buddy is " + b.getName());
        }

        @SuppressWarnings("unchecked")
        List<AddressBook> results1 = q1.getResultList();

        System.out.println("addressbooks: \n");

        for (AddressBook a: results1){
            for (int i = 0; i < a.size(); i++){
                System.out.println("Buddy name is: " + a.getBuddy(i).getName() + "\n");
                System.out.println("Buddy address is: " + a.getBuddy(i).getAddress() + "\n");
                System.out.println("Buddy number is: " + a.getBuddy(i).getNumber() + "\n");
            }
        }

        em.close();
        emf.close();

    }


}

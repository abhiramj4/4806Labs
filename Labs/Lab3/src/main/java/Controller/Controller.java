package Controller;

import Model.AddressBook;
import Model.BuddyInfo;
import View.View;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller  {

    private View view;
    private AddressBook addressBook;

    public Controller(AddressBook addressBook, View view){
        this.addressBook = addressBook;
        this.view = view;
    }

    public void initController(){
        view.getBuddySubmitButton().addActionListener(e -> addressBook.addBuddy(
                new BuddyInfo(
                        view.getBuddyNameField().getText(),
                        view.getBuddyAddressField().getText(),
                        view.getBuddyNumberField().getText()
                )));


    }

    private void saveBuddy(){

    }


    public static void main(String[] args) {

    }
}



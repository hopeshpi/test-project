package com.example.tests;

import java.util.Collections;
import java.util.List;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class ContactCreationTests extends TestBase {
	
  @Test
    public void testNonEmptyContactCreation() throws Exception {
	  app.getNavigationHelper().openMainPage();
	  
	  // save old state
	  List<ContactData> oldList = app.getContactHelper().getContacts();
	  
	  // actions
      app.getContactHelper().initContactCreation();
      ContactData contact = new ContactData();
      contact.firstname = "first name";
      contact.lastname = "last name";
      contact.address = "address";
      contact.telhome = "tel home";
      contact.telmobile = "tel mobile";
      contact.telwork = "tel work";
      contact.email = "e-mail";
      contact.email2 = "e-mail2";
      contact.bday = "1";
      contact.bmonth = "January";
      contact.byear = "2000";
      contact.addresssec = "addres sec";
      contact.telsec = "tel sec";
	  app.getContactHelper().fillContactForm(contact);
      app.getContactHelper().submitContactCreation();
      app.getContactHelper().returnToHomePage();
      
      // save new state
	  List<ContactData> newList = app.getContactHelper().getContacts();

      // compare states
	  oldList.add(contact);
	  Collections.sort(oldList);
	  assertEquals(newList, oldList);
   }
  
  @Test
    public void testEmptyContactCreation() throws Exception {
	  app.getNavigationHelper().openMainPage();
	  
	  // save old state
	  List<ContactData> oldList = app.getContactHelper().getContacts();
	  
	  // actions
      ContactData contact = new ContactData("", "", "", "", "", "", "", "", "-", "-", "", "", "");
      app.getContactHelper().initContactCreation();
      app.getContactHelper().fillContactForm(contact);
      app.getContactHelper().submitContactCreation();
      app.getContactHelper().returnToHomePage();
      
      // save new state
	  List<ContactData> newList = app.getContactHelper().getContacts();

      // compare states
	  oldList.add(contact);
	  Collections.sort(oldList);
	  assertEquals(newList, oldList);   
   }  
  
}

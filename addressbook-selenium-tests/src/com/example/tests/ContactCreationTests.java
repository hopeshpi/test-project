package com.example.tests;

import org.testng.annotations.Test;

public class ContactCreationTests extends TestBase {
	
  @Test
    public void testNonEmptyContactCreation() throws Exception {
	  app.getNavigationHelper().openMainPage();
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
   }
  
  @Test
    public void testEmptyContactCreation() throws Exception {
	  app.getNavigationHelper().openMainPage();
      app.getContactHelper().initContactCreation();
      app.getContactHelper().fillContactForm(new ContactData("", "", "", "", "", "", "", "", "-", "-", "", "", ""));
      app.getContactHelper().submitContactCreation();
      app.getContactHelper().returnToHomePage();
    }  
}

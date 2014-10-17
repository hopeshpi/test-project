package com.example.tests;

import org.testng.annotations.Test;

public class ContactCreationTests extends TestBase {
	
  @Test
    public void testNonEmptyContactCreation() throws Exception {
	  openMainPage();
      initContactCreation();
      ContactData group = new ContactData();
      group.firstname = "first name";
      group.lastname = "last name";
      group.address = "address";
      group.telhome = "tel home";
      group.telmobile = "tel mobile";
      group.telwork = "tel work";
      group.email = "e-mail";
      group.email2 = "e-mail2";
      group.bday = "1";
      group.bmonth = "January";
      group.byear = "2000";
      group.addresssec = "addres sec";
      group.telsec = "tel sec";
	  fillContactForm(group);
      submitContactCreation();
      returnToHomePage();
   }
  
  @Test
    public void testEmptyContactCreation() throws Exception {
	  openMainPage();
      initContactCreation();
      fillContactForm(new ContactData("", "", "", "", "", "", "", "", "-", "-", "", "", ""));
      submitContactCreation();
      returnToHomePage();
    }  
}

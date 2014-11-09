package com.example.tests;

import static org.testng.Assert.assertEquals;

import java.util.Collections;
import java.util.List;

import org.testng.annotations.Test;

public class ContactModificationTest extends TestBase {
	
	@Test
	public void modifySomeContact() {
	   app.getNavigationHelper().openMainPage();
	   
	   // save old state
	   List<ContactData> oldList = app.getContactHelper().getContacts();
	   
	   //actions
	   app.getContactHelper().initContactModification(0);
	   ContactData contact = new ContactData();
	   contact.firstname = "new firstname";
	   contact.lastname = "new lastname";
	   app.getContactHelper().fillContactForm(contact);
	   app.getContactHelper().submitContactModification();
	   app.getContactHelper().returnToHomePage();
	   
	   // save new state
	   List<ContactData> newList = app.getContactHelper().getContacts();

	   // compare states
	   oldList.remove(0);
	   oldList.add(contact);
	   Collections.sort(oldList);
	   assertEquals(newList, oldList);   
	}

}

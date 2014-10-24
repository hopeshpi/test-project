package com.example.fw;

import org.openqa.selenium.By;

import com.example.tests.ContactData;

public class ContactHelper extends HelperBase{

	public ContactHelper(ApplicationManager manager) {
		super(manager);
	}

	public void initContactCreation() {
	  click(By.linkText("add new"));
	}

	public void fillContactForm(ContactData contact) {
	  type(By.name("firstname"), contact.firstname);
	  type(By.name("lastname"), contact.lastname);
	  type(By.name("address"), contact.address);
	  type(By.name("home"), contact.telhome);
	  type(By.name("mobile"), contact.telmobile);
	  type(By.name("work"), contact.telwork);
	  type(By.name("email"), contact.email);
	  type(By.name("email2"), contact.email2);
	  selectByText(By.name("bday"), contact.bday);
	  selectByText(By.name("bmonth"), contact.bmonth);
	  type(By.name("byear"), contact.byear);
	 // selectByText(By.name("new_group"), "group 1");
	  type(By.name("address2"), contact.addresssec);
	  type(By.name("phone2"), contact.telsec);

	}

	public void submitContactCreation() {
		click(By.name("submit"));
	}

	public void returnToHomePage() {
		click(By.linkText("home page"));
	}

}

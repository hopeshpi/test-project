package com.example.fw;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.example.tests.ContactData;

public class ContactHelper extends HelperBase{

	public ContactHelper(ApplicationManager manager) {
		super(manager);
	}

	public ContactHelper initContactCreation() {
	  click(By.linkText("add new"));
	  return this;
	}

	public ContactHelper fillContactForm(ContactData contact) {
	  type(By.name("firstname"), contact.getFirstname());
	  type(By.name("lastname"), contact.getLastname());
	  type(By.name("address"), contact.getAddress());
	  type(By.name("home"), contact.getTelhome());
	  type(By.name("mobile"), contact.getTelmobile());
	  type(By.name("work"), contact.getTelwork());
	  type(By.name("email"), contact.getEmail());
	  type(By.name("email2"), contact.getEmail2());
	  selectByText(By.name("bday"), contact.getBday());
	  selectByText(By.name("bmonth"), contact.getBmonth());
	  type(By.name("byear"), contact.getByear());
	 // selectByText(By.name("new_group"), "group 1");
	  type(By.name("address2"), contact.getAddresssec());
	  type(By.name("phone2"), contact.getTelsec());
	  return this;
	}

	public ContactHelper submitContactCreation() {
		click(By.name("submit"));
		  return this;
	}

	public ContactHelper returnToHomePage() {
		click(By.linkText("home page"));
		  return this;
	}

	public ContactHelper deleteContact(int index) {
		editContactByIndex(index);
		click(By.cssSelector("input[value=Delete]"));
		  return this;
	}

	private void editContactByIndex(int index) {
		click(By.xpath("/html/body/div/div[4]/form[2]/table/tbody/tr[" + (index + 2) + "]/td[7]/a"));
	}

	public ContactHelper initContactModification(int index) {
		editContactByIndex(index);
		  return this;
	}

	public ContactHelper submitContactModification() {
		click(By.cssSelector("input[value=Update]"));	
		  return this;
	}
	
	public List<ContactData> getContacts() {
		List<ContactData> contacts = new ArrayList<ContactData>();
		List<WebElement> contactsFnameInTable = driver.findElements(By.xpath("/html/body/div/div[4]/form[2]/table/tbody/tr/td[3]"));
		List<WebElement> contactsLnameInTable = driver.findElements(By.xpath("/html/body/div/div[4]/form[2]/table/tbody/tr/td[2]"));
		for (int index = 0; index < contactsFnameInTable.size() - 1; index ++) {
			String firstname = contactsFnameInTable.get(index).getText();
			String lastname = contactsLnameInTable.get(index).getText();
			contacts.add(new ContactData().withFirstname(firstname).withLastname(lastname));			
		}	
		return contacts;
	}

}

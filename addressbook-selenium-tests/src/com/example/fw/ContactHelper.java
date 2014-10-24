package com.example.fw;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import com.example.tests.ContactData;

public class ContactHelper extends HelperBase{

	public ContactHelper(ApplicationManager manager) {
		super(manager);
	}

	public void initContactCreation() {
	  driver.findElement(By.linkText("add new")).click();
	}

	public void fillContactForm(ContactData group) {
	  driver.findElement(By.name("firstname")).clear();
	  driver.findElement(By.name("firstname")).sendKeys(group.firstname);
	  driver.findElement(By.name("lastname")).clear();
	  driver.findElement(By.name("lastname")).sendKeys(group.lastname);
	  driver.findElement(By.name("address")).clear();
	  driver.findElement(By.name("address")).sendKeys(group.address);
	  driver.findElement(By.name("home")).clear();
	  driver.findElement(By.name("home")).sendKeys(group.telhome);
	  driver.findElement(By.name("mobile")).clear();
	  driver.findElement(By.name("mobile")).sendKeys(group.telmobile);
	  driver.findElement(By.name("work")).clear();
	  driver.findElement(By.name("work")).sendKeys(group.telwork);
	  driver.findElement(By.name("email")).clear();
	  driver.findElement(By.name("email")).sendKeys(group.email);
	  driver.findElement(By.name("email2")).clear();
	  driver.findElement(By.name("email2")).sendKeys(group.email2);
	  new Select(driver.findElement(By.name("bday"))).selectByVisibleText(group.bday);
	  new Select(driver.findElement(By.name("bmonth"))).selectByVisibleText(group.bmonth);
	  driver.findElement(By.name("byear")).clear();
	  driver.findElement(By.name("byear")).sendKeys(group.byear);
	  driver.findElement(By.name("address2")).clear();
	  driver.findElement(By.name("address2")).sendKeys(group.addresssec);
	  driver.findElement(By.name("phone2")).clear();
	  driver.findElement(By.name("phone2")).sendKeys(group.telsec);
	}

	public void submitContactCreation() {
		driver.findElement(By.name("submit")).click();
	}

	public void returnToHomePage() {
		driver.findElement(By.linkText("home page")).click();
	}

}

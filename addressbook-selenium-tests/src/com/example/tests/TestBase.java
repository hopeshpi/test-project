package com.example.tests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import com.example.fw.ApplicationManager;

public class TestBase {
	
	protected static ApplicationManager app;

	@BeforeTest
	public void setUp() throws Exception {
		app = new ApplicationManager();
	  }
	
	@AfterTest
	public void tearDown() throws Exception {
		app.stop();
	  }
	
	@DataProvider
	public Iterator<Object[]> randomValidGroupGenerator() {
		List<Object[]> list = new ArrayList<Object[]>();
		for (int i = 0; i < 5; i++) {
			GroupData group = new GroupData()
				.withName(generateRandomString())
				.withHeader(generateRandomString())
				.withFooter(generateRandomString());
			list.add(new Object[]{group});
		}
		return list.iterator();
	}
		
	@DataProvider
	public Iterator<Object[]> randomValidContactGenerator() {
		List<Object[]> list = new ArrayList<Object[]>();
		for (int i = 0; i < 5; i++) {
			ContactData contact = new ContactData()
				.withFirstname(generateRandomString())
				.withLastname(generateRandomString())
				.withaAdress(generateRandomString())
				.withTelhome(generateRandomString())
				.withTelmobile(generateRandomString())
				.withTelwork(generateRandomString())
				.withEmail(generateRandomString())
				.withEmail2(generateRandomString())				
				.withBday(generateRandomStringBday())
				.withBmonth(generateRandomStringBmonth())
				.withByear(generateRandomStringByear())				
				.withAddresssec(generateRandomString())
				.withTelsec(generateRandomString());
			list.add(new Object[]{contact});
		}
		return list.iterator();
	}
	
	public String generateRandomString() {
		Random rnd = new Random();
		if (rnd.nextInt(3) == 0) {				
			return "";
		} else {
			return "test" + rnd.nextInt();
		}
	}
		
	public String generateRandomStringBday() {
		Random rnd = new Random();
		if (rnd.nextInt(3) == 0) {				
			return "-";
		} else {
			return Integer.toString(rnd.nextInt(31) + 1);
		}
	}
	
	public String generateRandomStringBmonth() {
		Random rnd = new Random();
		List<String> months = Arrays.asList("-", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December");
		return months.get(rnd.nextInt(months.size()));
	}
	
	public String generateRandomStringByear() {
		Random rnd = new Random();
		if (rnd.nextInt(3) == 0) {				
			return "";
		} else {
			return Integer.toString(rnd.nextInt(9000) + 1000);
		}
	}
	
}

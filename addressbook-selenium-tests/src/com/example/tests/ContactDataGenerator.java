package com.example.tests;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ContactDataGenerator {

	public static void main(String[] args) throws IOException {
	  if (args.length < 3) {
		System.out.println("Please specify parameters: <amount of test data> <file> <format>");
		return;
	}
		
	int amount = Integer.parseInt(args[0]);
	File file = new File(args[1]);
	String format = args[2];
	
	if (file.exists()) {
      System.out.println("File exist, please remote it manually: " + file);
	  return;	
	}
	
	List<ContactData> contacts = generateRandomContacts(amount);
	if ("csv".equals(format)) {
	  saveContactsToCsvFile(contacts, file);
	} else if ("xml".equals(format)) {
	  saveContactsToXmlFile(contacts, file);
	} else {
	  System.out.println("Unknown format " + format);
	  return;
	}
  }

	private static void saveContactsToXmlFile(List<ContactData> contacts,
			File file) {
		// TODO Auto-generated method stub
		
  }

	private static void saveContactsToCsvFile(List<ContactData> contacts,
			File file) throws IOException {
	  FileWriter writer = new FileWriter(file);
	  for (ContactData contact : contacts) {
		writer.write(contact.getFirstname() + "," + contact.getLastname() + "," + contact.getAddress() + "," + contact.getTelhome() + "," + contact.getTelmobile() + "," + contact.getTelwork() + "," + contact.getEmail() + "," + contact.getEmail2() + "," + contact.getBday() + "," + contact.getBmonth() + "," + contact.getByear() + "," + contact.getAddresssec() + "," + contact.getTelsec() + "\n");
	}
	  writer.close();
  }
	  
	public static List<ContactData> loadContactFromCsvFile(File file) {
	  return null;
  }


	public static List<ContactData> generateRandomContacts(int amount) {
	  List<ContactData> list = new ArrayList<ContactData>();
	  for (int i = 0; i < amount; i++) {
			ContactData contact = new ContactData()
				.withFirstname(generateRandomString())
				.withLastname(generateRandomString())
				.withAddress(generateRandomString())
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
			list.add(contact);
	}
	return list;
  }

	public static String generateRandomString() {
	  Random rnd = new Random();
	  if (rnd.nextInt(3) == 0) {				
	    return "";
	  } else {
	    return "test" + rnd.nextInt();
	  }
  }
	
	public static String generateRandomStringBday() {
		Random rnd = new Random();
		if (rnd.nextInt(3) == 0) {				
		return "-";
	  } else {
		return Integer.toString(rnd.nextInt(31) + 1);
	  }
	}
	
	public static String generateRandomStringBmonth() {
		Random rnd = new Random();
		List<String> months = Arrays.asList("-", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December");
		return months.get(rnd.nextInt(months.size()));
	}
	
	public static String generateRandomStringByear() {
		Random rnd = new Random();
		if (rnd.nextInt(3) == 0) {				
		return "";
	  } else {
		return Integer.toString(rnd.nextInt(9000) + 1000);
	  }
	}

}

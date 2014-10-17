package com.example.tests;

public class ContactData {
	public String firstname;
	public String lastname;
	public String address;
	public String telhome;
	public String telmobile;
	public String telwork;
	public String email;
	public String email2;
	public String bday;
	public String bmonth;
	public String byear;
	public String addresssec;
	public String telsec;

	public ContactData() {		
	}
	
	public ContactData(String firstname, String lastname, String address,
			String telhome, String telmobile, String telwork, String email,
			String email2, String bday, String bmonth, String byear,
			String addresssec, String telsec) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.address = address;
		this.telhome = telhome;
		this.telmobile = telmobile;
		this.telwork = telwork;
		this.email = email;
		this.email2 = email2;
		this.bday = bday;
		this.bmonth = bmonth;
		this.byear = byear;
		this.addresssec = addresssec;
		this.telsec = telsec;
	}	
}
package com.example.tests;

public class ContactData implements Comparable<ContactData> {
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

	@Override
	public String toString() {
		return "ContactData [firstname=" + firstname + ", lastname=" + lastname
				+ ", address=" + address + ", telhome=" + telhome
				+ ", telmobile=" + telmobile + ", telwork=" + telwork
				+ ", email=" + email + ", email2=" + email2 + ", bday=" + bday
				+ ", bmonth=" + bmonth + ", byear=" + byear + ", addresssec="
				+ addresssec + ", telsec=" + telsec + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		//result = prime * result
				//+ ((firstname == null) ? 0 : firstname.hashCode());
		//result = prime * result
				//+ ((lastname == null) ? 0 : lastname.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ContactData other = (ContactData) obj;
		if (firstname == null) {
			if (other.firstname != null)
				return false;
		} else if (!firstname.equals(other.firstname))
			return false;
		if (lastname == null) {
			if (other.lastname != null)
				return false;
		} else if (!lastname.equals(other.lastname))
			return false;
		return true;
	}

	@Override
	public int compareTo(ContactData other) {		
		if (this.lastname.equals(other.lastname)){
			return this.firstname.toLowerCase().compareTo(other.firstname.toLowerCase());
		}
		else 
		return this.lastname.toLowerCase().compareTo(other.lastname.toLowerCase());
	}
		
}
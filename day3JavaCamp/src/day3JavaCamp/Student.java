package day3JavaCamp;

public class Student extends User {
	private String address;

	public Student(int id, String name, String surName, String eMail, String passWord, String address) {
		super(id, name, surName, eMail, passWord);
		this.address = address;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}

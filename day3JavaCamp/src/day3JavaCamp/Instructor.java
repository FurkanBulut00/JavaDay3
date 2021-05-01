package day3JavaCamp;

public class Instructor extends User {
	private double rating;

	public Instructor(int id, String name, String surName, String eMail, String passWord, double rating) {
		super(id, name, surName, eMail, passWord);
		this.rating = rating;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

}

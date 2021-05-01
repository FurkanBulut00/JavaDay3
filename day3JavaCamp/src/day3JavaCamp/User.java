package day3JavaCamp;

public class User {
	private int id;
	private String name;
	private String surName;
	private String eMail;
	private String passWord;

	public User(int id, String name, String surName, String eMail, String passWord) {
		super();
		this.id = id;
		this.name = name;
		this.surName = surName;
		this.eMail = eMail;
		this.passWord = passWord;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurName() {
		return surName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
}

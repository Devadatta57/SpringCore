package com.di;

public class Address {
	private int id;
	private String street;
	private int dno;
	
	public Address() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public int getDno() {
		return dno;
	}

	public void setDno(int dno) {
		this.dno = dno;
	}

	public Address(int id, String street, int dno) {
		super();
		this.id = id;
		this.street = street;
		this.dno = dno;
	}

	@Override
	public String toString() {
		return "Address [id=" + id + ", street=" + street + ", dno=" + dno + "]";
	}
	
	

}

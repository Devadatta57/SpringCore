package com.di;

public class Address {
	private int id;
	private String dno;
	private String street;
	public Address() {
		// TODO Auto-generated constructor stub
	}
	public Address(int id, String dno, String street) {
		super();
		this.id = id;
		this.dno = dno;
		this.street = street;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDno() {
		return dno;
	}
	public void setDno(String dno) {
		this.dno = dno;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	@Override
	public String toString() {
		return "Address [id=" + id + ", dno=" + dno + ", street=" + street + "]";
	}
	

}

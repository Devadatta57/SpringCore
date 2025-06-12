package com.di;

import java.util.List;

public class Employee {
	private int id;
	private String name;
	private List<String> roles;
	private Address address;
	public Employee() {
		// TODO Auto-generated constructor stub
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
	public List<String> getRoles() {
		return roles;
	}
	public void setRoles(List<String> roles) {
		this.roles = roles;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Employee(int id, String name, List<String> roles, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.roles = roles;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", roles=" + roles + ", address=" + address + "]";
	}
	
	
	

}

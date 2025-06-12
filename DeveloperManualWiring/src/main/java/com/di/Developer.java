package com.di;

public class Developer {
	private Computer comp;

	public Computer getComp() {
		return comp;
	}

	public Developer(Computer comp) {
		super();
		this.comp = comp;
	}

	public void setComp(Computer comp) {
		this.comp = comp;
	}
	
   public void computer() {
	   comp.code();
   }
}

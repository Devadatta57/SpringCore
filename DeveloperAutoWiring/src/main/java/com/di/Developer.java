package com.di;

public class Developer {
	private Computer comp;
	public Developer() {
		// TODO Auto-generated constructor stub
	}

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

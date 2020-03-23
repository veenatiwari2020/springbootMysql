package com.springdemo;

public class Address {
	private String permanet;
    private String office;
	public String getPermanet() {
		return permanet;
	}
	public void setPermanet(String permanet) {
		this.permanet = permanet;
	}
	public String getOffice() {
		return office;
	}
	public void setOffice(String office) {
		this.office = office;
	}
	@Override
	public String toString() {
		return "Address [permanet=" + permanet + ", office=" + office + "]";
	}

}

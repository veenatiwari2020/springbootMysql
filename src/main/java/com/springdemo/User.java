package com.springdemo;

import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class User {

	private int empId;
	
	private String ename;
	
	private Date birthDate;
	
	private List<String> phoneNo;
	private Address address;
	private String[] accountNumber;
	public String[] getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String[] accountNumber) {
		this.accountNumber = accountNumber;
	}

	private Map<String, Object> bankAccount;
	
	 public List<String> getPhoneNo() {
		return phoneNo;
	}

	public Map<String, Object> getBankAccount() {
		return bankAccount;
	}

	public void setBankAccount(Map<String, Object> bankAccount) {
		this.bankAccount = bankAccount;
	}

	public void setPhoneNo(List<String> phoneNo) {
		this.phoneNo = phoneNo;
	}


	//Arraylist<Hashmap<String,Object>> array= new Arraylist<Hashmap<String,Object>>();
	


	public User()
	{}
	
	public User(int empId, String ename, Date birthDate) {
		super();
		this.empId = empId;
		this.ename = ename;
		this.birthDate = birthDate;
		this.address=address;
	}

	public User(int empId, String ename, Date birthDate,List phoneNo, Address address) {
		super();
		this.empId = empId;
		this.ename = ename;
		this.birthDate = birthDate;
		this.address=address;
		this.phoneNo=phoneNo;
	}
	
	public User(int empId, String ename, Date birthDate,List phoneNo, Address address, String[] accountNumber, Map bankAccount ) {
		super();
		this.empId = empId;
		this.ename = ename;
		this.birthDate = birthDate;
		this.address=address;
		this.phoneNo=phoneNo;
		this.accountNumber=accountNumber;
		this.bankAccount=bankAccount;
	}

	public int getEmpId() {
		return empId;
	}
	
	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}



	@Override
	public String toString() {
		return "User [empId=" + empId + ", ename=" + ename + ", birthDate=" + birthDate + ", phoneNo=" + phoneNo
				+ ", address=" + address + ", accountNumber=" + Arrays.toString(accountNumber) + ", bankAccount="
				+ bankAccount + "]";
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
}

package com.Account.accountService.model;

public class Account {
	private String name;
	private String id;
	private String number;

	public Account(String name, String id,String number){
		this.name=name;
		this.id=id;
		this.number=number;
	}

	public String getName() {
		return name;
	}

	public String getId(){
		return id;
	}

	public String getNumber(){
		return number;
	}

	public void setName(String name){
		this.name =name;
	}

	
}

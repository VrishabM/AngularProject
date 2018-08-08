package com;

public class User {
	private int id,price;
	private String name,description,categorty;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public User(int i,String n,String d, int p,String c) {
		super();
		this.id = i;
		this.name = n;
		this.description = d;
		this.price = p;
		this.categorty = c;
	}
	public int getId() {
		return id;
		}
	public int getPrice() {
		return price;
	}
	public String getName() {
		return name;
	}
	public String getDescription() {
		return description;
	}
	public String getCategory() {
		return categorty;
	}
	
	public void setId(int i) {
		this.id = i;
		}
	public void setName(String n) {
		this.name = n;
	}
	public void setDescription(String d) {
		this.description = d;
	}
	public void setPrice(int p) {
		this.price = p;
	}
	public void setCategory(String c) {
		this.categorty = c;
	}

}

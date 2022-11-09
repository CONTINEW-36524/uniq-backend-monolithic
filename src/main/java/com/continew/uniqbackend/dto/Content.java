package com.continew.uniqbackend.dto;

public class Content {
	int id;
	String con;


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCon() {
		return con;
	}
	public void setCon(String con) {
		this.con = con;
	}
	@Override
	public String toString() {
		return "{\"id\":\"" + id + "\""+", \"con\": \"" + con + "\"}";
	}
}

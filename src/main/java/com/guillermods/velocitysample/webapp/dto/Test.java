package com.guillermods.velocitysample.webapp.dto;

public class Test{
	private String name;
	
	
	
	public Test() {

	}

	public Test(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Test [name=" + name + "]";
	}

	
	
	
}

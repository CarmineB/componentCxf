package org.cxfttest.presentation.models;

public class Developer {
	
	private String name;
	private String programmingLanguage;
	
	public Developer() {
		super();
	}
	
	public Developer(String name, String programmingLanguage) {
		super();
		this.name = name;
		this.programmingLanguage = programmingLanguage;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getProgrammingLanguage() {
		return programmingLanguage;
	}
	public void setProgrammingLanguage(String programmingLanguage) {
		this.programmingLanguage = programmingLanguage;
	}

}

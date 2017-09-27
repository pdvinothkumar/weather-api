package io.vinoth.springboot.model;

public class Search {
	
	private String countryName;
	
	public Search(String countryName) {
		this.setCountryName(countryName);
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

}
